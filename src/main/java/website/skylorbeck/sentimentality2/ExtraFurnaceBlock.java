package website.skylorbeck.sentimentality2;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.*;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;


public class ExtraFurnaceBlock extends AbstractExtraFurnaceBlock {
    private static final IntProperty DIM = IntProperty.of("dim",0,2);

    protected ExtraFurnaceBlock(Settings settings, int dimension) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(DIM,dimension));
    }
    @Environment(EnvType.CLIENT)
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            double x = (double) pos.getX() + 0.5D;
            double y = (double) pos.getY();
            double z = (double) pos.getZ() + 0.5D;
            if (random.nextDouble() < 0.1D) {
                world.playSound(x, y, z, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }
            Direction direction_1 = state.get(FACING);
            Direction.Axis direction$Axis_1 = direction_1.getAxis();
            double double_5 = random.nextDouble() * 0.6D - 0.3D;
            double double_6 = direction$Axis_1 == Direction.Axis.X ? (double) direction_1.getOffsetX() * 0.52D : double_5;
            double double_7 = random.nextDouble() * 6.0D / 16.0D;
            double double_8 = direction$Axis_1 == Direction.Axis.Z ? (double) direction_1.getOffsetZ() * 0.52D : double_5;
            world.addParticle(ParticleTypes.SMOKE, x + double_6, y + double_7, z + double_8, 0.0D, 0.0D, 0.0D);

            switch (state.get(DIM)){
                case 0:
                    world.addParticle(ParticleTypes.FLAME, x + double_6, y + double_7, z + double_8, 0.0D, 0.0D, 0.0D);
                    break;
                case 1:
                    world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, x + double_6, y + double_7, z + double_8, 0.0D, 0.0D, 0.0D);
                    break;
                case 2:
                    world.addParticle(Declarer.END_FIRE_FLAME, x + double_6, y + double_7, z + double_8, 0.0D, 0.0D, 0.0D);
                    break;
            }
        }
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, LIT});
        builder.add(DIM);
    }
}


