package com.mjr.moreplanetsextras;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.mjr.moreplanetsextras.proxy.CommonProxy;
import com.mjr.moreplanetsextras.spaceStations.SpaceStationsMain;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.modVersion, dependencies = "required-after:galacticraftcore;required-after:galacticraftplanets;required-after:moreplanets;", acceptedMinecraftVersions="[1.12.2]")
public class MorePlanetsExtras {

	@SidedProxy(clientSide = "com.mjr.moreplanetsextras.proxy.ClientProxy", serverSide = "com.mjr.moreplanetsextras.proxy.CommonProxy")
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