package me.ilia.coraldisabler;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Coral_Disabler extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(MiniMessage.miniMessage().deserialize("<aqua>ily7</aqua> <dark_gray>>></dark_gray> <green>Plugin Has Been Enable!<green>"));
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(MiniMessage.miniMessage().deserialize("<aqua>ily7</aqua> <dark_gray>>></dark_gray> <dark_red>Plugin Has Been Disable!</dark_red>"));
    }
    @EventHandler
    public void CoralDead(BlockFadeEvent event) {
        if (event.getBlock().getType().toString().contains("CORAL") && event.getBlock().getWorld().getName().equals("world")){
            event.setCancelled(true);
        }
    }



}
