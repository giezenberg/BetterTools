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
public class CommandSmelt implements CommandExecutor {
    private BetterTools plugin;
    private String perm;
    
    public CommandSmelt(BetterTools instance, String permission) {
        this.plugin = instance;
        this.perm = permission;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player;
        
        if (cmd.getName().equalsIgnoreCase("smelt")) {
            
            if (sender instanceof Player) {
                player = (Player) sender;
            } else {
                sender.sendMessage(plugin.prefix + ChatColor.RED + "You are not a player!");
                return true;
            }
            
            if (player.hasPermission(perm)) {
                
                if (args.length < 1 || args.length > 1) {
                    help(sender);
                }
                
                if (args.length == 1) {
                    
                    if (args[0].equalsIgnoreCase("dia") || args[0].equalsIgnoreCase("diamond")) {
                        player.getInventory().addItem(plugin.DiamondSmelt);
                        player.sendMessage(plugin.prefix + "You have received a Diamond Smelters-Pickaxe. Have fun!");
                    } else if (args[0].equalsIgnoreCase("gold")) {
                        player.getInventory().addItem(plugin.GoldSmelt);
                        player.sendMessage(plugin.prefix + "You have recieved a Gold Smelters-Pickaxe. Have fun!");
                    } else if (args[0].equalsIgnoreCase("iron")) {
                        player.getInventory().addItem(plugin.GoldSmelt);
                        player.sendMessage(plugin.prefix + "You have recieved a Iron Smelters-Pickaxe. Have fun!");
                    } else if (args[0].equalsIgnoreCase("stone")) {
                        player.getInventory().addItem(plugin.GoldSmelt);
                        player.sendMessage(plugin.prefix + "You have recieved a Stone Smelters-Pickaxe. Have fun!");
                    } else if (args[0].equalsIgnoreCase("wood")) {
                        player.getInventory().addItem(plugin.GoldSmelt);
                        player.sendMessage(plugin.prefix + "You have recieved a Wooden Smelters-Pickaxe. Have fun!");
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
        player.sendMessage(plugin.prefix + "Smelters-Pickaxes");
        player.sendMessage(plugin.prefix + "It melts some of the blocks it mines.");
        player.sendMessage(plugin.prefix + "Usage: /smelt <pickaxe type>");
        player.sendMessage("");
        player.sendMessage(plugin.prefix + "The available Smelters-Picakxes are:");
        player.sendMessage(plugin.prefix + "    Diamond: Smelts Stone, Iron Ore and Gold Ore.");
        player.sendMessage(plugin.prefix + "    Gold: Smelts only Stone.");
        player.sendMessage(plugin.prefix + "    Iron: Smelts Stone, Iron Ore and Gold Ore.");
        player.sendMessage(plugin.prefix + "    Stone: Smetls Stone and Iron Ore.");
        player.sendMessage(plugin.prefix + "    Wood: Smelts only Stone.");
    }
    
}
