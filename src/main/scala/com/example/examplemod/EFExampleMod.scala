package com.example.examplemod

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = EFExampleMod.modId, name = "EF Example Mod", version = "0.2", modLanguage = "scala")
object EFExampleMod {
  final val modId = "EFExampleMod"

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    println("EF Example Mod is running!")
  }
}
