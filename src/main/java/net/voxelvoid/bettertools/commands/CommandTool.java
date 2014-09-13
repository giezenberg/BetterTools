/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.voxelvoid.bettertools.commands;

import net.voxelvoid.bettertools.BetterTools;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author Tim
 * @author Matthijs
 */
public class CommandTool implements CommandExecutor {
    private BetterTools plugin;
    private String perm;
    
    public CommandTool(BetterTools instance, String permission) {
        this.plugin = instance;
        this.perm = permission;
    }
    
   @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = null;
        
        if (cmd.getName().equalsIgnoreCase("tool") || cmd.getName().equalsIgnoreCase("tools")) {
            
            if (sender instanceof Player) {
                player = (Player) sender;
            } else {
                sender.sendMessage(plugin.prefix + ChatColor.RED + "You are not a player!");
            }
            
            if (player.hasPermission(perm)) {
                
                if (args.length < 1 || args.length > 1) {
                    player.sendMessage(plugin.prefix + ChatColor.RED + "Not enough arguments: /pickaxe <type>");
                }
                
                if (args.length == 1) {
                    
                    if (args[0].equalsIgnoreCase("smelters")) {
                        // @ToDo: add Item to player
                        player.sendMessage("You have received the Smelters-Pickaxe, Have fun!");
                    } else if (args[0].equalsIgnoreCase("explosive")) {
                        // @ToDo: add Item to player
                        player.sendMessage(plugin.prefix + "You have received the Explosion-Pickaxe");
                    }
                }
            } else {
                player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have permission!");
            }
        }
        return true;
    }
    
}
