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
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

/**
 * @author Tim
 * @author Matthijs
 */
public class PickaxeExplode implements Listener {
    private BetterTools plugin;
    
    private static List<String> breakable = new ArrayList<>();
    
    private ItemStack DiamondPickaxe = ToolUtil.createTool(ChatColor.RED + "Diamond" + ChatColor.WHITE + " Explosion-Pickaxe", Material.DIAMOND_PICKAXE, ChatColor.GOLD + "The incredible explosion-pickaxe", ChatColor.GOLD + "Mines a 5x5, very fancy!");
    private ItemStack GoldPickaxe = ToolUtil.createTool(ChatColor.RED + "Golden" + ChatColor.WHITE + " Explosion-Pickaxe", Material.GOLD_PICKAXE, ChatColor.GOLD + "The incredible explosion-pickaxe", ChatColor.GOLD + "Mines a full 3x3");
    private ItemStack IronPickaxe = ToolUtil.createTool(ChatColor.RED + "Iron" + ChatColor.WHITE + " Explosion-Pickaxe", Material.IRON_PICKAXE, ChatColor.GOLD + "The incredible explosion-pickaxe", ChatColor.GOLD + "Mines a full 3x3");
    private ItemStack StonePickaxe = ToolUtil.createTool(ChatColor.RED + "Stone" + ChatColor.WHITE + " Explosion-Pickaxe", Material.STONE_PICKAXE, ChatColor.GOLD + "The incredible explosion-pickaxe", ChatColor.GOLD + "Mines a 3x3 without the corners.");
    
    public PickaxeExplode(BetterTools instance) {
        this.plugin = instance;
    }
    
    public void onBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        Block centre = e.getBlock();
        ItemStack item = player.getItemInHand();
        
        // Validate if some elements aren't null or false
        Validate.isTrue(item.hasItemMeta(), "itemmeta cannot be false");
        Validate.notNull(item.getItemMeta().getDisplayName(), "displayname cannot be nnull");
        Validate.notNull(item.getItemMeta().getLore(), "lore cannot be null");
        
        if (!item.getItemMeta().getEnchants().containsKey(Enchantment.LOOT_BONUS_BLOCKS) || !item.getItemMeta().getEnchants().containsKey(Enchantment.SILK_TOUCH)) {
            
            // Iron Pickaxe
            if (item.getType() == Material.IRON_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(DiamondPickaxe.getItemMeta().getDisplayName())) {
                    breakingIron(centre);
                }
            }
        }
    }
    
    public static void setup() {
        breakable.add("STONE");
        breakable.add("LAPIS_ORE");
        breakable.add("REDSTONE_ORE");
        breakable.add("IRON_ORE");
        breakable.add("GOLD_ORE");
        breakable.add("DIAMOND_ORE");
    }
    
    public void breakingIron(Block target) {
        Block b1;
        Block b2;
        Block b3;
        Block b4;
        Block b5;
        Block b6;
        Block b7;
        Block b8;
        
        for (String s : breakable) {
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
    }
}
