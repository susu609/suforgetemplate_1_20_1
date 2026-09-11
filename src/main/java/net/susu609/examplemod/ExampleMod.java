package net.susu609.examplemod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.susu609.examplemod.config.WConfig;
import org.slf4j.Logger;

@Mod(ExampleMod.MOD_ID) public final class ExampleMod {

    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExampleMod(FMLJavaModLoadingContext context) {
        // Forge 47.3.10+ supports constructor injection; avoid deprecated
        // static get().
        context.registerConfig(ModConfig.Type.COMMON, WConfig.SPEC);
        LOGGER.info("{} loaded", MOD_ID);
    }
}
