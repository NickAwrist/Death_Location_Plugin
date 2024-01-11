package nicholas.death_location.events;

import nicholas.death_location.Msg;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class respawnEvent implements Listener {

    @EventHandler
    public void respawnEvent(PlayerRespawnEvent e){

        Location deathLocation = e.getPlayer().getLastDeathLocation();

        assert deathLocation != null;
        int x = deathLocation.getBlockX();
        int y = deathLocation.getBlockY();
        int z = deathLocation.getBlockZ();

        World deathWorld =  deathLocation.getWorld();

        String worldName = deathWorld.getName().toLowerCase();

        switch (worldName) {
            case "world":
                worldName = "&bOverworld";
                break;
            case "world_nether":
                worldName = "&4Nether Dimension";
                break;
            case "world_the_end":
                worldName = "&5End Dimension";
                break;
        }

        Msg.send(e.getPlayer(), "&rYou have died at &ax="+x+" y="+y+" z="+z+" &rin the "+worldName);

    }

}
