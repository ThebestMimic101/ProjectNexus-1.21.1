package com.mimic101.projectnexus.item;

import com.mimic101.projectnexus.ProjectNexus;
import com.mimic101.projectnexus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectNexus.MOD_ID);

    // ------------------- ITEMS TAB -------------------
    public static final Supplier<CreativeModeTab> PROJECT_NEXUS_ITEMS_TAB = CREATIVE_MODE_TAB.register("project_nexus_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ALL_STAR_INGOT.get()))
                    .title(Component.translatable("creativetab.projectnexus.project_nexus_items"))
                    .displayItems((parameters, output) -> {
                        // Ingots & materials
                        output.accept(ModItems.NUCLEAR_WASTE);
                        output.accept(ModItems.PLASTIC);
                        output.accept(ModItems.SILICONE);
                        output.accept(ModItems.NUCLEAR_IRON_INGOT);
                        output.accept(ModItems.INFINITY_INGOT);
                        output.accept(ModItems.MAGICAL_WEED);
                        output.accept(ModItems.ALL_STAR_INGOT);
                        output.accept(ModItems.SUPERCOMPUTER_CHIP);
                        output.accept(ModItems.NEXUS_CRYSTAL);
                        output.accept(ModItems.VOID_ESSENCE);
                        output.accept(ModItems.BIOFUEL_PELLET);
                        output.accept(ModItems.ENERGY_CELL);

                        // New items
                        output.accept(ModItems.IRON_MOULD);
                        output.accept(ModItems.AI_CHIP);
                        output.accept(ModItems.BLUEPRINT_OF_THE_NEXUS);
                        output.accept(ModItems.ATOM_CORE);
                        output.accept(ModItems.NUCLEAR_COAL);
                    })
                    .build());

    // ------------------- BLOCKS TAB -------------------
    public static final Supplier<CreativeModeTab> PROJECT_NEXUS_BLOCKS_TAB = CREATIVE_MODE_TAB.register("project_nexus_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.NEXUS_BEACON.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ProjectNexus.MOD_ID, "project_nexus_items_tab"))
                    .title(Component.translatable("creativetab.projectnexus.project_nexus_blocks"))
                    .displayItems((parameters, output) -> {
                        // Functional blocks
                        output.accept(ModBlocks.VOID_QUARRY);
                        output.accept(ModBlocks.DISPLAY_BLOCK);
                        output.accept(ModBlocks.SUPERCOMPUTER_BLOCK);
                        output.accept(ModBlocks.NUCLEAR_REACTOR_CORE);
                        output.accept(ModBlocks.ATOMIZER);
                        output.accept(ModBlocks.PRESSER);

                        // Decorative/Storage
                        output.accept(ModBlocks.PLASTIC_BLOCK);
                        output.accept(ModBlocks.SILICONE_BLOCK);
                        output.accept(ModBlocks.NEXUS_BEACON);
                        output.accept(ModBlocks.NEXUS_BRICKS);
                        output.accept(ModBlocks.NEXUS_GLASS);

                        // Ores
                        output.accept(ModBlocks.URANIUM_ORE);
                        output.accept(ModBlocks.TITANIUM_ORE);
                        output.accept(ModBlocks.ALUMINUM_ORE);
                        output.accept(ModBlocks.PLATINUM_ORE);
                        output.accept(ModBlocks.LITHIUM_ORE);
                        output.accept(ModBlocks.IRIDIUM_ORE);
                        output.accept(ModBlocks.NEXUS_CRYSTAL_ORE);
                        output.accept(ModBlocks.UNKNOWN_ORE);

                        // Special blocks
                        output.accept(ModBlocks.RADIATION_BLOCK);
                        output.accept(ModBlocks.VOID_BLOCK);
                    })
                    .build());

    // ------------------- ARMOR TAB -------------------
    public static final Supplier<CreativeModeTab> PROJECT_NEXUS_ARMOR_TAB = CREATIVE_MODE_TAB.register("project_nexus_armor_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.INFINITY_INGOT.get())) // Example armor
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ProjectNexus.MOD_ID, "project_nexus_blocks_tab"))
                    .title(Component.translatable("creativetab.projectnexus.project_nexus_armor"))
                    .displayItems((parameters, output) -> {
                        // Replace with your actual armor items
                    })
                    .build());

    // ------------------- WEAPONS TAB -------------------
    public static final Supplier<CreativeModeTab> PROJECT_NEXUS_WEAPONS_TAB = CREATIVE_MODE_TAB.register("project_nexus_weapons_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.INFINITY_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ProjectNexus.MOD_ID, "project_nexus_armor_tab"))
                    .title(Component.translatable("creativetab.projectnexus.project_nexus_weapons"))
                    .displayItems((parameters, output) -> {
                        // Replace with your actual weapons
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
