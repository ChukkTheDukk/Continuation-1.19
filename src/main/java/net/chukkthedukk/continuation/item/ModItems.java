package net.chukkthedukk.continuation.item;

import net.chukkthedukk.continuation.Continuation;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_PLATINUM = registerItem("raw_platinum",
            new Item(new FabricItemSettings().group(ModItemGroup.CONTINUATION)));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.CONTINUATION)));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.CONTINUATION)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Continuation.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Continuation.LOGGER.debug("Registering Mod Items for " + Continuation.MOD_ID);
    }
}
