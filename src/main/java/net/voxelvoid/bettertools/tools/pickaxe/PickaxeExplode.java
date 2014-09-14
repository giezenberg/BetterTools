package net.voxelvoid.bettertools.tools.pickaxe;

import java.util.ArrayList;
import java.util.List;
import net.voxelvoid.bettertools.BetterTools;
import net.voxelvoid.bettertools.util.ToolUtil;
import org.apache.commons.lang.Validate;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
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
public class PickaxeExplode implements Listener {
    private BetterTools plugin;
    
    public PickaxeExplode(BetterTools instance) {
        this.plugin = instance;
    }
    
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        Block centre = e.getBlock();
        ItemStack item = player.getItemInHand();
        
        /* Validate if some elements aren't null or false
        Validate.isTrue(item.hasItemMeta(), "itemmeta cannot be false");
        Validate.notNull(item.getItemMeta().getDisplayName(), "displayname cannot be nnull");
        Validate.notNull(item.getItemMeta().getLore(), "lore cannot be null");
        */
        
        if (!item.getItemMeta().getEnchants().containsKey(Enchantment.LOOT_BONUS_BLOCKS) || !item.getItemMeta().getEnchants().containsKey(Enchantment.SILK_TOUCH)) {
            
            // Iron Pickaxe
            if (item.getType() == Material.DIAMOND_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(plugin.DiamondExplode.getItemMeta().getDisplayName())) {
                    breaking("dia", centre);
                }
            } else if (item.getType() == Material.GOLD_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(plugin.GoldExplode.getItemMeta().getDisplayName())) {
                    breaking("gold", centre);
                }
            } else if (item.getType() == Material.IRON_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(plugin.IronExplode.getItemMeta().getDisplayName())) {
                    breaking("iron", centre);
                }
            } else if (item.getType() == Material.STONE_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(plugin.StoneExplode.getItemMeta().getDisplayName())) {
                    breaking("stone", centre);
                }
            }
        }
    }

    
    private void breaking(String size, Block target) {
        Block b1;
        Block b2;
        Block b3;
        Block b4;
        Block b5;
        Block b6;
        Block b7;
        Block b8;
        Block b9;
        Block b10;
        Block b11;
        Block b12;
        Block b13;
        Block b14;
        Block b15;
        Block b16;
        Block b17;
        Block b18;
        Block b19;
        Block b20;
        Block b21;
        Block b22;
        Block b23;
        Block b24;
        
        if (size.equals("dia")) {
            for (String s : BetterTools.breakable) {
                if (target.getRelative(BlockFace.UP).getType() == Material.AIR) {
                    // Toplayer
                    b1 = target.getRelative(BlockFace.NORTH_WEST, 2);
                    b2 = target.getRelative(BlockFace.NORTH_NORTH_WEST, 1);
                    b3 = target.getRelative(BlockFace.NORTH, 2);
                    b4 = target.getRelative(BlockFace.NORTH_NORTH_EAST, 1);
                    b5 = target.getRelative(BlockFace.NORTH_EAST, 2);
                    // Secondlayer
                    b6 = target.getRelative(BlockFace.WEST_NORTH_WEST, 1);
                    b7 = target.getRelative(BlockFace.NORTH_WEST, 1);
                    b8 = target.getRelative(BlockFace.NORTH, 1);
                    b9 = target.getRelative(BlockFace.NORTH_EAST, 1);
                    b10 = target.getRelative(BlockFace.EAST_NORTH_EAST, 1);
                    // Thirdlayer
                    b11 = target.getRelative(BlockFace.WEST, 2);
                    b12 = target.getRelative(BlockFace.WEST, 1);
                        // Middle is here
                    b13 = target.getRelative(BlockFace.EAST, 1);
                    b14 = target.getRelative(BlockFace.EAST, 2);
                    // Fourthlayer
                    b15 = target.getRelative(BlockFace.WEST_SOUTH_WEST, 1);
                    b16 = target.getRelative(BlockFace.SOUTH_WEST, 1);
                    b17 = target.getRelative(BlockFace.SOUTH, 1);
                    b18 = target.getRelative(BlockFace.SOUTH_EAST, 1);
                    b19 = target.getRelative(BlockFace.EAST_SOUTH_EAST, 1);
                    // Fivethlayer
                    b20 = target.getRelative(BlockFace.SOUTH_WEST, 2);
                    b21 = target.getRelative(BlockFace.SOUTH_SOUTH_WEST, 1);
                    b22 = target.getRelative(BlockFace.SOUTH, 2);
                    b23 = target.getRelative(BlockFace.SOUTH_SOUTH_EAST, 1);
                    b24 = target.getRelative(BlockFace.SOUTH_EAST, 2);

                    if (b1.getType() == Material.getMaterial(s)) {
                        b1.breakNaturally();
                    }
                    if (b2.getType() == Material.getMaterial(s)) {
                        b2.breakNaturally();
                    }
                    if (b3.getType() == Material.getMaterial(s)) {
                        b3.breakNaturally();
                    }
                    if (b4.getType() == Material.getMaterial(s)) {
                        b4.breakNaturally();
                    }
                    if (b5.getType() == Material.getMaterial(s)) {
                        b5.breakNaturally();
                    }
                    if (b6.getType() == Material.getMaterial(s)) {
                        b6.breakNaturally();
                    }
                    if (b7.getType() == Material.getMaterial(s)) {
                        b7.breakNaturally();
                    }
                    if (b8.getType() == Material.getMaterial(s)) {
                        b8.breakNaturally();
                    }
                    if (b9.getType() == Material.getMaterial(s)) {
                        b9.breakNaturally();
                    }
                    if (b10.getType() == Material.getMaterial(s)) {
                        b10.breakNaturally();
                    }
                    if (b11.getType() == Material.getMaterial(s)) {
                        b11.breakNaturally();
                    }
                    if (b12.getType() == Material.getMaterial(s)) {
                        b12.breakNaturally();
                    }
                    if (b13.getType() == Material.getMaterial(s)) {
                        b13.breakNaturally();
                    }
                    if (b14.getType() == Material.getMaterial(s)) {
                        b14.breakNaturally();
                    }
                    if (b15.getType() == Material.getMaterial(s)) {
                        b15.breakNaturally();
                    }
                    if (b16.getType() == Material.getMaterial(s)) {
                        b16.breakNaturally();
                    }
                    if (b17.getType() == Material.getMaterial(s)) {
                        b17.breakNaturally();
                    }
                    if (b18.getType() == Material.getMaterial(s)) {
                        b19.breakNaturally();
                    }
                    if (b19.getType() == Material.getMaterial(s)) {
                        b19.breakNaturally();
                    }
                    if (b20.getType() == Material.getMaterial(s)) {
                        b20.breakNaturally();
                    }
                    if (b21.getType() == Material.getMaterial(s)) {
                        b21.breakNaturally();
                    }
                    if (b22.getType() == Material.getMaterial(s)) {
                        b22.breakNaturally();
                    }
                    if (b23.getType() == Material.getMaterial(s)) {
                        b23.breakNaturally();
                    }
                    if (b24.getType() == Material.getMaterial(s)) {
                        b24.breakNaturally();
                    }
                }
            }
        } else if (size.equals("iron") || size.equals("gold")) {
            for (String s : BetterTools.breakable) {
                if (target.getRelative(BlockFace.UP).getType() == Material.AIR) {
                    b1 = target.getRelative(BlockFace.NORTH, 1);
                    b2 = target.getRelative(BlockFace.NORTH_EAST, 1);
                    b3 = target.getRelative(BlockFace.EAST, 1);
                    b4 = target.getRelative(BlockFace.SOUTH_EAST, 1);
                    b5 = target.getRelative(BlockFace.SOUTH, 1);
                    b6 = target.getRelative(BlockFace.SOUTH_WEST, 1);
                    b7 = target.getRelative(BlockFace.WEST, 1);
                    b8 = target.getRelative(BlockFace.NORTH_WEST, 1);

                    if (b1.getType() == Material.getMaterial(s)) {
                        b1.breakNaturally();
                    }
                    if (b2.getType() == Material.getMaterial(s)) {
                        b2.breakNaturally();
                    }
                    if (b3.getType() == Material.getMaterial(s)) {
                        b3.breakNaturally();
                    }
                    if (b4.getType() == Material.getMaterial(s)) {
                        b4.breakNaturally();
                    }
                    if (b5.getType() == Material.getMaterial(s)) {
                        b5.breakNaturally();
                    }
                    if (b6.getType() == Material.getMaterial(s)) {
                        b6.breakNaturally();
                    }
                    if (b7.getType() == Material.getMaterial(s)) {
                        b7.breakNaturally();
                    }
                    if (b8.getType() == Material.getMaterial(s)) {
                        b8.breakNaturally();
                    }
                }
            }
        } else if (size.equals("stone")) {
            for (String s : BetterTools.breakable) {
                if (target.getRelative(BlockFace.UP).getType() == Material.AIR) {
                    b1 = target.getRelative(BlockFace.NORTH, 1);
                    b2 = target.getRelative(BlockFace.EAST, 1);
                    b3 = target.getRelative(BlockFace.SOUTH, 1);
                    b4 = target.getRelative(BlockFace.WEST, 1);

                    if (b1.getType() == Material.getMaterial(s)) {
                        b1.breakNaturally();
                    }
                    if (b2.getType() == Material.getMaterial(s)) {
                        b2.breakNaturally();
                    }
                    if (b3.getType() == Material.getMaterial(s)) {
                        b3.breakNaturally();
                    }
                    if (b4.getType() == Material.getMaterial(s)) {
                        b4.breakNaturally();
                    }
                }
            }
        }
    }
}
