package nicholas.death_location;

import nicholas.death_location.events.respawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeathLocation extends JavaPlugin {

    private static DeathLocation plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic

        plugin = this;

        getServer().getPluginManager().registerEvents(new respawnEvent(), plugin);

        Bukkit.getLogger().info("Death Location has been activated");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
