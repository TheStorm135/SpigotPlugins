package io.github.thestorm135.particleplugin.Events;

import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import javax.annotation.Nullable;

public class ElytraParticle implements Listener {
     @EventHandler
    public void ElytraFeetParticle(PlayerMoveEvent e){
         Player p = e.getPlayer();
         if (p.isGliding()){

             p.spawnParticle(Particle.ELECTRIC_SPARK, p.getLocation(), 25);
         }
     }
}
