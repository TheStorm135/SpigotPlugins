package io.github.thestorm135.particleplugin.Commands;

import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ParticleCommand implements CommandExecutor {
    public boolean on;
    public boolean pon;
    private boolean something = true;

    public void toggle() {
        this.something = !this.something;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            toggle();
            



        }

        return true;
    }


}
