package silveon22.deep;

import net.minecraft.client.render.EntityRendererDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.Side;
import silveon22.deep.block.DEEPBlocks;
import silveon22.deep.item.DEEPItems;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static silveon22.deep.Deep.MOD_ID;
import static silveon22.deep.block.DEEPBlocks.*;
import static silveon22.deep.block.DEEPBlocks.netherrackSilverOre;

public class DEEPModels implements ModelEntrypoint {
	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

		// Creating a standard block model (full block) an "applying" to the block data.
		dispatcher.addDispatch(new BlockModelStandard<>(rhodoniteBlock).setTex(MOD_ID + ":block/block_rhodonite", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(rhodoniteBrick).setTex(MOD_ID + ":block/brick_rhodonite", Side.sides));
		dispatcher.addDispatch(new BlockModelSlab<>(DEEPBlocks.slabRhodoniteBrick));
		dispatcher.addDispatch(new BlockModelStairs<>(DEEPBlocks.stairsRhodoniteBrick));
		dispatcher.addDispatch(new BlockModelStandard<>(netherrackRhodoniteOre)
				.setTex(MOD_ID + ":block/ore/rhodonite/netherrack", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(amethystBlock).setTex(MOD_ID + ":block/block_amethyst", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(stoneAmethystOre)
				.setTex(MOD_ID + ":block/ore/amethyst/stone", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(basaltAmethystOre)
				.setTex(MOD_ID + ":block/ore/amethyst/basalt", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(limestoneAmethystOre)
				.setTex(MOD_ID + ":block/ore/amethyst/limestone", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(graniteAmethystOre)
				.setTex(MOD_ID + ":block/ore/amethyst/granite", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(permafrostAmethystOre)
				.setTex(MOD_ID + ":block/ore/amethyst/permafrost", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(silverBlock).setTex(MOD_ID + ":block/block_silver", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(stoneSilverOre)
				.setTex(MOD_ID + ":block/ore/silver/stone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(basaltSilverOre)
				.setTex(MOD_ID + ":block/ore/silver/basalt", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(limestoneSilverOre)
				.setTex(MOD_ID + ":block/ore/silver/limestone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(graniteSilverOre)
				.setTex(MOD_ID + ":block/ore/silver/granite", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(permafrostSilverOre)
				.setTex(MOD_ID + ":block/ore/silver/permafrost", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(netherrackSilverOre)
				.setTex(MOD_ID + ":block/ore/silver/netherrack", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(uraniumBlock).setTex(MOD_ID + ":block/block_uranium", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(stoneUraniumOre)
				.setTex(MOD_ID + ":block/ore/uranium/stone", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(basaltUraniumOre)
				.setTex(MOD_ID + ":block/ore/uranium/basalt", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(limestoneUraniumOre)
				.setTex(MOD_ID + ":block/ore/uranium/limestone", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(graniteUraniumOre)
				.setTex(MOD_ID + ":block/ore/uranium/granite", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(permafrostUraniumOre)
				.setTex(MOD_ID + ":block/ore/uranium/permafrost", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(leadBlock)
				.setTex(MOD_ID + ":block/block_lead", Side.sides));
		dispatcher.addDispatch(new BlockModelTransparent<>(leadedGlass,false).onRenderLayer(1).setTex(MOD_ID + ":block/glass_leaded", Side.sides));
		dispatcher.addDispatch(new BlockModelStandard<>(stoneLeadOre)
				.setTex(MOD_ID + ":block/ore/lead/stone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(basaltLeadOre)
				.setTex(MOD_ID + ":block/ore/lead/basalt", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(limestoneLeadOre)
				.setTex(MOD_ID + ":block/ore/lead/limestone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(graniteLeadOre)
				.setTex(MOD_ID + ":block/ore/lead/granite", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(permafrostLeadOre)
				.setTex(MOD_ID + ":block/ore/lead/permafrost", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(blockClayRed)
				.setTex(MOD_ID + ":block/block_clay_red", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(brickClayBlue)
				.setTex(MOD_ID + ":block/brick_clay_blue", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelSlab<>(DEEPBlocks.slabBrickClayBlue));
		dispatcher.addDispatch(new BlockModelStairs<>(DEEPBlocks.stairsBrickClayBlue));
		dispatcher.addDispatch(new BlockModelStandard<>(tileCeramicBlue)
				.setTex(MOD_ID + ":block/tiles_ceramic_blue", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelStandard<>(tileCeramicRed)
				.setTex(MOD_ID + ":block/tiles_ceramic_red", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelSlab<>(DEEPBlocks.slabTileCeramicBlue));
		dispatcher.addDispatch(new BlockModelStairs<>(DEEPBlocks.stairsTileCeramicBlue));
		dispatcher.addDispatch(new BlockModelSlab<>(DEEPBlocks.slabTileCeramicRed));
		dispatcher.addDispatch(new BlockModelStairs<>(DEEPBlocks.stairsTileCeramicRed));
		dispatcher.addDispatch(new BlockModelStandard<>(netherrackTopazOre).setTex(MOD_ID + ":block/ore/topaz/netherrack", Side.sides));



	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.rhodonite));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethyst));

		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethystAxe));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethystHoe));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethystSword));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethystShovel));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethystPickaxe));

		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethystHelmet));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethystChestplate));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethystLeggings));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.amethystBoots));

		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.rawSilver));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.ingotSilver));

		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.silverBoots));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.silverHelmet));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.silverChestplate));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.silverLeggings));

		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.silverAxe));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.silverHoe));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.silverSword));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.silverShovel));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.silverPickaxe));

		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.uranium));

		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.rawLead));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.ingotLead));

		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.leadAxe));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.leadHoe));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.leadSword));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.leadShovel));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.leadPickaxe));

		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.clayRed));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.clayBrickBlue));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.niter));
		dispatcher.addDispatch(new ItemModelStandard(DEEPItems.topaz));
	}

	@Override
	public void initEntityModels(EntityRendererDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
