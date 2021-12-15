package me.mrxbox98.nomelt.nomelt;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;

public class MeltListener implements Listener {

    @EventHandler
    public void onBlockFade(BlockFadeEvent event)
    {
        if(event.getBlock().getType() != Material.FIRE){
            event.setCancelled(true);
        }
    }
}
