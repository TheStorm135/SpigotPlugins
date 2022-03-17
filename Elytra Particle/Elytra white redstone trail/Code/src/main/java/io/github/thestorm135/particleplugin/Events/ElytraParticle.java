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
             Particle.DustTransition i = new Particle.DustTransition(Color.WHITE, Color.RED, 3.0F);
             p.spawnParticle(Particle.REDSTONE, p.getLocation(), 5, i);
         }
     }
}
