package com.luca145783.servermanager.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static ConsoleCommandSender console = Bukkit.getConsoleSender();
	
	public void onEnable() {
		console.sendMessage(ChatColor.translateAlternateColorCodes('&', "[ServerManager] Plugin v0.1 erfolgreich geladen."));
	}
	
}
