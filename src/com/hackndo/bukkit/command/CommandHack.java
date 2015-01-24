package com.hackndo.bukkit.command;

import com.hackndo.bukkit.Test;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

/**
 * Created by betezed on 24/01/15.
 */
public class CommandHack implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        String playerName;
        if(commandSender instanceof Player) {
            // It's a player
            Player p = (Player) commandSender;
            playerName = p.getDisplayName();
        } else {
            playerName = "console";
        }
        getLogger().info(Test.LOG_PREFIX + "help command was used by " + playerName);
        return false;
    }
}
