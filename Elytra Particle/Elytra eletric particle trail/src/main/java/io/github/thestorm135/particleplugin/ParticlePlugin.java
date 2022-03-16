package io.github.thestorm135.particleplugin;

import io.github.thestorm135.particleplugin.Events.ElytraParticle;
import org.bukkit.plugin.java.JavaPlugin;

public final class ParticlePlugin extends JavaPlugin {



    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ElytraParticle(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



}
