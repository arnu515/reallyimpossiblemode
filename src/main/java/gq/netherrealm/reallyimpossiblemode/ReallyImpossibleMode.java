package gq.netherrealm.reallyimpossiblemode;

import gq.netherrealm.reallyimpossiblemode.events.Crafting;
import gq.netherrealm.reallyimpossiblemode.events.DoubleDamage;
import gq.netherrealm.reallyimpossiblemode.events.FallDamage;
import gq.netherrealm.reallyimpossiblemode.events.MobSpawns;
import org.bukkit.plugin.java.JavaPlugin;

public final class ReallyImpossibleMode extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        if (getConfig().getBoolean("changemobs")) {
            getServer().getPluginManager().registerEvents(new MobSpawns(), this);
        }
        if (getConfig().getBoolean("killonfall")) {
            getServer().getPluginManager().registerEvents(new FallDamage(), this);
        }
        if (getConfig().getBoolean("randomlykilloncraft")) {
            getServer().getPluginManager().registerEvents(new Crafting(), this);
        }
        if (getConfig().getBoolean("playertakesdoubledamage")) {
            getServer().getPluginManager().registerEvents(new DoubleDamage(), this);
        }
    }

    @Override
    public void onDisable() {

    }
}
