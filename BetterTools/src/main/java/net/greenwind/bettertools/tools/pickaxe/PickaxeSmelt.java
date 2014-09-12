package net.greenwind.bettertools.tools.pickaxe;

import java.util.HashMap;
import net.greenwind.bettertools.BetterTools;
import net.greenwind.bettertools.util.ToolUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

/**
 * @author Tim
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
        if (item.hasItemMeta()) {
            if (item.getItemMeta().getDisplayName() != null) {
                if (item.getItemMeta().getLore() != null) {
                    if (!item.getItemMeta().getEnchants().containsKey(Enchantment.LOOT_BONUS_BLOCKS) || !item.getItemMeta().getEnchants().containsKey(Enchantment.SILK_TOUCH)) {
                    if (brokenm == Material.DIAMOND_PICKAXE) {
                        if (item.getItemMeta().getDisplayName().equals(DiamondPickaxe.getItemMeta().getDisplayName())) {
                            if (DiamondList.containsKey(brokenm)) {
                                broken.getWorld().dropItemNaturally(broken.getLocation(), DiamondList.get(brokenm));
                                broken.setType(Material.AIR);
                            }
                            }
                        } else if (brokenm == Material.GOLD_PICKAXE) {
                            if (item.getItemMeta().getDisplayName().equals(GoldPickaxe.getItemMeta().getDisplayName())) {
                                if (GoldList.containsKey(brokenm)) {
                                    broken.getWorld().dropItemNaturally(broken.getLocation(), GoldList.get(brokenm));
                                    broken.setType(Material.AIR);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void setup() {
        DiamondList.put(Material.STONE, new ItemStack(Material.STONE, 1));
        DiamondList.put(Material.GOLD_ORE, new ItemStack(Material.GOLD_INGOT, 1));
        DiamondList.put(Material.IRON_ORE, new ItemStack(Material.IRON_INGOT, 1));
        
        GoldList.put(Material.STONE, new ItemStack(Material.STONE, 1));
        
        IronList.put(Material.STONE, new ItemStack(Material.STONE, 1));
        IronList.put(Material.GOLD_ORE, new ItemStack(Material.GOLD_INGOT, 1));
        IronList.put(Material.IRON_ORE, new ItemStack(Material.IRON_INGOT, 1));
        
        StoneList.put(Material.STONE, new ItemStack(Material.STONE, 1));
        StoneList.put(Material.IRON_ORE, new ItemStack(Material.IRON_INGOT, 1));
        
        WoodList.put(Material.STONE, new ItemStack(Material.STONE, 1));
    }

}
