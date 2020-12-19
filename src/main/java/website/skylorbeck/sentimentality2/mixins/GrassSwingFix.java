package website.skylorbeck.sentimentality2.mixins;

import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MinecraftClient.class)
public class GrassSwingFix {

    @Shadow
    public ClientPlayerEntity player;
    @Shadow public ClientWorld world;

    @Redirect(method = "doAttack", at = @At(value = "INVOKE", target = "net/minecraft/client/network/ClientPlayerInteractionManager.attackBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;)Z"))
    private boolean checkForEntity(ClientPlayerInteractionManager manager, BlockPos pos, Direction direction) {
        BlockState clicked = world.getBlockState(pos);
        if (!clicked.getCollisionShape(world, pos).isEmpty() || clicked.getHardness(world, pos) != 0.0F) {//make sure the block clicked on was not air
            return manager.attackBlock(pos, direction);
        }
        Vec3d camera = player.getCameraPosVec(1.0F);//find the players vector, then check if any entity is within reach of the player in a ray through the block hit
        Vec3d rotation = player.getRotationVec(1.0F);
        float reach = manager.getReachDistance();
        Vec3d end = camera.add(rotation.x * reach, rotation.y * reach, rotation.z * reach);
        EntityHitResult result = ProjectileUtil.getEntityCollision(world, player, camera, end, new Box(camera, end), EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR.and(e -> e != null && e.collides() && e instanceof LivingEntity));
        if (result != null) {//only pass if a livingentity was hit
            manager.attackEntity(player, result.getEntity());
            return true;
        }
        return manager.attackBlock(pos, direction);
    }
}