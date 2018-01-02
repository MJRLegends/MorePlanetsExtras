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
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mjr.moreplanetsExtras.Config;

public class SpaceStationsMain {
	public static Satellite dionaSpaceStation;

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
	}

	private static void registerSatellites() {

		if (GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.diona") != null && Config.dionaSpaceStation) {
			GalaxyRegistry.registerSatellite(dionaSpaceStation);
			GalacticraftRegistry.registerTeleportType(WorldProviderOrbitDiona.class, new TeleportTypeOrbit());
			GalacticraftRegistry.registerDimension("Diona Space Station", "_diona_orbit", Config.dionaSpaceStationID, WorldProviderOrbitDiona.class, false);
			GalacticraftRegistry.registerDimension("Diona Space Station", "_diona_orbit", Config.dionaSpaceStationStaticID, WorldProviderOrbitDiona.class, true);
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
