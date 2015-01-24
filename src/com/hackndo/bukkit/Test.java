package com.hackndo.bukkit;

import com.hackndo.bukkit.command.CommandHelp;
import com.hackndo.bukkit.listener.HackListener;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Test extends JavaPlugin {
    public static String LOG_PREFIX = "[ TEST ] ";
    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info(LOG_PREFIX + "Plugin Test has been launched !");
        saveDefaultConfig();
        FileConfiguration fileConfiguration = getConfig();
        boolean isEnabled = fileConfiguration.getBoolean("enabled");
        if (isEnabled) {
            getLogger().info(LOG_PREFIX + "Test plugin is enabled");
            CommandExecutor helpExecutor = new CommandHelp();
            getCommand("help").setExecutor(helpExecutor);
            Listener l = new HackListener();
            PluginManager pm = getServer().getPluginManager();
            pm.registerEvents(l, this);
        }
        else {
            getLogger().info(LOG_PREFIX + "Test plugin is disabled");
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        // Actions à effectuer à la désactivation du plugin
        //   - A l'extinction du serveur
        //   - Pendant un /reload
    }
}
