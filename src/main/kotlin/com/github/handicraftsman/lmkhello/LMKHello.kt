package com.github.handicraftsman.lmkhello

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLInitializationEvent

@Mod(modid = LMKHello.MODID, version = LMKHello.VERSION)
class LMKHello {
    companion object {
      const val MODID: String = "lmkhello"
      const val VERSION: String = "1.0"
    }
    
    @EventHandler
    fun init(event: FMLInitializationEvent) {
        println("Hello, World!")
    }
}
