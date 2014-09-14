package net.voxelvoid.bettertools.tools.pickaxe;

import java.util.HashMap;

import net.voxelvoid.bettertools.BetterTools;
import org.apache.commons.lang.Validate;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

/**
 * @author Tim
 * @author Matthijs
 */
public class PickaxeSmelt implements Listener {
    private BetterTools plugin;
    
    public PickaxeSmelt(BetterTools instance) {
        this.plugin = instance;
    }
    
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        Block broken = e.getBlock();
        Material brokenm = broken.getType();
        ItemStack item = player.getItemInHand();
        
        /* Validate if some elements aren't null or false
        Validate.isTrue(item.hasItemMeta(), "itemmeta cannot be false");
        Validate.notNull(item.getItemMeta().getDisplayName(), "displayname cannot be null");
        Validate.notNull(item.getItemMeta().getLore(), "lore cannot be null");
        */
        if (item.getType() == Material.DIAMOND_PICKAXE ||
                item.getType() == Material.GOLD_PICKAXE ||
                item.getType() == Material.IRON_PICKAXE ||
                item.getType() == Material.STONE_PICKAXE ||
                item.getType() == Material.WOOD_PICKAXE) {
            
            if (!item.getItemMeta().getEnchants().containsKey(Enchantment.LOOT_BONUS_BLOCKS) ||
                    !item.getItemMeta().getEnchants().containsKey(Enchantment.SILK_TOUCH)) {
                
                // Diamond Pickaxe
                if (item.getType() == Material.DIAMOND_PICKAXE) {

                    if (item.getItemMeta().getDisplayName().equals(plugin.DiamondSmelt.getItemMeta().getDisplayName())) {

                        if (plugin.DiamondList.containsKey(brokenm)) {
                            broken.breakNaturally();
                        }
                    }
                // Gold Pickaxe
                } else if (item.getType() == Material.GOLD_PICKAXE) {

                    if (item.getItemMeta().getDisplayName().equals(plugin.GoldSmelt.getItemMeta().getDisplayName())) {

                        if (plugin.GoldList.containsKey(brokenm)) {
                            broken.setType(Material.AIR);
                            broken.getWorld().dropItemNaturally(broken.getLocation(), plugin.GoldList.get(broken.getType()));
                        }
                    }
                // Iron Pickaxe
                } else if (item.getType() == Material.IRON_PICKAXE) {

                    if (item.getItemMeta().getDisplayName().equals(plugin.IronSmelt.getItemMeta().getDisplayName())) {

                        if (plugin.IronList.containsKey(brokenm)) {
                            broken.setType(Material.AIR);
                            broken.getWorld().dropItemNaturally(broken.getLocation(), plugin.IronList.get(broken.getType()));
                        }
                    }
                // Stone Pickaxe
                } else if (item.getType() == Material.STONE_PICKAXE) {

                    if (item.getItemMeta().getDisplayName().equals(plugin.StoneSmelt.getItemMeta().getDisplayName())) {

                        if (plugin.StoneList.containsKey(brokenm)) {
                            broken.setType(Material.AIR);
                            broken.getWorld().dropItemNaturally(broken.getLocation(), plugin.StoneList.get(broken.getType()));
                        }
                    }
                // Wood Pickaxe
                } else if (item.getType() == Material.WOOD_PICKAXE) {

                    if (item.getItemMeta().getDisplayName().equals(plugin.WoodSmelt.getItemMeta().getDisplayName())) {

                        if (plugin.WoodList.containsKey(brokenm)) {
                            broken.setType(Material.AIR);
                            broken.getWorld().dropItemNaturally(broken.getLocation(), plugin.WoodList.get(broken.getType()));
                        }
                    }
                }
            }
        }
    }
}
