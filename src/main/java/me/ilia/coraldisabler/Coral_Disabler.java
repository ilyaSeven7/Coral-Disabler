package me.ilia.coraldisabler;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
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
        Material x = event.getBlock().getType();
        Material tb = Material.TUBE_CORAL; //TubeCoral
        Material fc = Material.FIRE_CORAL; //FireCoral
        Material brc = Material.BRAIN_CORAL; //BrainCoral
        Material bc = Material.BUBBLE_CORAL; //Bubble Coral
        Material hc = Material.HORN_CORAL; //Horn Coral
        Material tcb = Material.TUBE_CORAL_BLOCK; //TubeCoralBlock
        Material fcb = Material.FIRE_CORAL_BLOCK; //FireCoralBlock
        Material brcb = Material.BRAIN_CORAL_BLOCK; //BrainCoralBlock
        Material bcb = Material.BUBBLE_CORAL_BLOCK; //Bubble CoralBlock
        Material hcb = Material.HORN_CORAL_BLOCK; //Horn CoralBlock
        Material tbf = Material.TUBE_CORAL_FAN; //TubeCoral
        Material fcf = Material.FIRE_CORAL_FAN; //FireCoral
        Material brcf = Material.BRAIN_CORAL_FAN; //BrainCoral
        Material bcf = Material.BUBBLE_CORAL_FAN; //Bubble Coral
        Material hcf = Material.HORN_CORAL_FAN; //Horn Coral
        if (x == tb || x == fc || x == brc || x == bc || x == hc || x == tcb || x == fcb || x == brcb || x == bcb || x == hcb || x == tbf | x == fcf || x == brcf || x == bcf || x == hcf){
            event.setCancelled(true);
        }
    }



}
