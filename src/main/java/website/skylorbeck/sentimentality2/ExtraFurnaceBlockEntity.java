package website.skylorbeck.sentimentality2;

import net.minecraft.recipe.RecipeType;

public class ExtraFurnaceBlockEntity extends AbstractExtraFurnaceBlockEntity {

    protected ExtraFurnaceBlockEntity() {
        super(Declarer.EXTRA_FURNACE_ENTITY,RecipeType.SMELTING);
    }
}
