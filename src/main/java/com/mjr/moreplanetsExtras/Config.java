package com.mjr.moreplanetsExtras;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {
	private static String spacestationCustom = "space stations";
	private static String spacestationid = "space stations dimension ids";

	public static int mercurySpaceStationID;
	public static int mercurySpaceStationStaticID;

	public static int venusSpaceStationID;
	public static int venusSpaceStationStaticID;

	public static int plutoSpaceStationID;
	public static int plutoSpaceStationStaticID;

	public static int dionaSpaceStationID;
	public static int dionaSpaceStationStaticID;

	public static int fronosSpaceStationID;
	public static int fronosSpaceStationStaticID;

	public static int nibiruSpaceStationID;
	public static int nibiruSpaceStationStaticID;

	public static int polongniusSpaceStationID;
	public static int polongniusSpaceStationStaticID;

	public static int siriusBSpaceStationID;
	public static int siriusBSpaceStationStaticID;

	public static int kapteynBSpaceStationID;
	public static int kapteynBSpaceStationStaticID;

	public static boolean mercurySpaceStation;
	public static boolean venusSpaceStation;
	public static boolean plutoSpaceStation;
	public static boolean dionaSpaceStation;
	public static boolean fronosSpaceStation;
	public static boolean nibiruSpaceStation;
	public static boolean polongniusSpaceStation;
	public static boolean siriusBSpaceStation;
	public static boolean kapteynBSpaceStation;

	public static void load() {
		Configuration config = new Configuration(new File("config/MorePlanetsExtras.cfg"));
		config.load();

		config.addCustomCategoryComment(spacestationCustom, "Disabling this will remove the space station from the planet");
		config.addCustomCategoryComment(spacestationid, "Change if a dimension ID is causing conflicts!");

		mercurySpaceStation = config.get(spacestationCustom, "Mercury SpaceStation", true, "").getBoolean(true);
		venusSpaceStation = config.get(spacestationCustom, "Venus SpaceStation", true, "").getBoolean(true);
		dionaSpaceStation = config.get(spacestationCustom, "Diona SpaceStation", true, "").getBoolean(true);
		plutoSpaceStation = config.get(spacestationCustom, "Pluto SpaceStation", true, "").getBoolean(true);
		fronosSpaceStation = config.get(spacestationCustom, "Fronos SpaceStation", true, "").getBoolean(true);
		nibiruSpaceStation = config.get(spacestationCustom, "Nibiru SpaceStation", true, "").getBoolean(true);
		polongniusSpaceStation = config.get(spacestationCustom, "Polongnius SpaceStation", true, "").getBoolean(true);
		siriusBSpaceStation = config.get(spacestationCustom, "Sirius B SpaceStation", true, "").getBoolean(true);
		kapteynBSpaceStation = config.get(spacestationCustom, "Kapteyn B SpaceStation", true, "").getBoolean(true);

		mercurySpaceStationID = config.get(spacestationid, "Mercury SpaceStation Dimension ID", -3001).getInt();
		mercurySpaceStationStaticID = config.get(spacestationid, "Mercury SpaceStation Static Dimension ID", -3002).getInt();

		venusSpaceStationID = config.get(spacestationid, "Venus SpaceStation Dimension ID", -3003).getInt();
		venusSpaceStationStaticID = config.get(spacestationid, "Venus SpaceStation Static Dimension ID", -3004).getInt();

		plutoSpaceStationID = config.get(spacestationid, "Pluto SpaceStation Dimension ID", -3005).getInt();
		plutoSpaceStationStaticID = config.get(spacestationid, "Pluto SpaceStation Static Dimension ID", -3006).getInt();

		dionaSpaceStationID = config.get(spacestationid, "Diona SpaceStation Dimension ID", -3007).getInt();
		dionaSpaceStationStaticID = config.get(spacestationid, "Diona SpaceStation Static Dimension ID", -3008).getInt();

		fronosSpaceStationID = config.get(spacestationid, "Fronos SpaceStation Dimension ID", -3009).getInt();
		fronosSpaceStationStaticID = config.get(spacestationid, "Fronos SpaceStation Static Dimension ID", -3010).getInt();

		nibiruSpaceStationID = config.get(spacestationid, "Nibiru SpaceStation Dimension ID", -3011).getInt();
		nibiruSpaceStationStaticID = config.get(spacestationid, "Nibiru SpaceStation Static Dimension ID", -3012).getInt();

		polongniusSpaceStationID = config.get(spacestationid, "Polongnius SpaceStation Dimension ID", -3013).getInt();
		polongniusSpaceStationStaticID = config.get(spacestationid, "Polongnius SpaceStation Static Dimension ID", -3014).getInt();

		siriusBSpaceStationID = config.get(spacestationid, "Sirius B SpaceStation Dimension ID", -3015).getInt();
		siriusBSpaceStationStaticID = config.get(spacestationid, "Sirius B SpaceStation Static Dimension ID", -3016).getInt();

		kapteynBSpaceStationID = config.get(spacestationid, "Kapteyn B SpaceStation Dimension ID", -3017).getInt();
		kapteynBSpaceStationStaticID = config.get(spacestationid, "Kapteyn B SpaceStation Static Dimension ID", -3018).getInt();

		config.save();
	}

}
