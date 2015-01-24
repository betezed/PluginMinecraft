package com.hackndo.bukkit.listener;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.util.Vector;

/**
 * Created by betezed on 24/01/15.
 */
public class HackListener implements Listener {
    @EventHandler
    public void onEntityShootBowEvent( EntityShootBowEvent e) {
        Entity arrow = e.getProjectile();
        arrow.setVelocity(new Vector(arrow.getVelocity().getX()*10,
                arrow.getVelocity().getY()*10,
                arrow.getVelocity().getZ()*10)
        );

        e.setProjectile(arrow);
    }
}
