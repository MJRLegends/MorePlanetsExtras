package com.mjr.moreplanetsextras;

import net.minecraft.world.DimensionType;

import com.mjr.moreplanetsextras.spaceStations.WorldProviderOrbitChalos;
import com.mjr.moreplanetsextras.spaceStations.WorldProviderOrbitDiona;
import com.mjr.moreplanetsextras.spaceStations.WorldProviderOrbitNibiru;

public class Dimensions {

	public static DimensionType DIONA_ORBIT = DimensionType.register("Diona Space Station", "_diona_orbit", Config.dionaSpaceStationID, WorldProviderOrbitDiona.class, false);
	public static DimensionType CHALOS_ORBIT = DimensionType.register("Chalos Space Station", "_chalos_orbit", Config.chalosSpaceStationID, WorldProviderOrbitChalos.class, false);
	public static DimensionType NIBIRU_ORBIT = DimensionType.register("Nibiru Space Station", "_nibiru_orbit", Config.nibiruSpaceStationID, WorldProviderOrbitNibiru.class, false);

}
