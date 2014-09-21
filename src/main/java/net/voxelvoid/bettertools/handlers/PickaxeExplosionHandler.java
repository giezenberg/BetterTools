package net.voxelvoid.bettertools.handlers;

import net.voxelvoid.bettertools.BetterTools;
import net.voxelvoid.bettertools.tools.pickaxe.PickaxeExplode;

/**
 * @author Tim
 * @author Matthijs
 */
public class PickaxeExplosionHandler {
    public PickaxeExplosionHandler() {};
    public PickaxeExplode listener;
    
    public void init(BetterTools plugin) {
        listener = new PickaxeExplode(plugin);
    }
    
    public PickaxeExplode getListner() {
        return listener;
    }
}
