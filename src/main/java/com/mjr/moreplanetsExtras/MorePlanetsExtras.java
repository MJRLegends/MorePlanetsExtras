package com.mjr.moreplanetsExtras;

import micdoodle8.mods.galacticraft.core.util.GCCoreUtil;
import net.minecraft.entity.Entity;

import com.mjr.moreplanetsExtras.proxy.CommonProxy;
import com.mjr.moreplanetsExtras.spaceStations.SpaceStationsMain;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.modVersion, dependencies = "required-after:GalacticraftCore;required-after:GalacticraftMars;required-after:MorePlanet;")
public class MorePlanetsExtras {

	@SidedProxy(clientSide = "com.mjr.moreplanetsExtras.proxy.ClientProxy", serverSide = "com.mjr.moreplanetsExtras.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Instance(Constants.modID)
	public static MorePlanetsExtras instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.load();
		MorePlanetsExtras.proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		SpaceStationsMain.init();
		MorePlanetsExtras.proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		MorePlanetsExtras.proxy.postInit(event);
	}

	public static void registerMorePlanetsExtrasNonMobEntity(Class<? extends Entity> var0, String var1, int trackingDistance, int updateFreq, boolean sendVel) {
		EntityRegistry.registerModEntity(var0, var1, GCCoreUtil.nextInternalID(), MorePlanetsExtras.instance, trackingDistance, updateFreq, sendVel);
	}

	public void registerMorePlanetsExtrasCreature(Class<? extends Entity> var0, String var1, int back, int fore) {
		EntityRegistry.instance();
		int newID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(var0, var1, newID, back, fore);
		EntityRegistry.registerModEntity(var0, var1, GCCoreUtil.nextInternalID(), MorePlanetsExtras.instance, 80, 3, true);
	}
}