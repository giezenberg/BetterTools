package net.voxelvoid.bettertools.tools.pickaxe;

import java.util.HashMap;

import net.voxelvoid.bettertools.BetterTools;
import net.voxelvoid.bettertools.util.ToolUtil;
import org.apache.commons.lang.Validate;

import org.bukkit.ChatColor;
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
    
    private static HashMap<Material, ItemStack> DiamondList = new HashMap<Material, ItemStack>();
    private static HashMap<Material, ItemStack> GoldList = new HashMap<Material, ItemStack>();
    private static HashMap<Material, ItemStack> IronList = new HashMap<Material, ItemStack>();
    private static HashMap<Material, ItemStack> StoneList = new HashMap<Material, ItemStack>();
    private static HashMap<Material, ItemStack> WoodList = new HashMap<Material, ItemStack>();
    
    private ItemStack DiamondPickaxe = ToolUtil.createTool(ChatColor.RED + "Diamond Smelt-Pickaxe", Material.DIAMOND_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    private ItemStack GoldPickaxe = ToolUtil.createTool(ChatColor.RED + "Golden Smelt-Pickaxe", Material.GOLD_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    private ItemStack IronPickaxe = ToolUtil.createTool(ChatColor.RED + "Iron Smelt-Pickaxe", Material.IRON_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    private ItemStack StonePickaxe = ToolUtil.createTool(ChatColor.RED + "Stone Smelt-Pickaxe", Material.STONE_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    private ItemStack WoodPickaxe = ToolUtil.createTool(ChatColor.RED + "Wooden Smelt-Pickaxe", Material.WOOD_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    
    public PickaxeSmelt(BetterTools instance) {
        this.plugin = instance;
    }
    
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        Block broken = e.getBlock();
        Material brokenm = broken.getType();
        ItemStack item = player.getItemInHand();
        
        // Validate if some elements aren't null or false
        Validate.isTrue(item.hasItemMeta(), "itemmeta cannot be false");
        Validate.notNull(item.getItemMeta().getDisplayName(), "displayname cannot be nnull");
        Validate.notNull(item.getItemMeta().getLore(), "lore cannot be null");
        
        if (!item.getItemMeta().getEnchants().containsKey(Enchantment.LOOT_BONUS_BLOCKS) || !item.getItemMeta().getEnchants().containsKey(Enchantment.SILK_TOUCH)) {
            // Diamond Pickaxe
            if (item.getType() == Material.DIAMOND_PICKAXE) {

                if (item.getItemMeta().getDisplayName().equals(DiamondPickaxe.getItemMeta().getDisplayName())) {

                    if (DiamondList.containsKey(brokenm)) {
                        broken.breakNaturally();
                    }
                }
            // Gold Pickaxe
            } else if (item.getType() == Material.GOLD_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(GoldPickaxe.getItemMeta().getDisplayName())) {
                    
                    if (GoldList.containsKey(brokenm)) {
                        broken.setType(Material.AIR);
                        broken.getWorld().dropItemNaturally(broken.getLocation(), GoldList.get(broken.getType()));
                    }
                }
            // Iron Pickaxe
            } else if (item.getType() == Material.IRON_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(IronPickaxe.getItemMeta().getDisplayName())) {
                    
                    if (IronList.containsKey(brokenm)) {
                        broken.setType(Material.AIR);
                        broken.getWorld().dropItemNaturally(broken.getLocation(), IronList.get(broken.getType()));
                    }
                }
            // Stone Pickaxe
            } else if (item.getType() == Material.STONE_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(StonePickaxe.getItemMeta().getDisplayName())) {
                    
                    if (StoneList.containsKey(brokenm)) {
                        broken.setType(Material.AIR);
                        broken.getWorld().dropItemNaturally(broken.getLocation(), StoneList.get(broken.getType()));
                    }
                }
            // Wood Pickaxe
            } else if (item.getType() == Material.WOOD_PICKAXE) {
                
                if (item.getItemMeta().getDisplayName().equals(WoodPickaxe.getItemMeta().getDisplayName())) {
                    
                    if (WoodList.containsKey(brokenm)) {
                        broken.setType(Material.AIR);
                        broken.getWorld().dropItemNaturally(broken.getLocation(), WoodList.get(broken.getType()));
                    }
                }
            }
        }
    }
    
    public static void setup() {
        // Diamond Breakable List
        DiamondList.put(Material.STONE, new ItemStack(Material.STONE, 1));
        DiamondList.put(Material.GOLD_ORE, new ItemStack(Material.GOLD_INGOT, 1));
        DiamondList.put(Material.IRON_ORE, new ItemStack(Material.IRON_INGOT, 1));
        
        // Gold Breakable List
        GoldList.put(Material.STONE, new ItemStack(Material.STONE, 1));
        
        // Iron Breakable List
        IronList.put(Material.STONE, new ItemStack(Material.STONE, 1));
        IronList.put(Material.GOLD_ORE, new ItemStack(Material.GOLD_INGOT, 1));
        IronList.put(Material.IRON_ORE, new ItemStack(Material.IRON_INGOT, 1));
        
        // Stone Breakable List
        StoneList.put(Material.STONE, new ItemStack(Material.STONE, 1));
        StoneList.put(Material.IRON_ORE, new ItemStack(Material.IRON_INGOT, 1));
        
        // Wood Breakable List
        WoodList.put(Material.STONE, new ItemStack(Material.STONE, 1));
    }

}
