package com.mimic101.projectnexus.block;

import com.mimic101.projectnexus.ProjectNexus;
import com.mimic101.projectnexus.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ProjectNexus.MOD_ID);

    // Functional
    public static final DeferredBlock<Block> VOID_QUARRY = registerBlock("void_quarry",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)));

    public static final DeferredBlock<Block> DISPLAY_BLOCK = registerBlock("display_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)));

    public static final DeferredBlock<Block> SUPERCOMPUTER_BLOCK = registerBlock("supercomputer_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f)));

    public static final DeferredBlock<Block> NUCLEAR_REACTOR_CORE = registerBlock("nuclear_reactor_core",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f)));

    // Storage/Decoration
    public static final DeferredBlock<Block> PLASTIC_BLOCK = registerBlock("plastic_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f)));

    public static final DeferredBlock<Block> SILICONE_BLOCK = registerBlock("silicone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f)));

    public static final DeferredBlock<Block> NEXUS_BEACON = registerBlock("nexus_beacon",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f).lightLevel(s -> 12)));

    public static final DeferredBlock<Block> NEXUS_BRICKS = registerBlock("nexus_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)));

    public static final DeferredBlock<Block> NEXUS_GLASS = registerBlock("nexus_glass",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).lightLevel(s -> 6).mapColor(MapColor.COLOR_LIGHT_BLUE).noOcclusion()));

    // Ores
    public static final DeferredBlock<Block> URANIUM_ORE = registerBlock("uranium_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)));

    public static final DeferredBlock<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)));

    public static final DeferredBlock<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)));

    public static final DeferredBlock<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)));

    public static final DeferredBlock<Block> LITHIUM_ORE = registerBlock("lithium_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)));

    public static final DeferredBlock<Block> IRIDIUM_ORE = registerBlock("iridium_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)));

    public static final DeferredBlock<Block> NEXUS_CRYSTAL_ORE = registerBlock("nexus_crystal_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).lightLevel(s -> 7)));

    // Generic block registration
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
