package org.xwashere.slimefunores;

import java.util.Random;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class WorldListener implements Listener {
    static Random random = new Random();

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent e) {
        
        // Lazy check for if it's canceled.
        if (e.isCanceled()) return;
        
        Block b = e.getBlock();
        SlimefunItem slimefunItem = BlockStorage.check(b);
        
        if (slimefunItem instanceof SlimefunOre) {
            BlockStorage.clearBlockInfo(b);
            return;
        }
        
        if (e.getPlayer().getItemInHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
            return;
        }
        
        if (b.getType().toString().endsWith("_ORE")) {
            ItemStack dust = new ItemStack(Material.AIR);
            switch (b.getType()) {
                case COAL_ORE: {
                    if (!WorldListener.getChance(ConfigSetup.coalOverallChance)) break;
                    if (ConfigSetup.oldAlgorithmEnabled) {
                        dust = SlimefunItems.IRON_DUST;
                        if (WorldListener.getChance(25) && ConfigSetup.coal_GoldDustEnabled) {
                            dust = SlimefunItems.GOLD_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.coal_AluminumDustEnabled) {
                            dust = SlimefunItems.ALUMINUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.coal_CopperDustEnabled) {
                            dust = SlimefunItems.COPPER_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.coal_ZincDustEnabled) {
                            dust = SlimefunItems.ZINC_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.coal_TinDustEnabled) {
                            dust = SlimefunItems.TIN_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.coal_MagnesiumDustEnabled) {
                            dust = SlimefunItems.MAGNESIUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.coal_LeadDustEnabled) {
                            dust = SlimefunItems.LEAD_DUST;
                            break;
                        }
                        if (!WorldListener.getChance(25) || !ConfigSetup.coal_SilverDustEnabled) break;
                        dust = SlimefunItems.SILVER_DUST;
                        break;
                    }
                    dust = WorldListener.getRandomItem(ConfigSetup.coalEnabled);
                    break;
                }
                case IRON_ORE: {
                    if (!WorldListener.getChance(ConfigSetup.ironOverallChance)) break;
                    if (ConfigSetup.oldAlgorithmEnabled) {
                        dust = SlimefunItems.IRON_DUST;
                        if (WorldListener.getChance(25) && ConfigSetup.iron_GoldDustEnabled) {
                            dust = SlimefunItems.GOLD_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.iron_AluminumDustEnabled) {
                            dust = SlimefunItems.ALUMINUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.iron_CopperDustEnabled) {
                            dust = SlimefunItems.COPPER_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.iron_ZincDustEnabled) {
                            dust = SlimefunItems.ZINC_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.iron_TinDustEnabled) {
                            dust = SlimefunItems.TIN_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.iron_MagnesiumDustEnabled) {
                            dust = SlimefunItems.MAGNESIUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.iron_LeadDustEnabled) {
                            dust = SlimefunItems.LEAD_DUST;
                            break;
                        }
                        if (!WorldListener.getChance(25) || !ConfigSetup.iron_SilverDustEnabled) break;
                        dust = SlimefunItems.SILVER_DUST;
                        break;
                    }
                    dust = WorldListener.getRandomItem(ConfigSetup.ironEnabled);
                    break;
                }
                case GOLD_ORE: {
                    if (!WorldListener.getChance(ConfigSetup.goldOverallChance)) break;
                    if (ConfigSetup.oldAlgorithmEnabled) {
                        dust = SlimefunItems.IRON_DUST;
                        if (WorldListener.getChance(25) && ConfigSetup.gold_GoldDustEnabled) {
                            dust = SlimefunItems.GOLD_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.gold_AluminumDustEnabled) {
                            dust = SlimefunItems.ALUMINUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.gold_CopperDustEnabled) {
                            dust = SlimefunItems.COPPER_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.gold_ZincDustEnabled) {
                            dust = SlimefunItems.ZINC_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.gold_TinDustEnabled) {
                            dust = SlimefunItems.TIN_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.gold_MagnesiumDustEnabled) {
                            dust = SlimefunItems.MAGNESIUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.gold_LeadDustEnabled) {
                            dust = SlimefunItems.LEAD_DUST;
                            break;
                        }
                        if (!WorldListener.getChance(25) || !ConfigSetup.gold_SilverDustEnabled) break;
                        dust = SlimefunItems.SILVER_DUST;
                        break;
                    }
                    dust = WorldListener.getRandomItem(ConfigSetup.goldEnabled);
                    break;
                }
                case DIAMOND_ORE: {
                    if (!WorldListener.getChance(ConfigSetup.diamondOverallChance)) break;
                    if (ConfigSetup.oldAlgorithmEnabled) {
                        dust = SlimefunItems.IRON_DUST;
                        if (WorldListener.getChance(25) && ConfigSetup.diamond_GoldDustEnabled) {
                            dust = SlimefunItems.GOLD_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.diamond_AluminumDustEnabled) {
                            dust = SlimefunItems.ALUMINUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.diamond_CopperDustEnabled) {
                            dust = SlimefunItems.COPPER_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.diamond_ZincDustEnabled) {
                            dust = SlimefunItems.ZINC_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.diamond_TinDustEnabled) {
                            dust = SlimefunItems.TIN_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.diamond_MagnesiumDustEnabled) {
                            dust = SlimefunItems.MAGNESIUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.diamond_LeadDustEnabled) {
                            dust = SlimefunItems.LEAD_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.diamond_SilverDustEnabled) {
                            dust = SlimefunItems.SILVER_DUST;
                            break;
                        }
                        if (!WorldListener.getChance(25) || !ConfigSetup.diamond_TinyUraniumEnabled) break;
                        dust = SlimefunItems.TINY_URANIUM;
                        break;
                    }
                    dust = WorldListener.getRandomItem(ConfigSetup.diamondEnabled);
                    break;
                }
                case EMERALD_ORE: {
                    if (!WorldListener.getChance(ConfigSetup.emeraldOverallChance)) break;
                    if (ConfigSetup.oldAlgorithmEnabled) {
                        dust = SlimefunItems.IRON_DUST;
                        if (WorldListener.getChance(25) && ConfigSetup.emerald_GoldDustEnabled) {
                            dust = SlimefunItems.GOLD_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.emerald_AluminumDustEnabled) {
                            dust = SlimefunItems.ALUMINUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.emerald_CopperDustEnabled) {
                            dust = SlimefunItems.COPPER_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.emerald_ZincDustEnabled) {
                            dust = SlimefunItems.ZINC_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.emerald_TinDustEnabled) {
                            dust = SlimefunItems.TIN_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.emerald_MagnesiumDustEnabled) {
                            dust = SlimefunItems.MAGNESIUM_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.emerald_LeadDustEnabled) {
                            dust = SlimefunItems.LEAD_DUST;
                            break;
                        }
                        if (WorldListener.getChance(25) && ConfigSetup.emerald_SilverDustEnabled) {
                            dust = SlimefunItems.SILVER_DUST;
                            break;
                        }
                        if (!WorldListener.getChance(25) || !ConfigSetup.emerald_TinyUraniumEnabled) break;
                        dust = SlimefunItems.TINY_URANIUM;
                        break;
                    }
                    dust = WorldListener.getRandomItem(ConfigSetup.emeraldEnabled);
                }
            }
            if (dust.getType() != Material.AIR) {
                b.getWorld().dropItemNaturally(b.getLocation(), dust);
            }
        }
    }

    private static boolean getChance(int percentage) {
        return random.nextInt(100) <= percentage;
    }

    private static ItemStack getRandomItem(ArrayList<ItemStack> list) {
        return list.get(random.nextInt(list.size()));
    }
}
