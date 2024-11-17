package com.deathcrystals;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DeathCrystalsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DeathCrystalsPlugin.class);
		RuneLite.main(args);
	}
}