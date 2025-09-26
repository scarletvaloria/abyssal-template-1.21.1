package net.scarletontv.abyssal.item;

import net.acoyt.acornlib.api.item.KillEffectItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.scarletontv.abyssal.Abyssal;

import java.util.List;

public class DuskbladeItem extends SwordItem implements KillEffectItem {
    public DuskbladeItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
        public void killEntity(World world, ItemStack itemStack, LivingEntity user, LivingEntity victim) {
            if (victim instanceof PlayerEntity player) {
                if (player instanceof ServerPlayerEntity serverPlayerEntity) {
                    teleportToPurgatory(serverPlayerEntity);
                    serverPlayerEntity.setHealth(20f);
                    ((ServerPlayerEntity) user).requestRespawn();
                }

            }
            if (world instanceof ServerWorld serverWorld) {
                serverWorld.spawnParticles(ParticleTypes.RAID_OMEN, victim.getX(), victim.getY(), victim.getZ(), 75, 0.1, 4, 0.1, 0.02);
            }
        }

        private void teleportToPurgatory(ServerPlayerEntity player) {
            // Correct way to create a registry key in 1.21.1
            RegistryKey<World> abyssWorldKey = RegistryKey.of(RegistryKeys.WORLD, Identifier.of(Abyssal.MOD_ID, "abyss"));

            // Get the target dimension
            MinecraftServer server = player.getServer();
            if (server == null) {
                Abyssal.LOGGER.error("Server is null!");
                return;
            }

            ServerWorld targetWorld = server.getWorld(abyssWorldKey);
            if (targetWorld != null) {
                // Get target spawn position
                BlockPos spawnPos = targetWorld.getSpawnPos();

                // Teleport the player
                player.teleport(
                        targetWorld,
                        spawnPos.getX() + 0.5,
                        spawnPos.getY(),
                        spawnPos.getZ() + 0.5,
                        player.getYaw(),
                        player.getPitch()
                );
            } else {
                Abyssal.LOGGER.error("Could not find abyss dimension!");
            }
        }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.abyssal.duskblade.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}