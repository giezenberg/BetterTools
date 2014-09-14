package net.voxelvoid.bettertools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.voxelvoid.bettertools.commands.CommandSmelt;
import net.voxelvoid.bettertools.commands.CommandExplode;
import net.voxelvoid.bettertools.tools.pickaxe.PickaxeExplode;
import net.voxelvoid.bettertools.tools.pickaxe.PickaxeSmelt;
import net.voxelvoid.bettertools.util.ToolUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Tim
 * @author Matthijs
 */
public class BetterTools extends JavaPlugin {
    public String prefix = "[BetterTools] ";
    
    public ItemStack DiamondSmelt = ToolUtil.createTool(ChatColor.RED + "Diamond Smelt-Pickaxe", Material.DIAMOND_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    public ItemStack GoldSmelt = ToolUtil.createTool(ChatColor.RED + "Golden Smelt-Pickaxe", Material.GOLD_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    public ItemStack IronSmelt = ToolUtil.createTool(ChatColor.RED + "Iron Smelt-Pickaxe", Material.IRON_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    public ItemStack StoneSmelt = ToolUtil.createTool(ChatColor.RED + "Stone Smelt-Pickaxe", Material.STONE_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    public ItemStack WoodSmelt = ToolUtil.createTool(ChatColor.RED + "Wooden Smelt-Pickaxe", Material.WOOD_PICKAXE, ChatColor.GOLD + "The incredible smelt-pickaxe", ChatColor.GOLD + "Smelts all the stone/ore types!");
    
    public ItemStack DiamondExplode = ToolUtil.createTool(ChatColor.RED + "Diamond" + ChatColor.WHITE + " Explosion-Pickaxe", Material.DIAMOND_PICKAXE, ChatColor.GOLD + "The incredible explosion-pickaxe", ChatColor.GOLD + "Mines a 5x5, very fancy!");
    public ItemStack GoldExplode = ToolUtil.createTool(ChatColor.RED + "Golden" + ChatColor.WHITE + " Explosion-Pickaxe", Material.GOLD_PICKAXE, ChatColor.GOLD + "The incredible explosion-pickaxe", ChatColor.GOLD + "Mines a full 3x3");
    public ItemStack IronExplode = ToolUtil.createTool(ChatColor.RED + "Iron" + ChatColor.WHITE + " Explosion-Pickaxe", Material.IRON_PICKAXE, ChatColor.GOLD + "The incredible explosion-pickaxe", ChatColor.GOLD + "Mines a full 3x3");
    public ItemStack StoneExplode = ToolUtil.createTool(ChatColor.RED + "Stone" + ChatColor.WHITE + " Explosion-Pickaxe", Material.STONE_PICKAXE, ChatColor.GOLD + "The incredible explosion-pickaxe", ChatColor.GOLD + "Mines a 3x3 without the corners.");
    
    public static HashMap<Material, ItemStack> DiamondList = new HashMap<>();
    public static HashMap<Material, ItemStack> GoldList = new HashMap<>();
    public static HashMap<Material, ItemStack> IronList = new HashMap<>();
    public static HashMap<Material, ItemStack> StoneList = new HashMap<>();
    public static HashMap<Material, ItemStack> WoodList = new HashMap<>();
    
    public static List<String> breakable = new ArrayList<>();
    
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PickaxeSmelt(this), this);
        getServer().getPluginManager().registerEvents(new PickaxeExplode(this), this);
        
        // Load the Commands
        loadCommands();
        
        // Setup Tools
        setupSmelterPick();
        setupExplosionPick();
    }
    
    public void loadCommands() {
        getCommand("smelt").setExecutor(new CommandSmelt(this, "bettertools.command.smelt"));
        getCommand("explode").setExecutor(new CommandExplode(this, "explode" , "bettertools.command.explode"));
    }
    
    private static void setupSmelterPick() {
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
    
    private static void setupExplosionPick() {
        breakable.add("STONE");
        breakable.add("LAPIS_ORE");
        breakable.add("REDSTONE_ORE");
        breakable.add("IRON_ORE");
        breakable.add("GOLD_ORE");
        breakable.add("DIAMOND_ORE");
    }
}
