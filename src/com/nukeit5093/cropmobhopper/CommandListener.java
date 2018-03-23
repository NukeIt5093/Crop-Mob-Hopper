package com.nukeit5093.cropmobhopper;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandListener implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String s, String[] args) {

        if(!(commandSender instanceof Player)){
            commandSender.sendMessage(ChatColor.RED + "Only players can use this command.");
        }

        Player player = (Player) commandSender;

        if(cmd.getName().equalsIgnoreCase("cropmobhopper")){

            if(args.length == 3){
                if(args[0].equalsIgnoreCase("get")){
                    if(Bukkit.getPlayer(args[1]) != null){
                        if(args[2].equalsIgnoreCase("Crop")){
                            player.getInventory().addItem(CropHopper.getCropHopper());
                            player.sendMessage(ChatColor.DARK_GREEN + "[CropMobHopper] " + ChatColor.GREEN + "You received a CROP hopper.");
                            return true;
                        }else if(args[2].equalsIgnoreCase("Mob")){
                            player.getInventory().addItem(MobHopper.getMobHopper());
                            player.sendMessage(ChatColor.DARK_GREEN + "[CropMobHopper] " + ChatColor.GREEN + "You received a MOB hopper.");
                            return true;
                        }
                    }
                }

            }

            player.sendMessage(ChatColor.DARK_GREEN + "[CropMobHopper]" + ChatColor.GREEN + "\n- Alias: /cropmobhopper & /cmh\n- /cmh get <Player> <Crop / Mob> " + ChatColor.GRAY + "(Gives Player a Crop or Mob hopper).");
        }

        return true;
    }
}
