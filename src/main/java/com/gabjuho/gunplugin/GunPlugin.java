package com.gabjuho.gunplugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class GunPlugin extends JavaPlugin {
    @Override
    public void onEnable(){
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[GunPlugin] Plugin is enabled!");
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[GunPlugin] Plugin is disabled!");
    }
}
