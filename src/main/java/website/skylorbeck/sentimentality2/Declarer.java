package website.skylorbeck.sentimentality2;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.HayBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.particle.DefaultParticleType;
//todo durability config

//todo shields
//todo flight item
//todo firstperson legs
//todo lapis in enchanter
//todo armor visibility
//todo spears maybe

//tried to do these, they are really hard or I just don't know how to do it.
//todo 3d objects on crafting tables - sucessfully made table but it crashes java without a log
//todo lava fishing, bone fish

//probably wont do, because someone else did it better or in almost the same way I want to
//todo uppers
//todo wolf armor
//todo treechopping


//I used Declarer and Registrar to prevent the problem they have in vanilla code where a single class is a thousand lines long
public class Declarer {

    //entities
    public static DefaultParticleType END_FIRE_FLAME;
    public static BlockEntityType<ExtraFurnaceBlockEntity> EXTRA_FURNACE_ENTITY;
    public static BlockEntityType<ExtraBlastFurnaceBlockEntity> EXTRA_BLAST_FURNACE_ENTITY;
    public static BlockEntityType<ExtraSmokerBlockEntity> EXTRA_SMOKER_FURNACE_ENTITY;
    //gliders
    public static final Item glider_leather = new FlightItem(new FabricItemSettings().group(ItemGroup.TRANSPORTATION).maxCount(1).maxDamage(50));
    public static final Item glider_iron = new FlightItem(new FabricItemSettings().group(ItemGroup.TRANSPORTATION).maxCount(1).maxDamage(100));
    //custom personal items
    public static final Item chunk_loader = new Chunkloader(new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item personal_daylight_detector = new PDDItem(new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item slime_chunk_locator = new SlimeChunkLocator(new FabricItemSettings().group(ItemGroup.TOOLS));
    //misc items
    public static final Item fleather = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item small_stick_bundle = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item large_stick_bundle = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Block feather_block_block = new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK));
    public static final BlockItem feather_block = new BlockItem(feather_block_block,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block charcoal_block_block =new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK));
    public static final BlockItem charcoal_block = new BlockItem(charcoal_block_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item charcoal_nugget = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item coal_nugget = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    //compressed cobble
    public static final Block monuple_compressed_cobblestone_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE),1);
    public static final BlockItem monuple_compressed_cobblestone = new BlockItem(monuple_compressed_cobblestone_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block couple_compressed_cobblestone_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE),2);
    public static final BlockItem couple_compressed_cobblestone = new BlockItem(couple_compressed_cobblestone_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block triple_compressed_cobblestone_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE),3);
    public static final BlockItem triple_compressed_cobblestone = new BlockItem(triple_compressed_cobblestone_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quadruple_compressed_cobblestone_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE),4);
    public static final BlockItem quadruple_compressed_cobblestone = new BlockItem(quadruple_compressed_cobblestone_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quintuple_compressed_cobblestone_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE),5);
    public static final BlockItem quintuple_compressed_cobblestone = new BlockItem(quintuple_compressed_cobblestone_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block sextuple_compressed_cobblestone_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE),6);
    public static final BlockItem sextuple_compressed_cobblestone = new BlockItem(sextuple_compressed_cobblestone_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block septuple_compressed_cobblestone_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE),7);
    public static final BlockItem septuple_compressed_cobblestone = new BlockItem(septuple_compressed_cobblestone_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block octuple_compressed_cobblestone_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE),8);
    public static final BlockItem octuple_compressed_cobblestone = new BlockItem(octuple_compressed_cobblestone_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block nonuple_compressed_cobblestone_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE),9);
    public static final BlockItem nonuple_compressed_cobblestone = new BlockItem(nonuple_compressed_cobblestone_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    //compressed dirt
    public static final Block monuple_compressed_dirt_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIRT),1);
    public static final BlockItem monuple_compressed_dirt = new BlockItem(monuple_compressed_dirt_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block couple_compressed_dirt_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIRT),2);
    public static final BlockItem couple_compressed_dirt = new BlockItem(couple_compressed_dirt_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block triple_compressed_dirt_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIRT),3);
    public static final BlockItem triple_compressed_dirt = new BlockItem(triple_compressed_dirt_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quadruple_compressed_dirt_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIRT),4);
    public static final BlockItem quadruple_compressed_dirt = new BlockItem(quadruple_compressed_dirt_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quintuple_compressed_dirt_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIRT),5);
    public static final BlockItem quintuple_compressed_dirt = new BlockItem(quintuple_compressed_dirt_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block sextuple_compressed_dirt_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIRT),6);
    public static final BlockItem sextuple_compressed_dirt = new BlockItem(sextuple_compressed_dirt_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block septuple_compressed_dirt_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIRT),7);
    public static final BlockItem septuple_compressed_dirt = new BlockItem(septuple_compressed_dirt_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block octuple_compressed_dirt_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIRT),8);
    public static final BlockItem octuple_compressed_dirt = new BlockItem(octuple_compressed_dirt_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block nonuple_compressed_dirt_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIRT),9);
    public static final BlockItem nonuple_compressed_dirt = new BlockItem(nonuple_compressed_dirt_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    //compressed granite
    public static final Block monuple_compressed_granite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE),1);
    public static final BlockItem monuple_compressed_granite = new BlockItem(monuple_compressed_granite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block couple_compressed_granite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE),2);
    public static final BlockItem couple_compressed_granite = new BlockItem(couple_compressed_granite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block triple_compressed_granite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE),3);
    public static final BlockItem triple_compressed_granite = new BlockItem(triple_compressed_granite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quadruple_compressed_granite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE),4);
    public static final BlockItem quadruple_compressed_granite = new BlockItem(quadruple_compressed_granite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quintuple_compressed_granite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE),5);
    public static final BlockItem quintuple_compressed_granite = new BlockItem(quintuple_compressed_granite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block sextuple_compressed_granite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE),6);
    public static final BlockItem sextuple_compressed_granite = new BlockItem(sextuple_compressed_granite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block septuple_compressed_granite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE),7);
    public static final BlockItem septuple_compressed_granite = new BlockItem(septuple_compressed_granite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block octuple_compressed_granite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE),8);
    public static final BlockItem octuple_compressed_granite = new BlockItem(octuple_compressed_granite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block nonuple_compressed_granite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE),9);
    public static final BlockItem nonuple_compressed_granite = new BlockItem(nonuple_compressed_granite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    //compressed diorite
    public static final Block monuple_compressed_diorite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE),1);
    public static final BlockItem monuple_compressed_diorite = new BlockItem(monuple_compressed_diorite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block couple_compressed_diorite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE),2);
    public static final BlockItem couple_compressed_diorite = new BlockItem(couple_compressed_diorite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block triple_compressed_diorite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE),3);
    public static final BlockItem triple_compressed_diorite = new BlockItem(triple_compressed_diorite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quadruple_compressed_diorite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE),4);
    public static final BlockItem quadruple_compressed_diorite = new BlockItem(quadruple_compressed_diorite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quintuple_compressed_diorite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE),5);
    public static final BlockItem quintuple_compressed_diorite = new BlockItem(quintuple_compressed_diorite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block sextuple_compressed_diorite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE),6);
    public static final BlockItem sextuple_compressed_diorite = new BlockItem(sextuple_compressed_diorite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block septuple_compressed_diorite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE),7);
    public static final BlockItem septuple_compressed_diorite = new BlockItem(septuple_compressed_diorite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block octuple_compressed_diorite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE),8);
    public static final BlockItem octuple_compressed_diorite = new BlockItem(octuple_compressed_diorite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block nonuple_compressed_diorite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE),9);
    public static final BlockItem nonuple_compressed_diorite = new BlockItem(nonuple_compressed_diorite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    //compressed andesite
    public static final Block monuple_compressed_andesite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE),1);
    public static final BlockItem monuple_compressed_andesite = new BlockItem(monuple_compressed_andesite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block couple_compressed_andesite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE),2);
    public static final BlockItem couple_compressed_andesite = new BlockItem(couple_compressed_andesite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block triple_compressed_andesite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE),3);
    public static final BlockItem triple_compressed_andesite = new BlockItem(triple_compressed_andesite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quadruple_compressed_andesite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE),4);
    public static final BlockItem quadruple_compressed_andesite = new BlockItem(quadruple_compressed_andesite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quintuple_compressed_andesite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE),5);
    public static final BlockItem quintuple_compressed_andesite = new BlockItem(quintuple_compressed_andesite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block sextuple_compressed_andesite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE),6);
    public static final BlockItem sextuple_compressed_andesite = new BlockItem(sextuple_compressed_andesite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block septuple_compressed_andesite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE),7);
    public static final BlockItem septuple_compressed_andesite = new BlockItem(septuple_compressed_andesite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block octuple_compressed_andesite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE),8);
    public static final BlockItem octuple_compressed_andesite = new BlockItem(octuple_compressed_andesite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block nonuple_compressed_andesite_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE),9);
    public static final BlockItem nonuple_compressed_andesite = new BlockItem(nonuple_compressed_andesite_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    //compressed netherrack
    public static final Block monuple_compressed_netherrack_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK),1);
    public static final BlockItem monuple_compressed_netherrack = new BlockItem(monuple_compressed_netherrack_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block couple_compressed_netherrack_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK),2);
    public static final BlockItem couple_compressed_netherrack = new BlockItem(couple_compressed_netherrack_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block triple_compressed_netherrack_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK),3);
    public static final BlockItem triple_compressed_netherrack = new BlockItem(triple_compressed_netherrack_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quadruple_compressed_netherrack_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK),4);
    public static final BlockItem quadruple_compressed_netherrack = new BlockItem(quadruple_compressed_netherrack_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quintuple_compressed_netherrack_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK),5);
    public static final BlockItem quintuple_compressed_netherrack = new BlockItem(quintuple_compressed_netherrack_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block sextuple_compressed_netherrack_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK),6);
    public static final BlockItem sextuple_compressed_netherrack = new BlockItem(sextuple_compressed_netherrack_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block septuple_compressed_netherrack_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK),7);
    public static final BlockItem septuple_compressed_netherrack = new BlockItem(septuple_compressed_netherrack_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block octuple_compressed_netherrack_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK),8);
    public static final BlockItem octuple_compressed_netherrack = new BlockItem(octuple_compressed_netherrack_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block nonuple_compressed_netherrack_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK),9);
    public static final BlockItem nonuple_compressed_netherrack = new BlockItem(nonuple_compressed_netherrack_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    //compressed sand
    public static final Block monuple_compressed_sand_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.SAND),1);
    public static final BlockItem monuple_compressed_sand = new BlockItem(monuple_compressed_sand_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block couple_compressed_sand_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.SAND),2);
    public static final BlockItem couple_compressed_sand = new BlockItem(couple_compressed_sand_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block triple_compressed_sand_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.SAND),3);
    public static final BlockItem triple_compressed_sand = new BlockItem(triple_compressed_sand_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quadruple_compressed_sand_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.SAND),4);
    public static final BlockItem quadruple_compressed_sand = new BlockItem(quadruple_compressed_sand_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quintuple_compressed_sand_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.SAND),5);
    public static final BlockItem quintuple_compressed_sand = new BlockItem(quintuple_compressed_sand_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block sextuple_compressed_sand_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.SAND),6);
    public static final BlockItem sextuple_compressed_sand = new BlockItem(sextuple_compressed_sand_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block septuple_compressed_sand_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.SAND),7);
    public static final BlockItem septuple_compressed_sand = new BlockItem(septuple_compressed_sand_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block octuple_compressed_sand_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.SAND),8);
    public static final BlockItem octuple_compressed_sand = new BlockItem(octuple_compressed_sand_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block nonuple_compressed_sand_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.SAND),9);
    public static final BlockItem nonuple_compressed_sand = new BlockItem(nonuple_compressed_sand_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    //compressed gravel
    public static final Block monuple_compressed_gravel_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL),1);
    public static final BlockItem monuple_compressed_gravel = new BlockItem(monuple_compressed_gravel_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block couple_compressed_gravel_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL),2);
    public static final BlockItem couple_compressed_gravel = new BlockItem(couple_compressed_gravel_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block triple_compressed_gravel_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL),3);
    public static final BlockItem triple_compressed_gravel = new BlockItem(triple_compressed_gravel_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quadruple_compressed_gravel_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL),4);
    public static final BlockItem quadruple_compressed_gravel = new BlockItem(quadruple_compressed_gravel_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block quintuple_compressed_gravel_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL),5);
    public static final BlockItem quintuple_compressed_gravel = new BlockItem(quintuple_compressed_gravel_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block sextuple_compressed_gravel_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL),6);
    public static final BlockItem sextuple_compressed_gravel = new BlockItem(sextuple_compressed_gravel_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block septuple_compressed_gravel_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL),7);
    public static final BlockItem septuple_compressed_gravel = new BlockItem(septuple_compressed_gravel_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block octuple_compressed_gravel_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL),8);
    public static final BlockItem octuple_compressed_gravel = new BlockItem(octuple_compressed_gravel_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block nonuple_compressed_gravel_block = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL),9);
    public static final BlockItem nonuple_compressed_gravel = new BlockItem(nonuple_compressed_gravel_block,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    //furnaces
    public static final Block sandstone_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem sandstone_furnace = new BlockItem(sandstone_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block red_sandstone_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem red_sandstone_furnace = new BlockItem(red_sandstone_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block andesite_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem andesite_furnace = new BlockItem(andesite_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block granite_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem granite_furnace = new BlockItem(granite_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block diorite_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),0);
    public static final BlockItem diorite_furnace = new BlockItem(diorite_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block netherrack_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),1);
    public static final BlockItem netherrack_furnace = new BlockItem(netherrack_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block blackstone_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),1);
    public static final BlockItem blackstone_furnace = new BlockItem(blackstone_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block basalt_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),1);
    public static final BlockItem basalt_furnace = new BlockItem(basalt_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block endstone_furnaceblock = new ExtraFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE),2);
    public static final BlockItem endstone_furnace = new BlockItem(endstone_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    //blast furnaces
    public static final Block sandstone_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem sandstone_blast_furnace = new BlockItem(sandstone_blast_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block red_sandstone_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem red_sandstone_blast_furnace = new BlockItem(red_sandstone_blast_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block andesite_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem andesite_blast_furnace = new BlockItem(andesite_blast_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block granite_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem granite_blast_furnace = new BlockItem(granite_blast_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block diorite_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem diorite_blast_furnace = new BlockItem(diorite_blast_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block netherrack_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem netherrack_blast_furnace = new BlockItem(netherrack_blast_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block blackstone_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem blackstone_blast_furnace = new BlockItem(blackstone_blast_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block basalt_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem basalt_blast_furnace = new BlockItem(basalt_blast_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block endstone_blast_furnaceblock = new ExtraBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));
    public static final BlockItem endstone_blast_furnace = new BlockItem(endstone_blast_furnaceblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    //smokers
    public static final Block sandstone_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem sandstone_smoker = new BlockItem(sandstone_smokerblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block red_sandstone_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem red_sandstone_smoker = new BlockItem(red_sandstone_smokerblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block andesite_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem andesite_smoker = new BlockItem(andesite_smokerblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block granite_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem granite_smoker = new BlockItem(granite_smokerblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block diorite_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem diorite_smoker = new BlockItem(diorite_smokerblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block netherrack_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem netherrack_smoker = new BlockItem(netherrack_smokerblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block blackstone_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem blackstone_smoker = new BlockItem(blackstone_smokerblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block basalt_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem basalt_smoker = new BlockItem(basalt_smokerblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Block endstone_smokerblock = new ExtraSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER));
    public static final BlockItem endstone_smoker = new BlockItem(endstone_smokerblock,new FabricItemSettings().group(ItemGroup.DECORATIONS));
    //wool armor
    public static final Item wool_helmet = new ExtraDyeableArmorItem(ExtraArmorMaterials.WOOL, EquipmentSlot.HEAD,new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item wool_chestplate = new ExtraDyeableArmorItem(ExtraArmorMaterials.WOOL, EquipmentSlot.CHEST,new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item wool_leggings = new ExtraDyeableArmorItem(ExtraArmorMaterials.WOOL, EquipmentSlot.LEGS,new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item wool_boots = new ExtraDyeableArmorItem(ExtraArmorMaterials.WOOL, EquipmentSlot.FEET,new FabricItemSettings().group(ItemGroup.COMBAT));
    //tools
    public static final Item granite_sword = new SwordItem(ExtraToolMaterials.GRANITE, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item granite_shovel = new ShovelItem(ExtraToolMaterials.GRANITE, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item granite_pick = new ExtraPickaxeItem(ExtraToolMaterials.GRANITE,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item granite_axe = new ExtraAxeItem(ExtraToolMaterials.GRANITE, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item granite_hoe = new ExtraHoeItem(ExtraToolMaterials.GRANITE, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item diorite_sword = new SwordItem(ExtraToolMaterials.DIORITE, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item diorite_shovel = new ShovelItem(ExtraToolMaterials.DIORITE, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item diorite_pick = new ExtraPickaxeItem(ExtraToolMaterials.DIORITE,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item diorite_axe = new ExtraAxeItem(ExtraToolMaterials.DIORITE, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item diorite_hoe = new ExtraHoeItem(ExtraToolMaterials.DIORITE, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item andesite_sword = new SwordItem(ExtraToolMaterials.ANDESITE, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item andesite_shovel = new ShovelItem(ExtraToolMaterials.ANDESITE, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item andesite_pick = new ExtraPickaxeItem(ExtraToolMaterials.ANDESITE,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item andesite_axe = new ExtraAxeItem(ExtraToolMaterials.ANDESITE, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item andesite_hoe = new ExtraHoeItem(ExtraToolMaterials.ANDESITE, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item quartz_sword = new SwordItem(ExtraToolMaterials.QUARTZ, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item quartz_shovel = new ShovelItem(ExtraToolMaterials.QUARTZ, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item quartz_pick = new ExtraPickaxeItem(ExtraToolMaterials.QUARTZ,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item quartz_axe = new ExtraAxeItem(ExtraToolMaterials.QUARTZ, 6.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item quartz_hoe = new ExtraHoeItem(ExtraToolMaterials.QUARTZ, -2,-1.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item netherrack_sword = new SwordItem(ExtraToolMaterials.NETHERRACK, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item netherrack_shovel = new ShovelItem(ExtraToolMaterials.NETHERRACK, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item netherrack_pick = new ExtraPickaxeItem(ExtraToolMaterials.NETHERRACK,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item netherrack_axe = new ExtraAxeItem(ExtraToolMaterials.NETHERRACK, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item netherrack_hoe = new ExtraHoeItem(ExtraToolMaterials.NETHERRACK, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item netherbrick_sword = new SwordItem(ExtraToolMaterials.NETHERBRICK, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item netherbrick_shovel = new ShovelItem(ExtraToolMaterials.NETHERBRICK, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item netherbrick_pick = new ExtraPickaxeItem(ExtraToolMaterials.NETHERBRICK,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item netherbrick_axe = new ExtraAxeItem(ExtraToolMaterials.NETHERBRICK, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item netherbrick_hoe = new ExtraHoeItem(ExtraToolMaterials.NETHERBRICK, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item rednetherbrick_sword = new SwordItem(ExtraToolMaterials.REDNETHERBRICK, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item rednetherbrick_shovel = new ShovelItem(ExtraToolMaterials.REDNETHERBRICK, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item rednetherbrick_pick = new ExtraPickaxeItem(ExtraToolMaterials.REDNETHERBRICK,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item rednetherbrick_axe = new ExtraAxeItem(ExtraToolMaterials.REDNETHERBRICK, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item rednetherbrick_hoe = new ExtraHoeItem(ExtraToolMaterials.REDNETHERBRICK, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item sandstone_sword = new SwordItem(ExtraToolMaterials.SANDSTONE, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item sandstone_shovel = new ShovelItem(ExtraToolMaterials.SANDSTONE, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item sandstone_pick = new ExtraPickaxeItem(ExtraToolMaterials.SANDSTONE,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item sandstone_axe = new ExtraAxeItem(ExtraToolMaterials.SANDSTONE, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item sandstone_hoe = new ExtraHoeItem(ExtraToolMaterials.SANDSTONE, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item redsandstone_sword = new SwordItem(ExtraToolMaterials.REDSANDSTONE, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item redsandstone_shovel = new ShovelItem(ExtraToolMaterials.REDSANDSTONE, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item redsandstone_pick = new ExtraPickaxeItem(ExtraToolMaterials.REDSANDSTONE,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item redsandstone_axe = new ExtraAxeItem(ExtraToolMaterials.REDSANDSTONE, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item redsandstone_hoe = new ExtraHoeItem(ExtraToolMaterials.REDSANDSTONE, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item redstone_sword = new SwordItem(ExtraToolMaterials.REDSTONE, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item redstone_shovel = new ShovelItem(ExtraToolMaterials.REDSTONE, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item redstone_pick = new ExtraPickaxeItem(ExtraToolMaterials.REDSTONE,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item redstone_axe = new ExtraAxeItem(ExtraToolMaterials.REDSTONE, 5.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item redstone_hoe = new ExtraHoeItem(ExtraToolMaterials.REDSTONE, -2,-1.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item lapis_sword = new SwordItem(ExtraToolMaterials.LAPIS, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item lapis_shovel = new ShovelItem(ExtraToolMaterials.LAPIS, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item lapis_pick = new ExtraPickaxeItem(ExtraToolMaterials.LAPIS,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item lapis_axe = new ExtraAxeItem(ExtraToolMaterials.LAPIS, 5.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item lapis_hoe = new ExtraHoeItem(ExtraToolMaterials.LAPIS, -2,-1.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item emerald_sword = new SwordItem(ExtraToolMaterials.EMERALD, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item emerald_shovel = new ShovelItem(ExtraToolMaterials.EMERALD, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item emerald_pick = new ExtraPickaxeItem(ExtraToolMaterials.EMERALD,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item emerald_axe = new ExtraAxeItem(ExtraToolMaterials.EMERALD, 5.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item emerald_hoe = new ExtraHoeItem(ExtraToolMaterials.EMERALD, -2,-1.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item flint_sword = new SwordItem(ExtraToolMaterials.FLINT, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item flint_shovel = new ShovelItem(ExtraToolMaterials.FLINT, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item flint_pick = new ExtraPickaxeItem(ExtraToolMaterials.FLINT,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item flint_axe = new ExtraAxeItem(ExtraToolMaterials.FLINT, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item flint_hoe = new ExtraHoeItem(ExtraToolMaterials.FLINT, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item blackstone_sword = new SwordItem(ExtraToolMaterials.BLACKSTONE, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item blackstone_shovel = new ShovelItem(ExtraToolMaterials.BLACKSTONE, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item blackstone_pick = new ExtraPickaxeItem(ExtraToolMaterials.BLACKSTONE,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item blackstone_axe = new ExtraAxeItem(ExtraToolMaterials.BLACKSTONE, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item blackstone_hoe = new ExtraHoeItem(ExtraToolMaterials.BLACKSTONE, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item basalt_sword = new SwordItem(ExtraToolMaterials.BASALT, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item basalt_shovel = new ShovelItem(ExtraToolMaterials.BASALT, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item basalt_pick = new ExtraPickaxeItem(ExtraToolMaterials.BASALT,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item basalt_axe = new ExtraAxeItem(ExtraToolMaterials.BASALT, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item basalt_hoe = new ExtraHoeItem(ExtraToolMaterials.BASALT, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item endstone_sword = new SwordItem(ExtraToolMaterials.ENDSTONE, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item endstone_shovel = new ShovelItem(ExtraToolMaterials.ENDSTONE, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item endstone_pick = new ExtraPickaxeItem(ExtraToolMaterials.ENDSTONE,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item endstone_axe = new ExtraAxeItem(ExtraToolMaterials.ENDSTONE, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item endstone_hoe = new ExtraHoeItem(ExtraToolMaterials.ENDSTONE, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item crimson_sword = new SwordItem(ExtraToolMaterials.CRIMSON, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item crimson_shovel = new ShovelItem(ExtraToolMaterials.CRIMSON, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item crimson_pick = new ExtraPickaxeItem(ExtraToolMaterials.CRIMSON,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item crimson_axe = new ExtraAxeItem(ExtraToolMaterials.CRIMSON, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item crimson_hoe = new ExtraHoeItem(ExtraToolMaterials.CRIMSON, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item warped_sword = new SwordItem(ExtraToolMaterials.WARPED, 3, -2.4F, (new FabricItemSettings()).group(ItemGroup.COMBAT));
    public static final Item warped_shovel = new ShovelItem(ExtraToolMaterials.WARPED, 1.5F, -3.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item warped_pick = new ExtraPickaxeItem(ExtraToolMaterials.WARPED,1,-2.8F,(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item warped_axe = new ExtraAxeItem(ExtraToolMaterials.WARPED, 7.0F, -3.2F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
    public static final Item warped_hoe = new ExtraHoeItem(ExtraToolMaterials.WARPED, -1,-2.0F, (new FabricItemSettings()).group(ItemGroup.TOOLS));
}
