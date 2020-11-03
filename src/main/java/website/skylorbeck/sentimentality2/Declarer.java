package website.skylorbeck.sentimentality2;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.particle.DefaultParticleType;


public class Declarer {
    public static DefaultParticleType END_FIRE_FLAME;
    public static BlockEntityType<ExtraFurnaceBlockEntity> EXTRA_FURNACE_ENTITY;
    public static BlockEntityType<ExtraBlastFurnaceBlockEntity> EXTRA_BLAST_FURNACE_ENTITY;
    public static BlockEntityType<ExtraSmokerBlockEntity> EXTRA_SMOKER_FURNACE_ENTITY;


    public static final Item fleather = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Block charcoal_block =new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK));
    public static final BlockItem charcoal_blockitem = new BlockItem(charcoal_block,new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Block sandstone_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem sandstone_furnace = new BlockItem(sandstone_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block red_sandstone_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem red_sandstone_furnace = new BlockItem(red_sandstone_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block andesite_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem andesite_furnace = new BlockItem(andesite_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block granite_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem granite_furnace = new BlockItem(granite_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block diorite_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem diorite_furnace = new BlockItem(diorite_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block netherrack_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),1);
    public static final BlockItem netherrack_furnace = new BlockItem(netherrack_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block blackstone_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),1);
    public static final BlockItem blackstone_furnace = new BlockItem(blackstone_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block basalt_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),1);
    public static final BlockItem basalt_furnace = new BlockItem(basalt_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block endstone_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),2);
    public static final BlockItem endstone_furnace = new BlockItem(endstone_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));

    public static final Block sandstone_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem sandstone_blast_furnace = new BlockItem(sandstone_blast_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block red_sandstone_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem red_sandstone_blast_furnace = new BlockItem(red_sandstone_blast_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block andesite_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem andesite_blast_furnace = new BlockItem(andesite_blast_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block granite_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem granite_blast_furnace = new BlockItem(granite_blast_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block diorite_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem diorite_blast_furnace = new BlockItem(diorite_blast_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block netherrack_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem netherrack_blast_furnace = new BlockItem(netherrack_blast_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block blackstone_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem blackstone_blast_furnace = new BlockItem(blackstone_blast_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block basalt_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem basalt_blast_furnace = new BlockItem(basalt_blast_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block endstone_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem endstone_blast_furnace = new BlockItem(endstone_blast_furnaceblock,new Item.Settings().group(ItemGroup.DECORATIONS));

    public static final Block sandstone_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem sandstone_smoker = new BlockItem(sandstone_smokerblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block red_sandstone_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem red_sandstone_smoker = new BlockItem(red_sandstone_smokerblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block andesite_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem andesite_smoker = new BlockItem(andesite_smokerblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block granite_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem granite_smoker = new BlockItem(granite_smokerblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block diorite_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem diorite_smoker = new BlockItem(diorite_smokerblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block netherrack_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem netherrack_smoker = new BlockItem(netherrack_smokerblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block blackstone_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem blackstone_smoker = new BlockItem(blackstone_smokerblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block basalt_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem basalt_smoker = new BlockItem(basalt_smokerblock,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final Block endstone_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem endstone_smoker = new BlockItem(endstone_smokerblock,new Item.Settings().group(ItemGroup.DECORATIONS));

    public static final Item wool_helmet = new DyeableArmorItem(ExtraArmorMaterials.WOOL, EquipmentSlot.HEAD,new Item.Settings().group(ItemGroup.COMBAT));//todo figure out how to change default color to white from brown
    public static final Item wool_chestplate = new DyeableArmorItem(ExtraArmorMaterials.WOOL, EquipmentSlot.CHEST,new Item.Settings().group(ItemGroup.COMBAT));//todo make better textures
    public static final Item wool_leggings = new DyeableArmorItem(ExtraArmorMaterials.WOOL, EquipmentSlot.LEGS,new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item wool_boots = new DyeableArmorItem(ExtraArmorMaterials.WOOL, EquipmentSlot.FEET,new Item.Settings().group(ItemGroup.COMBAT));

    public static final Item granitesword = new SwordItem(ExtraToolMaterials.GRANITE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item graniteshovel = new ShovelItem(ExtraToolMaterials.GRANITE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item granitepick = new ExtraPickaxeItem(ExtraToolMaterials.GRANITE,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item graniteaxe = new ExtraAxeItem(ExtraToolMaterials.GRANITE, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item granitehoe = new ExtraHoeItem(ExtraToolMaterials.GRANITE, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item dioritesword = new SwordItem(ExtraToolMaterials.DIORITE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item dioriteshovel = new ShovelItem(ExtraToolMaterials.DIORITE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item dioritepick = new ExtraPickaxeItem(ExtraToolMaterials.DIORITE,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item dioriteaxe = new ExtraAxeItem(ExtraToolMaterials.DIORITE, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item dioritehoe = new ExtraHoeItem(ExtraToolMaterials.DIORITE, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item andesitesword = new SwordItem(ExtraToolMaterials.ANDESITE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item andesiteshovel = new ShovelItem(ExtraToolMaterials.ANDESITE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item andesitepick = new ExtraPickaxeItem(ExtraToolMaterials.ANDESITE,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item andesiteaxe = new ExtraAxeItem(ExtraToolMaterials.ANDESITE, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item andesitehoe = new ExtraHoeItem(ExtraToolMaterials.ANDESITE, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item quartzsword = new SwordItem(ExtraToolMaterials.QUARTZ, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item quartzshovel = new ShovelItem(ExtraToolMaterials.QUARTZ, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item quartzpick = new ExtraPickaxeItem(ExtraToolMaterials.QUARTZ,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item quartzaxe = new ExtraAxeItem(ExtraToolMaterials.QUARTZ, 6.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item quartzhoe = new ExtraHoeItem(ExtraToolMaterials.QUARTZ, -2,-1.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item netherracksword = new SwordItem(ExtraToolMaterials.NETHERRACK, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item netherrackshovel = new ShovelItem(ExtraToolMaterials.NETHERRACK, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item netherrackpick = new ExtraPickaxeItem(ExtraToolMaterials.NETHERRACK,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item netherrackaxe = new ExtraAxeItem(ExtraToolMaterials.NETHERRACK, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item netherrackhoe = new ExtraHoeItem(ExtraToolMaterials.NETHERRACK, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item netherbricksword = new SwordItem(ExtraToolMaterials.NETHERBRICK, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item netherbrickshovel = new ShovelItem(ExtraToolMaterials.NETHERBRICK, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item netherbrickpick = new ExtraPickaxeItem(ExtraToolMaterials.NETHERBRICK,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item netherbrickaxe = new ExtraAxeItem(ExtraToolMaterials.NETHERBRICK, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item netherbrickhoe = new ExtraHoeItem(ExtraToolMaterials.NETHERBRICK, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item rednetherbricksword = new SwordItem(ExtraToolMaterials.REDNETHERBRICK, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item rednetherbrickshovel = new ShovelItem(ExtraToolMaterials.REDNETHERBRICK, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item rednetherbrickpick = new ExtraPickaxeItem(ExtraToolMaterials.REDNETHERBRICK,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item rednetherbrickaxe = new ExtraAxeItem(ExtraToolMaterials.REDNETHERBRICK, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item rednetherbrickhoe = new ExtraHoeItem(ExtraToolMaterials.REDNETHERBRICK, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item sandstonesword = new SwordItem(ExtraToolMaterials.SANDSTONE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item sandstoneshovel = new ShovelItem(ExtraToolMaterials.SANDSTONE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item sandstonepick = new ExtraPickaxeItem(ExtraToolMaterials.SANDSTONE,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item sandstoneaxe = new ExtraAxeItem(ExtraToolMaterials.SANDSTONE, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item sandstonehoe = new ExtraHoeItem(ExtraToolMaterials.SANDSTONE, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item redsandstonesword = new SwordItem(ExtraToolMaterials.REDSANDSTONE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item redsandstoneshovel = new ShovelItem(ExtraToolMaterials.REDSANDSTONE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item redsandstonepick = new ExtraPickaxeItem(ExtraToolMaterials.REDSANDSTONE,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item redsandstoneaxe = new ExtraAxeItem(ExtraToolMaterials.REDSANDSTONE, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item redsandstonehoe = new ExtraHoeItem(ExtraToolMaterials.REDSANDSTONE, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item redstonesword = new SwordItem(ExtraToolMaterials.REDSTONE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item redstoneshovel = new ShovelItem(ExtraToolMaterials.REDSTONE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item redstonepick = new ExtraPickaxeItem(ExtraToolMaterials.REDSTONE,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item redstoneaxe = new ExtraAxeItem(ExtraToolMaterials.REDSTONE, 5.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item redstonehoe = new ExtraHoeItem(ExtraToolMaterials.REDSTONE, -2,-1.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item lapissword = new SwordItem(ExtraToolMaterials.LAPIS, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item lapisshovel = new ShovelItem(ExtraToolMaterials.LAPIS, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item lapispick = new ExtraPickaxeItem(ExtraToolMaterials.LAPIS,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item lapisaxe = new ExtraAxeItem(ExtraToolMaterials.LAPIS, 5.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item lapishoe = new ExtraHoeItem(ExtraToolMaterials.LAPIS, -2,-1.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item emeraldsword = new SwordItem(ExtraToolMaterials.EMERALD, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item emeraldshovel = new ShovelItem(ExtraToolMaterials.EMERALD, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item emeraldpick = new ExtraPickaxeItem(ExtraToolMaterials.EMERALD,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item emeraldaxe = new ExtraAxeItem(ExtraToolMaterials.EMERALD, 5.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item emeraldhoe = new ExtraHoeItem(ExtraToolMaterials.EMERALD, -2,-1.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item flintsword = new SwordItem(ExtraToolMaterials.FLINT, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item flintshovel = new ShovelItem(ExtraToolMaterials.FLINT, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item flintpick = new ExtraPickaxeItem(ExtraToolMaterials.FLINT,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item flintaxe = new ExtraAxeItem(ExtraToolMaterials.FLINT, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item flinthoe = new ExtraHoeItem(ExtraToolMaterials.FLINT, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item blackstonesword = new SwordItem(ExtraToolMaterials.BLACKSTONE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item blackstoneshovel = new ShovelItem(ExtraToolMaterials.BLACKSTONE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item blackstonepick = new ExtraPickaxeItem(ExtraToolMaterials.BLACKSTONE,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item blackstoneaxe = new ExtraAxeItem(ExtraToolMaterials.BLACKSTONE, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item blackstonehoe = new ExtraHoeItem(ExtraToolMaterials.BLACKSTONE, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item basaltsword = new SwordItem(ExtraToolMaterials.BASALT, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item basaltshovel = new ShovelItem(ExtraToolMaterials.BASALT, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item basaltpick = new ExtraPickaxeItem(ExtraToolMaterials.BASALT,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item basaltaxe = new ExtraAxeItem(ExtraToolMaterials.BASALT, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item basalthoe = new ExtraHoeItem(ExtraToolMaterials.BASALT, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item endstonesword = new SwordItem(ExtraToolMaterials.ENDSTONE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    public static final Item endstoneshovel = new ShovelItem(ExtraToolMaterials.ENDSTONE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item endstonepick = new ExtraPickaxeItem(ExtraToolMaterials.ENDSTONE,1,-2.8F,(new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item endstoneaxe = new ExtraAxeItem(ExtraToolMaterials.ENDSTONE, 7.0F, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final Item endstonehoe = new ExtraHoeItem(ExtraToolMaterials.ENDSTONE, -1,-2.0F, (new Item.Settings()).group(ItemGroup.TOOLS));
}
