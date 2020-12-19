package website.skylorbeck.sentimentality2;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;

public class ExtraDyeableArmorItem extends DyeableArmorItem implements DyeableItem {//extends the dyeable armor system but makes it default to white so that clothes default to white
    public ExtraDyeableArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Settings settings) {
        super(armorMaterial, equipmentSlot, settings);
    }
    @Override
    public int getColor(ItemStack stack) {
        CompoundTag compoundTag = stack.getSubTag("display");
        return compoundTag != null && compoundTag.contains("color", 99) ? compoundTag.getInt("color") : 16777215;//white
    }
}
