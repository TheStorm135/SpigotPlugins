package io.github.thestorm135.particleplugin;

import io.github.thestorm135.particleplugin.Commands.ParticleCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class ParticlePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("Particle").setExecutor(new ParticleCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
