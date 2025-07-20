package net.ticench.mod.mixin;

import net.minecraft.nbt.CompoundTag;
import net.ticench.mod.IGetFullNBTData;
import org.spongepowered.asm.mixin.*;
import slimeknights.tconstruct.library.tools.nbt.ToolStack;

@Mixin(ToolStack.class)
@Implements(@Interface(iface = IGetFullNBTData.class, prefix = "nbtMaster$"))
public class NBTHack {
    @Final
    @Shadow(remap = false)
    private CompoundTag nbt;

    public CompoundTag nbtMaster$getFullData(){
        return nbt;
    }
}
