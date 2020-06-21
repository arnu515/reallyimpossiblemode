package gq.netherrealm.reallyimpossiblemode.events;

import gq.netherrealm.reallyimpossiblemode.ReallyImpossibleMode;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

public class MobSpawns implements Listener {

    ReallyImpossibleMode plugin = ReallyImpossibleMode.getPlugin(ReallyImpossibleMode.class);

    @EventHandler
    public void onSpawn(EntitySpawnEvent e) {
        if (e.getEntity().getType() == EntityType.SKELETON && plugin.getConfig().getBoolean("opskeletons")) {
            LivingEntity skeleton = (LivingEntity) e.getEntity();
            skeleton.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET, 1));
            skeleton.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
            skeleton.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS, 1));
            skeleton.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS, 1));
        }
        if (e.getEntity().getType() == EntityType.COW && plugin.getConfig().getBoolean("nocows")) {
            e.setCancelled(true);
        }
        if (e.getEntity().getType() == EntityType.ZOMBIE) {
            LivingEntity zombie = (LivingEntity) e.getEntity();
            if (plugin.getConfig().getBoolean("zombiesdontburn")) {
                zombie.getEquipment().setHelmet(new ItemStack(Material.CARVED_PUMPKIN, 1));
            }
            if (plugin.getConfig().getBoolean("zombieshavesword")) {
                zombie.getEquipment().setItemInMainHand(new ItemStack((Math.random() > 0.5) ? Material.IRON_SWORD : Material.DIAMOND_SWORD, 1));
            }
        }
    }

}
