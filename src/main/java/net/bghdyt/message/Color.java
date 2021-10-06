package net.bghdyt.message;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Color {

    public static String translate(String source) {
        return ChatColor.translateAlternateColorCodes('&', source);
    }

    public static String main(String prefix, String body) {
        return ChatColor.BLUE + prefix + " > " + ChatColor.GRAY + translate(body);
    }

    public static void log(String message) {
        Bukkit.getConsoleSender().sendMessage(main("Log", message));
    }

}
