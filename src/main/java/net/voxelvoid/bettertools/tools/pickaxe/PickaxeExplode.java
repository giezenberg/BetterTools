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
        BlockFace face = e.getBlock().getFace(centre);
        
        //Validate if some elements aren't null or false
        //Validate.isTrue(item.hasItemMeta(), "itemmeta cannot be false");
       // Validate.notNull(item.getItemMeta().getDisplayName(), "displayname cannot be nnull");
        //Validate.notNull(item.getItemMeta().getLore(), "lore cannot be null");
        
       if (item.getItemMeta().hasEnchants()) {
           if (item.getEnchantments().containsKey(Enchantment.LOOT_BONUS_BLOCKS) || item.getEnchantments().containsKey(Enchantment.SILK_TOUCH)) {
               return;
           }
       }
        
            // Iron Pickaxe
            if (item.getType() == Material.DIAMOND_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(plugin.DiamondExplode.getItemMeta().getDisplayName())) {
                    breaking("dia", centre, face);
                }
            } else if (item.getType() == Material.GOLD_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(plugin.GoldExplode.getItemMeta().getDisplayName())) {
                    breaking("gold", centre, face);
                }
            } else if (item.getType() == Material.IRON_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(plugin.IronExplode.getItemMeta().getDisplayName())) {
                    breaking("iron", centre, face);
                }
            } else if (item.getType() == Material.STONE_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(plugin.StoneExplode.getItemMeta().getDisplayName())) {
                    breaking("stone", centre, face);
                }
            }
    }

    
    private void breaking(String size, Block target, BlockFace side) {
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
        switch (size) {
            case "dia":
                for (String s : BetterTools.breakable) {
                    if (side == BlockFace.UP) {
                        // Toplayer
                        b1 = target.getLocation().add(-2, 0, -2).getBlock();
                        b2 = target.getLocation().add(-1, 0, -2).getBlock();
                        b3 = target.getLocation().add(0, 0, -2).getBlock();
                        b4 = target.getLocation().add(1, 0, -2).getBlock();
                        b5 = target.getLocation().add(2, 0, -2).getBlock();
                        // Secondlayer
                        b6 = target.getLocation().add(-2, 0, -1).getBlock();
                        b7 = target.getLocation().add(-1, 0, -1).getBlock();
                        b8 = target.getLocation().add(0, 0, -1).getBlock();
                        b9 = target.getLocation().add(1, 0, -1).getBlock();
                        b10 = target.getLocation().add(2, 0, -1).getBlock();
                        // Thirdlayer
                        b11 = target.getLocation().add(-2, 0, 0).getBlock();
                        b12 = target.getLocation().add(-1, 0, 0).getBlock();
                        // Middle is here
                        b13 = target.getLocation().add(1, 0, 0).getBlock();
                        b14 = target.getLocation().add(2, 0, 0).getBlock();
                        // Fourthlayer
                        b15 = target.getLocation().add(-2, 0, 1).getBlock();
                        b16 = target.getLocation().add(-1, 0, 1).getBlock();
                        b17 = target.getLocation().add(0, 0, 1).getBlock();
                        b18 = target.getLocation().add(1, 0, 1).getBlock();
                        b19 = target.getLocation().add(2, 0, 1).getBlock();
                        // Fivethlayer
                        b20 = target.getLocation().add(-2, 0, 2).getBlock();
                        b21 = target.getLocation().add(-1, 0, 2).getBlock();
                        b22 = target.getLocation().add(0, 0, 2).getBlock();
                        b23 = target.getLocation().add(1, 0, 2).getBlock();
                        b24 = target.getLocation().add(2, 0, 2).getBlock();
                        
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
                            b18.breakNaturally();
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
                }   break;
            case "iron":
                for (String s : BetterTools.breakable) {
                    if (side == BlockFace.UP) {
                        b1 = target.getLocation().add(-1, 0, -1).getBlock();
                        b2 = target.getLocation().add(0, 0, -1).getBlock();
                        b3 = target.getLocation().add(1, 0, -1).getBlock();
                        b4 = target.getLocation().add(-1, 0, 0).getBlock();
                        b5 = target.getLocation().add(1, 0, 0).getBlock();
                        b6 = target.getLocation().add(-1, 0, 1).getBlock();
                        b7 = target.getLocation().add(0, 0, 1).getBlock();
                        b8 = target.getLocation().add(1, 0, 1).getBlock();
                        
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
                }   break;
            case "gold":
                for (String s : BetterTools.breakable) {
                    if (side == BlockFace.UP) {
                        b1 = target.getLocation().add(-1, 0, -1).getBlock();
                        b2 = target.getLocation().add(0, 0, -1).getBlock();
                        b3 = target.getLocation().add(1, 0, -1).getBlock();
                        b4 = target.getLocation().add(-1, 0, 0).getBlock();
                        b5 = target.getLocation().add(1, 0, 0).getBlock();
                        b6 = target.getLocation().add(-1, 0, 1).getBlock();
                        b7 = target.getLocation().add(0, 0, 1).getBlock();
                        b8 = target.getLocation().add(1, 0, 1).getBlock();
                        
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
                }   break;
            case "stone":
                for (String s : BetterTools.breakable) {
                    if (side == BlockFace.UP) {
                        b1 = target.getLocation().add(0, 0, -1).getBlock();
                        b2 = target.getLocation().add(1, 0, 0).getBlock();
                        b3 = target.getLocation().add(0, 0, 1).getBlock();
                        b4 = target.getLocation().add(-1, 0, 0).getBlock();
                        
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
                }   break;
        }
    }
}
