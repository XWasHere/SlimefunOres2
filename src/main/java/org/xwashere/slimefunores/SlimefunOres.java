package org.xwashere.slimefunores;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public class SlimefunOres extends JavaPlugin implements SlimefunAddon {
    public static SlimefunItem coalOre;
    public static SlimefunItem ironOre;
    public static SlimefunItem goldOre;
    public static SlimefunItem diamondOre;
    public static SlimefunItem emeraldOre;
    public static Category category;
    public static JavaPlugin plugin;

    public void onEnable() {
        this.setupSlimefunItems();
        new ConfigSetup(this);
        this.getServer().getPluginManager().registerEvents(new WorldListener(), this);

        this.getLogger().info("SlimefunOres " + this.getDescription().getVersion() + " has been enabled!");
    }

    public void onDisable() {
        plugin = null;
        this.getLogger().info("SlimefunOres has been disabled!");
    }

    private void setupSlimefunItems() {
        NamespacedKey categoryId = new NamespacedKey(this, "slimefunores");
        CustomItem categoryItem = new CustomItem(Material.GUNPOWDER, "Slimefun Ores");

        category = new Category(categoryId, categoryItem);

        ironOre = new SlimefunOre(category, new SlimefunItemStack("SF_IRON_ORE",new ItemStack(Material.IRON_ORE)), "SF_IRON_ORE", RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[0], true);
        goldOre = new SlimefunOre(category, new SlimefunItemStack("SF_GOLD_ORE", new ItemStack(Material.GOLD_ORE)), "SF_GOLD_ORE", RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[0], true);
        ironOre.register(this);
        goldOre.register(this);
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
