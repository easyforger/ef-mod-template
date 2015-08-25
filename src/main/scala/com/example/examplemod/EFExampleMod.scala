package com.example.examplemod

import com.easyforger.base.EasyForger
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = EFExampleMod.modId, name = "EF Example Mod", version = "0.3", modLanguage = "scala")
object EFExampleMod extends EasyForger {
  final val modId = "EFExampleMod"

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    println("EF Example Mod is running!")
  }
}
