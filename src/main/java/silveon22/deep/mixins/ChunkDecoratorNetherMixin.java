package silveon22.deep.mixins;

import net.minecraft.core.block.BlockLogicSand;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.nether.ChunkDecoratorNether;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import silveon22.deep.block.DEEPBlocks;

import java.util.Random;

@Mixin(value = ChunkDecoratorNether.class, remap = false)
public class ChunkDecoratorNetherMixin {
	@Shadow
	@Final
	private World world;

	@Inject(method = "decorate(Lnet/minecraft/core/world/chunk/Chunk;)V", at = @At(value = "TAIL"))
	public void addCustomOre(Chunk chunk, CallbackInfo ci) {
		BlockLogicSand.fallInstantly = true;

		int chunkX = chunk.xPosition;
		int chunkZ = chunk.zPosition;
		int minY = this.world.getWorldType().getMinY();
		int maxY = this.world.getWorldType().getMaxY();
		int rangeY = maxY + 1 - minY;
		Random rand = new Random((long)chunkX * 341873128712L + (long)chunkZ * 132897987541L);

		BlockLogicSand.fallInstantly = true;
		int x = chunkX * 16;
		int z = chunkZ * 16;

		for(int i = 0; i < 20	; ++i) {
			int xf = x + rand.nextInt(16);
			int yf = minY + rand.nextInt(rangeY - 8) + 4;
			int zf = z + rand.nextInt(16);
			(new WorldFeatureOre(Blocks.COBBLE_NETHERRACK_IGNEOUS.id(), 48)).place(this.world, rand, xf, yf, zf);
		}
		for(int i = 0; i < 12	; ++i) {
			int xf = x + rand.nextInt(16);
			int yf = minY + rand.nextInt(rangeY - 8) + 4;
			int zf = z + rand.nextInt(16);
			(new WorldFeatureOre(Blocks.SOULSAND.id(), 60)).place(this.world, rand, xf, yf, zf);
		}

		for(int i = 0; i < 20	; ++i) {
			int xf = x + rand.nextInt(16);
			int yf = minY + rand.nextInt(rangeY - 8) + 4;
			int zf = z + rand.nextInt(16);
			(new WorldFeatureOre(DEEPBlocks.netherrackRhodoniteOre.id(), 14)).place(this.world, rand, xf, yf, zf);
		}

		for(int i = 0; i < 7	; ++i) {
			int xf = x + rand.nextInt(16);
			int yf = minY + rand.nextInt(rangeY - 8) + 4;
			int zf = z + rand.nextInt(16);
			(new WorldFeatureOre(DEEPBlocks.netherrackSilverOre.id(), 10)).place(this.world, rand, xf, yf, zf);
		}

		BlockLogicSand.fallInstantly = false;
	}
}
