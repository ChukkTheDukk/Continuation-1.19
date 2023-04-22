package net.chukkthedukk.continuation.world.feature;

import net.chukkthedukk.continuation.Continuation;
import net.chukkthedukk.continuation.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_PLATINUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PLATINUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PLATINUM_ORE =
            ConfiguredFeatures.register("platinum_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_PLATINUM_ORES, 4
            ));

    public static void registerConfiguredFeatures() {
        Continuation.LOGGER.debug("Registering the ModConfiguredFeatures for " + Continuation.MOD_ID);
    }

}
