package com.mjr.moreplanetsextras;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {
	private static String spacestationCustom = "space stations";
	private static String spacestationid = "space stations dimension ids";

	public static int dionaSpaceStationID;
	public static int dionaSpaceStationStaticID;

	public static int chalosSpaceStationID;
	public static int chalosSpaceStationStaticID;

	public static int nibiruSpaceStationID;
	public static int nibiruSpaceStationStaticID;

	public static boolean dionaSpaceStation;
	public static boolean chalosSpaceStation;
	public static boolean nibiruSpaceStation;

	public static void load() {
		Configuration config = new Configuration(new File("config/MorePlanetsExtras.cfg"));
		config.load();

		config.addCustomCategoryComment(spacestationCustom, "Disabling this will remove the space station from the planet");
		config.addCustomCategoryComment(spacestationid, "Change if a dimension ID is causing conflicts!");

		dionaSpaceStation = config.get(spacestationCustom, "Diona SpaceStation", true, "").getBoolean(true);
		dionaSpaceStationID = config.get(spacestationid, "Diona SpaceStation Dimension ID", -3007).getInt();
		dionaSpaceStationStaticID = config.get(spacestationid, "Diona SpaceStation Static Dimension ID", -3008).getInt();

		chalosSpaceStation = config.get(spacestationCustom, "Chalos SpaceStation", true, "").getBoolean(true);
		chalosSpaceStationID = config.get(spacestationid, "Chalos SpaceStation Dimension ID", -3009).getInt();
		chalosSpaceStationStaticID = config.get(spacestationid, "Chalos SpaceStation Static Dimension ID", -3010).getInt();

		nibiruSpaceStation = config.get(spacestationCustom, "Nibiru SpaceStation", true, "").getBoolean(true);
		nibiruSpaceStationID = config.get(spacestationid, "Nibiru SpaceStation Dimension ID", -3011).getInt();
		nibiruSpaceStationStaticID = config.get(spacestationid, "Nibiru SpaceStation Static Dimension ID", -3012).getInt();
		config.save();
	}

}
