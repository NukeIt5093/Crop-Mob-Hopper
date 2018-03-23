package com.nukeit5093.cropmobhopper;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobHopper {

    private World world;
    private Block block;

    public MobHopper(World world, Block block){
        this.world = world;
        this.block = block;
    }

    public static ItemStack getMobHopper(){
        ItemStack mobHopper = new ItemStack(Material.HOPPER);

        ItemMeta mobHopperMeta = mobHopper.getItemMeta();
        mobHopperMeta.setDisplayName(ChatColor.DARK_RED + "[Mob Hopper]");
        List<String> loreStrings = new ArrayList<>();
        loreStrings.add(ChatColor.RED + "Automatically collects the following items: ");
        for(int i = 0; i < CropMobHopper.getMobHopperList().size(); i++){
            loreStrings.add(ChatColor.RED + "- " + CropMobHopper.getMobHopperList().get(i).toString().toLowerCase());
        }
        mobHopperMeta.setLore(loreStrings);

        mobHopper.setItemMeta(mobHopperMeta);
        return mobHopper;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }



}
