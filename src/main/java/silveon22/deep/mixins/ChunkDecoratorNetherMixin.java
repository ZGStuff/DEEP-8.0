package silveon22.deep.mixins;

import net.minecraft.core.block.BlockLogicFallingBlock;
import net.minecraft.core.block.BlockLogicOreNetherCoal;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.ChunkDecorationBuilder;
import net.minecraft.core.world.generate.chunk.ChunkFeatureDecorator;
import net.minecraft.core.world.generate.chunk.PlacementMethod;
import net.minecraft.core.world.generate.chunk.PositionSelectors;
import net.minecraft.core.world.generate.chunk.perlin.nether.ChunkDecoratorNether;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import net.minecraft.core.world.pos.TilePos;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import silveon22.deep.block.DEEPBlocks;
import silveon22.deep.block.ore.BlockLogicRhodoniteOre;

import java.util.Random;

@Mixin(value = ChunkDecoratorNether.class, remap = false)
public abstract class ChunkDecoratorNetherMixin extends ChunkFeatureDecorator{
	public ChunkDecoratorNetherMixin(@NotNull World world) {
		super(world);
	}

	@Inject(method = "registerDecorations", at = @At(value = "HEAD"))
	public void addCustomOre(CallbackInfo ci) {
		this.register(
			"deep:decoration/nether/default/rhodonite_ore",
			(new ChunkDecorationBuilder(new WorldFeatureOre(BlockLogicRhodoniteOre.variantMap, 12)))
				.withPositionSelector(PositionSelectors.HeightRangeUniform)
				.withPlacementMethod(new PlacementMethod.TriesPerChunk(10)));
	}
}
