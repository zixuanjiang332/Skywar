package jdd.skyWar;

import jdd.skyWar.playerEvent.MyfirstListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyWar extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new MyfirstListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
