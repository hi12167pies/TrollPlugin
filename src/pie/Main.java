package pie;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        Bukkit.getPluginCommand("crash").setExecutor(new crash());
        Bukkit.getPluginCommand("demo").setExecutor(new demo());
    }
}