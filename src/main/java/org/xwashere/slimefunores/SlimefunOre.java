package org.xwashere.slimefunores;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class SlimefunOre extends SlimefunItem {
    public SlimefunOre(Category category, SlimefunItemStack item, String name, RecipeType type, ItemStack[] recipe, boolean ghost) {
        super(category, item, type, recipe);
    }
}