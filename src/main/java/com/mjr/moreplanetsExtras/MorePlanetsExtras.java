package com.mjr.moreplanetsExtras;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.mjr.moreplanetsExtras.proxy.CommonProxy;
import com.mjr.moreplanetsExtras.spaceStations.SpaceStationsMain;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.modVersion, dependencies = "required-after:galacticraftcore;required-after:galacticraftplanets;required-after:moreplanets;")
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
}