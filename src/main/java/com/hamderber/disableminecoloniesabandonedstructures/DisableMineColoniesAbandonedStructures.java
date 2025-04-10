package com.hamderber.disableminecoloniesabandonedstructures;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(DisableMineColoniesAbandonedStructures.MODID)
public class DisableMineColoniesAbandonedStructures
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "disableminecoloniesabandonedstructures";
    
    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public DisableMineColoniesAbandonedStructures(IEventBus modEventBus, ModContainer modContainer)
    {
        
    }
}
