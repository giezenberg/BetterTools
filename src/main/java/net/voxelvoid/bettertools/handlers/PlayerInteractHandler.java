package net.voxelvoid.bettertools.handlers;

import net.voxelvoid.bettertools.BetterTools;
import net.voxelvoid.bettertools.listeners.PlayerInteractListener;

/**
 * @author Tim
 * @author Matthijs
 */
public class PlayerInteractHandler {
    public PlayerInteractHandler() {};
    public PlayerInteractListener listener;
    
    public void init(BetterTools plugin) {
        listener = new PlayerInteractListener(plugin);
    }
    
    public PlayerInteractListener getListener() {
        return listener;
    }
}