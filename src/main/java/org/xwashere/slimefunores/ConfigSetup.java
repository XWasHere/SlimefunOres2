// Decompiled with: CFR 0.151
// Class Version: 7
package org.xwashere.slimefunores;

import java.util.ArrayList;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.inventory.ItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;

public class ConfigSetup {
    public static boolean oldAlgorithmEnabled;
    public static int coalOverallChance;
    public static int ironOverallChance;
    public static int goldOverallChance;
    public static int diamondOverallChance;
    public static int emeraldOverallChance;
    public static boolean coal_IronDustEnabled;
    public static boolean coal_GoldDustEnabled;
    public static boolean coal_AluminumDustEnabled;
    public static boolean coal_ZincDustEnabled;
    public static boolean coal_TinDustEnabled;
    public static boolean coal_CopperDustEnabled;
    public static boolean coal_MagnesiumDustEnabled;
    public static boolean coal_LeadDustEnabled;
    public static boolean coal_SilverDustEnabled;
    public static boolean iron_IronDustEnabled;
    public static boolean iron_GoldDustEnabled;
    public static boolean iron_AluminumDustEnabled;
    public static boolean iron_ZincDustEnabled;
    public static boolean iron_TinDustEnabled;
    public static boolean iron_CopperDustEnabled;
    public static boolean iron_MagnesiumDustEnabled;
    public static boolean iron_LeadDustEnabled;
    public static boolean iron_SilverDustEnabled;
    public static boolean gold_IronDustEnabled;
    public static boolean gold_GoldDustEnabled;
    public static boolean gold_AluminumDustEnabled;
    public static boolean gold_ZincDustEnabled;
    public static boolean gold_TinDustEnabled;
    public static boolean gold_CopperDustEnabled;
    public static boolean gold_MagnesiumDustEnabled;
    public static boolean gold_LeadDustEnabled;
    public static boolean gold_SilverDustEnabled;
    public static boolean diamond_IronDustEnabled;
    public static boolean diamond_GoldDustEnabled;
    public static boolean diamond_AluminumDustEnabled;
    public static boolean diamond_ZincDustEnabled;
    public static boolean diamond_TinDustEnabled;
    public static boolean diamond_CopperDustEnabled;
    public static boolean diamond_MagnesiumDustEnabled;
    public static boolean diamond_LeadDustEnabled;
    public static boolean diamond_SilverDustEnabled;
    public static boolean diamond_TinyUraniumEnabled;
    public static boolean emerald_IronDustEnabled;
    public static boolean emerald_GoldDustEnabled;
    public static boolean emerald_AluminumDustEnabled;
    public static boolean emerald_ZincDustEnabled;
    public static boolean emerald_TinDustEnabled;
    public static boolean emerald_CopperDustEnabled;
    public static boolean emerald_MagnesiumDustEnabled;
    public static boolean emerald_LeadDustEnabled;
    public static boolean emerald_SilverDustEnabled;
    public static boolean emerald_TinyUraniumEnabled;
    public static ArrayList<ItemStack> coalEnabled;
    public static ArrayList<ItemStack> ironEnabled;
    public static ArrayList<ItemStack> goldEnabled;
    public static ArrayList<ItemStack> diamondEnabled;
    public static ArrayList<ItemStack> emeraldEnabled;

    public ConfigSetup(SlimefunOres sfores) {
        Config config = new Config(sfores);
        coalOverallChance = config.getInt("coal_ore.overall_chance");
        ironOverallChance = config.getInt("iron_ore.overall_chance");
        goldOverallChance = config.getInt("gold_ore.overall_chance");
        diamondOverallChance = config.getInt("diamond_ore.overall_chance");
        emeraldOverallChance = config.getInt("emerald_ore.overall_chance");
        oldAlgorithmEnabled = config.getBoolean("options.old-algorithm");
        if (oldAlgorithmEnabled) {
            coal_IronDustEnabled = config.getBoolean("coal.ore.iron_dust");
            coal_GoldDustEnabled = config.getBoolean("coal_ore.gold_dust");
            coal_AluminumDustEnabled = config.getBoolean("coal_ore.aluminum_dust");
            coal_ZincDustEnabled = config.getBoolean("coal_ore.zinc_dust");
            coal_TinDustEnabled = config.getBoolean("coal_ore.tin_dust");
            coal_CopperDustEnabled = config.getBoolean("coal_ore.copper_dust");
            coal_MagnesiumDustEnabled = config.getBoolean("coal_ore.magnesium_dust");
            coal_LeadDustEnabled = config.getBoolean("coal_ore.lead_dust");
            coal_SilverDustEnabled = config.getBoolean("coal_ore.silver_dust");
            iron_IronDustEnabled = config.getBoolean("iron.ore.iron_dust");
            iron_GoldDustEnabled = config.getBoolean("iron_ore.gold_dust");
            iron_AluminumDustEnabled = config.getBoolean("iron_ore.aluminum_dust");
            iron_ZincDustEnabled = config.getBoolean("iron_ore.zinc_dust");
            iron_TinDustEnabled = config.getBoolean("iron_ore.tin_dust");
            iron_CopperDustEnabled = config.getBoolean("iron_ore.copper_dust");
            iron_MagnesiumDustEnabled = config.getBoolean("iron_ore.magnesium_dust");
            iron_LeadDustEnabled = config.getBoolean("iron_ore.lead_dust");
            iron_SilverDustEnabled = config.getBoolean("iron_ore.silver_dust");
            gold_IronDustEnabled = config.getBoolean("gold.ore.iron_dust");
            gold_GoldDustEnabled = config.getBoolean("gold_ore.gold_dust");
            gold_AluminumDustEnabled = config.getBoolean("gold_ore.aluminum_dust");
            gold_ZincDustEnabled = config.getBoolean("gold_ore.zinc_dust");
            gold_TinDustEnabled = config.getBoolean("gold_ore.tin_dust");
            gold_CopperDustEnabled = config.getBoolean("gold_ore.copper_dust");
            gold_MagnesiumDustEnabled = config.getBoolean("gold_ore.magnesium_dust");
            gold_LeadDustEnabled = config.getBoolean("gold_ore.lead_dust");
            gold_SilverDustEnabled = config.getBoolean("gold_ore.silver_dust");
            diamond_IronDustEnabled = config.getBoolean("coal.ore.iron_dust");
            diamond_GoldDustEnabled = config.getBoolean("diamond_ore.diamond_dust");
            diamond_AluminumDustEnabled = config.getBoolean("diamond_ore.aluminum_dust");
            diamond_ZincDustEnabled = config.getBoolean("diamond_ore.zinc_dust");
            diamond_TinDustEnabled = config.getBoolean("diamond_ore.tin_dust");
            diamond_CopperDustEnabled = config.getBoolean("diamond_ore.copper_dust");
            diamond_MagnesiumDustEnabled = config.getBoolean("diamond_ore.magnesium_dust");
            diamond_LeadDustEnabled = config.getBoolean("diamond_ore.lead_dust");
            diamond_SilverDustEnabled = config.getBoolean("diamond_ore.silver_dust");
            diamond_TinyUraniumEnabled = config.getBoolean("diamond_ore.tiny_uranium");
            emerald_IronDustEnabled = config.getBoolean("emerald.ore.iron_dust");
            emerald_GoldDustEnabled = config.getBoolean("emerald_ore.emerald_dust");
            emerald_AluminumDustEnabled = config.getBoolean("emerald_ore.aluminum_dust");
            emerald_ZincDustEnabled = config.getBoolean("emerald_ore.zinc_dust");
            emerald_TinDustEnabled = config.getBoolean("emerald_ore.tin_dust");
            emerald_CopperDustEnabled = config.getBoolean("emerald_ore.copper_dust");
            emerald_MagnesiumDustEnabled = config.getBoolean("emerald_ore.magnesium_dust");
            emerald_LeadDustEnabled = config.getBoolean("emerald_ore.lead_dust");
            emerald_SilverDustEnabled = config.getBoolean("emerald_ore.silver_dust");
            emerald_TinyUraniumEnabled = config.getBoolean("emerald_ore.tiny_uranium");
        } else {
            if (config.getBoolean("coal_ore.iron_dust")) {
                coalEnabled.add(SlimefunItems.IRON_DUST);
            }
            if (config.getBoolean("coal_ore.gold_dust")) {
                coalEnabled.add(SlimefunItems.GOLD_DUST);
            }
            if (config.getBoolean("coal_ore.aluminum_dust")) {
                coalEnabled.add(SlimefunItems.ALUMINUM_DUST);
            }
            if (config.getBoolean("coal_ore.zinc_dust")) {
                coalEnabled.add(SlimefunItems.ZINC_DUST);
            }
            if (config.getBoolean("coal_ore.tin_dust")) {
                coalEnabled.add(SlimefunItems.TIN_DUST);
            }
            if (config.getBoolean("coal_ore.copper_dust")) {
                coalEnabled.add(SlimefunItems.COPPER_DUST);
            }
            if (config.getBoolean("coal_ore.magnesium_dust")) {
                coalEnabled.add(SlimefunItems.MAGNESIUM_DUST);
            }
            if (config.getBoolean("coal_ore.lead_dust")) {
                coalEnabled.add(SlimefunItems.LEAD_DUST);
            }
            if (config.getBoolean("coal_ore.silver_dust")) {
                coalEnabled.add(SlimefunItems.SILVER_DUST);
            }
            if (config.getBoolean("iron_ore.iron_dust")) {
                ironEnabled.add(SlimefunItems.IRON_DUST);
            }
            if (config.getBoolean("iron_ore.gold_dust")) {
                ironEnabled.add(SlimefunItems.GOLD_DUST);
            }
            if (config.getBoolean("iron_ore.aluminum_dust")) {
                ironEnabled.add(SlimefunItems.ALUMINUM_DUST);
            }
            if (config.getBoolean("iron_ore.zinc_dust")) {
                ironEnabled.add(SlimefunItems.ZINC_DUST);
            }
            if (config.getBoolean("iron_ore.tin_dust")) {
                ironEnabled.add(SlimefunItems.TIN_DUST);
            }
            if (config.getBoolean("iron_ore.copper_dust")) {
                ironEnabled.add(SlimefunItems.COPPER_DUST);
            }
            if (config.getBoolean("iron_ore.magnesium_dust")) {
                ironEnabled.add(SlimefunItems.MAGNESIUM_DUST);
            }
            if (config.getBoolean("iron_ore.lead_dust")) {
                ironEnabled.add(SlimefunItems.LEAD_DUST);
            }
            if (config.getBoolean("iron_ore.silver_dust")) {
                ironEnabled.add(SlimefunItems.SILVER_DUST);
            }
            if (config.getBoolean("gold_ore.iron_dust")) {
                goldEnabled.add(SlimefunItems.IRON_DUST);
            }
            if (config.getBoolean("gold_ore.gold_dust")) {
                goldEnabled.add(SlimefunItems.GOLD_DUST);
            }
            if (config.getBoolean("gold_ore.aluminum_dust")) {
                goldEnabled.add(SlimefunItems.ALUMINUM_DUST);
            }
            if (config.getBoolean("gold_ore.zinc_dust")) {
                goldEnabled.add(SlimefunItems.ZINC_DUST);
            }
            if (config.getBoolean("gold_ore.tin_dust")) {
                goldEnabled.add(SlimefunItems.TIN_DUST);
            }
            if (config.getBoolean("gold_ore.copper_dust")) {
                goldEnabled.add(SlimefunItems.COPPER_DUST);
            }
            if (config.getBoolean("gold_ore.magnesium_dust")) {
                goldEnabled.add(SlimefunItems.MAGNESIUM_DUST);
            }
            if (config.getBoolean("gold_ore.lead_dust")) {
                goldEnabled.add(SlimefunItems.LEAD_DUST);
            }
            if (config.getBoolean("gold_ore.silver_dust")) {
                goldEnabled.add(SlimefunItems.SILVER_DUST);
            }
            if (config.getBoolean("diamond_ore.iron_dust")) {
                diamondEnabled.add(SlimefunItems.IRON_DUST);
            }
            if (config.getBoolean("diamond_ore.gold_dust")) {
                diamondEnabled.add(SlimefunItems.GOLD_DUST);
            }
            if (config.getBoolean("diamond_ore.aluminum_dust")) {
                diamondEnabled.add(SlimefunItems.ALUMINUM_DUST);
            }
            if (config.getBoolean("diamond_ore.zinc_dust")) {
                diamondEnabled.add(SlimefunItems.ZINC_DUST);
            }
            if (config.getBoolean("diamond_ore.tin_dust")) {
                diamondEnabled.add(SlimefunItems.TIN_DUST);
            }
            if (config.getBoolean("diamond_ore.copper_dust")) {
                diamondEnabled.add(SlimefunItems.COPPER_DUST);
            }
            if (config.getBoolean("diamond_ore.magnesium_dust")) {
                diamondEnabled.add(SlimefunItems.MAGNESIUM_DUST);
            }
            if (config.getBoolean("diamond_ore.lead_dust")) {
                diamondEnabled.add(SlimefunItems.LEAD_DUST);
            }
            if (config.getBoolean("diamond_ore.silver_dust")) {
                diamondEnabled.add(SlimefunItems.SILVER_DUST);
            }
            if (config.getBoolean("emerald_ore.tiny_uranium")) {
                diamondEnabled.add(SlimefunItems.TINY_URANIUM);
            }
            if (config.getBoolean("emerald_ore.iron_dust")) {
                emeraldEnabled.add(SlimefunItems.IRON_DUST);
            }
            if (config.getBoolean("emerald_ore.gold_dust")) {
                emeraldEnabled.add(SlimefunItems.GOLD_DUST);
            }
            if (config.getBoolean("emerald_ore.aluminum_dust")) {
                emeraldEnabled.add(SlimefunItems.ALUMINUM_DUST);
            }
            if (config.getBoolean("emerald_ore.zinc_dust")) {
                emeraldEnabled.add(SlimefunItems.ZINC_DUST);
            }
            if (config.getBoolean("emerald_ore.tin_dust")) {
                emeraldEnabled.add(SlimefunItems.TIN_DUST);
            }
            if (config.getBoolean("emerald_ore.copper_dust")) {
                emeraldEnabled.add(SlimefunItems.COPPER_DUST);
            }
            if (config.getBoolean("emerald_ore.magnesium_dust")) {
                emeraldEnabled.add(SlimefunItems.MAGNESIUM_DUST);
            }
            if (config.getBoolean("emerald_ore.lead_dust")) {
                emeraldEnabled.add(SlimefunItems.LEAD_DUST);
            }
            if (config.getBoolean("emerald_ore.silver_dust")) {
                emeraldEnabled.add(SlimefunItems.SILVER_DUST);
            }
            if (config.getBoolean("emerald_ore.tiny_uranium")) {
                emeraldEnabled.add(SlimefunItems.TINY_URANIUM);
            }
        }
    }

    static {
        coalEnabled = new ArrayList();
        ironEnabled = new ArrayList();
        goldEnabled = new ArrayList();
        diamondEnabled = new ArrayList();
        emeraldEnabled = new ArrayList();
    }
}
