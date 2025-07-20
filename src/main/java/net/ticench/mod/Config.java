package net.ticench.mod;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

import java.util.HashMap;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = TiCEnchMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue MAX_ALL_DAMAGE_PROTECTION = BUILDER.comment("max level").defineInRange("MAX_ALL_DAMAGE_PROTECTION", Enchantments.ALL_DAMAGE_PROTECTION.getMaxLevel(), Enchantments.ALL_DAMAGE_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_FIRE_PROTECTION = BUILDER.comment("max level").defineInRange("MAX_FIRE_PROTECTION", Enchantments.FIRE_PROTECTION.getMaxLevel(), Enchantments.FIRE_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_BLAST_PROTECTION = BUILDER.comment("max level").defineInRange("MAX_BLAST_PROTECTION", Enchantments.BLAST_PROTECTION.getMaxLevel(), Enchantments.BLAST_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_PROJECTILE_PROTECTION = BUILDER.comment("max level").defineInRange("MAX_PROJECTILE_PROTECTION", Enchantments.PROJECTILE_PROTECTION.getMaxLevel(), Enchantments.PROJECTILE_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_FALL_PROTECTION = BUILDER.comment("max level").defineInRange("MAX_FALL_PROTECTION", Enchantments.FALL_PROTECTION.getMaxLevel(), Enchantments.FALL_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_RESPIRATION = BUILDER.comment("max level").defineInRange("MAX_RESPIRATION", Enchantments.RESPIRATION.getMaxLevel(), Enchantments.RESPIRATION.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_AQUA_AFFINITY = BUILDER.comment("max level").defineInRange("MAX_AQUA_AFFINITY", Enchantments.AQUA_AFFINITY.getMaxLevel(), Enchantments.AQUA_AFFINITY.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_THORNS = BUILDER.comment("max level").defineInRange("MAX_THORNS", Enchantments.THORNS.getMaxLevel(), Enchantments.THORNS.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_DEPTH_STRIDER = BUILDER.comment("max level").defineInRange("MAX_DEPTH_STRIDER", Enchantments.DEPTH_STRIDER.getMaxLevel(), Enchantments.DEPTH_STRIDER.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_FROST_WALKER = BUILDER.comment("max level").defineInRange("MAX_FROST_WALKER", Enchantments.FROST_WALKER.getMaxLevel(), Enchantments.FROST_WALKER.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_SOUL_SPEED = BUILDER.comment("max level").defineInRange("MAX_SOUL_SPEED", Enchantments.SOUL_SPEED.getMaxLevel(), Enchantments.SOUL_SPEED.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_SWIFT_SNEAK = BUILDER.comment("max level").defineInRange("MAX_SWIFT_SNEAK", Enchantments.SWIFT_SNEAK.getMaxLevel(), Enchantments.SWIFT_SNEAK.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_SHARPNESS = BUILDER.comment("max level").defineInRange("MAX_SHARPNESS", Enchantments.SHARPNESS.getMaxLevel(), Enchantments.SHARPNESS.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_SMITE = BUILDER.comment("max level").defineInRange("MAX_SMITE", Enchantments.SMITE.getMaxLevel(), Enchantments.SMITE.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_BANE_OF_ARTHROPODS = BUILDER.comment("max level").defineInRange("MAX_BANE_OF_ARTHROPODS", Enchantments.BANE_OF_ARTHROPODS.getMaxLevel(), Enchantments.BANE_OF_ARTHROPODS.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_KNOCKBACK = BUILDER.comment("max level").defineInRange("MAX_KNOCKBACK", Enchantments.KNOCKBACK.getMaxLevel(), Enchantments.KNOCKBACK.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_FIRE_ASPECT = BUILDER.comment("max level").defineInRange("MAX_FIRE_ASPECT", Enchantments.FIRE_ASPECT.getMaxLevel(), Enchantments.FIRE_ASPECT.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_MOB_LOOTING = BUILDER.comment("max level").defineInRange("MAX_MOB_LOOTING", Enchantments.MOB_LOOTING.getMaxLevel(), Enchantments.MOB_LOOTING.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_SWEEPING_EDGE = BUILDER.comment("max level").defineInRange("MAX_SWEEPING_EDGE", Enchantments.SWEEPING_EDGE.getMaxLevel(), Enchantments.SWEEPING_EDGE.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_IMPALING = BUILDER.comment("max level").defineInRange("MAX_IMPALING", Enchantments.IMPALING.getMaxLevel(), Enchantments.IMPALING.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_BLOCK_EFFICIENCY = BUILDER.comment("max level").defineInRange("MAX_BLOCK_EFFICIENCY", Enchantments.BLOCK_EFFICIENCY.getMaxLevel(), Enchantments.BLOCK_EFFICIENCY.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_SILK_TOUCH = BUILDER.comment("max level").defineInRange("MAX_SILK_TOUCH", Enchantments.SILK_TOUCH.getMaxLevel(), Enchantments.SILK_TOUCH.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_BLOCK_FORTUNE = BUILDER.comment("max level").defineInRange("MAX_BLOCK_FORTUNE", Enchantments.BLOCK_FORTUNE.getMaxLevel(), Enchantments.BLOCK_FORTUNE.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_POWER_ARROWS = BUILDER.comment("max level").defineInRange("MAX_POWER_ARROWS", Enchantments.POWER_ARROWS.getMaxLevel(), Enchantments.POWER_ARROWS.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_PUNCH_ARROWS = BUILDER.comment("max level").defineInRange("MAX_PUNCH_ARROWS", Enchantments.PUNCH_ARROWS.getMaxLevel(), Enchantments.PUNCH_ARROWS.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_FLAMING_ARROWS = BUILDER.comment("max level").defineInRange("MAX_FLAMING_ARROWS", Enchantments.FLAMING_ARROWS.getMaxLevel(), Enchantments.FLAMING_ARROWS.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_INFINITY_ARROWS = BUILDER.comment("max level").defineInRange("MAX_INFINITY_ARROWS", Enchantments.INFINITY_ARROWS.getMaxLevel(), Enchantments.INFINITY_ARROWS.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_MULTISHOT = BUILDER.comment("max level").defineInRange("MAX_MULTISHOT", Enchantments.MULTISHOT.getMaxLevel(), Enchantments.MULTISHOT.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_QUICK_CHARGE = BUILDER.comment("max level").defineInRange("MAX_QUICK_CHARGE", Enchantments.QUICK_CHARGE.getMaxLevel(), Enchantments.QUICK_CHARGE.getMaxLevel(), Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MAX_PIERCING = BUILDER.comment("max level").defineInRange("MAX_PIERCING", Enchantments.PIERCING.getMaxLevel(), Enchantments.PIERCING.getMaxLevel(), Integer.MAX_VALUE);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static HashMap<Enchantment, Integer> enchlvls = new HashMap<>();


    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        enchlvls.put(Enchantments.ALL_DAMAGE_PROTECTION, MAX_ALL_DAMAGE_PROTECTION.get());
        enchlvls.put(Enchantments.FIRE_PROTECTION, MAX_FIRE_PROTECTION.get());
        enchlvls.put(Enchantments.BLAST_PROTECTION, MAX_BLAST_PROTECTION.get());
        enchlvls.put(Enchantments.PROJECTILE_PROTECTION, MAX_PROJECTILE_PROTECTION.get());
        enchlvls.put(Enchantments.FALL_PROTECTION, MAX_FALL_PROTECTION.get());
        enchlvls.put(Enchantments.RESPIRATION, MAX_RESPIRATION.get());
        enchlvls.put(Enchantments.AQUA_AFFINITY, MAX_AQUA_AFFINITY.get());
        enchlvls.put(Enchantments.THORNS, MAX_THORNS.get());
        enchlvls.put(Enchantments.DEPTH_STRIDER, MAX_DEPTH_STRIDER.get());
        enchlvls.put(Enchantments.FROST_WALKER, MAX_FROST_WALKER.get());
        enchlvls.put(Enchantments.SOUL_SPEED, MAX_SOUL_SPEED.get());
        enchlvls.put(Enchantments.SWIFT_SNEAK, MAX_SWIFT_SNEAK.get());
        enchlvls.put(Enchantments.SHARPNESS, MAX_SHARPNESS.get());
        enchlvls.put(Enchantments.SMITE, MAX_SMITE.get());
        enchlvls.put(Enchantments.BANE_OF_ARTHROPODS, MAX_BANE_OF_ARTHROPODS.get());
        enchlvls.put(Enchantments.KNOCKBACK, MAX_KNOCKBACK.get());
        enchlvls.put(Enchantments.FIRE_ASPECT, MAX_FIRE_ASPECT.get());
        enchlvls.put(Enchantments.MOB_LOOTING, MAX_MOB_LOOTING.get());
        enchlvls.put(Enchantments.SWEEPING_EDGE, MAX_SWEEPING_EDGE.get());
        enchlvls.put(Enchantments.IMPALING, MAX_IMPALING.get());
        enchlvls.put(Enchantments.BLOCK_EFFICIENCY, MAX_BLOCK_EFFICIENCY.get());
        enchlvls.put(Enchantments.SILK_TOUCH, MAX_SILK_TOUCH.get());
        enchlvls.put(Enchantments.BLOCK_FORTUNE, MAX_BLOCK_FORTUNE.get());
        enchlvls.put(Enchantments.POWER_ARROWS, MAX_POWER_ARROWS.get());
        enchlvls.put(Enchantments.PUNCH_ARROWS, MAX_PUNCH_ARROWS.get());
        enchlvls.put(Enchantments.FLAMING_ARROWS, MAX_FLAMING_ARROWS.get());
        enchlvls.put(Enchantments.INFINITY_ARROWS, MAX_INFINITY_ARROWS.get());
        enchlvls.put(Enchantments.MULTISHOT, MAX_MULTISHOT.get());
        enchlvls.put(Enchantments.QUICK_CHARGE, MAX_QUICK_CHARGE.get());
        enchlvls.put(Enchantments.PIERCING, MAX_PIERCING.get());

    }
}
