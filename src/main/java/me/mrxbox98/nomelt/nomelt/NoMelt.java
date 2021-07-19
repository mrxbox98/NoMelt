package me.mrxbox98.nomelt.nomelt;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoMelt extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new MeltListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
