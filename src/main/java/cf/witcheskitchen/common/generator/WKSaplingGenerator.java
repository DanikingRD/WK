package cf.witcheskitchen.common.generator;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.Supplier;

//code currently thanks to croptopia as other attempts kept failing here
public class WKSaplingGenerator extends SaplingGenerator {

    private final Supplier<ConfiguredFeature<TreeFeatureConfig, ?>> tree;

    public WKSaplingGenerator(Supplier<ConfiguredFeature<TreeFeatureConfig, ?>> tree) {
        this.tree = tree;
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return tree.get();
    }
}
