
package net.voxelvoid.bettertools.listeners;

import java.util.HashMap;

import net.voxelvoid.bettertools.BetterTools;

import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 *
 * @author Matthijs
 */
public class PlayerInteractListener implements Listener {
    private BetterTools plugin;
    private HashMap<String, BlockFace> faces = new HashMap<>();
    
    public PlayerInteractListener(BetterTools instance) {
        this.plugin = instance;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    
    public void saveBlockFace(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        BlockFace face = e.getBlockFace();
        
        if (player != null && face != null) {
            String uuid = player.getUniqueId().toString();
            faces.put(uuid, face);
        }
    }
    
    public BlockFace getBlockFaceByUUID(String uuid) {
        return faces.get(uuid);
    }
}
