package cf.witcheskitchen.common.blocks.technical;

import cf.witcheskitchen.api.WKBlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class WKDeviceBlock extends WKBlockEntityProvider {

    public WKDeviceBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        final BlockEntity entity = world.getBlockEntity(pos);
        // We extended BlockEntityProvider.
        // But i've seen weird bugs
        if (entity == null) {
            return ActionResult.PASS;
        }
        //Requests a screen
        if (entity instanceof NamedScreenHandlerFactory factory) {
            player.openHandledScreen(factory);
            return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }

}
