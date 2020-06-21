package gq.netherrealm.reallyimpossiblemode.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class Crafting implements Listener {

    @EventHandler
    public void onCraft(CraftItemEvent e) {
        if (Math.random() <= 0.1) {
            e.getWhoClicked().setHealth(0);
        }
    }

}
