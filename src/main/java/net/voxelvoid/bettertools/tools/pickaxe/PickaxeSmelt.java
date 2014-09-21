package net.voxelvoid.bettertools.tools.pickaxe;

import net.voxelvoid.bettertools.BetterTools;

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
        
        
        if (item.getItemMeta().hasEnchants()) {
           if (item.getEnchantments().containsKey(Enchantment.LOOT_BONUS_BLOCKS) || item.getEnchantments().containsKey(Enchantment.SILK_TOUCH)) {
               return;
           }
        }
        
        // Diamond Pickaxe
        if (item.getType() == Material.DIAMOND_PICKAXE) {

            if (item.getItemMeta().getDisplayName().equals(plugin.DiamondSmelt.getItemMeta().getDisplayName())) {

                if (BetterTools.DiamondList.containsKey(brokenm)) {
                    broken.getWorld().dropItemNaturally(broken.getLocation(), BetterTools.DiamondList.get(broken.getType()));
                    broken.setType(Material.AIR);
                }
            }
        // Gold Pickaxe
        } else if (item.getType() == Material.GOLD_PICKAXE) {

            if (item.getItemMeta().getDisplayName().equals(plugin.GoldSmelt.getItemMeta().getDisplayName())) {

                if (BetterTools.GoldList.containsKey(brokenm)) {
                    broken.getWorld().dropItemNaturally(broken.getLocation(), BetterTools.GoldList.get(broken.getType()));
                    broken.setType(Material.AIR);
                }
            }
        // Iron Pickaxe
        } else if (item.getType() == Material.IRON_PICKAXE) {

            if (item.getItemMeta().getDisplayName().equals(plugin.IronSmelt.getItemMeta().getDisplayName())) {

                if (BetterTools.IronList.containsKey(brokenm)) {
                    broken.getWorld().dropItemNaturally(broken.getLocation(), BetterTools.IronList.get(broken.getType()));
                    broken.setType(Material.AIR);
                }
            }
        // Stone Pickaxe
        } else if (item.getType() == Material.STONE_PICKAXE) {

            if (item.getItemMeta().getDisplayName().equals(plugin.StoneSmelt.getItemMeta().getDisplayName())) {

                if (BetterTools.StoneList.containsKey(brokenm)) {
                    broken.getWorld().dropItemNaturally(broken.getLocation(), BetterTools.StoneList.get(broken.getType()));
                    broken.setType(Material.AIR);
                }
            }
        // Wood Pickaxe
        } else if (item.getType() == Material.WOOD_PICKAXE) {

            if (item.getItemMeta().getDisplayName().equals(plugin.WoodSmelt.getItemMeta().getDisplayName())) {

                if (BetterTools.WoodList.containsKey(brokenm)) {
                    broken.getWorld().dropItemNaturally(broken.getLocation(), BetterTools.WoodList.get(broken.getType()));
                    broken.setType(Material.AIR);
                }
            }
        }
    }
}
