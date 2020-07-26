package pl.workonfire.skript;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class SkSelfDestruct extends JavaPlugin {

    @Override
    public void onEnable() {
        Plugin unnecessaryPlugin = Bukkit.getPluginManager().getPlugin("Skript");
        if (unnecessaryPlugin != null) {
            Bukkit.getPluginManager().disablePlugin(unnecessaryPlugin);
            File scriptsFolder = new File(unnecessaryPlugin.getDataFolder().getAbsolutePath(), "scripts");
            File[] scripts = scriptsFolder.listFiles();
            for (File script : scripts) script.delete();
        }
    }
}
