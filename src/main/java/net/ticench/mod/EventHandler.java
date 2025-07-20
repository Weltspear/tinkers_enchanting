package net.ticench.mod;

import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import slimeknights.tconstruct.library.modifiers.ModifierId;
import slimeknights.tconstruct.library.tools.item.ModifiableItem;
import slimeknights.tconstruct.library.tools.item.armor.ModifiableArmorItem;
import slimeknights.tconstruct.library.tools.item.ranged.ModifiableLauncherItem;
import slimeknights.tconstruct.library.tools.nbt.ToolStack;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.data.ModifierIds;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static net.minecraft.world.item.Items.ENCHANTED_BOOK;

public class EventHandler {

    public static HashMap<Enchantment, ModifierId> ench2mod = new HashMap<>();

    static {
        // general
        ench2mod.put(Enchantments.UNBREAKING, ModifierIds.reinforced);

        // protection
        ench2mod.put(Enchantments.ALL_DAMAGE_PROTECTION, ModifierIds.protection);
        ench2mod.put(Enchantments.FIRE_PROTECTION, ModifierIds.fireProtection);
        ench2mod.put(Enchantments.BLAST_PROTECTION, ModifierIds.blastProtection);
        ench2mod.put(Enchantments.PROJECTILE_PROTECTION, ModifierIds.projectileProtection);
        ench2mod.put(Enchantments.FALL_PROTECTION, ModifierIds.featherFalling);
        // misc armor
        ench2mod.put(Enchantments.RESPIRATION, ModifierIds.respiration);
        ench2mod.put(Enchantments.AQUA_AFFINITY, ModifierIds.aquaAffinity);
        ench2mod.put(Enchantments.THORNS, ModifierIds.thorns);
        ench2mod.put(Enchantments.DEPTH_STRIDER, ModifierIds.depthStrider);
        ench2mod.put(Enchantments.FROST_WALKER, ModifierIds.frostWalker);
        ench2mod.put(Enchantments.SOUL_SPEED, TinkerModifiers.soulspeed.getId());
        ench2mod.put(Enchantments.SWIFT_SNEAK, ModifierIds.swiftSneak);

        // melee
        ench2mod.put(Enchantments.SHARPNESS, ModifierIds.sharpness);
        ench2mod.put(Enchantments.SMITE, ModifierIds.smite);
        ench2mod.put(Enchantments.BANE_OF_ARTHROPODS, ModifierIds.baneOfSssss);
        ench2mod.put(Enchantments.KNOCKBACK, TinkerModifiers.knockback.getId());
        ench2mod.put(Enchantments.FIRE_ASPECT, ModifierIds.fiery);
        ench2mod.put(Enchantments.MOB_LOOTING, ModifierIds.luck);
        ench2mod.put(Enchantments.SWEEPING_EDGE, TinkerModifiers.sweeping.getId());
        ench2mod.put(Enchantments.IMPALING, ModifierIds.antiaquatic);

        // harvest
        ench2mod.put(Enchantments.BLOCK_EFFICIENCY, ModifierIds.haste);
        ench2mod.put(Enchantments.SILK_TOUCH, TinkerModifiers.silky.getId());
        ench2mod.put(Enchantments.BLOCK_FORTUNE, ModifierIds.luck);

        // ranged
        ench2mod.put(Enchantments.POWER_ARROWS, ModifierIds.power);
        ench2mod.put(Enchantments.PUNCH_ARROWS, TinkerModifiers.punch.getId());
        ench2mod.put(Enchantments.FLAMING_ARROWS, ModifierIds.fiery);
        ench2mod.put(Enchantments.INFINITY_ARROWS, ModifierIds.crystalshot);
        ench2mod.put(Enchantments.MULTISHOT, TinkerModifiers.multishot.getId());
        ench2mod.put(Enchantments.QUICK_CHARGE, ModifierIds.quickCharge);
        ench2mod.put(Enchantments.PIERCING, TinkerModifiers.impaling.getId());
    }

    public static int costOfLevel(Enchantment enchantment, int level){
        int rarity_price = 0;
        switch (enchantment.getRarity()) {
            case COMMON:
                rarity_price = 1;
                break;
            case UNCOMMON:
                rarity_price = 2;
                break;
            case RARE:
                rarity_price = 4;
                break;
            case VERY_RARE:
                rarity_price = 8;
        }

        return rarity_price*level;
    }

    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent event){
        System.out.println(event.getLeft().getItem());
        if (event.getLeft().getItem() instanceof ModifiableItem ||
                event.getLeft().getItem() instanceof ModifiableArmorItem ||
                event.getLeft().getItem() instanceof ModifiableLauncherItem){
            if (event.getRight().getItem() == ENCHANTED_BOOK){
                Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(event.getRight());

                int cur_cost = event.getCost();

                Map<Enchantment, Integer> enchantmentsToBeApplied = new HashMap<>();
                ItemStack leftToModify = event.getLeft().copy();
                ToolStack toolStack = ToolStack.from(leftToModify);

                int tcost = 0;
                
                

                for (Enchantment enchantment : enchantments.keySet()){
                    if (ench2mod.containsKey(enchantment)){
                        // convert enchantment to modifier
                        int curLevel = toolStack.getModifierLevel(ench2mod.get(enchantment));
                        int newLevel = enchantments.get(enchantment);

                        if (newLevel > curLevel){
                            if (curLevel>0)
                                toolStack.removeModifier(ench2mod.get(enchantment), curLevel);
                            toolStack.addModifier(ench2mod.get(enchantment), newLevel);
                            tcost += costOfLevel(enchantment, newLevel);
                        }
                        else if (newLevel == curLevel && newLevel+1 <= Config.enchlvls.getOrDefault(enchantment, enchantment.getMaxLevel())){
                            if (curLevel>0)
                                toolStack.removeModifier(ench2mod.get(enchantment), curLevel);
                            toolStack.addModifier(ench2mod.get(enchantment), newLevel+1);
                            tcost += costOfLevel(enchantment, newLevel+1);
                        }
                        else{
                            event.setCanceled(true);
                            return;
                        }
                    }
                    else{
                        enchantmentsToBeApplied.put(enchantment,Math.min(enchantments.get(enchantment), Config.enchlvls.getOrDefault(enchantment, enchantment.getMaxLevel())));
                        tcost += costOfLevel(enchantment, Math.min(enchantments.get(enchantment), Config.enchlvls.getOrDefault(enchantment, enchantment.getMaxLevel())));
                    }
                }

                toolStack.rebuildStats();

                // reapply left enchants

                Map<Enchantment, Integer> leftEnchants = EnchantmentHelper.getEnchantments(event.getLeft());
                for (Enchantment enchantment: leftEnchants.keySet()){
                    if (leftEnchants.get(enchantment) > enchantmentsToBeApplied.getOrDefault(enchantment, 0)){
                        enchantmentsToBeApplied.put(enchantment, Math.min(enchantments.get(enchantment), leftEnchants.get(enchantment)));
                    }
                    else if (Objects.equals(leftEnchants.get(enchantment), enchantmentsToBeApplied.getOrDefault(enchantment, 0))){
                        if (Config.enchlvls.getOrDefault(enchantment, enchantment.getMaxLevel()) < leftEnchants.get(enchantment) + 1){
                            event.setCanceled(true);
                            return;
                        }
                        enchantmentsToBeApplied.put(enchantment, leftEnchants.get(enchantment)+1);
                        tcost+=3;
                    }
                }

                int cost = (event.getName() != null ? 1 : 0) + tcost;

                EnchantmentHelper.setEnchantments(enchantmentsToBeApplied, leftToModify);
                leftToModify.setRepairCost(cost);
                event.setOutput(leftToModify);

                event.setCost(cost);


                event.setResult(Event.Result.ALLOW);

            }
        }
    }
}
