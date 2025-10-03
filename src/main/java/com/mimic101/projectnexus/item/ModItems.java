package com.mimic101.projectnexus.item;

import com.mimic101.projectnexus.ProjectNexus;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectNexus.MOD_ID);

    public static final DeferredItem<Item> NUCLEAR_WASTE = ITEMS.register("nuclear_waste",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILICONE = ITEMS.register("silicone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NUCLEAR_IRON_INGOT = ITEMS.register("nuclear_iron_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> INFINITY_INGOT = ITEMS.register("infinity_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAGICAL_WEED = ITEMS.register("magical_weed",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ALL_STAR_INGOT = ITEMS.register("all_star_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SUPERCOMPUTER_CHIP = ITEMS.register("supercomputer_chip",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEXUS_CRYSTAL = ITEMS.register("nexus_crystal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VOID_ESSENCE = ITEMS.register("void_essence",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BIOFUEL_PELLET = ITEMS.register("biofuel_pellet",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENERGY_CELL = ITEMS.register("energy_cell",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

