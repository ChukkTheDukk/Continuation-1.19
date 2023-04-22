package net.chukkthedukk.continuation.block;

import net.chukkthedukk.continuation.Continuation;
import net.chukkthedukk.continuation.block.custom.CookingPotBlock;
import net.chukkthedukk.continuation.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20f).requiresTool()), ModItemGroup.CONTINUATION);
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(30f).requiresTool()), ModItemGroup.CONTINUATION);
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(35f).requiresTool()), ModItemGroup.CONTINUATION);
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(50f).requiresTool()), ModItemGroup.CONTINUATION);

    public static final Block COOKING_POT = registerBlock("cooking_pot",
            new CookingPotBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(2.5f).nonOpaque()), ModItemGroup.CONTINUATION);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Continuation.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Continuation.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Continuation.LOGGER.debug("Registering ModBlocks for " + Continuation.MOD_ID);
    }

}
