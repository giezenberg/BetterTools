package net.voxelvoid.bettertools;

import net.voxelvoid.bettertools.commands.CommandTool;
import net.voxelvoid.bettertools.tools.pickaxe.PickaxeExplode;
import net.voxelvoid.bettertools.tools.pickaxe.PickaxeSmelt;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Tim
 * @author Matthijs
 */
public class BetterTools extends JavaPlugin {
    public String prefix = "[BetterTools] ";
    
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PickaxeSmelt(this), this);
    }
    
    public void loadCommands() {
        getCommand("tool").setExecutor(new CommandTool(this, "bettertools.command.tool"));
        getCommand("tools").setExecutor(new CommandTool(this, "bettertools.command.tool"));
    }
    
    public void listSetup() {
        PickaxeSmelt.setup();
        PickaxeExplode.setup();
    }
}
