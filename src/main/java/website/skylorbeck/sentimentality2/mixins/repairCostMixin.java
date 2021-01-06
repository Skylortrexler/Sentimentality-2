package website.skylorbeck.sentimentality2.mixins;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import website.skylorbeck.sentimentality2.Ref;
import website.skylorbeck.sentimentality2.Registrar;


@Mixin(ItemStack.class)
public abstract class repairCostMixin {
    @Shadow public abstract CompoundTag getOrCreateTag();
    @Inject(method = "setRepairCost",at = @At("HEAD"),cancellable = true)
    public void sentimentalSetRepairCost(CallbackInfo ci) {
        if (Ref.repairCost) {
            this.getOrCreateTag().putInt("RepairCost", 0);//always set added repair cost to 0, then cancel. I explicitly did not want to remove the cost to repair, just prevent it from ballooning super high
            ci.cancel();
        }
    }
}