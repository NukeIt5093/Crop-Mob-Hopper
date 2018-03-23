package com.nukeit5093.cropmobhopper;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class CropMobHopper extends JavaPlugin{

    public static List<Material> cropHopperList;
    public static List<Material> mobHopperList;

    @Override
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(new EventListener(), this);
        getCommand("cropmobhopper").setExecutor(new CommandListener());
        initCropHopperList();
        initMobHopperList();
    }

    public void initCropHopperList(){
        cropHopperList = new ArrayList<>();
        cropHopperList.add(Material.SUGAR_CANE);
        cropHopperList.add(Material.CACTUS);
    }

    public void initMobHopperList(){
        mobHopperList = new ArrayList<>();
        mobHopperList.add(Material.ROTTEN_FLESH);
        mobHopperList.add(Material.BONE);
        mobHopperList.add(Material.STRING);
    }

    public static List<Material> getCropHopperList(){
        return cropHopperList;
    }

    public static List<Material> getMobHopperList(){
        return mobHopperList;
    }

}
