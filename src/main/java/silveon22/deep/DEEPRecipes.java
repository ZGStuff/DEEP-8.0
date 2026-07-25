package silveon22.deep;

import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.DyeColor;
import silveon22.deep.block.DEEPBlocks;
import silveon22.deep.item.DEEPItems;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static silveon22.deep.Deep.MOD_ID;

public class DEEPRecipes implements RecipeEntrypoint {
	@Override
	public void onRecipesReady() {
		Registries.ITEM_GROUPS.register("silveon22.deep:gemstones",Registries.stackListOf(Items.DIAMOND,DEEPItems.amethyst));
		Registries.ITEM_GROUPS.register("silveon22.deep:clayBricks",Registries.stackListOf(DEEPItems.clayBrickBlue,Items.BRICK_CLAY));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("R")
			.addInput('R', DEEPItems.rhodonite)
			.create("rhodoniteToPinkDye", new ItemStack(Items.DYE, 1, DyeColor.PINK.itemMeta));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("RRR","RRR","RRR")
			.addInput('R', DEEPItems.rhodonite)
			.create("rhodoniteToBlock", new ItemStack(DEEPBlocks.rhodoniteBlock, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("R")
			.addInput('R', DEEPBlocks.rhodoniteBlock)
			.create("blockToRhodonite", new ItemStack(DEEPItems.rhodonite, 9));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("RR","RR")
			.addInput('R', DEEPItems.rhodonite)
			.create("rhodoniteToBrick", new ItemStack(DEEPBlocks.rhodoniteBrick, 4));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("RRR")
			.addInput('R', DEEPBlocks.rhodoniteBrick)
			.create("rhodoniteBrickSlab", new ItemStack(DEEPBlocks.slabRhodoniteBrick, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("R  ","RR ","RRR")
			.addInput('R', DEEPBlocks.rhodoniteBrick)
			.create("rhodoniteBrickStairs", new ItemStack(DEEPBlocks.stairsRhodoniteBrick, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AAA","AAA","AAA")
			.addInput('A', DEEPItems.amethyst)
			.create("amethystToBlock", new ItemStack(DEEPBlocks.amethystBlock, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A")
			.addInput('A', DEEPBlocks.amethystBlock)
			.create("blockToAmethyst", new ItemStack(DEEPItems.amethyst, 9));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AAA"," S "," S ")
			.addInput('A', DEEPItems.amethyst)
			.addInput('S', Items.STICK)
			.create("amethystPickaxe", new ItemStack(DEEPItems.amethystPickaxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA ","AS "," S ")
			.addInput('A', DEEPItems.amethyst)
			.addInput('S', Items.STICK)
			.create("amethystAxeLeft", new ItemStack(DEEPItems.amethystAxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA","SA","S ")
			.addInput('A', DEEPItems.amethyst)
			.addInput('S', Items.STICK)
			.create("amethystAxeRight", new ItemStack(DEEPItems.amethystAxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A","A","S")
			.addInput('A', DEEPItems.amethyst)
			.addInput('S', Items.STICK)
			.create("amethystSword", new ItemStack(DEEPItems.amethystSword, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A","S","S")
			.addInput('A', DEEPItems.amethyst)
			.addInput('S', Items.STICK)
			.create("amethystShovel", new ItemStack(DEEPItems.amethystShovel, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA","S ","S ")
			.addInput('A', DEEPItems.amethyst)
			.addInput('S', Items.STICK)
			.create("amethystHoeRight", new ItemStack(DEEPItems.amethystHoe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA"," S"," S")
			.addInput('A', DEEPItems.amethyst)
			.addInput('S', Items.STICK)
			.create("amethystHoeLeft", new ItemStack(DEEPItems.amethystHoe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AAA","A A")
			.addInput('A', DEEPItems.amethyst)
			.create("amethystHelmet", new ItemStack(DEEPItems.amethystHelmet, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A A","AAA","AAA")
			.addInput('A', DEEPItems.amethyst)
			.create("amethystChestplate", new ItemStack(DEEPItems.amethystChestplate, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AAA","A A","A A")
			.addInput('A', DEEPItems.amethyst)
			.create("amethystLeggings", new ItemStack(DEEPItems.amethystLeggings, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A A","A A")
			.addInput('A', DEEPItems.amethyst)
			.create("amethystBoots", new ItemStack(DEEPItems.amethystBoots, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("SSS","SSS","SSS")
			.addInput('S', DEEPItems.ingotSilver)
			.create("silverToBlock", new ItemStack(DEEPBlocks.silverBlock, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("S")
			.addInput('S', DEEPBlocks.silverBlock)
			.create("blockToSilver", new ItemStack(DEEPItems.ingotSilver, 9));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("S S","STS","SRS")
			.addInput('S', DEEPItems.ingotSilver)
			.addInput('T', Items.STICK)
			.addInput('R', Items.DUST_REDSTONE)
			.create("silverPoweredRail", new ItemStack(Blocks.RAIL_POWERED, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("SSS","SNS","SSS")
			.addInput('S', DEEPItems.ingotSilver)
			.addInput('N', Items.NETHERCOAL)
			.create("silverBlastFurnace", new ItemStack(Blocks.FURNACE_BLAST_IDLE, 2));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("S S","SNS")
			.addInput('S', DEEPItems.ingotSilver)
			.addInput('N', Blocks.COBBLE_NETHERRACK)
			.create("silverBrazier", new ItemStack(Blocks.BRAZIER_INACTIVE, 4));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("S S"," S ")
			.addInput('S', DEEPItems.ingotSilver)
			.create("silverBucket", new ItemStack(Items.BUCKET_IRON, 2));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("SCS","SCS")
			.addInput('S', DEEPItems.ingotSilver)
			.addInput('C', Items.CHAINLINK)
			.create("silverChainlinkFence", new ItemStack(Blocks.FENCE_CHAINLINK, 16));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("SS","SS","SS")
			.addInput('S', DEEPItems.ingotSilver)
			.create("silverDoor", new ItemStack(Items.DOOR_IRON, 4));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("SSS","SSS")
			.addInput('S', DEEPItems.ingotSilver)
			.create("silverTrapdoor", new ItemStack(Blocks.TRAPDOOR_IRON, 12));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(" S ","SRS"," S ")
			.addInput('S', DEEPItems.ingotSilver)
			.addInput('R', Items.DUST_REDSTONE)
			.create("silverClock", new ItemStack(Items.TOOL_CLOCK, 1));
		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("jukebox");
		RecipeBuilderShaped jukebox = new RecipeBuilderShaped(MOD_ID,"WWW","WGW","WWW");
		jukebox.addInput('W',"minecraft:planks").addInput('G',"silveon22.deep:gemstones").create("jukebox", new ItemStack(Blocks.JUKEBOX, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AAA"," S "," S ")
			.addInput('A', DEEPItems.ingotSilver)
			.addInput('S', Items.STICK)
			.create("silverPickaxe", new ItemStack(DEEPItems.silverPickaxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA ","AS "," S ")
			.addInput('A', DEEPItems.ingotSilver)
			.addInput('S', Items.STICK)
			.create("silverAxeLeft", new ItemStack(DEEPItems.silverAxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA","SA","S ")
			.addInput('A', DEEPItems.ingotSilver)
			.addInput('S', Items.STICK)
			.create("silverAxeRight", new ItemStack(DEEPItems.silverAxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A","A","S")
			.addInput('A', DEEPItems.ingotSilver)
			.addInput('S', Items.STICK)
			.create("silverSword", new ItemStack(DEEPItems.silverSword, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A","S","S")
			.addInput('A', DEEPItems.ingotSilver)
			.addInput('S', Items.STICK)
			.create("silverShovel", new ItemStack(DEEPItems.silverShovel, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA","S ","S ")
			.addInput('A', DEEPItems.ingotSilver)
			.addInput('S', Items.STICK)
			.create("silverHoeRight", new ItemStack(DEEPItems.silverHoe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA"," S"," S")
			.addInput('A', DEEPItems.ingotSilver)
			.addInput('S', Items.STICK)
			.create("silverHoeLeft", new ItemStack(DEEPItems.silverHoe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AAA","A A")
			.addInput('A', DEEPItems.ingotSilver)
			.create("silverHelmet", new ItemStack(DEEPItems.silverHelmet, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A A","AAA","AAA")
			.addInput('A', DEEPItems.ingotSilver)
			.create("silverChestplate", new ItemStack(DEEPItems.silverChestplate, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AAA","A A","A A")
			.addInput('A', DEEPItems.ingotSilver)
			.create("silverLeggings", new ItemStack(DEEPItems.silverLeggings, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A A","A A")
			.addInput('A', DEEPItems.ingotSilver)
			.create("silverBoots", new ItemStack(DEEPItems.silverBoots, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(" S ","IUI"," I ")
			.addInput('U', DEEPItems.uranium)
			.addInput('S', Items.STRING)
			.addInput('I', Items.INGOT_IRON)
			.create("uraniumExplosiveCharge", new ItemStack(Items.AMMO_CHARGE_EXPLOSIVE, 16));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(" S ","PUP"," P ")
			.addInput('U', DEEPItems.uranium)
			.addInput('S', Items.STRING)
			.addInput('P', Items.PAPER)
			.create("uraniumTNT", new ItemStack(Blocks.TNT, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("U","S")
			.addInput('U', DEEPItems.uranium)
			.addInput('S', Items.STICK)
			.create("uraniumTorch", new ItemStack(Blocks.TORCH_COAL, 32));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("UUU","U U","UUU")
			.addInput('U', DEEPItems.uranium)
			.create("uraniumToBlock", new ItemStack(DEEPBlocks.uraniumBlock, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("U")
			.addInput('U', DEEPBlocks.uraniumBlock)
			.create("blockToUranium", new ItemStack(DEEPItems.uranium, 8));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.RED.itemMeta)
			.create("leadToRedDye", new ItemStack(Items.DYE, 8, DyeColor.RED.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.ORANGE.itemMeta)
			.create("leadToOrangeDye", new ItemStack(Items.DYE, 8, DyeColor.ORANGE.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.YELLOW.itemMeta)
			.create("leadToYellowDye", new ItemStack(Items.DYE, 8, DyeColor.YELLOW.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.GREEN.itemMeta)
			.create("leadToGreenDye", new ItemStack(Items.DYE, 8, DyeColor.GREEN.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.LIME.itemMeta)
			.create("leadToLimeDye", new ItemStack(Items.DYE, 4, DyeColor.LIME.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.CYAN.itemMeta)
			.create("leadToCyanDye", new ItemStack(Items.DYE, 4, DyeColor.CYAN.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.BLUE.itemMeta)
			.create("leadToBlueDye", new ItemStack(Items.DYE, 4, DyeColor.BLUE.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.LIGHT_BLUE.itemMeta)
			.create("leadToLightBlueDye", new ItemStack(Items.DYE, 8, DyeColor.LIGHT_BLUE.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.PURPLE.itemMeta)
			.create("leadToPurpleDye", new ItemStack(Items.DYE, 8, DyeColor.PURPLE.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.MAGENTA.itemMeta)
			.create("leadToMagentaDye", new ItemStack(Items.DYE, 4, DyeColor.MAGENTA.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.PINK.itemMeta)
			.create("leadToPinkDye", new ItemStack(Items.DYE, 8, DyeColor.PINK.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.BROWN.itemMeta)
			.create("leadToBrownDye", new ItemStack(Items.DYE, 4, DyeColor.BROWN.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.BLACK.itemMeta)
			.create("leadToBlackDye", new ItemStack(Items.DYE, 6, DyeColor.BLACK.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.GRAY.itemMeta)
			.create("leadToGrayDye", new ItemStack(Items.DYE, 4, DyeColor.GRAY.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.SILVER.itemMeta)
			.create("leadToSilverDye", new ItemStack(Items.DYE, 4, DyeColor.SILVER.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Items.DYE, DyeColor.WHITE.itemMeta)
			.create("leadToWhiteDye", new ItemStack(Items.DYE, 6, DyeColor.WHITE.itemMeta));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("LLL","LLL","LLL")
			.addInput('L', DEEPItems.ingotLead)
			.create("silverToLead", new ItemStack(DEEPBlocks.leadBlock, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("L")
			.addInput('L', DEEPBlocks.leadBlock)
			.create("blockToLead", new ItemStack(DEEPItems.ingotLead, 9));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.ingotLead)
			.addInput(Blocks.GLASS)
			.addInput(Blocks.GLASS)
			.addInput(DEEPItems.ingotLead)
			.create("leadedGlass", new ItemStack(DEEPBlocks.leadedGlass, 4));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AAA"," S "," S ")
			.addInput('A', DEEPItems.ingotLead)
			.addInput('S', Items.STICK)
			.create("leadPickaxe", new ItemStack(DEEPItems.leadPickaxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA ","AS "," S ")
			.addInput('A', DEEPItems.ingotLead)
			.addInput('S', Items.STICK)
			.create("leadAxeLeft", new ItemStack(DEEPItems.leadAxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA","SA","S ")
			.addInput('A', DEEPItems.ingotLead)
			.addInput('S', Items.STICK)
			.create("leadAxeRight", new ItemStack(DEEPItems.leadAxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A","A","S")
			.addInput('A', DEEPItems.ingotLead)
			.addInput('S', Items.STICK)
			.create("leadSword", new ItemStack(DEEPItems.leadSword, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("A","S","S")
			.addInput('A', DEEPItems.ingotLead)
			.addInput('S', Items.STICK)
			.create("leadShovel", new ItemStack(DEEPItems.leadShovel, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA","S ","S ")
			.addInput('A', DEEPItems.ingotLead)
			.addInput('S', Items.STICK)
			.create("leadHoeRight", new ItemStack(DEEPItems.leadHoe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("AA"," S"," S")
			.addInput('A', DEEPItems.ingotLead)
			.addInput('S', Items.STICK)
			.create("leadHoeLeft", new ItemStack(DEEPItems.leadHoe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("SCS","SCS")
			.addInput('S', DEEPItems.ingotLead)
			.addInput('C', Items.CHAINLINK)
			.create("leadChainlinkFence", new ItemStack(Blocks.FENCE_CHAINLINK, 4));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("SS","SS","SS")
			.addInput('S', DEEPItems.ingotLead)
			.create("leadDoor", new ItemStack(Items.DOOR_IRON, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("SSS","SSS")
			.addInput('S', DEEPItems.ingotLead)
			.create("leadTrapdoor", new ItemStack(Blocks.TRAPDOOR_IRON, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("S S","STS","S S")
			.addInput('S', DEEPItems.ingotLead)
			.addInput('T', Items.STICK)
			.create("leadRail", new ItemStack(Blocks.RAIL, 4));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(" S ","SRS","CCC")
			.addInput('S', DEEPItems.ingotLead)
			.addInput('R', Items.DUST_REDSTONE)
			.addInput('C', "minecraft:cobblestones")
			.create("leadSpikes", new ItemStack(Blocks.SPIKES, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("BB","BB")
			.addInput('B', DEEPItems.clayBrickBlue)
			.create("blueClayBricks", new ItemStack(DEEPBlocks.brickClayBlue, 4));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("RR","RR")
			.addInput('R', DEEPItems.clayRed)
			.create("redClayBlock", new ItemStack(DEEPBlocks.blockClayRed, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("RRR")
			.addInput('R', DEEPBlocks.brickClayBlue)
			.create("blueClayBrickSlab", new ItemStack(DEEPBlocks.slabBrickClayBlue, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("R  ","RR ","RRR")
			.addInput('R', DEEPBlocks.brickClayBlue)
			.create("blueClayBrickStairs", new ItemStack(DEEPBlocks.stairsBrickClayBlue, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("C C"," C ")
			.addInput('C',DEEPBlocks.brickClayBlue)
			.create("clayBowl", new ItemStack(Items.BOWL, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("B","B")
			.addInput('B', DEEPBlocks.brickClayBlue)
			.create("blueCeramicTiles", new ItemStack(DEEPBlocks.tileCeramicBlue, 2));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("B","B")
			.addInput('B', Blocks.BRICK_CLAY)
			.create("redCeramicTiles", new ItemStack(DEEPBlocks.tileCeramicRed, 2));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("RRR")
			.addInput('R', DEEPBlocks.tileCeramicBlue)
			.create("blueCeramicTileSlab", new ItemStack(DEEPBlocks.slabTileCeramicBlue, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("R  ","RR ","RRR")
			.addInput('R', DEEPBlocks.tileCeramicBlue)
			.create("blueCeramicTileStairs", new ItemStack(DEEPBlocks.stairsTileCeramicBlue, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("RRR")
			.addInput('R', DEEPBlocks.tileCeramicRed)
			.create("redCeramicTileSlab", new ItemStack(DEEPBlocks.slabTileCeramicRed, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("R  ","RR ","RRR")
			.addInput('R', DEEPBlocks.tileCeramicRed)
			.create("redCeramicTileStairs", new ItemStack(DEEPBlocks.stairsTileCeramicRed, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("N")
			.addInput('N', DEEPItems.niter)
			.create("niterToBonemeal", new ItemStack(Items.DYE, 1, DyeColor.WHITE.itemMeta));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.niter)
			.addInput(Items.COAL)
			.create("niterToGunpowder", new ItemStack(Items.SULFUR, 2));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.niter)
			.addInput(Items.COAL, 1)
			.create("niterToGunpowderCharcoal", new ItemStack(Items.SULFUR, 2));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.niter)
			.addInput(Items.AMMO_PEBBLE)
			.addInput(Items.AMMO_PEBBLE)
			.addInput(DEEPItems.niter)
			.create("niterGravel", new ItemStack(Blocks.GRAVEL, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(DEEPItems.niter)
			.addInput(Items.FLINT)
			.addInput(Items.FLINT)
			.addInput(DEEPItems.niter)
			.create("niterFlintGravel", new ItemStack(Blocks.GRAVEL, 1));




		RecipeBuilder.Furnace(MOD_ID)
			.setInput(DEEPItems.rawSilver)
			.create("rawSilverToSilverIngot", DEEPItems.ingotSilver.getDefaultStack());
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(DEEPItems.rawSilver)
			.create("rawSilverToSilverIngot", DEEPItems.ingotSilver.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID)
			.setInput(DEEPItems.rawLead)
			.create("rawLeadToLeadIngot", DEEPItems.ingotLead.getDefaultStack());
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(DEEPItems.rawLead)
			.create("rawLeadToLeadIngot", DEEPItems.ingotLead.getDefaultStack());
		RecipeBuilder.ModifyFurnace("minecraft").removeRecipe("clay_to_brick_clay");
		RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("clay_to_brick_clay");
		RecipeBuilder.Furnace(MOD_ID)
			.setInput(Items.CLAY)
			.create("blue_clay_to_blue_clay_brick", DEEPItems.clayBrickBlue.getDefaultStack());
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(Items.CLAY)
			.create("blue_clay_to_blue_clay_brick", DEEPItems.clayBrickBlue.getDefaultStack());
		RecipeBuilder.Furnace(MOD_ID)
			.setInput(DEEPItems.clayRed)
			.create("red_clay_to_red_clay_brick", Items.BRICK_CLAY.getDefaultStack());
		RecipeBuilder.BlastFurnace(MOD_ID)
			.setInput(DEEPItems.clayRed)
			.create("red_clay_to_red_clay_brick", Items.BRICK_CLAY.getDefaultStack());




		RecipeBuilder.ModifyTrommel("minecraft", "clay").deleteRecipe();
		RecipeBuilder.Trommel(MOD_ID)
			.setInput(DEEPBlocks.blockClayRed)
			.addEntry(new WeightedRandomLootObject(new ItemStack(DEEPItems.clayRed, 1), 4, 8), 30)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Items.AMMO_PEBBLE, 1), 1, 3), 20)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Items.SULFUR, 1), 1, 3), 10)
			.addEntry(new WeightedRandomLootObject(Items.ORE_RAW_GOLD.getDefaultStack(), 1), 1)
			.addEntry(new WeightedRandomLootObject(new ItemStack(DEEPItems.niter, 1), 1, 2), 5)
			.create("clay_red");
		RecipeBuilder.Trommel(MOD_ID)
			.setInput(Blocks.BLOCK_CLAY)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Items.CLAY, 1), 4, 8), 30)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Items.AMMO_PEBBLE, 1), 1, 3), 20)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Items.SULFUR, 1), 1, 3), 10)
			.addEntry(new WeightedRandomLootObject(DEEPItems.rawSilver.getDefaultStack(), 1), 1)
			.addEntry(new WeightedRandomLootObject(new ItemStack(DEEPItems.niter, 1), 1, 2), 5)
			.create("clay_blue");
		RecipeBuilder.Trommel(MOD_ID)
			.setInput(Blocks.BLOCK_SNOW)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Items.AMMO_SNOWBALL, 1), 1, 3), 30)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Items.AMMO_PEBBLE, 1), 1, 3), 17)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Blocks.ICE, 1), 2, 6), 10)
			.addEntry(new WeightedRandomLootObject(new ItemStack(DEEPItems.niter, 1), 1), 5)
			.create("snow");
		RecipeBuilder.ModifyTrommel("minecraft", "gravel")
			.addEntry(new WeightedRandomLootObject(DEEPItems.rawSilver.getDefaultStack(), 1), 1);
		RecipeBuilder.ModifyTrommel("minecraft", "gravel")
			.addEntry(new WeightedRandomLootObject(DEEPItems.rawLead.getDefaultStack(), 1), 3);
		RecipeBuilder.ModifyTrommel("minecraft", "gravel")
			.addEntry(new WeightedRandomLootObject(DEEPItems.niter.getDefaultStack(), 1, 2), 25);
		RecipeBuilder.ModifyTrommel("minecraft", "rich_dirt")
			.addEntry(new WeightedRandomLootObject(DEEPItems.rawSilver.getDefaultStack(), 1, 2), 11);
		RecipeBuilder.ModifyTrommel("minecraft", "rich_dirt")
			.addEntry(new WeightedRandomLootObject(DEEPItems.rawLead.getDefaultStack(), 1, 3), 11);
		RecipeBuilder.ModifyTrommel("minecraft", "rich_dirt")
			.addEntry(new WeightedRandomLootObject(DEEPItems.clayRed.getDefaultStack(), 4, 8), 11);
		RecipeBuilder.ModifyTrommel("minecraft", "sand")
			.addEntry(new WeightedRandomLootObject(DEEPItems.clayRed.getDefaultStack(), 4, 8), 30);
		RecipeBuilder.ModifyTrommel("minecraft", "sand")
			.addEntry(new WeightedRandomLootObject(DEEPItems.niter.getDefaultStack(), 1, 3), 10);
		RecipeBuilder.ModifyTrommel("minecraft", "dirt")
			.addEntry(new WeightedRandomLootObject(DEEPItems.niter.getDefaultStack(), 1, 3), 10);
		RecipeBuilder.ModifyTrommel("minecraft", "soulsand")
			.addEntry(new WeightedRandomLootObject(DEEPItems.rhodonite.getDefaultStack(), 2,6), 7);
		RecipeBuilder.Trommel(MOD_ID)
			.setInput(DEEPBlocks.netherrackRhodoniteOre)
			.addEntry(new WeightedRandomLootObject(new ItemStack(DEEPItems.rhodonite, 1), 4, 8), 30)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Blocks.COBBLE_NETHERRACK, 1), 1, 2), 20);
		RecipeBuilder.Trommel(MOD_ID)
			.setInput(DEEPBlocks.gloomstoneRhodoniteOre)
			.addEntry(new WeightedRandomLootObject(new ItemStack(DEEPItems.rhodonite, 1), 3, 6), 30)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Blocks.COBBLE_GLOOMSTONE, 1), 1, 2), 20);
		RecipeBuilder.Trommel(MOD_ID)
			.setInput(DEEPBlocks.basaltRhodoniteOre)
			.addEntry(new WeightedRandomLootObject(new ItemStack(DEEPItems.rhodonite, 1), 3, 6), 30)
			.addEntry(new WeightedRandomLootObject(new ItemStack(Blocks.COBBLE_BASALT, 1), 1, 2), 20);
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
		RecipeBuilder.getRecipeNamespace(MOD_ID);

	}
}
