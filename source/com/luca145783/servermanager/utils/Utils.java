package com.luca145783.servermanager.utils;

import com.luca145783.servermanager.main.Main;

public class Utils {
	
	private static Main main;
	
	@SuppressWarnings("static-access")
	public Utils(Main main) {
		this.main = main;
	}
	
	public static void loadConfiguration() {
		main.getConfig().options().copyDefaults(true);
		main.saveConfig();
	}
	
	public static String getString(String string) {
		String out = main.getConfig().getString(string);
		return out;
	}

}
