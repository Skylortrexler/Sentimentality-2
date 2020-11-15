package website.skylorbeck.sentimentality2.mixins;

import net.fabricmc.fabric.api.network.ServerSidePacketRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.packet.s2c.play.TitleS2CPacket;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShearsItem.class)
public abstract class DurabilityWarningMixinShear {
    @Inject(at = @At("HEAD"), method = "postMine")
    public void checkDur(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity attacker, CallbackInfoReturnable<Boolean> cir) {
        if (!world.isClient && attacker instanceof PlayerEntity && state.getHardness(world, pos) != 0.0F) {
            int curDam = stack.getMaxDamage() - stack.getDamage();
            CompoundTag tag = stack.getOrCreateTag();
            if (curDam>=11){
                tag.putBoolean("hasPlayedSound1",false);
                tag.putBoolean("hasPlayedSound2",false);
            }
            switch (curDam) {
                case 10:
                case 9:
                    if (!tag.getBoolean("hasPlayedSound1")) {
                        world.playSound(null, pos, SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.BLOCKS, 0.4f, 0.8F + world.random.nextFloat() * 0.4F);
                        ServerSidePacketRegistry.INSTANCE.sendToPlayer((PlayerEntity) attacker, (new TitleS2CPacket(TitleS2CPacket.Action.ACTIONBAR, new TranslatableText(stack.getItem().getTranslationKey()).append(" is close to breaking!"))));
                        tag.putBoolean("hasPlayedSound1", true);
                    }
                        break;
                case 5:
                case 4:
                    if (!tag.getBoolean("hasPlayedSound2")) {
                        world.playSound(null, pos, SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.BLOCKS, 0.6f, 0.8F + world.random.nextFloat() * 0.4F);
                        ServerSidePacketRegistry.INSTANCE.sendToPlayer((PlayerEntity) attacker, (new TitleS2CPacket(TitleS2CPacket.Action.ACTIONBAR, new TranslatableText(stack.getItem().getTranslationKey()).append(" is VERY close to breaking!!"))));
                        tag.putBoolean("hasPlayedSound2", true);
                    }
                    break;
            }
        }
    }
}