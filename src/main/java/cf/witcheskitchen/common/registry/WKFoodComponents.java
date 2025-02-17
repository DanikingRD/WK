package cf.witcheskitchen.common.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class WKFoodComponents {

    public static final FoodComponent FROSTING = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 250), 0.66F).build();
    public static final FoodComponent RUM_BALLS = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).snack().alwaysEdible().statusEffect(new StatusEffectInstance(WKStatusEffects.DRUNK, 400), 0.05F).build();
    public static final FoodComponent SUPER_BOOZE = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).snack().alwaysEdible().statusEffect(new StatusEffectInstance(WKStatusEffects.DRUNK, 4000, 3), 1F).build();
    public static final FoodComponent SUPER_STRONG_ALCOHOL = new FoodComponent.Builder().hunger(1).saturationModifier(1f).snack().alwaysEdible().statusEffect(new StatusEffectInstance(WKStatusEffects.DRUNK, 4000, 2), 0.95F).build();
    public static final FoodComponent STRONG_ALCOHOL = new FoodComponent.Builder().hunger(1).saturationModifier(1f).snack().alwaysEdible().statusEffect(new StatusEffectInstance(WKStatusEffects.DRUNK, 3000, 2), 0.65F).build();
    public static final FoodComponent AVERAGE_ALCOHOL = new FoodComponent.Builder().hunger(1).saturationModifier(1f).snack().alwaysEdible().statusEffect(new StatusEffectInstance(WKStatusEffects.DRUNK, 2000, 1), 0.35F).build();
    public static final FoodComponent WEAK_ALCOHOL = new FoodComponent.Builder().hunger(1).saturationModifier(1f).snack().alwaysEdible().statusEffect(new StatusEffectInstance(WKStatusEffects.DRUNK, 1000), 0.15F).build();
}
