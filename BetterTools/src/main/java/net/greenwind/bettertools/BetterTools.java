package net.greenwind.bettertools;

import net.greenwind.bettertools.tools.pickaxe.PickaxeSmelt;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Tim
 */
public class BetterTools extends JavaPlugin {
    
    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new PickaxeSmelt(this), this);
    }
    
    @Override
    public void onDisable() {
        
    }

}
