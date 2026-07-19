package silveon22.deep.mixins;

import net.minecraft.core.block.BlockLogicFallingBlock;
import net.minecraft.core.world.World;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import net.minecraft.core.world.pos.TilePos;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import silveon22.deep.block.ore.BlockLogicAmethystOre;
import silveon22.deep.block.ore.BlockLogicLeadOre;
import silveon22.deep.block.ore.BlockLogicSilverOre;
import silveon22.deep.block.ore.BlockLogicUraniumOre;

import java.util.Random;

@Mixin(value = ChunkDecoratorOverworld.class, remap = false)
public class ChunkDecoratorOverworldMixin {
	@Shadow
	@Final
	private World world;

	@Inject(method = "decorate(Lnet/minecraft/core/world/chunk/Chunk;)V", at = @At(value = "TAIL"))
	public void addCustomOre(Chunk chunk, CallbackInfo ci) {
		BlockLogicFallingBlock.fallInstantly = true;

		int chunkX = chunk.pos.x;
		int chunkZ = chunk.pos.z;
		int minY = this.world.getWorldType().getMinY(this.world);
		int maxY = this.world.getWorldType().getMaxY(this.world);
		int rangeY = maxY + 1 - minY;
		float oreHeightModifier = (float)rangeY / 128.0F;
		Random rand = new Random((long)chunkX * 341873898712L + (long)chunkZ * 132696981241L);

		BlockLogicFallingBlock.fallInstantly = true;
		int x = chunkX * 16;
		int z = chunkZ * 16;

		for(int i4 = 0; (float)i4 < oreHeightModifier; ++i4) {
			int j7 = x + rand.nextInt(16);
			int k10 = minY + rand.nextInt(rangeY / 8);
			int j13 = z + rand.nextInt(16);
			TilePos queryPos = new TilePos(j7, k10, j13);
			(new WorldFeatureOre(BlockLogicAmethystOre.variantMap, 7)).place(this.world, rand, queryPos);
		}

		for(int k3 = 0; (float)k3 < 2.0F * oreHeightModifier; ++k3) {
			int l6 = x + rand.nextInt(16);
			int i10 = minY + rand.nextInt(rangeY / 6);
			int l12 = z + rand.nextInt(16);
			TilePos queryPos = new TilePos(l6, i10, l12);
			(new WorldFeatureOre(BlockLogicSilverOre.variantMap, 8)).place(this.world, rand, queryPos);
		}

		for(int i4 = 0; (float)i4 < oreHeightModifier; ++i4) {
			int j7 = x + rand.nextInt(16);
			int k10 = minY + rand.nextInt(rangeY / 4);
			int j13 = z + rand.nextInt(16);
			TilePos queryPos = new TilePos(j7, k10, j13);
			(new WorldFeatureOre(BlockLogicUraniumOre.variantMap, 5)).place(this.world, rand, queryPos);
		}

		for(int j3 = 0; (float)j3 < 8.0F * oreHeightModifier; ++j3) {
			int k6 = x + rand.nextInt(16);
			int l9 = minY + rand.nextInt(rangeY / 4);
			int k12 = z + rand.nextInt(16);
			TilePos queryPos = new TilePos(k6, l9, k12);
			(new WorldFeatureOre(BlockLogicLeadOre.variantMap, 7)).place(this.world, rand, queryPos);
		}


		BlockLogicFallingBlock.fallInstantly = false;
	}

}
