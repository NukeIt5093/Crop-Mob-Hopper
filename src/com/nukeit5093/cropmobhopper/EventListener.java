package com.nukeit5093.cropmobhopper;

import net.minecraft.server.v1_8_R3.Block;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class EventListener implements Listener{

    @EventHandler
    public void onBlockPlaced(BlockPlaceEvent e){
        Player player = e.getPlayer();
        Block inHand = Block.getByName(player.getInventory().getItemInHand().getType().toString());
        ItemStack block = player.getItemInHand();

        if(block.equals(CropHopper.getCropHopper())){
            Bukkit.broadcastMessage("Player " + player.getName() + " placed a crophopper");
        }else if(block.equals(MobHopper.getMobHopper())){
            Bukkit.broadcastMessage("Player " + player.getName() + "placed a mobhopper");
        }


    }

}
