package net.ticench.mod;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
//@Mod.EventBusSubscriber(modid = TiCEnchMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    public static final ForgeConfigSpec commonSpec;
    public static final Config COMMON;
    //private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public ForgeConfigSpec.IntValue MAX_ALL_DAMAGE_PROTECTION;
    public ForgeConfigSpec.IntValue MAX_FIRE_PROTECTION;
    public  ForgeConfigSpec.IntValue MAX_BLAST_PROTECTION;
    public  ForgeConfigSpec.IntValue MAX_PROJECTILE_PROTECTION;
    public  ForgeConfigSpec.IntValue MAX_FALL_PROTECTION;
    public  ForgeConfigSpec.IntValue MAX_RESPIRATION;
    public  ForgeConfigSpec.IntValue MAX_AQUA_AFFINITY;
    public  ForgeConfigSpec.IntValue MAX_THORNS;
    public  ForgeConfigSpec.IntValue MAX_DEPTH_STRIDER;
    public  ForgeConfigSpec.IntValue MAX_FROST_WALKER;
    public  ForgeConfigSpec.IntValue MAX_SOUL_SPEED;
    public  ForgeConfigSpec.IntValue MAX_SWIFT_SNEAK;
    public  ForgeConfigSpec.IntValue MAX_SHARPNESS;
    public  ForgeConfigSpec.IntValue MAX_SMITE;
    public  ForgeConfigSpec.IntValue MAX_BANE_OF_ARTHROPODS;
    public  ForgeConfigSpec.IntValue MAX_KNOCKBACK;
    public  ForgeConfigSpec.IntValue MAX_FIRE_ASPECT;
    public  ForgeConfigSpec.IntValue MAX_MOB_LOOTING;
    public  ForgeConfigSpec.IntValue MAX_SWEEPING_EDGE;
    public  ForgeConfigSpec.IntValue MAX_IMPALING;
    public  ForgeConfigSpec.IntValue MAX_BLOCK_EFFICIENCY;
    public  ForgeConfigSpec.IntValue MAX_SILK_TOUCH;
    public  ForgeConfigSpec.IntValue MAX_BLOCK_FORTUNE;
    public  ForgeConfigSpec.IntValue MAX_POWER_ARROWS;
    public  ForgeConfigSpec.IntValue MAX_PUNCH_ARROWS;
    public  ForgeConfigSpec.IntValue MAX_FLAMING_ARROWS;
    public  ForgeConfigSpec.IntValue MAX_INFINITY_ARROWS;
    public  ForgeConfigSpec.IntValue MAX_MULTISHOT;
    public  ForgeConfigSpec.IntValue MAX_QUICK_CHARGE;
    public  ForgeConfigSpec.IntValue MAX_PIERCING;

    //static final ForgeConfigSpec SPEC = BUILDER.build();

    public HashMap<Enchantment, Integer> enchlvls = new HashMap<>();

    static {
        final Pair<Config, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Config::new);
        commonSpec = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public Config(ForgeConfigSpec.Builder builder){
        MAX_ALL_DAMAGE_PROTECTION = builder.comment("max level").defineInRange("MAX_ALL_DAMAGE_PROTECTION", Enchantments.ALL_DAMAGE_PROTECTION.getMaxLevel(), Enchantments.ALL_DAMAGE_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
        MAX_FIRE_PROTECTION = builder.comment("max level").defineInRange("MAX_FIRE_PROTECTION", Enchantments.FIRE_PROTECTION.getMaxLevel(), Enchantments.FIRE_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
        MAX_BLAST_PROTECTION = builder.comment("max level").defineInRange("MAX_BLAST_PROTECTION", Enchantments.BLAST_PROTECTION.getMaxLevel(), Enchantments.BLAST_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
        MAX_PROJECTILE_PROTECTION = builder.comment("max level").defineInRange("MAX_PROJECTILE_PROTECTION", Enchantments.PROJECTILE_PROTECTION.getMaxLevel(), Enchantments.PROJECTILE_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
        MAX_FALL_PROTECTION = builder.comment("max level").defineInRange("MAX_FALL_PROTECTION", Enchantments.FALL_PROTECTION.getMaxLevel(), Enchantments.FALL_PROTECTION.getMaxLevel(), Integer.MAX_VALUE);
        MAX_RESPIRATION = builder.comment("max level").defineInRange("MAX_RESPIRATION", Enchantments.RESPIRATION.getMaxLevel(), Enchantments.RESPIRATION.getMaxLevel(), Integer.MAX_VALUE);
        MAX_AQUA_AFFINITY = builder.comment("max level").defineInRange("MAX_AQUA_AFFINITY", Enchantments.AQUA_AFFINITY.getMaxLevel(), Enchantments.AQUA_AFFINITY.getMaxLevel(), Integer.MAX_VALUE);
        MAX_THORNS = builder.comment("max level").defineInRange("MAX_THORNS", Enchantments.THORNS.getMaxLevel(), Enchantments.THORNS.getMaxLevel(), Integer.MAX_VALUE);
        MAX_DEPTH_STRIDER = builder.comment("max level").defineInRange("MAX_DEPTH_STRIDER", Enchantments.DEPTH_STRIDER.getMaxLevel(), Enchantments.DEPTH_STRIDER.getMaxLevel(), Integer.MAX_VALUE);
        MAX_FROST_WALKER = builder.comment("max level").defineInRange("MAX_FROST_WALKER", Enchantments.FROST_WALKER.getMaxLevel(), Enchantments.FROST_WALKER.getMaxLevel(), Integer.MAX_VALUE);
        MAX_SOUL_SPEED = builder.comment("max level").defineInRange("MAX_SOUL_SPEED", Enchantments.SOUL_SPEED.getMaxLevel(), Enchantments.SOUL_SPEED.getMaxLevel(), Integer.MAX_VALUE);
        MAX_SWIFT_SNEAK = builder.comment("max level").defineInRange("MAX_SWIFT_SNEAK", Enchantments.SWIFT_SNEAK.getMaxLevel(), Enchantments.SWIFT_SNEAK.getMaxLevel(), Integer.MAX_VALUE);
        MAX_SHARPNESS = builder.comment("max level").defineInRange("MAX_SHARPNESS", Enchantments.SHARPNESS.getMaxLevel(), Enchantments.SHARPNESS.getMaxLevel(), Integer.MAX_VALUE);
        MAX_SMITE = builder.comment("max level").defineInRange("MAX_SMITE", Enchantments.SMITE.getMaxLevel(), Enchantments.SMITE.getMaxLevel(), Integer.MAX_VALUE);
        MAX_BANE_OF_ARTHROPODS = builder.comment("max level").defineInRange("MAX_BANE_OF_ARTHROPODS", Enchantments.BANE_OF_ARTHROPODS.getMaxLevel(), Enchantments.BANE_OF_ARTHROPODS.getMaxLevel(), Integer.MAX_VALUE);
        MAX_KNOCKBACK = builder.comment("max level").defineInRange("MAX_KNOCKBACK", Enchantments.KNOCKBACK.getMaxLevel(), Enchantments.KNOCKBACK.getMaxLevel(), Integer.MAX_VALUE);
        MAX_FIRE_ASPECT = builder.comment("max level").defineInRange("MAX_FIRE_ASPECT", Enchantments.FIRE_ASPECT.getMaxLevel(), Enchantments.FIRE_ASPECT.getMaxLevel(), Integer.MAX_VALUE);
        MAX_MOB_LOOTING = builder.comment("max level").defineInRange("MAX_MOB_LOOTING", Enchantments.MOB_LOOTING.getMaxLevel(), Enchantments.MOB_LOOTING.getMaxLevel(), Integer.MAX_VALUE);
        MAX_SWEEPING_EDGE = builder.comment("max level").defineInRange("MAX_SWEEPING_EDGE", Enchantments.SWEEPING_EDGE.getMaxLevel(), Enchantments.SWEEPING_EDGE.getMaxLevel(), Integer.MAX_VALUE);
        MAX_IMPALING = builder.comment("max level").defineInRange("MAX_IMPALING", Enchantments.IMPALING.getMaxLevel(), Enchantments.IMPALING.getMaxLevel(), Integer.MAX_VALUE);
        MAX_BLOCK_EFFICIENCY = builder.comment("max level").defineInRange("MAX_BLOCK_EFFICIENCY", Enchantments.BLOCK_EFFICIENCY.getMaxLevel(), Enchantments.BLOCK_EFFICIENCY.getMaxLevel(), Integer.MAX_VALUE);
        MAX_SILK_TOUCH = builder.comment("max level").defineInRange("MAX_SILK_TOUCH", Enchantments.SILK_TOUCH.getMaxLevel(), Enchantments.SILK_TOUCH.getMaxLevel(), Integer.MAX_VALUE);
        MAX_BLOCK_FORTUNE = builder.comment("max level").defineInRange("MAX_BLOCK_FORTUNE", Enchantments.BLOCK_FORTUNE.getMaxLevel(), Enchantments.BLOCK_FORTUNE.getMaxLevel(), Integer.MAX_VALUE);
        MAX_POWER_ARROWS = builder.comment("max level").defineInRange("MAX_POWER_ARROWS", Enchantments.POWER_ARROWS.getMaxLevel(), Enchantments.POWER_ARROWS.getMaxLevel(), Integer.MAX_VALUE);
        MAX_PUNCH_ARROWS = builder.comment("max level").defineInRange("MAX_PUNCH_ARROWS", Enchantments.PUNCH_ARROWS.getMaxLevel(), Enchantments.PUNCH_ARROWS.getMaxLevel(), Integer.MAX_VALUE);
        MAX_FLAMING_ARROWS = builder.comment("max level").defineInRange("MAX_FLAMING_ARROWS", Enchantments.FLAMING_ARROWS.getMaxLevel(), Enchantments.FLAMING_ARROWS.getMaxLevel(), Integer.MAX_VALUE);
        MAX_INFINITY_ARROWS = builder.comment("max level").defineInRange("MAX_INFINITY_ARROWS", Enchantments.INFINITY_ARROWS.getMaxLevel(), Enchantments.INFINITY_ARROWS.getMaxLevel(), Integer.MAX_VALUE);
        MAX_MULTISHOT = builder.comment("max level").defineInRange("MAX_MULTISHOT", Enchantments.MULTISHOT.getMaxLevel(), Enchantments.MULTISHOT.getMaxLevel(), Integer.MAX_VALUE);
        MAX_QUICK_CHARGE = builder.comment("max level").defineInRange("MAX_QUICK_CHARGE", Enchantments.QUICK_CHARGE.getMaxLevel(), Enchantments.QUICK_CHARGE.getMaxLevel(), Integer.MAX_VALUE);
        MAX_PIERCING = builder.comment("max level").defineInRange("MAX_PIERCING", Enchantments.PIERCING.getMaxLevel(), Enchantments.PIERCING.getMaxLevel(), Integer.MAX_VALUE);
    }

    public static void init() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.commonSpec);
    }

    public static void postInit(){
        COMMON.enchlvls.put(Enchantments.ALL_DAMAGE_PROTECTION, COMMON.MAX_ALL_DAMAGE_PROTECTION.get());
        COMMON.enchlvls.put(Enchantments.FIRE_PROTECTION, COMMON.MAX_FIRE_PROTECTION.get());
        COMMON.enchlvls.put(Enchantments.BLAST_PROTECTION, COMMON.MAX_BLAST_PROTECTION.get());
        COMMON.enchlvls.put(Enchantments.PROJECTILE_PROTECTION, COMMON.MAX_PROJECTILE_PROTECTION.get());
        COMMON.enchlvls.put(Enchantments.FALL_PROTECTION, COMMON.MAX_FALL_PROTECTION.get());
        COMMON.enchlvls.put(Enchantments.RESPIRATION, COMMON.MAX_RESPIRATION.get());
        COMMON.enchlvls.put(Enchantments.AQUA_AFFINITY, COMMON.MAX_AQUA_AFFINITY.get());
        COMMON.enchlvls.put(Enchantments.THORNS, COMMON.MAX_THORNS.get());
        COMMON.enchlvls.put(Enchantments.DEPTH_STRIDER, COMMON.MAX_DEPTH_STRIDER.get());
        COMMON.enchlvls.put(Enchantments.FROST_WALKER, COMMON.MAX_FROST_WALKER.get());
        COMMON.enchlvls.put(Enchantments.SOUL_SPEED, COMMON.MAX_SOUL_SPEED.get());
        COMMON.enchlvls.put(Enchantments.SWIFT_SNEAK, COMMON.MAX_SWIFT_SNEAK.get());
        COMMON.enchlvls.put(Enchantments.SHARPNESS, COMMON.MAX_SHARPNESS.get());
        COMMON.enchlvls.put(Enchantments.SMITE, COMMON.MAX_SMITE.get());
        COMMON.enchlvls.put(Enchantments.BANE_OF_ARTHROPODS, COMMON.MAX_BANE_OF_ARTHROPODS.get());
        COMMON.enchlvls.put(Enchantments.KNOCKBACK, COMMON.MAX_KNOCKBACK.get());
        COMMON.enchlvls.put(Enchantments.FIRE_ASPECT, COMMON.MAX_FIRE_ASPECT.get());
        COMMON.enchlvls.put(Enchantments.MOB_LOOTING, COMMON.MAX_MOB_LOOTING.get());
        COMMON.enchlvls.put(Enchantments.SWEEPING_EDGE, COMMON.MAX_SWEEPING_EDGE.get());
        COMMON.enchlvls.put(Enchantments.IMPALING, COMMON.MAX_IMPALING.get());
        COMMON.enchlvls.put(Enchantments.BLOCK_EFFICIENCY, COMMON.MAX_BLOCK_EFFICIENCY.get());
        COMMON.enchlvls.put(Enchantments.SILK_TOUCH, COMMON.MAX_SILK_TOUCH.get());
        COMMON.enchlvls.put(Enchantments.BLOCK_FORTUNE, COMMON.MAX_BLOCK_FORTUNE.get());
        COMMON.enchlvls.put(Enchantments.POWER_ARROWS, COMMON.MAX_POWER_ARROWS.get());
        COMMON.enchlvls.put(Enchantments.PUNCH_ARROWS, COMMON.MAX_PUNCH_ARROWS.get());
        COMMON.enchlvls.put(Enchantments.FLAMING_ARROWS, COMMON.MAX_FLAMING_ARROWS.get());
        COMMON.enchlvls.put(Enchantments.INFINITY_ARROWS, COMMON.MAX_INFINITY_ARROWS.get());
        COMMON.enchlvls.put(Enchantments.MULTISHOT, COMMON.MAX_MULTISHOT.get());
        COMMON.enchlvls.put(Enchantments.QUICK_CHARGE, COMMON.MAX_QUICK_CHARGE.get());
        COMMON.enchlvls.put(Enchantments.PIERCING, COMMON.MAX_PIERCING.get());
    }



}
