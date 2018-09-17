package com.luca145783.servermanager.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.luca145783.servermanager.utils.Utils;

public class Main extends JavaPlugin {
	
	private static ConsoleCommandSender console = Bukkit.getConsoleSender();
		
	public void onEnable() {
		Utils.loadConfiguration();
		console.sendMessage(ChatColor.translateAlternateColorCodes('&', "[Server-Manager] Plugin " + getDescription().getVersion() + " erfolgreich geladen."));
	}
	
}
