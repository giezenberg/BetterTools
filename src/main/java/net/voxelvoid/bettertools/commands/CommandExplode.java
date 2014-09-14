
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
public class CommandExplode implements CommandExecutor {
    private BetterTools plugin;
    private String perm;
    private String command;
    
    public CommandExplode(BetterTools instance, String command, String permission) {
        this.command = command;
        this.plugin = instance;
        this.perm = permission;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player;
        
        if (cmd.getName().equalsIgnoreCase(command)) {
            
            if (sender instanceof Player) {
                player = (Player) sender;
            } else {
                sender.sendMessage(plugin.prefix + ChatColor.RED + "You are not a player!");
                return false;
            }
            
            if (player.hasPermission(perm)) {
                
                if (args.length < 1 || args.length > 1) {
                    help(sender);
                }
                
                if (args.length == 1) {
                    
                    if (args[0].equalsIgnoreCase("dia") || args[0].equalsIgnoreCase("diamond")) {
                        player.getInventory().addItem(plugin.DiamondExplode);
                        player.sendMessage("You have received a Diamond Smelters-Pickaxe. Have fun!");
                    } else if (args[0].equalsIgnoreCase("gold")) {
                        player.getInventory().addItem(plugin.GoldExplode);
                        player.sendMessage(plugin.prefix + "You have recieved a Gold Tnt-Pickaxe. Have fun!");
                    } else if (args[0].equalsIgnoreCase("iron")) {
                        player.getInventory().addItem(plugin.IronExplode);
                        player.sendMessage(plugin.prefix + "You have recieved a Iron Tnt-Pickaxe. Have fun!");
                    } else if (args[0].equalsIgnoreCase("stone")) {
                        player.getInventory().addItem(plugin.StoneExplode);
                        player.sendMessage(plugin.prefix + "You have recieved a Stone Tnt-Pickaxe. Have fun!");
                    } else {
                        help(sender);
                    }
                }
            } else {
                player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have permission!");
            }
        }
        return true;
    }
    
    private void help(CommandSender player) {
        player.sendMessage(plugin.prefix + "Exploding-Pickaxes");
        player.sendMessage(plugin.prefix + "The pickaxe only works for mining down.");
        player.sendMessage(plugin.prefix + "And not for minig straight!");
        player.sendMessage(plugin.prefix + "Usage: /explode <pickaxe type>");
        player.sendMessage("");
        player.sendMessage(plugin.prefix + "The available Exploding-Picakxes are:");
        player.sendMessage(plugin.prefix + "    Diamond: Mines a 5x5 area.");
        player.sendMessage(plugin.prefix + "    Gold: Mines a 3x3 area.");
        player.sendMessage(plugin.prefix + "    Iron: Mines a 3x3 area.");
        player.sendMessage(plugin.prefix + "    Stone: Mines a 3x3, but without the corners.");
    }
    
}
