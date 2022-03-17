package io.github.thestorm135.consolesender;

import io.github.thestorm135.consolesender.Commands.PlayerConsoleSayCommand;
import org.bukkit.plugin.java.JavaPlugin;


public final class ConsoleSender extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("csend").setExecutor(new PlayerConsoleSayCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
