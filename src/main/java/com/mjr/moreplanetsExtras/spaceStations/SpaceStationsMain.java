package com.mjr.moreplanetsextras.spaceStations;

import java.util.HashMap;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.Satellite;
import micdoodle8.mods.galacticraft.api.recipe.SpaceStationRecipe;
import micdoodle8.mods.galacticraft.api.world.SpaceStationType;
import micdoodle8.mods.galacticraft.core.dimension.TeleportTypeOrbit;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mjr.moreplanetsextras.Config;

public class SpaceStationsMain {
	public static Satellite dionaSpaceStation;
	public static Satellite chalosSpaceStation;
	public static Satellite nibiruSpaceStation;

	public static void init() {
		initializeSatellites();
		registerSatellites();
		registerSatellitesRecipes();
	}

	private static void initializeSatellites() {
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona") != null && Config.dionaSpaceStation) {
			dionaSpaceStation = new Satellite("spaceStation.diona").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona"));
			dionaSpaceStation.setRelativeSize(0.2667F);
			dionaSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			dionaSpaceStation.setRelativeOrbitTime(20.0F);
			dionaSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona")).getTierRequirement());
			dionaSpaceStation.setDimensionInfo(Config.dionaSpaceStationID, Config.dionaSpaceStationStaticID, WorldProviderOrbitDiona.class);
			dionaSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.chalos") != null && Config.chalosSpaceStation) {
			chalosSpaceStation = new Satellite("spaceStation.chalos").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.chalos"));
			chalosSpaceStation.setRelativeSize(0.2667F);
			chalosSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			chalosSpaceStation.setRelativeOrbitTime(20.0F);
			chalosSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.chalos")).getTierRequirement());
			chalosSpaceStation.setDimensionInfo(Config.chalosSpaceStationID, Config.chalosSpaceStationStaticID, WorldProviderOrbitChalos.class);
			chalosSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru") != null && Config.nibiruSpaceStation) {
			nibiruSpaceStation = new Satellite("spaceStation.nibiru").setParentBody((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru"));
			nibiruSpaceStation.setRelativeSize(0.2667F);
			nibiruSpaceStation.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(5.5F, 5.5F));
			nibiruSpaceStation.setRelativeOrbitTime(20.0F);
			nibiruSpaceStation.setTierRequired(((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru")).getTierRequirement());
			nibiruSpaceStation.setDimensionInfo(Config.nibiruSpaceStationID, Config.nibiruSpaceStationStaticID, WorldProviderOrbitNibiru.class);
			nibiruSpaceStation.setBodyIcon(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/spaceStation.png"));
		}
	}

	private static void registerSatellites() {
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona") != null && Config.dionaSpaceStation) {
			GalaxyRegistry.registerSatellite(dionaSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitDiona.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerDimension("Diona Space Station", "_diona_orbit", Config.dionaSpaceStationID, WorldProviderOrbitDiona.class, false);
			GalacticraftRegistry.registerDimension("Diona Space Station", "_diona_orbit", Config.dionaSpaceStationStaticID, WorldProviderOrbitDiona.class, true);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.chalos") != null && Config.chalosSpaceStation) {
			GalaxyRegistry.registerSatellite(chalosSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitDiona.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerDimension("Chalos Space Station", "_chalos_orbit", Config.chalosSpaceStationID, WorldProviderOrbitChalos.class, false);
			GalacticraftRegistry.registerDimension("Chalos Space Station", "_chalos_orbit", Config.chalosSpaceStationStaticID, WorldProviderOrbitChalos.class, true);
		}
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.nibiru") != null && Config.nibiruSpaceStation) {
			GalaxyRegistry.registerSatellite(nibiruSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitDiona.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerDimension("Nibiru Space Station", "_nibiru_orbit", Config.nibiruSpaceStationID, WorldProviderOrbitNibiru.class, false);
			GalacticraftRegistry.registerDimension("Nibiru Space Station", "_nibiru_orbit", Config.nibiruSpaceStationStaticID, WorldProviderOrbitNibiru.class, true);
		}
	}

	@SuppressWarnings("deprecation")
	private static void registerSatellitesRecipes() {
		HashMap<Object, Integer> inputMap = new HashMap<Object, Integer>();
		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona") != null && dionaSpaceStation != null) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put(new ItemStack(GameRegistry.findItem("MorePlanets", "diona_item"), 1, 0), 32);
			inputMap.put(new ItemStack(GameRegistry.findItem("MorePlanets", "diona_item"), 1, 1), 32);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.dionaSpaceStationID, ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona")).getDimensionID(), new SpaceStationRecipe(inputMap)));
		}
	};
}
