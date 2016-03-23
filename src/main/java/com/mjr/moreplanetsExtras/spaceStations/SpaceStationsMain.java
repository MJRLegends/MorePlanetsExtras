package com.mjr.moreplanetsExtras.spaceStations;

import java.util.HashMap;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.Satellite;
import micdoodle8.mods.galacticraft.api.recipe.SpaceStationRecipe;
import micdoodle8.mods.galacticraft.api.world.SpaceStationType;
import micdoodle8.mods.galacticraft.core.dimension.TeleportTypeOrbit;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;

public class SpaceStationsMain {
	public static Satellite mercurySpaceStation;
	public static Satellite venusSpaceStation;
	public static Satellite plutoSpaceStation;
	public static Satellite dionaSpaceStation;
	public static Satellite fronosSpaceStation;
	public static Satellite nibiruSpaceStation;
	public static Satellite polongniusSpaceStation;
	public static Satellite siriusBSpaceStation;
	public static Satellite kapteynBSpaceStation;

	public static void init() {
		initializeSatellites();
		registerSatellites();
		registerSatellitesRecipes();
	}

	private static void initializeSatellites() {
		mercurySpaceStation = new Satellite("spaceStation.mercury").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.mercury"));
		mercurySpaceStation.setRelativeSize(0.2667F);
		mercurySpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
		mercurySpaceStation.setRelativeOrbitTime(20.0F);
		mercurySpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.mercury")).getTierRequirement());
		mercurySpaceStation.setDimensionInfo(-3001, -3002, WorldProviderOrbitMercury.class);
		mercurySpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
	
		venusSpaceStation = new Satellite("spaceStation.venus").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.venus"));
		venusSpaceStation.setRelativeSize(0.2667F);
		venusSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
		venusSpaceStation.setRelativeOrbitTime(20.0F);
		venusSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.venus")).getTierRequirement());
		venusSpaceStation.setDimensionInfo(-3003, -3004, WorldProviderOrbitVenus.class);
		venusSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		
		plutoSpaceStation = new Satellite("spaceStation.pluto").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto"));
		plutoSpaceStation.setRelativeSize(0.2667F);
		plutoSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
		plutoSpaceStation.setRelativeOrbitTime(20.0F);
		plutoSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto")).getTierRequirement());
		plutoSpaceStation.setDimensionInfo(-3005, -3006, WorldProviderOrbitPluto.class);
		plutoSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));

		dionaSpaceStation = new Satellite("spaceStation.diona").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona"));
		dionaSpaceStation.setRelativeSize(0.2667F);
		dionaSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
		dionaSpaceStation.setRelativeOrbitTime(20.0F);
		dionaSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona")).getTierRequirement());
		dionaSpaceStation.setDimensionInfo(-3009, -3010, WorldProviderOrbitDiona.class);
		dionaSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		
		fronosSpaceStation = new Satellite("spaceStation.fronos").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.fronos"));
		fronosSpaceStation.setRelativeSize(0.2667F);
		fronosSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
		fronosSpaceStation.setRelativeOrbitTime(20.0F);
		fronosSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.fronos")).getTierRequirement());
		fronosSpaceStation.setDimensionInfo(-3011, -3012, WorldProviderOrbitFronos.class);
		fronosSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		
		nibiruSpaceStation = new Satellite("spaceStation.nibiru").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru"));
		nibiruSpaceStation.setRelativeSize(0.2667F);
		nibiruSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
		nibiruSpaceStation.setRelativeOrbitTime(20.0F);
		nibiruSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru")).getTierRequirement());
		nibiruSpaceStation.setDimensionInfo(-3015, -3016, WorldProviderOrbitNibiru.class);
		nibiruSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		
		polongniusSpaceStation = new Satellite("spaceStation.polongnius").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.polongnius"));
		polongniusSpaceStation.setRelativeSize(0.2667F);
		polongniusSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
		polongniusSpaceStation.setRelativeOrbitTime(20.0F);
		polongniusSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.polongnius")).getTierRequirement());
		polongniusSpaceStation.setDimensionInfo(-3019, -3020, WorldProviderOrbitPolongnius.class);
		polongniusSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		
		siriusBSpaceStation = new Satellite("spaceStation.siriusB").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.siriusB"));
		siriusBSpaceStation.setRelativeSize(0.2667F);
		siriusBSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
		siriusBSpaceStation.setRelativeOrbitTime(20.0F);
		siriusBSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.siriusB")).getTierRequirement());
		siriusBSpaceStation.setDimensionInfo(-3021, -3022, WorldProviderOrbitSiriusB.class);
		siriusBSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		
		kapteynBSpaceStation = new Satellite("spaceStation.kapteynB").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.kapteynB"));
		kapteynBSpaceStation.setRelativeSize(0.2667F);
		kapteynBSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
		kapteynBSpaceStation.setRelativeOrbitTime(20.0F);
		kapteynBSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.kapteynB")).getTierRequirement());
		kapteynBSpaceStation.setDimensionInfo(-3023, -3024, WorldProviderOrbitKapteynB.class);
		kapteynBSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
	}

	private static void registerSatellites() {
		GalaxyRegistry.registerSatellite(mercurySpaceStation);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrbitMercury.class, new TeleportTypeOrbit());
		GalacticraftRegistry.registerProvider(-3001, WorldProviderOrbitMercury.class, false, 0);
		GalacticraftRegistry.registerProvider(-3002, WorldProviderOrbitMercury.class, true, 0);
		
		GalaxyRegistry.registerSatellite(venusSpaceStation);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrbitVenus.class, new TeleportTypeOrbit());
		GalacticraftRegistry.registerProvider(-3001, WorldProviderOrbitVenus.class, false, 0);
		GalacticraftRegistry.registerProvider(-3002, WorldProviderOrbitVenus.class, true, 0);

		GalaxyRegistry.registerSatellite(plutoSpaceStation);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrbitPluto.class, new TeleportTypeOrbit());
		GalacticraftRegistry.registerProvider(-3005, WorldProviderOrbitPluto.class, false, 0);
		GalacticraftRegistry.registerProvider(-3006, WorldProviderOrbitPluto.class, true, 0);
		
		GalaxyRegistry.registerSatellite(dionaSpaceStation);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrbitDiona.class, new TeleportTypeOrbit());
		GalacticraftRegistry.registerProvider(-3009, WorldProviderOrbitDiona.class, false, 0);
		GalacticraftRegistry.registerProvider(-3010, WorldProviderOrbitDiona.class, true, 0);
		
		GalaxyRegistry.registerSatellite(fronosSpaceStation);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrbitFronos.class, new TeleportTypeOrbit());
		GalacticraftRegistry.registerProvider(-3011, WorldProviderOrbitFronos.class, false, 0);
		GalacticraftRegistry.registerProvider(-3012, WorldProviderOrbitFronos.class, true, 0);
		
	
		GalaxyRegistry.registerSatellite(nibiruSpaceStation);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrbitNibiru.class, new TeleportTypeOrbit());
		GalacticraftRegistry.registerProvider(-3015, WorldProviderOrbitNibiru.class, false, 0);
		GalacticraftRegistry.registerProvider(-3016, WorldProviderOrbitNibiru.class, true, 0);
	
		GalaxyRegistry.registerSatellite(polongniusSpaceStation);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrbitPolongnius.class, new TeleportTypeOrbit());
		GalacticraftRegistry.registerProvider(-3019, WorldProviderOrbitPolongnius.class, false, 0);
		GalacticraftRegistry.registerProvider(-3020, WorldProviderOrbitPolongnius.class, true, 0);
		
		GalaxyRegistry.registerSatellite(siriusBSpaceStation);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrbitSiriusB.class, new TeleportTypeOrbit());
		GalacticraftRegistry.registerProvider(-3021, WorldProviderOrbitSiriusB.class, false, 0);
		GalacticraftRegistry.registerProvider(-3022, WorldProviderOrbitSiriusB.class, true, 0);
		
		GalaxyRegistry.registerSatellite(kapteynBSpaceStation);
		GalacticraftRegistry.registerTeleportType(WorldProviderOrbitKapteynB.class, new TeleportTypeOrbit());
		GalacticraftRegistry.registerProvider(-3023, WorldProviderOrbitKapteynB.class, false, 0);
		GalacticraftRegistry.registerProvider(-3024, WorldProviderOrbitKapteynB.class, true, 0);
	}

	private static void registerSatellitesRecipes() {
		final HashMap<Object, Integer> inputMap = new HashMap<Object, Integer>();
		inputMap.put("ingotTin", 32);
		inputMap.put("waferAdvanced", 1);
		inputMap.put(Items.iron_ingot, 24);
		
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3001, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.mercury")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3003, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.venus")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3005, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3007, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.deimos")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3009, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3011, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.fronos")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3013, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.koentus")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3015, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3017, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.phobos")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3019, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.polongnius")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3021, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.siriusB")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		GalacticraftRegistry.registerSpaceStation(new SpaceStationType(-3023, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.kapteynB")).getDimensionID(), new SpaceStationRecipe(inputMap)));


	};
}
