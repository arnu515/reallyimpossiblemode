package gq.netherrealm.reallyimpossiblemode.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class DoubleDamage implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if (e.getEntity().getType() == EntityType.PLAYER) {
            e.setDamage(e.getFinalDamage() * 2);
        }
    }

    @EventHandler
    public void onDamageByEntity(EntityDamageByEntityEvent e) {
        if (e.getEntity().getType() == EntityType.PLAYER) {
            e.setDamage(e.getFinalDamage() * 2);
        }
    }

    @EventHandler
    public void onDamageByBlock(EntityDamageByBlockEvent e) {
        if (e.getEntity().getType() == EntityType.PLAYER) {
            e.setDamage(e.getFinalDamage() * 2);
        }
    }

}
