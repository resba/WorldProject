package com.resbah.WorldProject;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class WorldProject extends JavaPlugin{

    Logger log = this.getServer().getLogger();
    
    public void onEnable(){
        log.info(this.getDescription().getName() + " Version: "+this.getDescription().getVersion()+" has been loaded.");
    }
    
    public void onDisable(){
        
    }   
    
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent e){
        Player player = e.getPlayer();
        player.sendMessage("Player has logged in!");
    }
}
