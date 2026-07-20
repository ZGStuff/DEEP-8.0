package silveon22.deep.block;

import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import silveon22.deep.block.ore.*;
import turniplabs.halplibe.helper.BlockBuilder;

import static net.minecraft.core.item.tool.ItemToolPickaxe.miningLevels;
import static silveon22.deep.Deep.MOD_ID;


public class DEEPBlocks {

	// Declaring blocks

	public static Block<?> rhodoniteBlock;
	public static Block<?> rhodoniteBrick;
	public static Block<?> netherrackRhodoniteOre;
	public static Block<?> basaltRhodoniteOre;
	public static Block<?> gloomstoneRhodoniteOre;
	public static Block<BlockLogicSlab> slabRhodoniteBrick;
	public static Block<BlockLogicStairs> stairsRhodoniteBrick;
	public static Block<?> amethystBlock;
	public static Block<?> stoneAmethystOre;
	public static Block<?> basaltAmethystOre;
	public static Block<?> limestoneAmethystOre;
	public static Block<?> graniteAmethystOre;
	public static Block<?> permafrostAmethystOre;
	public static Block<?> silverBlock;
	public static Block<?> stoneSilverOre;
	public static Block<?> basaltSilverOre;
	public static Block<?> limestoneSilverOre;
	public static Block<?> graniteSilverOre;
	public static Block<?> permafrostSilverOre;
	public static Block<?> netherrackSilverOre;
	public static Block<?> uraniumBlock;
	public static Block<?> stoneUraniumOre;
	public static Block<?> basaltUraniumOre;
	public static Block<?> limestoneUraniumOre;
	public static Block<?> graniteUraniumOre;
	public static Block<?> permafrostUraniumOre;
	public static Block<?> leadBlock;
	public static Block<?> leadedGlass;
	public static Block<?> stoneLeadOre;
	public static Block<?> basaltLeadOre;
	public static Block<?> limestoneLeadOre;
	public static Block<?> graniteLeadOre;
	public static Block<?> permafrostLeadOre;
	public static Block<?> blockClayRed;
	public static Block<?> brickClayBlue;
	public static Block<BlockLogicSlab> slabBrickClayBlue;
	public static Block<BlockLogicStairs> stairsBrickClayBlue;
	public static Block<?> tileCeramicRed;
	public static Block<?> tileCeramicBlue;
	public static Block<BlockLogicSlab> slabTileCeramicRed;
	public static Block<BlockLogicStairs> stairsTileCeramicRed;
	public static Block<BlockLogicSlab> slabTileCeramicBlue;
	public static Block<BlockLogicStairs> stairsTileCeramicBlue;
	public static Block<?> netherrackTopazOre;

	public static void initBlocks() {

		BlockBuilder rhodonite_block_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setResistance(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		rhodoniteBlock = rhodonite_block_builder.build("block.rhodoniteblock", "block/rhodonite_block", 9807, b -> new BlockLogic(b, Materials.METAL));
		miningLevels.put(rhodoniteBlock,2);

		BlockBuilder rhodonite_brick_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setResistance(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		rhodoniteBrick = rhodonite_brick_builder.build("block.rhodonitebrick", "block/rhodonite_brick", 9808, b -> new BlockLogic(b, Materials.METAL));
		miningLevels.put(rhodoniteBrick,2);

		BlockBuilder slab_rhodonite_brick_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setResistance(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		slabRhodoniteBrick = slab_rhodonite_brick_builder.build("block.slab.rhodonitebrick", "block/rhodonite_brick_slab", 9809, b -> new BlockLogicSlab(b, rhodoniteBrick));
		miningLevels.put(slabRhodoniteBrick,2);

		BlockBuilder stairs_rhodonite_brick_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setResistance(1.0f)
			.setLuminance(0)
			.setUseInternalLight()
//			.setVisualUpdateOnMetadata()
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		stairsRhodoniteBrick = stairs_rhodonite_brick_builder.build("block.stairs.rhodonitebrick", "block/rhodonite_brick_stairs", 9810, b -> new BlockLogicStairs(b, rhodoniteBrick));
		miningLevels.put(stairsRhodoniteBrick,2);

		BlockBuilder netherrack_rhodonite_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(6)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		netherrackRhodoniteOre = netherrack_rhodonite_ore_builder.build("block.ore.netherrack.rhodonite", "block/netherrack_rhodonite_ore", 9811,  b -> new BlockLogicRhodoniteOre(b, Blocks.NETHERRACK, Materials.NETHERRACK)).withBlastResistance(5.0F);
		miningLevels.put(netherrackRhodoniteOre,2);

		BlockBuilder gloomstone_rhodonite_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(6)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		gloomstoneRhodoniteOre = gloomstone_rhodonite_ore_builder.build("block.ore.gloomstone.rhodonite", "block/gloomstone_rhodonite_ore", 9849,  b -> new BlockLogicRhodoniteOre(b, Blocks.GLOOMSTONE, Materials.GLOOMSTONE)).withBlastResistance(5.0F);
		miningLevels.put(gloomstoneRhodoniteOre,2);

		BlockBuilder basalt_rhodonite_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(6)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		basaltRhodoniteOre = basalt_rhodonite_ore_builder.build("block.ore.basalt.rhodonite", "block/basalt_rhodonite_ore", 9850,  b -> new BlockLogicRhodoniteOre(b, Blocks.BASALT, Materials.BASALT)).withBlastResistance(5.0F);
		miningLevels.put(basaltRhodoniteOre,2);

		BlockBuilder amethyst_block_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setResistance(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		amethystBlock = amethyst_block_builder.build("block.amethystblock", "block/amethyst_block", 9812, b -> new BlockLogic(b, Materials.METAL));
		miningLevels.put(amethystBlock,2);

		BlockBuilder stone_amethyst_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		stoneAmethystOre = stone_amethyst_ore_builder.build("block.ore.stone.amethyst", "block/stone_amethyst_ore", 9813,  (b) -> new BlockLogicAmethystOre(b, Blocks.STONE, Materials.STONE));
		miningLevels.put(stoneAmethystOre,2);

		BlockBuilder basalt_amethyst_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		basaltAmethystOre = basalt_amethyst_ore_builder.build("block.ore.basalt.amethyst", "block/basalt_amethyst_ore", 9814,  (b) -> new BlockLogicAmethystOre(b, Blocks.BASALT, Materials.BASALT));
		miningLevels.put(basaltAmethystOre,2);

		BlockBuilder limestone_amethyst_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		limestoneAmethystOre = limestone_amethyst_ore_builder.build("block.ore.limestone.amethyst", "block/limestone_amethyst_ore", 9815,  (b) -> new BlockLogicAmethystOre(b, Blocks.LIMESTONE, Materials.LIMESTONE));
		miningLevels.put(limestoneAmethystOre,2);

		BlockBuilder granite_amethyst_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		graniteAmethystOre = granite_amethyst_ore_builder.build("block.ore.granite.amethyst", "block/granite_amethyst_ore", 9816,  (b) -> new BlockLogicAmethystOre(b, Blocks.GRANITE, Materials.GRANITE));
		miningLevels.put(graniteAmethystOre,2);

		BlockBuilder permafrost_amethyst_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		permafrostAmethystOre = permafrost_amethyst_ore_builder.build("block.ore.permafrost.amethyst", "block/permafrost_amethyst_ore", 9817,  (b) -> new BlockLogicAmethystOre(b, Blocks.PERMAFROST, Materials.PERMAFROST));
		miningLevels.put(permafrostAmethystOre,2);

		BlockBuilder silver_block_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setResistance(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		silverBlock = silver_block_builder.build("block.silverblock", "block/silver_block", 9818, b -> new BlockLogic(b, Materials.METAL));
		miningLevels.put(silverBlock,2);

		BlockBuilder stone_silver_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		stoneSilverOre = stone_silver_ore_builder.build("block.ore.stone.silver", "block/stone_silver_ore", 9819,  (b) -> new BlockLogicSilverOre(b, Blocks.STONE, Materials.STONE));
		miningLevels.put(stoneSilverOre,2);

		BlockBuilder basalt_silver_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		basaltSilverOre = basalt_silver_ore_builder.build("block.ore.basalt.silver", "block/basalt_silver_ore", 9820,  (b) -> new BlockLogicSilverOre(b, Blocks.BASALT, Materials.BASALT));
		miningLevels.put(basaltSilverOre,2);

		BlockBuilder limestone_silver_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		limestoneSilverOre = limestone_silver_ore_builder.build("block.ore.limestone.silver", "block/limestone_silver_ore", 9821,  (b) -> new BlockLogicSilverOre(b, Blocks.LIMESTONE, Materials.LIMESTONE));
		miningLevels.put(limestoneSilverOre,2);

		BlockBuilder granite_silver_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		graniteSilverOre = granite_silver_ore_builder.build("block.ore.granite.silver", "block/granite_silver_ore", 9822,  (b) -> new BlockLogicSilverOre(b, Blocks.GRANITE, Materials.GRANITE));
		miningLevels.put(graniteSilverOre,2);

		BlockBuilder permafrost_silver_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		permafrostSilverOre = permafrost_silver_ore_builder.build("block.ore.permafrost.silver", "block/permafrost_silver_ore", 9823,  (b) -> new BlockLogicSilverOre(b, Blocks.PERMAFROST, Materials.PERMAFROST));
		miningLevels.put(permafrostSilverOre,2);

		BlockBuilder uranium_block_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setResistance(1.0f)
			.setLuminance(8)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		uraniumBlock = uranium_block_builder.build("block.uraniumblock", "block/uranium_block", 9824, b -> new BlockLogic(b, Materials.STONE));
		miningLevels.put(uraniumBlock,2);

		BlockBuilder stone_uranium_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		stoneUraniumOre = stone_uranium_ore_builder.build("block.ore.stone.uranium", "block/stone_uranium_ore", 9825,  (b) -> new BlockLogicUraniumOre(b, Blocks.STONE, Materials.STONE));
		miningLevels.put(stoneUraniumOre,2);

		BlockBuilder basalt_uranium_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		basaltUraniumOre = basalt_uranium_ore_builder.build("block.ore.basalt.uranium", "block/basalt_uranium_ore", 9826,  (b) -> new BlockLogicUraniumOre(b, Blocks.BASALT, Materials.BASALT));
		miningLevels.put(basaltUraniumOre,2);

		BlockBuilder limestone_uranium_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		limestoneUraniumOre = limestone_uranium_ore_builder.build("block.ore.limestone.uranium", "block/limestone_uranium_ore", 9827,  (b) -> new BlockLogicUraniumOre(b, Blocks.LIMESTONE, Materials.LIMESTONE));
		miningLevels.put(limestoneUraniumOre,2);

		BlockBuilder granite_uranium_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		graniteUraniumOre = granite_uranium_ore_builder.build("block.ore.granite.uranium", "block/granite_uranium_ore", 9828,  (b) -> new BlockLogicUraniumOre(b, Blocks.GRANITE, Materials.GRANITE));
		miningLevels.put(graniteUraniumOre,2);

		BlockBuilder permafrost_uranium_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		permafrostUraniumOre = permafrost_uranium_ore_builder.build("block.ore.permafrost.uranium", "block/permafrost_uranium_ore", 9829,  (b) -> new BlockLogicUraniumOre(b, Blocks.PERMAFROST, Materials.PERMAFROST));
		miningLevels.put(permafrostUraniumOre,2);

		BlockBuilder lead_block_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setResistance(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		leadBlock = lead_block_builder.build("block.leadblock", "block/lead_block", 9830, b -> new BlockLogic(b, Materials.METAL));
		miningLevels.put(leadBlock,1);

		BlockBuilder leaded_glass_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setResistance(0f)
			.setLuminance(0)
			.setLightOpacity(0)
			.setBlockSound(BlockSounds.GLASS)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		leadedGlass = leaded_glass_builder.build("block.leadedglass", "block/leaded_glass", 9831, b -> new BlockLogicTransparent(b, Materials.GLASS));

		BlockBuilder stone_lead_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		stoneLeadOre = stone_lead_ore_builder.build("block.ore.stone.lead", "block/stone_lead_ore", 9832,  (b) -> new BlockLogicLeadOre(b, Blocks.STONE, Materials.STONE));
		miningLevels.put(stoneLeadOre,1);

		BlockBuilder basalt_lead_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		basaltLeadOre = basalt_lead_ore_builder.build("block.ore.basalt.lead", "block/basalt_lead_ore", 9833,  (b) -> new BlockLogicLeadOre(b, Blocks.BASALT, Materials.BASALT	));
		miningLevels.put(basaltLeadOre,1);

		BlockBuilder limestone_lead_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		limestoneLeadOre = limestone_lead_ore_builder.build("block.ore.limestone.lead", "block/limestone_lead_ore", 9834,  (b) -> new BlockLogicLeadOre(b, Blocks.LIMESTONE, Materials.LIMESTONE));
		miningLevels.put(limestoneLeadOre,1);

		BlockBuilder granite_lead_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		graniteLeadOre = granite_lead_ore_builder.build("block.ore.granite.lead", "block/granite_lead_ore", 9835,  (b) -> new BlockLogicLeadOre(b, Blocks.GRANITE, Materials.GRANITE));
		miningLevels.put(graniteLeadOre,1);

		BlockBuilder permafrost_lead_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		permafrostLeadOre = permafrost_lead_ore_builder.build("block.ore.permafrost.lead", "block/permafrost_lead_ore", 9836,  (b) -> new BlockLogicLeadOre(b, Blocks.PERMAFROST, Materials.PERMAFROST));
		miningLevels.put(permafrostLeadOre,1);

		BlockBuilder netherrack_silver_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(6)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		netherrackSilverOre = netherrack_silver_ore_builder.build("block.ore.netherrack.silver", "block/netherrack_silver_ore", 9837,  (b) -> new BlockLogicSilverOre(b, Blocks.NETHERRACK, Materials.NETHERRACK));
		miningLevels.put(netherrackSilverOre,2);

		BlockBuilder block_clay_red_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.setBlockSound(BlockSounds.GRAVEL)
			.addTags(BlockTags.MINEABLE_BY_SHOVEL);
		blockClayRed = block_clay_red_builder.build("block.clay.red", "block/clay_red", 9838,  (b) -> new BlockLogicClayRed(b));

		BlockBuilder brick_clay_blue_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		brickClayBlue = brick_clay_blue_builder.build("block.brick.clay.blue", "block/brick_clay_blue", 9839,  (b) -> new BlockLogic(b, Materials.STONE));

		BlockBuilder slab_brick_clay_blue_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		slabBrickClayBlue = slab_brick_clay_blue_builder.build("block.slab.brick.clay.blue", "block/brick_clay_blue_slab", 9840, b -> new BlockLogicSlab(b, brickClayBlue));

		BlockBuilder stairs_brick_clay_blue_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.setUseInternalLight()
//			.setVisualUpdateOnMetadata()
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		stairsBrickClayBlue = stairs_brick_clay_blue_builder.build("block.stairs.brick.clay.blue", "block/brick_clay_blue_stairs", 9841, b -> new BlockLogicStairs(b, brickClayBlue));

		BlockBuilder tile_ceramic_blue_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		tileCeramicBlue = tile_ceramic_blue_builder.build("block.tile.ceramic.blue", "block/tile_ceramic_blue", 9842,  (b) -> new BlockLogic(b, Materials.STONE));

		BlockBuilder tile_ceramic_red_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		tileCeramicRed = tile_ceramic_red_builder.build("block.tile.ceramic.red", "block/tile_ceramic_red", 9843,  (b) -> new BlockLogic(b, Materials.STONE));

		BlockBuilder slab_tile_ceramic_blue_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		slabTileCeramicBlue = slab_tile_ceramic_blue_builder.build("block.slab.tile.ceramic.blue", "block/tile_ceramic_blue_slab", 9844, b -> new BlockLogicSlab(b, tileCeramicBlue));

		BlockBuilder stairs_tile_ceramic_blue_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.setUseInternalLight()
//			.setVisualUpdateOnMetadata()
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		stairsTileCeramicBlue = stairs_tile_ceramic_blue_builder.build("block.stairs.tile.ceramic.blue", "block/tile_ceramic_blue_stairs", 9845, b -> new BlockLogicStairs(b, tileCeramicBlue));

		BlockBuilder slab_tile_ceramic_red_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		slabTileCeramicRed = slab_tile_ceramic_red_builder.build("block.slab.tile.ceramic.red", "block/tile_ceramic_red_slab", 9846, b -> new BlockLogicSlab(b, tileCeramicRed));

		BlockBuilder stairs_tile_ceramic_red_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setLuminance(0)
			.setUseInternalLight()
//			.setVisualUpdateOnMetadata()
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		stairsTileCeramicRed = stairs_tile_ceramic_red_builder.build("block.stairs.tile.ceramic.red", "block/tile_ceramic_red_stairs", 9847, b -> new BlockLogicStairs(b, tileCeramicRed));

		BlockBuilder netherrack_topaz_ore_builder = new BlockBuilder(MOD_ID)
			.setHardness(3.0f)
			.setLuminance(6)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);
		netherrackTopazOre = netherrack_topaz_ore_builder.build("block.ore.netherrack.topaz", "block/netherrack_topaz_ore", 9848,  b -> new BlockLogicTopazOre(b)).withBlastResistance(5.0F);
		miningLevels.put(netherrackTopazOre,2);




	}
}
