package com.mjr.moreplanetsExtras.spaceStations;

import com.mjr.moreplanetsExtras.SkyProviderOrbitCustom;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.dimension.WorldProviderOrbit;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import net.minecraft.util.MathHelper;
import net.minecraftforge.client.IRenderHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldProviderOrbitPluto extends WorldProviderOrbit{

	private float angularVelocityRadians = 0.0F;
	private float skyAngularVelocity = (float) (this.angularVelocityRadians * 180.0F / 3.141592653589793D);

	@Override
	public CelestialBody getCelestialBody()
	{
		return SpaceStationsMain.plutoSpaceStation;
	}

	@Override
	public Vector3 getFogColor()
	{
		return new Vector3(0, 0, 0);
	}

	@Override
	public Vector3 getSkyColor()
	{
		return new Vector3(0, 0, 0);
	}

	@Override
	public boolean canRainOrSnow()
	{
		return false;
	}

	@Override
	public boolean hasSunset()
	{
		return false;
	}

	@Override
	public long getDayLength()
	{
		return 24000L;
	}

	@Override
	public boolean shouldForceRespawn()
	{
		return true;
	}

	@Override
	public boolean isDaytime()
	{
		final float a = this.worldObj.getCelestialAngle(0F);
		//TODO: adjust this according to size of planet below
		return a < 0.42F || a > 0.58F;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getStarBrightness(float par1)
	{
		final float var2 = this.worldObj.getCelestialAngle(par1);
		float var3 = 1.0F - (MathHelper.cos(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.25F);

		if (var3 < 0.0F)
		{
			var3 = 0.0F;
		}

		if (var3 > 1.0F)
		{
			var3 = 1.0F;
		}

		return var3 * var3 * 0.5F + 0.3F;
	}


	@Override
	public boolean isSkyColored()
	{
		return false;
	}

	@Override
	public double getHorizon()
	{
		return 44.0D;
	}

	@Override
	public int getAverageGroundLevel()
	{
		return 44;
	}

	@Override
	public boolean isSurfaceWorld()
	{
		return true;
	}


	@Override
	public boolean canCoordinateBeSpawn(int var1, int var2)
	{
		return true;
	}

	@Override
	public float getGravity()
	{
		return 0.073F;//0.073F;
	}

	@Override
	public boolean hasBreathableAtmosphere()
	{
		return false;
	}

	@Override
	public double getMeteorFrequency()
	{
		return 0;
	}

	@Override
	public double getFuelUsageMultiplier()
	{
		return 1.9D;
	}

	@Override
	public String getPlanetToOrbit()
	{
		return "planet.pluto";
	}

	@Override
	public int getYCoordToTeleportToPlanet()
	{
		return 10;
	}

	@Override
	public String getSaveFolder()
	{
		return "DIM_SPACESTATION_Pluto_" + this.spaceStationDimensionID;
	}

	@Override
	public double getSolarEnergyMultiplier()
	{
		return ConfigManagerCore.spaceStationEnergyScalar;
	}

	@Override
	public double getYCoordinateToTeleport()
	{
		return 1200;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier)
	{
		return tier >= ((Planet) GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet.pluto")).getTierRequirement();
	}

	@Override
	public float getFallDamageModifier()
	{
		return 0.4F;
	}

	@Override
	public float getSoundVolReductionAmount()
	{
		return 50.0F;
	}
	
	@Override
	public float getThermalLevelModifier()
	{
		return 0;
	}

	@Override
	public float getWindLevel()
	{
		return 0.1F;
	}
	
	public void setSpinRate(float angle) {
		super.setSpinRate(angle);
		this.angularVelocityRadians = angle;
		this.skyAngularVelocity = (angle * 180.0F / 3.1415927F);
		if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
			updateSkyProviderSpinRate();
		}
	}

	@SideOnly(Side.CLIENT)
	private void updateSkyProviderSpinRate() {
		IRenderHandler sky = getSkyRenderer();
		if ((sky instanceof SkyProviderOrbitCustom)) {
			((SkyProviderOrbitCustom) sky).spinDeltaPerTick = this.skyAngularVelocity;
		}
	}

	public void setSpinRate(float angle, boolean firing) {
		super.setSpinRate(angle, firing);
		this.angularVelocityRadians = angle;
		this.skyAngularVelocity = (angle * 180.0F / 3.1415927F);
		IRenderHandler sky = getSkyRenderer();
		if ((sky instanceof SkyProviderOrbitCustom)) {
			((SkyProviderOrbitCustom) sky).spinDeltaPerTick = this.skyAngularVelocity;
		}
		this.thrustersFiring = firing;
	}
}
