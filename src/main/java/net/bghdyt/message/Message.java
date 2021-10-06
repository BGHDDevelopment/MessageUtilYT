package net.bghdyt.message;

import org.bukkit.plugin.java.JavaPlugin;

public final class Message extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Color.log("Hi this &eis a &ctest.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
