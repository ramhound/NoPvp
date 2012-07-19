package com.sosmedia.nopvp;

import org.bukkit.plugin.java.JavaPlugin;

public class NoPvpMain extends JavaPlugin {

	@Override
	public void onEnable ()
	{
		getServer().getPluginManager().registerEvents(new OnEntityDeathListener(this), this);
	}
	@Override
	public void onDisable ()
	{

	}

}
