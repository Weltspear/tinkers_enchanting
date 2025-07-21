package net.ticench.mod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;


@Mod(TiCEnchMod.MODID)
public class TiCEnchMod
{
    public static final String MODID = "ticench";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static TiCEnchMod instance;

    public TiCEnchMod(){
        instance = this;

        FMLJavaModLoadingContext context = FMLJavaModLoadingContext.get();

        Config.init();

        IEventBus modEventBus = context.getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);

        MinecraftForge.EVENT_BUS.register(EventHandler.class);

        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.te.json");

    }
}
