package io.github.thestorm135.consolesender.Commands;

import io.github.thestorm135.consolesender.ConsoleSender;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.io.Console;
import java.util.*;

public class PlayerConsoleSayCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Use command 'say' in the console");
        } else if (sender.isOp()) {
            Player p = (Player) sender;
            List<String> messageList = new ArrayList<>();


            Collections.addAll(messageList, args);
            String message = String.join(" ", messageList);
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "say " + message);
        } else {
            sender.sendMessage("You don't have permission to run this command");
        }return true;
    }
}
