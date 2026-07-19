package silveon22.deep;

import net.minecraft.client.render.EntityRenderDispatcher;
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
		ModelHelper.setBlockModel(rhodoniteBlock, () -> new BlockModelStandard<>(rhodoniteBlock)
				.setTex(0, MOD_ID + ":block/block_rhodonite", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(rhodoniteBrick, () -> new BlockModelStandard<>(rhodoniteBrick)
				.setTex(0, MOD_ID + ":block/brick_rhodonite", Side.sides)
			// setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelSlab<>(DEEPBlocks.slabRhodoniteBrick));
		dispatcher.addDispatch(new BlockModelStairs<>(DEEPBlocks.stairsRhodoniteBrick));
		ModelHelper.setBlockModel(netherrackRhodoniteOre, () -> new BlockModelStandard<>(netherrackRhodoniteOre)
				.setTex(0, MOD_ID + ":block/ore/rhodonite/netherrack", Side.sides)
				.setTex(1, MOD_ID + ":block/ore/rhodonite/overlay", Side.sides)// setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(amethystBlock, () -> new BlockModelStandard<>(amethystBlock)
				.setTex(0, MOD_ID + ":block/block_amethyst", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(stoneAmethystOre, () -> new BlockModelStandard<>(stoneAmethystOre)
				.setTex(0, MOD_ID + ":block/ore/amethyst/stone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(basaltAmethystOre, () -> new BlockModelStandard<>(basaltAmethystOre)
				.setTex(0, MOD_ID + ":block/ore/amethyst/basalt", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(limestoneAmethystOre, () -> new BlockModelStandard<>(limestoneAmethystOre)
				.setTex(0, MOD_ID + ":block/ore/amethyst/limestone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(graniteAmethystOre, () -> new BlockModelStandard<>(graniteAmethystOre)
				.setTex(0, MOD_ID + ":block/ore/amethyst/granite", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(permafrostAmethystOre, () -> new BlockModelStandard<>(permafrostAmethystOre)
				.setTex(0, MOD_ID + ":block/ore/amethyst/permafrost", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(silverBlock, () -> new BlockModelStandard<>(silverBlock)
				.setTex(0, MOD_ID + ":block/block_silver", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(stoneSilverOre, () -> new BlockModelStandard<>(stoneSilverOre)
				.setTex(0, MOD_ID + ":block/ore/silver/stone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(basaltSilverOre, () -> new BlockModelStandard<>(basaltSilverOre)
				.setTex(0, MOD_ID + ":block/ore/silver/basalt", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(limestoneSilverOre, () -> new BlockModelStandard<>(limestoneSilverOre)
				.setTex(0, MOD_ID + ":block/ore/silver/limestone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(graniteSilverOre, () -> new BlockModelStandard<>(graniteSilverOre)
				.setTex(0, MOD_ID + ":block/ore/silver/granite", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(permafrostSilverOre, () -> new BlockModelStandard<>(permafrostSilverOre)
				.setTex(0, MOD_ID + ":block/ore/silver/permafrost", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(netherrackSilverOre, () -> new BlockModelStandard<>(netherrackSilverOre)
				.setTex(0, MOD_ID + ":block/ore/silver/netherrack", Side.sides)
				.setTex(1, MOD_ID + ":block/ore/silver/overlay", Side.sides)// setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(uraniumBlock, () -> new BlockModelStandard<>(uraniumBlock)
				.setTex(0, MOD_ID + ":block/block_uranium", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(stoneUraniumOre, () -> new BlockModelStandard<>(stoneUraniumOre)
				.setTex(0, MOD_ID + ":block/ore/uranium/stone", Side.sides)
				.setTex(1, MOD_ID + ":block/ore/uranium/overlay", Side.sides)// setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(basaltUraniumOre, () -> new BlockModelStandard<>(basaltUraniumOre)
				.setTex(0, MOD_ID + ":block/ore/uranium/basalt", Side.sides)
				.setTex(1, MOD_ID + ":block/ore/uranium/overlay", Side.sides)// setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(limestoneUraniumOre, () -> new BlockModelStandard<>(limestoneUraniumOre)
				.setTex(0, MOD_ID + ":block/ore/uranium/limestone", Side.sides)
				.setTex(1, MOD_ID + ":block/ore/uranium/overlay", Side.sides)// setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(graniteUraniumOre, () -> new BlockModelStandard<>(graniteUraniumOre)
				.setTex(0, MOD_ID + ":block/ore/uranium/granite", Side.sides)
				.setTex(1, MOD_ID + ":block/ore/uranium/overlay", Side.sides)// setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(permafrostUraniumOre, () -> new BlockModelStandard<>(permafrostUraniumOre)
				.setTex(0, MOD_ID + ":block/ore/uranium/permafrost", Side.sides)
				.setTex(1, MOD_ID + ":block/ore/uranium/overlay", Side.sides)// setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(leadBlock, () -> new BlockModelStandard<>(leadBlock)
				.setTex(0, MOD_ID + ":block/block_lead", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(leadedGlass, () -> new BlockModelTransparent<>(leadedGlass,false).onRenderLayer(1)
				.setTex(0, MOD_ID + ":block/glass_leaded", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(stoneLeadOre, () -> new BlockModelStandard<>(stoneLeadOre)
				.setTex(0, MOD_ID + ":block/ore/lead/stone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(basaltLeadOre, () -> new BlockModelStandard<>(basaltLeadOre)
				.setTex(0, MOD_ID + ":block/ore/lead/basalt", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(limestoneLeadOre, () -> new BlockModelStandard<>(limestoneLeadOre)
				.setTex(0, MOD_ID + ":block/ore/lead/limestone", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(graniteLeadOre, () -> new BlockModelStandard<>(graniteLeadOre)
				.setTex(0, MOD_ID + ":block/ore/lead/granite", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(permafrostLeadOre, () -> new BlockModelStandard<>(permafrostLeadOre)
				.setTex(0, MOD_ID + ":block/ore/lead/permafrost", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(blockClayRed, () -> new BlockModelStandard<>(blockClayRed)
				.setTex(0, MOD_ID + ":block/block_clay_red", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(brickClayBlue, () -> new BlockModelStandard<>(brickClayBlue)
				.setTex(0, MOD_ID + ":block/brick_clay_blue", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelSlab<>(DEEPBlocks.slabBrickClayBlue));
		dispatcher.addDispatch(new BlockModelStairs<>(DEEPBlocks.stairsBrickClayBlue));
		ModelHelper.setBlockModel(tileCeramicBlue, () -> new BlockModelStandard<>(tileCeramicBlue)
				.setTex(0, MOD_ID + ":block/tiles_ceramic_blue", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		ModelHelper.setBlockModel(tileCeramicRed, () -> new BlockModelStandard<>(tileCeramicRed)
				.setTex(0, MOD_ID + ":block/tiles_ceramic_red", Side.sides) // setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);
		dispatcher.addDispatch(new BlockModelSlab<>(DEEPBlocks.slabTileCeramicBlue));
		dispatcher.addDispatch(new BlockModelStairs<>(DEEPBlocks.stairsTileCeramicBlue));
		dispatcher.addDispatch(new BlockModelSlab<>(DEEPBlocks.slabTileCeramicRed));
		dispatcher.addDispatch(new BlockModelStairs<>(DEEPBlocks.stairsTileCeramicRed));
		ModelHelper.setBlockModel(netherrackTopazOre, () -> new BlockModelStandard<>(netherrackTopazOre)
				.setTex(0, MOD_ID + ":block/ore/topaz/netherrack", Side.sides)
				.setTex(1, MOD_ID + ":block/ore/topaz/overlay", Side.sides)// setting the texture (don't forget the ':'). 'sides' can be: TOP, BOTTOM, NORTH, SOUTH, EAST, WEST
			// In resources create a folder 'assets', inside it another folder 'yourmodname', inside it 'textures', inside it 'block'. Inside it put the textures of your blocks with names in snake_case
		);



	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		ModelHelper.setItemModel(DEEPItems.rhodonite,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.rhodonite, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/rhodonite"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethyst,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethyst, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethystPickaxe,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethystPickaxe, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_pickaxe_amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethystAxe,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethystAxe, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_axe_amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethystSword,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethystSword, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_sword_amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethystShovel,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethystShovel, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_shovel_amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethystHoe,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethystHoe, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_hoe_amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethystHelmet,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethystHelmet, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/armor_helmet_amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethystChestplate,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethystChestplate, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/armor_chestplate_amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethystLeggings,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethystLeggings, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/armor_leggings_amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.amethystBoots,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.amethystBoots, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/armor_boots_amethyst"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.rawSilver,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.rawSilver, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/ore_raw_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.ingotSilver,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.ingotSilver, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/ingot_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.silverHelmet,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.silverHelmet, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/armor_helmet_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.silverChestplate,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.silverChestplate, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/armor_chestplate_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.silverLeggings,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.silverLeggings, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/armor_leggings_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.silverBoots,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.silverBoots, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/armor_boots_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.silverPickaxe,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.silverPickaxe, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_pickaxe_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.silverAxe,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.silverAxe, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_axe_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.silverSword,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.silverSword, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_sword_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.silverShovel,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.silverShovel, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_shovel_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.silverHoe,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.silverHoe, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_hoe_silver"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.uranium,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.uranium, MOD_ID).setFullBright();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/uranium"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.rawLead,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.rawLead, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/ore_raw_lead"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.ingotLead,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.ingotLead, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/ingot_lead"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.leadPickaxe,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.leadPickaxe, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_pickaxe_lead"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.leadAxe,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.leadAxe, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_axe_lead"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.leadSword,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.leadSword, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_sword_lead"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.leadShovel,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.leadShovel, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_shovel_lead"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.leadHoe,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.leadHoe, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/tool_hoe_lead"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.clayRed,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.clayRed, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/clay_red"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.clayBrickBlue,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.clayBrickBlue, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/brick_clay_blue"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.niter,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.niter, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/niter"));
			return model;
		});
		ModelHelper.setItemModel(DEEPItems.topaz,()->{
			ItemModelStandard model = new ItemModelStandard(DEEPItems.topaz, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID,"item/topaz"));
			return model;
		});


	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
