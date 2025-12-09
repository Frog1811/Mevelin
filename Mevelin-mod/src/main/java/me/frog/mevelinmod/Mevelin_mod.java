package me.frog.mevelinmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod(Mevelin_mod.MODID)
public class Mevelin_mod {
    public static final String MODID = "mevelinmod";

    public Mevelin_mod() {
        // Empty constructor
    }

    @EventBusSubscriber(modid = MODID, bus = Bus.MOD)
    public static class ModEvents {
        @SubscribeEvent
        public static void onCommonSetup(FMLCommonSetupEvent event) {
            // Your setup code here
        }
    }
}
