package com.mjr.moreplanetsextras.handlers;

import micdoodle8.mods.galacticraft.core.client.CloudRenderer;
import micdoodle8.mods.galacticraft.core.client.SkyProviderOrbit;
import micdoodle8.mods.galacticraft.core.dimension.WorldProviderOverworldOrbit;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;

import com.mjr.moreplanetsextras.spaceStations.WorldProviderOrbitChalos;
import com.mjr.moreplanetsextras.spaceStations.WorldProviderOrbitDiona;
import com.mjr.moreplanetsextras.spaceStations.WorldProviderOrbitNibiru;

public class TickHandlerClient {
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event) {
		final Minecraft minecraft = FMLClientHandler.instance().getClient();
		final WorldClient world = minecraft.theWorld;
		final EntityPlayerSP player = minecraft.thePlayer;

		if (event.phase == Phase.START) {
			if (world != null) {
				if (world.provider instanceof WorldProviderOrbitDiona) {
					if (world.provider.getSkyRenderer() == null || world.provider.getSkyRenderer() instanceof SkyProviderOrbit) {
						world.provider.setSkyRenderer(new SkyProviderOrbit(new ResourceLocation("moreplanets:textures/gui/celestialbodies/diona.png"), false, true));
						((SkyProviderOrbit) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOverworldOrbit) world.provider).getSpinManager().getSpinRate();
						micdoodle8.mods.galacticraft.core.entities.player.GCPlayerStatsClient stats = player.getCapability(micdoodle8.mods.galacticraft.core.entities.player.GCCapabilities.GC_STATS_CLIENT_CAPABILITY, null);
						stats.setInFreefallFirstCheck(false);
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				}
				if (world.provider instanceof WorldProviderOrbitChalos) {
					if (world.provider.getSkyRenderer() == null || world.provider.getSkyRenderer() instanceof SkyProviderOrbit) {
						world.provider.setSkyRenderer(new SkyProviderOrbit(new ResourceLocation("moreplanets:textures/gui/celestialbodies/chalos.png"), false, true));
						((SkyProviderOrbit) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOverworldOrbit) world.provider).getSpinManager().getSpinRate();
						micdoodle8.mods.galacticraft.core.entities.player.GCPlayerStatsClient stats = player.getCapability(micdoodle8.mods.galacticraft.core.entities.player.GCCapabilities.GC_STATS_CLIENT_CAPABILITY, null);
						stats.setInFreefallFirstCheck(false);
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				}
				if (world.provider instanceof WorldProviderOrbitNibiru) {
					if (world.provider.getSkyRenderer() == null || world.provider.getSkyRenderer() instanceof SkyProviderOrbit) {
						world.provider.setSkyRenderer(new SkyProviderOrbit(new ResourceLocation("moreplanets:textures/gui/celestialbodies/nibiru.png"), false, true));
						((SkyProviderOrbit) world.provider.getSkyRenderer()).spinDeltaPerTick = ((WorldProviderOverworldOrbit) world.provider).getSpinManager().getSpinRate();
						micdoodle8.mods.galacticraft.core.entities.player.GCPlayerStatsClient stats = player.getCapability(micdoodle8.mods.galacticraft.core.entities.player.GCCapabilities.GC_STATS_CLIENT_CAPABILITY, null);
						stats.setInFreefallFirstCheck(false);
					}

					if (world.provider.getCloudRenderer() == null) {
						world.provider.setCloudRenderer(new CloudRenderer());
					}
				}
			}
		}
	}
}