package gq.netherrealm.reallyimpossiblemode.events;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallDamage implements Listener {

    @EventHandler
    public void onFalling(EntityDamageEvent e) {
        if (e.getEntity().getType() == EntityType.PLAYER) {
            if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                Player p = (Player) e.getEntity();
                p.setHealth(0);
            }
        }
    }

}
