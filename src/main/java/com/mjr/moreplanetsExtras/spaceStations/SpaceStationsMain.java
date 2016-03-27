package com.mjr.moreplanetsExtras.spaceStations;

import java.util.HashMap;

import com.mjr.moreplanetsExtras.Config;

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
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.mercury") != null && Config.mercurySpaceStation) {
			mercurySpaceStation = new Satellite("spaceStation.mercury").setParentBody((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.mercury"));
			mercurySpaceStation.setRelativeSize(0.2667F);
			mercurySpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			mercurySpaceStation.setRelativeOrbitTime(20.0F);
			mercurySpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.mercury")).getTierRequirement());
			mercurySpaceStation.setDimensionInfo(Config.mercurySpaceStationID, Config.mercurySpaceStationStaticID, WorldProviderOrbitMercury.class);
			mercurySpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.venus") != null && Config.venusSpaceStation) {
			venusSpaceStation = new Satellite("spaceStation.venus").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.venus"));
			venusSpaceStation.setRelativeSize(0.2667F);
			venusSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			venusSpaceStation.setRelativeOrbitTime(20.0F);
			venusSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.venus")).getTierRequirement());
			venusSpaceStation.setDimensionInfo(Config.venusSpaceStationID, Config.venusSpaceStationStaticID, WorldProviderOrbitVenus.class);
			venusSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto") != null && Config.plutoSpaceStation) {
			plutoSpaceStation = new Satellite("spaceStation.pluto").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto"));
			plutoSpaceStation.setRelativeSize(0.2667F);
			plutoSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			plutoSpaceStation.setRelativeOrbitTime(20.0F);
			plutoSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto")).getTierRequirement());
			plutoSpaceStation.setDimensionInfo(Config.plutoSpaceStationID, Config.plutoSpaceStationStaticID, WorldProviderOrbitPluto.class);
			plutoSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona") != null && Config.dionaSpaceStation) {
			dionaSpaceStation = new Satellite("spaceStation.diona").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona"));
			dionaSpaceStation.setRelativeSize(0.2667F);
			dionaSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			dionaSpaceStation.setRelativeOrbitTime(20.0F);
			dionaSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona")).getTierRequirement());
			dionaSpaceStation.setDimensionInfo(Config.dionaSpaceStationID, Config.dionaSpaceStationStaticID, WorldProviderOrbitDiona.class);
			dionaSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.fronos") != null && Config.fronosSpaceStation) {
			fronosSpaceStation = new Satellite("spaceStation.fronos").setParentBody((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.fronos"));
			fronosSpaceStation.setRelativeSize(0.2667F);
			fronosSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			fronosSpaceStation.setRelativeOrbitTime(20.0F);
			fronosSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.fronos")).getTierRequirement());
			fronosSpaceStation.setDimensionInfo(Config.fronosSpaceStationID, Config.fronosSpaceStationStaticID, WorldProviderOrbitFronos.class);
			fronosSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru") != null && Config.nibiruSpaceStation) {
			nibiruSpaceStation = new Satellite("spaceStation.nibiru").setParentBody((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.nibiru"));
			nibiruSpaceStation.setRelativeSize(0.2667F);
			nibiruSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			nibiruSpaceStation.setRelativeOrbitTime(20.0F);
			nibiruSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru")).getTierRequirement());
			nibiruSpaceStation.setDimensionInfo(Config.nibiruSpaceStationID, Config.nibiruSpaceStationStaticID, WorldProviderOrbitNibiru.class);
			nibiruSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.polongnius") != null && Config.polongniusSpaceStation) {
			polongniusSpaceStation = new Satellite("spaceStation.polongnius").setParentBody((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.polongnius"));
			polongniusSpaceStation.setRelativeSize(0.2667F);
			polongniusSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			polongniusSpaceStation.setRelativeOrbitTime(20.0F);
			polongniusSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.polongnius")).getTierRequirement());
			polongniusSpaceStation.setDimensionInfo(Config.polongniusSpaceStationID, Config.polongniusSpaceStationStaticID, WorldProviderOrbitPolongnius.class);
			polongniusSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.siriusB") != null && Config.siriusBSpaceStation) {
			siriusBSpaceStation = new Satellite("spaceStation.siriusB").setParentBody((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.siriusB"));
			siriusBSpaceStation.setRelativeSize(0.2667F);
			siriusBSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			siriusBSpaceStation.setRelativeOrbitTime(20.0F);
			siriusBSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.siriusB")).getTierRequirement());
			siriusBSpaceStation.setDimensionInfo(Config.siriusBSpaceStationID, Config.siriusBSpaceStationStaticID, WorldProviderOrbitSiriusB.class);
			siriusBSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.kapteynB") != null && Config.kapteynBSpaceStation) {
			kapteynBSpaceStation = new Satellite("spaceStation.kapteynB").setParentBody((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.kapteynB"));
			kapteynBSpaceStation.setRelativeSize(0.2667F);
			kapteynBSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			kapteynBSpaceStation.setRelativeOrbitTime(20.0F);
			kapteynBSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.kapteynB")).getTierRequirement());
			kapteynBSpaceStation.setDimensionInfo(Config.kapteynBSpaceStationID, Config.kapteynBSpaceStationStaticID, WorldProviderOrbitKapteynB.class);
			kapteynBSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
	}

	private static void registerSatellites() {
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.mercury") != null && Config.mercurySpaceStation) {
			GalaxyRegistry.registerSatellite(mercurySpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitMercury.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerProvider(-3001, WorldProviderOrbitMercury.class, false, 0);
			GalacticraftRegistry.registerProvider(-3002, WorldProviderOrbitMercury.class, true, 0);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.venus") != null && Config.venusSpaceStation) {
			GalaxyRegistry.registerSatellite(venusSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitVenus.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerProvider(-3003, WorldProviderOrbitVenus.class, false, 0);
			GalacticraftRegistry.registerProvider(-3004, WorldProviderOrbitVenus.class, true, 0);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto") != null && Config.plutoSpaceStation) {
			GalaxyRegistry.registerSatellite(plutoSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitPluto.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerProvider(-3005, WorldProviderOrbitPluto.class, false, 0);
			GalacticraftRegistry.registerProvider(-3006, WorldProviderOrbitPluto.class, true, 0);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona") != null && Config.dionaSpaceStation) {
			GalaxyRegistry.registerSatellite(dionaSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitDiona.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerProvider(-3009, WorldProviderOrbitDiona.class, false, 0);
			GalacticraftRegistry.registerProvider(-3010, WorldProviderOrbitDiona.class, true, 0);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.fronos") != null && Config.fronosSpaceStation) {
			GalaxyRegistry.registerSatellite(fronosSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitFronos.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerProvider(-3011, WorldProviderOrbitFronos.class, false, 0);
			GalacticraftRegistry.registerProvider(-3012, WorldProviderOrbitFronos.class, true, 0);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru") != null && Config.nibiruSpaceStation) {
			GalaxyRegistry.registerSatellite(nibiruSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitNibiru.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerProvider(-3015, WorldProviderOrbitNibiru.class, false, 0);
			GalacticraftRegistry.registerProvider(-3016, WorldProviderOrbitNibiru.class, true, 0);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.polongnius") != null && Config.polongniusSpaceStation) {
			GalaxyRegistry.registerSatellite(polongniusSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitPolongnius.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerProvider(-3019, WorldProviderOrbitPolongnius.class, false, 0);
			GalacticraftRegistry.registerProvider(-3020, WorldProviderOrbitPolongnius.class, true, 0);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.siriusB") != null && Config.siriusBSpaceStation) {
			GalaxyRegistry.registerSatellite(siriusBSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitSiriusB.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerProvider(-3021, WorldProviderOrbitSiriusB.class, false, 0);
			GalacticraftRegistry.registerProvider(-3022, WorldProviderOrbitSiriusB.class, true, 0);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.kapteynB") != null && Config.kapteynBSpaceStation) {
			GalaxyRegistry.registerSatellite(kapteynBSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitKapteynB.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerProvider(-3023, WorldProviderOrbitKapteynB.class, false, 0);
			GalacticraftRegistry.registerProvider(-3024, WorldProviderOrbitKapteynB.class, true, 0);
		}
	}

	private static void registerSatellitesRecipes() {
		final HashMap<Object, Integer> inputMap = new HashMap<Object, Integer>();
		inputMap.put("ingotTin", 32);
		inputMap.put("waferAdvanced", 1);
		inputMap.put(Items.iron_ingot, 24);

		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.mercury") != null && mercurySpaceStation != null)
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.mercurySpaceStationID, ((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.mercury")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.venus") != null && venusSpaceStation != null)
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.venusSpaceStationID, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.venus"))
					.getDimensionID(), new SpaceStationRecipe(inputMap)));
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto") != null && plutoSpaceStation != null)
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.plutoSpaceStationID, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto"))
					.getDimensionID(), new SpaceStationRecipe(inputMap)));
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona") != null && dionaSpaceStation != null)
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.dionaSpaceStationID, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona"))
					.getDimensionID(), new SpaceStationRecipe(inputMap)));
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.fronos") != null && fronosSpaceStation != null)
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.fronosSpaceStationID,
					((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.fronos")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru") != null && nibiruSpaceStation != null)
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.nibiruSpaceStationID,
					((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.polongnius") != null && polongniusSpaceStation != null)
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.polongniusSpaceStationID, ((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.polongnius")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.siriusB") != null && siriusBSpaceStation != null)
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.siriusBSpaceStationID, ((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.siriusB")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.kapteynB") != null && kapteynBSpaceStation != null)
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.kapteynBSpaceStationID, ((Planet) GalaxyRegistry
					.getCelestialBodyFromUnlocalizedName("planet.kapteynB")).getDimensionID(), new SpaceStationRecipe(inputMap)));

	};
}
