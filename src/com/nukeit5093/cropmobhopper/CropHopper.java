package com.nukeit5093.cropmobhopper;

import com.sun.scenario.effect.Crop;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CropHopper {

    private World world;
    private Block block;

    public CropHopper(World world, Block block){
        this.world = world;
        this.block = block;
    }

    public static ItemStack getCropHopper(){
        ItemStack cropHopper = new ItemStack(Material.HOPPER);

        ItemMeta cropHopperMeta = cropHopper.getItemMeta();
        cropHopperMeta.setDisplayName(ChatColor.DARK_GREEN + "[Crop Hopper]");
        List<String> loreStrings = new ArrayList<>();
        loreStrings.add(ChatColor.GREEN + "Automatically collects the following items: ");
        for(int i = 0; i < CropMobHopper.getCropHopperList().size(); i++){
            loreStrings.add(ChatColor.GREEN + "- " + CropMobHopper.getCropHopperList().get(i).toString().toLowerCase());
        }
        cropHopperMeta.setLore(loreStrings);

        cropHopper.setItemMeta(cropHopperMeta);
        return cropHopper;
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
