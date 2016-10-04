package com.mjr.moreplanetsExtras.handlers;

import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.client.CloudRenderer;
import micdoodle8.mods.galacticraft.core.entities.player.GCPlayerStatsClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.ResourceLocation;

import com.mjr.moreplanetsExtras.SkyProviderOrbitCustom;
import com.mjr.moreplanetsExtras.spaceStations.WorldProviderOrbitDiona;
import com.mjr.moreplanetsExtras.spaceStations.WorldProviderOrbitFronos;
import com.mjr.moreplanetsExtras.spaceStations.WorldProviderOrbitKapteynB;
import com.mjr.moreplanetsExtras.spaceStations.WorldProviderOrbitMercury;
import com.mjr.moreplanetsExtras.spaceStations.WorldProviderOrbitNibiru;
import com.mjr.moreplanetsExtras.spaceStations.WorldProviderOrbitPluto;
import com.mjr.moreplanetsExtras.spaceStations.WorldProviderOrbitPolongnius;
import com.mjr.moreplanetsExtras.spaceStations.WorldProviderOrbitSiriusB;
import com.mjr.moreplanetsExtras.spaceStations.WorldProviderOrbitVenus;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;

public class TickHandlerClient {
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event) {
		final Minecraft minecraft = FMLClientHandler.instance().getClient();
		final WorldClient world = minecraft.theWorld;
		final EntityClientPlayerMP player = minecraft.thePlayer;

		if (event.phase == Phase.START) {
			if (world != null) {
				if (world.provider instanceof WorldProviderOrbitMercury) {
					if (world.provider.getSkyRenderer() == null) {
						world.provider.setSkyRenderer(new SkyProviderOrbitCustom(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/mercury.png"), new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "textures/gui/planets/orbitalsun.png")));
						((SkyProviderOrbitCustom) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOrbitMercury) world.provider).getSpinRate();
						GCPlayerStatsClient.get(player).inFreefallFirstCheck = false;
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				} else if (world.provider instanceof WorldProviderOrbitVenus) {
					if (world.provider.getSkyRenderer() == null) {
						world.provider.setSkyRenderer(new SkyProviderOrbitCustom(new ResourceLocation("galacticraftcore:textures/gui/celestialbodies/venus.png"), new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "textures/gui/planets/orbitalsun.png")));
						((SkyProviderOrbitCustom) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOrbitVenus) world.provider).getSpinRate();
						GCPlayerStatsClient.get(player).inFreefallFirstCheck = false;
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				} else if (world.provider instanceof WorldProviderOrbitPluto) {
					if (world.provider.getSkyRenderer() == null) {
						world.provider.setSkyRenderer(new SkyProviderOrbitCustom(new ResourceLocation("pluto:textures/gui/celestialbodies/pluto.png"), new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "textures/gui/planets/orbitalsun.png")));
						((SkyProviderOrbitCustom) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOrbitPluto) world.provider).getSpinRate();
						GCPlayerStatsClient.get(player).inFreefallFirstCheck = false;
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				} else if (world.provider instanceof WorldProviderOrbitDiona) {
					if (world.provider.getSkyRenderer() == null) {
						world.provider.setSkyRenderer(new SkyProviderOrbitCustom(new ResourceLocation("diona:textures/gui/celestialbodies/diona.png"), new ResourceLocation("mpcore:textures/gui/celestialbodies/sirius_celestial.png")));
						((SkyProviderOrbitCustom) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOrbitDiona) world.provider).getSpinRate();
						GCPlayerStatsClient.get(player).inFreefallFirstCheck = false;
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				} else if (world.provider instanceof WorldProviderOrbitFronos) {
					if (world.provider.getSkyRenderer() == null) {
						world.provider.setSkyRenderer(new SkyProviderOrbitCustom(new ResourceLocation("fronos:textures/gui/celestialbodies/fronos.png"), new ResourceLocation("mpcore:textures/gui/celestialbodies/sirius_celestial.png")));
						((SkyProviderOrbitCustom) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOrbitFronos) world.provider).getSpinRate();
						GCPlayerStatsClient.get(player).inFreefallFirstCheck = false;
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				} else if (world.provider instanceof WorldProviderOrbitNibiru) {
					if (world.provider.getSkyRenderer() == null) {
						world.provider.setSkyRenderer(new SkyProviderOrbitCustom(new ResourceLocation("nibiru:textures/gui/celestialbodies/nibiru.png"), new ResourceLocation("mpcore:textures/gui/celestialbodies/sirius_celestial.png")));
						((SkyProviderOrbitCustom) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOrbitNibiru) world.provider).getSpinRate();
						GCPlayerStatsClient.get(player).inFreefallFirstCheck = false;
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				} else if (world.provider instanceof WorldProviderOrbitPolongnius) {
					if (world.provider.getSkyRenderer() == null) {
						world.provider.setSkyRenderer(new SkyProviderOrbitCustom(new ResourceLocation("polongnius:textures/gui/celestialbodies/polongnius.png"), new ResourceLocation("mpcore:textures/gui/celestialbodies/sirius_celestial.png")));
						((SkyProviderOrbitCustom) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOrbitPolongnius) world.provider).getSpinRate();
						GCPlayerStatsClient.get(player).inFreefallFirstCheck = false;
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				} else if (world.provider instanceof WorldProviderOrbitSiriusB) {
					if (world.provider.getSkyRenderer() == null) {
						world.provider.setSkyRenderer(new SkyProviderOrbitCustom(new ResourceLocation("siriusb:textures/gui/celestialbodies/siriusb.png"), new ResourceLocation("mpcore:textures/gui/celestialbodies/sirius_celestial.png")));
						((SkyProviderOrbitCustom) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOrbitSiriusB) world.provider).getSpinRate();
						GCPlayerStatsClient.get(player).inFreefallFirstCheck = false;
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				} else if (world.provider instanceof WorldProviderOrbitKapteynB) {
					if (world.provider.getSkyRenderer() == null) {
						world.provider.setSkyRenderer(new SkyProviderOrbitCustom(new ResourceLocation("kapteynb:textures/gui/celestialbodies/kapteynb.png"), new ResourceLocation("kapteynb:textures/gui/celestialbodies/kapteyn_star.png")));
						((SkyProviderOrbitCustom) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOrbitKapteynB) world.provider).getSpinRate();
						GCPlayerStatsClient.get(player).inFreefallFirstCheck = false;
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				}
			}
		}
	}
}