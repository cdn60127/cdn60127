package com.github.cdn60127.TestPlugin;

import java.util.logging.Logger;

import org.bukkit.entity.Minecart;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {

	Logger log;
	Minecart cart;

	public void onEnable(){
		log = this.getLogger();
		cart.setMaxSpeed(1.0D);
		log.info("Your plugin has been enabled!");
	}

	public void onDisable(){
		log.info("Your plugin has been disabled.");
	}

}
