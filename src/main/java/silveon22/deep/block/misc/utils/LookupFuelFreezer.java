package silveon22.deep.block.misc.utils;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.Items;

public class LookupFuelFreezer {
	public static final silveon22.deep.block.misc.utils.LookupFuelFreezer instance = new silveon22.deep.block.misc.utils.LookupFuelFreezer();
	protected final Map<Integer, Integer> fuelList = new HashMap();

	protected LookupFuelFreezer() {
		this.register();
	}

	protected void register() {
		this.addFuelEntry(Blocks.ICE.id(), 400);
		this.addFuelEntry(Blocks.BLOCK_SNOW.id(), 200);
		this.addFuelEntry(Items.AMMO_SNOWBALL.id, 50);
	}

	public void addFuelEntry(int id, int fuelYield) {
		this.fuelList.put(id, fuelYield);
	}

	public int getFuelYield(int id) {
		return this.fuelList.get(id) == null ? 0 : (Integer)this.fuelList.get(id);
	}

	public Map<Integer, Integer> getFuelList() {
		return this.fuelList;
	}
}
