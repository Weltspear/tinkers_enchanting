package net.ticench.mod.mixin;

import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(slimeknights.tconstruct.library.tools.item.armor.ModifiableArmorItem.class)
public class TinkerEnchantModifiableArmor {
    @Inject(at = @At("HEAD"), method = "isEnchantable", cancellable = true, remap = false)
    public void isEnchantable(ItemStack stack, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(true);
        return;
    }

    @Inject(at = @At("HEAD"), method = "isBookEnchantable", cancellable = true, remap = false)
    public void isBookEnchantable(ItemStack stack, ItemStack book, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(true);
        return;
    }
}
