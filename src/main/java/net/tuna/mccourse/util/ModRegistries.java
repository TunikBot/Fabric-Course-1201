package net.tuna.mccourse.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.tuna.mccourse.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    public static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.PEAT_BRICK, 200);
    }
}
