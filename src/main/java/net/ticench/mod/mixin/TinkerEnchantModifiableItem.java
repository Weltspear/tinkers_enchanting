package net.ticench.mod.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(slimeknights.tconstruct.library.tools.item.ModifiableItem.class)
//@Implements(@Interface(iface = ICanApplyEnch.class, prefix = "apply$"))
public class TinkerEnchantModifiableItem {

    @Inject(at = @At("HEAD"), method = "isEnchantable", cancellable = true)
    public void isEnchantable(ItemStack stack, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBookEnchantable", cancellable = true, remap = false)
    public void isBookEnchantable(ItemStack stack, ItemStack book, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(true);
    }

    /**
     * @author Weltspear
     * @reason Make Tinker's items enchantable
     */
    @Overwrite(remap = false)
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment){
        return true;
    }

}
