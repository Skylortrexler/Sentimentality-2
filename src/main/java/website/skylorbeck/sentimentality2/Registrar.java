package website.skylorbeck.sentimentality2;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Objects;

//I used Declarer and Registrar to prevent the problem they have in vanilla code where a single class is a thousand lines long
public class Registrar {
    private static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, GsonConfigSerializer::new).getConfig();
    public static ModConfig getConfig() {
        return CONFIG;
    }

    public static void clientRegister(){//separated because servers don't like when they have this stuff registered on them
        //particles
        Declarer.END_FIRE_FLAME = Registry.register(Registry.PARTICLE_TYPE, new Identifier(Ref.MODID, "end_fire_flame"), FabricParticleTypes.simple());
        ParticleFactoryRegistry.getInstance().register(Declarer.END_FIRE_FLAME, FlameParticle.Factory::new);
        //tying the color provider to the wool armor
        ColorProviderRegistry.ITEM.register((stack, tintIndex) ->
                        stack.getSubTag(Ref.display) != null && Objects.requireNonNull(stack.getSubTag(Ref.display)).contains(Ref.color, 99) ? Objects.requireNonNull(stack.getSubTag(Ref.display)).getInt(Ref.color) :16777215,
                Declarer.wool_helmet,
                Declarer.wool_chestplate,
                Declarer.wool_leggings,
                Declarer.wool_boots
        );

    }

    public static void register() {
        //personal items
        if (CONFIG.toggles.daylighter) {
            regItem("personal_daylight_detector", Declarer.personal_daylight_detector);
        }
        if (CONFIG.toggles.slimer) {
            regItem("slime_chunk_locator", Declarer.slime_chunk_locator);
        }
        if (CONFIG.toggles.chunker) {
            regItem("chunkloader", Declarer.chunk_loader);
        }
        //misc items
        if (CONFIG.toggles.fleather) {
            regItem("fleather", Declarer.fleather);
        }
        if (CONFIG.toggles.charcoal) {
            regBlock("charcoal_block_block", Declarer.charcoal_block_block);
            regItem("charcoal_block", Declarer.charcoal_block);
            FuelRegistry.INSTANCE.add(Declarer.charcoal_block, 16000);
        }
        if (CONFIG.toggles.sticks) {
            regItem("small_stick_bundle", Declarer.small_stick_bundle);
            FuelRegistry.INSTANCE.add(Declarer.small_stick_bundle, 400);
            regItem("large_stick_bundle", Declarer.large_stick_bundle);
            FuelRegistry.INSTANCE.add(Declarer.large_stick_bundle, 1600);
        }
        if (CONFIG.toggles.featherBlock) {
            regBlock("feather_block_block", Declarer.feather_block_block);
            regItem("feather_block", Declarer.feather_block);
        }
        if (CONFIG.toggles.coalChunks) {
            regItem("charcoal_nugget", Declarer.charcoal_nugget);
            FuelRegistry.INSTANCE.add(Declarer.charcoal_nugget, 200);
            regItem("coal_nugget", Declarer.coal_nugget);
            FuelRegistry.INSTANCE.add(Declarer.coal_nugget, 200);
        }
        //gliders
        if (CONFIG.toggles.gliders) {
            regItem("glider_leather", Declarer.glider_leather);
            regItem("glider_iron", Declarer.glider_iron);
        }

        //block entities
        //furnace entity
        if (CONFIG.toggles.furnaces) {
            Declarer.EXTRA_FURNACE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    "sentimentality2:furnace",
                    BlockEntityType.Builder.create(ExtraFurnaceBlockEntity::new,
                            Declarer.sandstone_furnaceblock,
                            Declarer.red_sandstone_furnaceblock,
                            Declarer.andesite_furnaceblock,
                            Declarer.granite_furnaceblock,
                            Declarer.diorite_furnaceblock,
                            Declarer.endstone_furnaceblock,
                            Declarer.blackstone_furnaceblock,
                            Declarer.netherrack_furnaceblock,
                            Declarer.basalt_furnaceblock
                    ).build(null));
        }
        //blast furnace entity
        if (CONFIG.toggles.blasts) {
            Declarer.EXTRA_BLAST_FURNACE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    "sentimentality2:blast_furnace",
                    BlockEntityType.Builder.create(ExtraBlastFurnaceBlockEntity::new,
                            Declarer.sandstone_blast_furnaceblock,
                            Declarer.red_sandstone_blast_furnaceblock,
                            Declarer.andesite_blast_furnaceblock,
                            Declarer.granite_blast_furnaceblock,
                            Declarer.diorite_blast_furnaceblock,
                            Declarer.endstone_blast_furnaceblock,
                            Declarer.blackstone_blast_furnaceblock,
                            Declarer.netherrack_blast_furnaceblock,
                            Declarer.basalt_blast_furnaceblock
                    ).build(null));
        }
        //smoker entity
        if (CONFIG.toggles.smokers) {
            Declarer.EXTRA_SMOKER_FURNACE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    "sentimentality2:smoker",
                    BlockEntityType.Builder.create(ExtraSmokerBlockEntity::new,
                            Declarer.sandstone_smokerblock,
                            Declarer.red_sandstone_smokerblock,
                            Declarer.andesite_smokerblock,
                            Declarer.granite_smokerblock,
                            Declarer.diorite_smokerblock,
                            Declarer.endstone_smokerblock,
                            Declarer.blackstone_smokerblock,
                            Declarer.netherrack_smokerblock,
                            Declarer.basalt_smokerblock
                    ).build(null));
        }
        //furnaces
        if (CONFIG.toggles.furnaces) {
            regBlock("sandstone_furnace", Declarer.sandstone_furnaceblock);
            regItem("sandstone_furnaceitem", Declarer.sandstone_furnace);
            regBlock("red_sandstone_furnace", Declarer.red_sandstone_furnaceblock);
            regItem("red_sandstone_furnaceitem", Declarer.red_sandstone_furnace);
            regBlock("andesite_furnace", Declarer.andesite_furnaceblock);
            regItem("andesite_furnaceitem", Declarer.andesite_furnace);
            regBlock("granite_furnace", Declarer.granite_furnaceblock);
            regItem("granite_furnaceitem", Declarer.granite_furnace);
            regBlock("diorite_furnace", Declarer.diorite_furnaceblock);
            regItem("diorite_furnaceitem", Declarer.diorite_furnace);
            regBlock("endstone_furnace", Declarer.endstone_furnaceblock);
            regItem("endstone_furnaceitem", Declarer.endstone_furnace);
            regBlock("blackstone_furnace", Declarer.blackstone_furnaceblock);
            regItem("blackstone_furnaceitem", Declarer.blackstone_furnace);
            regBlock("netherrack_furnace", Declarer.netherrack_furnaceblock);
            regItem("netherrack_furnaceitem", Declarer.netherrack_furnace);
            regBlock("basalt_furnace", Declarer.basalt_furnaceblock);
            regItem("basalt_furnaceitem", Declarer.basalt_furnace);
        }
        //blast furnaces
        if (CONFIG.toggles.blasts) {
            regBlock("sandstone_blast_furnace", Declarer.sandstone_blast_furnaceblock);
            regItem("sandstone_blast_furnaceitem", Declarer.sandstone_blast_furnace);
            regBlock("red_sandstone_blast_furnace", Declarer.red_sandstone_blast_furnaceblock);
            regItem("red_sandstone_blast_furnaceitem", Declarer.red_sandstone_blast_furnace);
            regBlock("andesite_blast_furnace", Declarer.andesite_blast_furnaceblock);
            regItem("andesite_blast_furnaceitem", Declarer.andesite_blast_furnace);
            regBlock("granite_blast_furnace", Declarer.granite_blast_furnaceblock);
            regItem("granite_blast_furnaceitem", Declarer.granite_blast_furnace);
            regBlock("diorite_blast_furnace", Declarer.diorite_blast_furnaceblock);
            regItem("diorite_blast_furnaceitem", Declarer.diorite_blast_furnace);
            regBlock("endstone_blast_furnace", Declarer.endstone_blast_furnaceblock);
            regItem("endstone_blast_furnaceitem", Declarer.endstone_blast_furnace);
            regBlock("blackstone_blast_furnace", Declarer.blackstone_blast_furnaceblock);
            regItem("blackstone_blast_furnaceitem", Declarer.blackstone_blast_furnace);
            regBlock("netherrack_blast_furnace", Declarer.netherrack_blast_furnaceblock);
            regItem("netherrack_blast_furnaceitem", Declarer.netherrack_blast_furnace);
            regBlock("basalt_blast_furnace", Declarer.basalt_blast_furnaceblock);
            regItem("basalt_blast_furnaceitem", Declarer.basalt_blast_furnace);
        }
        //smokers
        if (CONFIG.toggles.smokers) {
            regBlock("sandstone_smoker", Declarer.sandstone_smokerblock);
            regItem("sandstone_smokeritem", Declarer.sandstone_smoker);
            regBlock("red_sandstone_smoker", Declarer.red_sandstone_smokerblock);
            regItem("red_sandstone_smokeritem", Declarer.red_sandstone_smoker);
            regBlock("andesite_smoker", Declarer.andesite_smokerblock);
            regItem("andesite_smokeritem", Declarer.andesite_smoker);
            regBlock("granite_smoker", Declarer.granite_smokerblock);
            regItem("granite_smokeritem", Declarer.granite_smoker);
            regBlock("diorite_smoker", Declarer.diorite_smokerblock);
            regItem("diorite_smokeritem", Declarer.diorite_smoker);
            regBlock("endstone_smoker", Declarer.endstone_smokerblock);
            regItem("endstone_smokeritem", Declarer.endstone_smoker);
            regBlock("blackstone_smoker", Declarer.blackstone_smokerblock);
            regItem("blackstone_smokeritem", Declarer.blackstone_smoker);
            regBlock("netherrack_smoker", Declarer.netherrack_smokerblock);
            regItem("netherrack_smokeritem", Declarer.netherrack_smoker);
            regBlock("basalt_smoker", Declarer.basalt_smokerblock);
            regItem("basalt_smokeritem", Declarer.basalt_smoker);
        }
        //wool armor
        if (CONFIG.toggles.woolArmor) {
            regItem("wool_helmet", Declarer.wool_helmet);
            regItem("wool_chestplate", Declarer.wool_chestplate);
            regItem("wool_leggings", Declarer.wool_leggings);
            regItem("wool_boots", Declarer.wool_boots);
        }
        //tools
        if (CONFIG.toggles.allTools) {
            if (CONFIG.toggles.toolToggles.graniteTools) {
                regItem("granite_pick", Declarer.granite_pick);
                regItem("granite_axe", Declarer.granite_axe);
                regItem("granite_shovel", Declarer.granite_shovel);
                regItem("granite_sword", Declarer.granite_sword);
                regItem("granite_hoe", Declarer.granite_hoe);
            }
            if (CONFIG.toggles.toolToggles.dioriteTools) {
                regItem("diorite_pick", Declarer.diorite_pick);
                regItem("diorite_axe", Declarer.diorite_axe);
                regItem("diorite_shovel", Declarer.diorite_shovel);
                regItem("diorite_sword", Declarer.diorite_sword);
                regItem("diorite_hoe", Declarer.diorite_hoe);
            }
            if (CONFIG.toggles.toolToggles.andesiteTools) {
                regItem("andesite_pick", Declarer.andesite_pick);
                regItem("andesite_axe", Declarer.andesite_axe);
                regItem("andesite_shovel", Declarer.andesite_shovel);
                regItem("andesite_sword", Declarer.andesite_sword);
                regItem("andesite_hoe", Declarer.andesite_hoe);
            }
            if (CONFIG.toggles.toolToggles.quartzTools) {
                regItem("quartz_pick", Declarer.quartz_pick);
                regItem("quartz_axe", Declarer.quartz_axe);
                regItem("quartz_shovel", Declarer.quartz_shovel);
                regItem("quartz_sword", Declarer.quartz_sword);
                regItem("quartz_hoe", Declarer.quartz_hoe);
            }
            if (CONFIG.toggles.toolToggles.netherrackTools) {
                regItem("netherrack_pick", Declarer.netherrack_pick);
                regItem("netherrack_axe", Declarer.netherrack_axe);
                regItem("netherrack_shovel", Declarer.netherrack_shovel);
                regItem("netherrack_sword", Declarer.netherrack_sword);
                regItem("netherrack_hoe", Declarer.netherrack_hoe);
            }
            if (CONFIG.toggles.toolToggles.netherbrickTools) {
                regItem("netherbrick_pick", Declarer.netherbrick_pick);
                regItem("netherbrick_axe", Declarer.netherbrick_axe);
                regItem("netherbrick_shovel", Declarer.netherbrick_shovel);
                regItem("netherbrick_sword", Declarer.netherbrick_sword);
                regItem("netherbrick_hoe", Declarer.netherbrick_hoe);
            }
            if (CONFIG.toggles.toolToggles.redNetherbrickTools) {
                regItem("rednetherbrick_pick", Declarer.rednetherbrick_pick);
                regItem("rednetherbrick_axe", Declarer.rednetherbrick_axe);
                regItem("rednetherbrick_shovel", Declarer.rednetherbrick_shovel);
                regItem("rednetherbrick_sword", Declarer.rednetherbrick_sword);
                regItem("rednetherbrick_hoe", Declarer.rednetherbrick_hoe);
            }
            if (CONFIG.toggles.toolToggles.sandstoneTools) {
                regItem("sandstone_pick", Declarer.sandstone_pick);
                regItem("sandstone_axe", Declarer.sandstone_axe);
                regItem("sandstone_shovel", Declarer.sandstone_shovel);
                regItem("sandstone_sword", Declarer.sandstone_sword);
                regItem("sandstone_hoe", Declarer.sandstone_hoe);
            }
            if (CONFIG.toggles.toolToggles.redSandstoneTools) {
                regItem("redsandstone_pick", Declarer.redsandstone_pick);
                regItem("redsandstone_axe", Declarer.redsandstone_axe);
                regItem("redsandstone_shovel", Declarer.redsandstone_shovel);
                regItem("redsandstone_sword", Declarer.redsandstone_sword);
                regItem("redsandstone_hoe", Declarer.redsandstone_hoe);
            }
            if (CONFIG.toggles.toolToggles.lapisTools) {
                regItem("lapis_pick", Declarer.lapis_pick);
                regItem("lapis_axe", Declarer.lapis_axe);
                regItem("lapis_shovel", Declarer.lapis_shovel);
                regItem("lapis_sword", Declarer.lapis_sword);
                regItem("lapis_hoe", Declarer.lapis_hoe);
            }
            if (CONFIG.toggles.toolToggles.emeraldTools) {
                regItem("emerald_pick", Declarer.emerald_pick);
                regItem("emerald_axe", Declarer.emerald_axe);
                regItem("emerald_shovel", Declarer.emerald_shovel);
                regItem("emerald_sword", Declarer.emerald_sword);
                regItem("emerald_hoe", Declarer.emerald_hoe);
            }
            if (CONFIG.toggles.toolToggles.flintTools) {
                regItem("flint_pick", Declarer.flint_pick);
                regItem("flint_axe", Declarer.flint_axe);
                regItem("flint_shovel", Declarer.flint_shovel);
                regItem("flint_sword", Declarer.flint_sword);
                regItem("flint_hoe", Declarer.flint_hoe);
            }
            if (CONFIG.toggles.toolToggles.redstoneTools) {
                regItem("redstone_pick", Declarer.redstone_pick);
                regItem("redstone_axe", Declarer.redstone_axe);
                regItem("redstone_shovel", Declarer.redstone_shovel);
                regItem("redstone_sword", Declarer.redstone_sword);
                regItem("redstone_hoe", Declarer.redstone_hoe);
            }
            if (CONFIG.toggles.toolToggles.blackstoneTools) {
                regItem("blackstone_pick", Declarer.blackstone_pick);
                regItem("blackstone_axe", Declarer.blackstone_axe);
                regItem("blackstone_shovel", Declarer.blackstone_shovel);
                regItem("blackstone_sword", Declarer.blackstone_sword);
                regItem("blackstone_hoe", Declarer.blackstone_hoe);
            }
            if (CONFIG.toggles.toolToggles.basaltTools) {
                regItem("basalt_pick", Declarer.basalt_pick);
                regItem("basalt_axe", Declarer.basalt_axe);
                regItem("basalt_shovel", Declarer.basalt_shovel);
                regItem("basalt_sword", Declarer.basalt_sword);
                regItem("basalt_hoe", Declarer.basalt_hoe);
            }
            if (CONFIG.toggles.toolToggles.endstoneTools) {
                regItem("endstone_pick", Declarer.endstone_pick);
                regItem("endstone_axe", Declarer.endstone_axe);
                regItem("endstone_shovel", Declarer.endstone_shovel);
                regItem("endstone_sword", Declarer.endstone_sword);
                regItem("endstone_hoe", Declarer.endstone_hoe);
            }
            if (CONFIG.toggles.toolToggles.warpedTools) {
                regItem("warped_pick", Declarer.warped_pick);
                regItem("warped_axe", Declarer.warped_axe);
                regItem("warped_shovel", Declarer.warped_shovel);
                regItem("warped_sword", Declarer.warped_sword);
                regItem("warped_hoe", Declarer.warped_hoe);
            }
            if (CONFIG.toggles.toolToggles.crimsonTools) {
                regItem("crimson_pick", Declarer.crimson_pick);
                regItem("crimson_axe", Declarer.crimson_axe);
                regItem("crimson_shovel", Declarer.crimson_shovel);
                regItem("crimson_sword", Declarer.crimson_sword);
                regItem("crimson_hoe", Declarer.crimson_hoe);
            }
        }
        //compressed cobble
        if (CONFIG.toggles.allCompressedBlocks) {
            if (CONFIG.toggles.compressedBlocks.cobble) {
                regItem("monuple_compressed_cobblestone", Declarer.monuple_compressed_cobblestone);
                regBlock("monuple_compressed_cobblestone_block", Declarer.monuple_compressed_cobblestone_block);
                regItem("couple_compressed_cobblestone", Declarer.couple_compressed_cobblestone);
                regBlock("couple_compressed_cobblestone_block", Declarer.couple_compressed_cobblestone_block);
                regItem("triple_compressed_cobblestone", Declarer.triple_compressed_cobblestone);
                regBlock("triple_compressed_cobblestone_block", Declarer.triple_compressed_cobblestone_block);
                regItem("quadruple_compressed_cobblestone", Declarer.quadruple_compressed_cobblestone);
                regBlock("quadruple_compressed_cobblestone_block", Declarer.quadruple_compressed_cobblestone_block);
                regItem("quintuple_compressed_cobblestone", Declarer.quintuple_compressed_cobblestone);
                regBlock("quintuple_compressed_cobblestone_block", Declarer.quintuple_compressed_cobblestone_block);
                regItem("sextuple_compressed_cobblestone", Declarer.sextuple_compressed_cobblestone);
                regBlock("sextuple_compressed_cobblestone_block", Declarer.sextuple_compressed_cobblestone_block);
                regItem("septuple_compressed_cobblestone", Declarer.septuple_compressed_cobblestone);
                regBlock("septuple_compressed_cobblestone_block", Declarer.septuple_compressed_cobblestone_block);
                regItem("octuple_compressed_cobblestone", Declarer.octuple_compressed_cobblestone);
                regBlock("octuple_compressed_cobblestone_block", Declarer.octuple_compressed_cobblestone_block);
                regItem("nonuple_compressed_cobblestone", Declarer.nonuple_compressed_cobblestone);
                regBlock("nonuple_compressed_cobblestone_block", Declarer.nonuple_compressed_cobblestone_block);
            }
            //compressed dirt
            if (CONFIG.toggles.compressedBlocks.dirt) {
                regItem("monuple_compressed_dirt", Declarer.monuple_compressed_dirt);
                regBlock("monuple_compressed_dirt_block", Declarer.monuple_compressed_dirt_block);
                regItem("couple_compressed_dirt", Declarer.couple_compressed_dirt);
                regBlock("couple_compressed_dirt_block", Declarer.couple_compressed_dirt_block);
                regItem("triple_compressed_dirt", Declarer.triple_compressed_dirt);
                regBlock("triple_compressed_dirt_block", Declarer.triple_compressed_dirt_block);
                regItem("quadruple_compressed_dirt", Declarer.quadruple_compressed_dirt);
                regBlock("quadruple_compressed_dirt_block", Declarer.quadruple_compressed_dirt_block);
                regItem("quintuple_compressed_dirt", Declarer.quintuple_compressed_dirt);
                regBlock("quintuple_compressed_dirt_block", Declarer.quintuple_compressed_dirt_block);
                regItem("sextuple_compressed_dirt", Declarer.sextuple_compressed_dirt);
                regBlock("sextuple_compressed_dirt_block", Declarer.sextuple_compressed_dirt_block);
                regItem("septuple_compressed_dirt", Declarer.septuple_compressed_dirt);
                regBlock("septuple_compressed_dirt_block", Declarer.septuple_compressed_dirt_block);
                regItem("octuple_compressed_dirt", Declarer.octuple_compressed_dirt);
                regBlock("octuple_compressed_dirt_block", Declarer.octuple_compressed_dirt_block);
                regItem("nonuple_compressed_dirt", Declarer.nonuple_compressed_dirt);
                regBlock("nonuple_compressed_dirt_block", Declarer.nonuple_compressed_dirt_block);
            }
            //compressed diorite
            if (CONFIG.toggles.compressedBlocks.diorite) {
                regItem("monuple_compressed_diorite", Declarer.monuple_compressed_diorite);
                regBlock("monuple_compressed_diorite_block", Declarer.monuple_compressed_diorite_block);
                regItem("couple_compressed_diorite", Declarer.couple_compressed_diorite);
                regBlock("couple_compressed_diorite_block", Declarer.couple_compressed_diorite_block);
                regItem("triple_compressed_diorite", Declarer.triple_compressed_diorite);
                regBlock("triple_compressed_diorite_block", Declarer.triple_compressed_diorite_block);
                regItem("quadruple_compressed_diorite", Declarer.quadruple_compressed_diorite);
                regBlock("quadruple_compressed_diorite_block", Declarer.quadruple_compressed_diorite_block);
                regItem("quintuple_compressed_diorite", Declarer.quintuple_compressed_diorite);
                regBlock("quintuple_compressed_diorite_block", Declarer.quintuple_compressed_diorite_block);
                regItem("sextuple_compressed_diorite", Declarer.sextuple_compressed_diorite);
                regBlock("sextuple_compressed_diorite_block", Declarer.sextuple_compressed_diorite_block);
                regItem("septuple_compressed_diorite", Declarer.septuple_compressed_diorite);
                regBlock("septuple_compressed_diorite_block", Declarer.septuple_compressed_diorite_block);
                regItem("octuple_compressed_diorite", Declarer.octuple_compressed_diorite);
                regBlock("octuple_compressed_diorite_block", Declarer.octuple_compressed_diorite_block);
                regItem("nonuple_compressed_diorite", Declarer.nonuple_compressed_diorite);
                regBlock("nonuple_compressed_diorite_block", Declarer.nonuple_compressed_diorite_block);
            }
            //compressed granite
            if (CONFIG.toggles.compressedBlocks.granite) {
                regItem("monuple_compressed_granite", Declarer.monuple_compressed_granite);
                regBlock("monuple_compressed_granite_block", Declarer.monuple_compressed_granite_block);
                regItem("couple_compressed_granite", Declarer.couple_compressed_granite);
                regBlock("couple_compressed_granite_block", Declarer.couple_compressed_granite_block);
                regItem("triple_compressed_granite", Declarer.triple_compressed_granite);
                regBlock("triple_compressed_granite_block", Declarer.triple_compressed_granite_block);
                regItem("quadruple_compressed_granite", Declarer.quadruple_compressed_granite);
                regBlock("quadruple_compressed_granite_block", Declarer.quadruple_compressed_granite_block);
                regItem("quintuple_compressed_granite", Declarer.quintuple_compressed_granite);
                regBlock("quintuple_compressed_granite_block", Declarer.quintuple_compressed_granite_block);
                regItem("sextuple_compressed_granite", Declarer.sextuple_compressed_granite);
                regBlock("sextuple_compressed_granite_block", Declarer.sextuple_compressed_granite_block);
                regItem("septuple_compressed_granite", Declarer.septuple_compressed_granite);
                regBlock("septuple_compressed_granite_block", Declarer.septuple_compressed_granite_block);
                regItem("octuple_compressed_granite", Declarer.octuple_compressed_granite);
                regBlock("octuple_compressed_granite_block", Declarer.octuple_compressed_granite_block);
                regItem("nonuple_compressed_granite", Declarer.nonuple_compressed_granite);
                regBlock("nonuple_compressed_granite_block", Declarer.nonuple_compressed_granite_block);
            }
            //compressed andesite
            if (CONFIG.toggles.compressedBlocks.andesite) {
                regItem("monuple_compressed_andesite", Declarer.monuple_compressed_andesite);
                regBlock("monuple_compressed_andesite_block", Declarer.monuple_compressed_andesite_block);
                regItem("couple_compressed_andesite", Declarer.couple_compressed_andesite);
                regBlock("couple_compressed_andesite_block", Declarer.couple_compressed_andesite_block);
                regItem("triple_compressed_andesite", Declarer.triple_compressed_andesite);
                regBlock("triple_compressed_andesite_block", Declarer.triple_compressed_andesite_block);
                regItem("quadruple_compressed_andesite", Declarer.quadruple_compressed_andesite);
                regBlock("quadruple_compressed_andesite_block", Declarer.quadruple_compressed_andesite_block);
                regItem("quintuple_compressed_andesite", Declarer.quintuple_compressed_andesite);
                regBlock("quintuple_compressed_andesite_block", Declarer.quintuple_compressed_andesite_block);
                regItem("sextuple_compressed_andesite", Declarer.sextuple_compressed_andesite);
                regBlock("sextuple_compressed_andesite_block", Declarer.sextuple_compressed_andesite_block);
                regItem("septuple_compressed_andesite", Declarer.septuple_compressed_andesite);
                regBlock("septuple_compressed_andesite_block", Declarer.septuple_compressed_andesite_block);
                regItem("octuple_compressed_andesite", Declarer.octuple_compressed_andesite);
                regBlock("octuple_compressed_andesite_block", Declarer.octuple_compressed_andesite_block);
                regItem("nonuple_compressed_andesite", Declarer.nonuple_compressed_andesite);
                regBlock("nonuple_compressed_andesite_block", Declarer.nonuple_compressed_andesite_block);
            }
            //compressed netherrack
            if (CONFIG.toggles.compressedBlocks.netherrack) {
                regItem("monuple_compressed_netherrack", Declarer.monuple_compressed_netherrack);
                regBlock("monuple_compressed_netherrack_block", Declarer.monuple_compressed_netherrack_block);
                regItem("couple_compressed_netherrack", Declarer.couple_compressed_netherrack);
                regBlock("couple_compressed_netherrack_block", Declarer.couple_compressed_netherrack_block);
                regItem("triple_compressed_netherrack", Declarer.triple_compressed_netherrack);
                regBlock("triple_compressed_netherrack_block", Declarer.triple_compressed_netherrack_block);
                regItem("quadruple_compressed_netherrack", Declarer.quadruple_compressed_netherrack);
                regBlock("quadruple_compressed_netherrack_block", Declarer.quadruple_compressed_netherrack_block);
                regItem("quintuple_compressed_netherrack", Declarer.quintuple_compressed_netherrack);
                regBlock("quintuple_compressed_netherrack_block", Declarer.quintuple_compressed_netherrack_block);
                regItem("sextuple_compressed_netherrack", Declarer.sextuple_compressed_netherrack);
                regBlock("sextuple_compressed_netherrack_block", Declarer.sextuple_compressed_netherrack_block);
                regItem("septuple_compressed_netherrack", Declarer.septuple_compressed_netherrack);
                regBlock("septuple_compressed_netherrack_block", Declarer.septuple_compressed_netherrack_block);
                regItem("octuple_compressed_netherrack", Declarer.octuple_compressed_netherrack);
                regBlock("octuple_compressed_netherrack_block", Declarer.octuple_compressed_netherrack_block);
                regItem("nonuple_compressed_netherrack", Declarer.nonuple_compressed_netherrack);
                regBlock("nonuple_compressed_netherrack_block", Declarer.nonuple_compressed_netherrack_block);
            }
        }
    }

    //instead of typing out this every single time, I just made it into a function with the hardcoded reference too
    public static void regItem(String name, Item itemid){
       Registry.register(Registry.ITEM, new Identifier(Ref.MODID, name), itemid);
    }
    public static void regBlock(String name, Block blockid){
        Registry.register(Registry.BLOCK, new Identifier(Ref.MODID, name), blockid);
    }
}
