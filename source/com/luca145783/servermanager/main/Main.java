package com.luca145783.servermanager.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	ConsoleCommandSender console = Bukkit.getConsoleSender();
		
	public void onEnable() {
		loadConfiguration();
		console.sendMessage(ChatColor.translateAlternateColorCodes('&', "[" + getDescription().getName() + "] v" + getDescription().getVersion() + " erfolgreich geladen."));
	}
	
	public void loadConfiguration() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
}
