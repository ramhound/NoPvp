package com.sosmedia.nopvp;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class OnEntityDeathListener implements Listener {

	NoPvpMain plugin;

	public OnEntityDeathListener(NoPvpMain in) {
		plugin = in;
	}
	@EventHandler
	public void onEntityDeath(EntityDeathEvent event) {

		Entity entityKiller = event.getEntity().getKiller();
		Entity entityKilled = event.getEntity();

		if(entityKiller instanceof Player && entityKilled instanceof Player) {
			Player player = (Player) entityKiller; 
			player.getLocation().getWorld().strikeLightningEffect(player.getLocation());
			player.damage(40);
		}
	}
}
