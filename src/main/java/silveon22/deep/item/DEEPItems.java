package silveon22.deep.item;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.*;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.ItemInitEntrypoint;

import static silveon22.deep.Deep.MOD_ID;

public class DEEPItems implements ItemInitEntrypoint {
	private static int baseID = 182042;


	public static int getBaseID() {
		return baseID;
	}

	public static void setBaseID(int baseID) {
		DEEPItems.baseID = baseID;
	}

	public static ArmorMaterial amethyst_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "amethyst", 55, 80.0F, 80.0F, 80.0F, 80.0F);
	public static ArmorMaterial silver_Armor = ArmorHelper.createArmorMaterial(MOD_ID, "silver", 160, 60.0F, 50.0F, 50.0F, 40.0F);

	public static Item rhodonite;
	public static Item amethyst;
	public static Item amethystPickaxe;
	public static Item amethystAxe;
	public static Item amethystSword;
	public static Item amethystShovel;
	public static Item amethystHoe;
	public static Item amethystHelmet;
	public static Item amethystChestplate;
	public static Item amethystLeggings;
	public static Item amethystBoots;
	public static Item rawSilver;
	public static Item ingotSilver;
	public static Item silverHelmet;
	public static Item silverChestplate;
	public static Item silverLeggings;
	public static Item silverBoots;
	public static Item silverPickaxe;
	public static Item silverAxe;
	public static Item silverSword;
	public static Item silverShovel;
	public static Item silverHoe;
	public static Item uranium;
	public static Item rawLead;
	public static Item ingotLead;
	public static Item leadPickaxe;
	public static Item leadAxe;
	public static Item leadSword;
	public static Item leadShovel;
	public static Item leadHoe;
	public static Item clayRed;
	public static Item clayBrickBlue;
	public static Item niter;
	public static Item topaz;

	@Override
	public void afterItemInit() {
		rhodonite = new ItemBuilder(MOD_ID)
			.build(new Item("rhodonite", MOD_ID + ":item/rhodonite", 28043));
		amethyst = new ItemBuilder(MOD_ID)
			.build(new Item("amethyst", MOD_ID + ":item/amethyst", 28044));
		amethystPickaxe = new ItemBuilder(MOD_ID)
			.build(new ItemToolPickaxe("amethystpickaxe", MOD_ID + ":item/amethyst_pickaxe", 28045, new ToolMaterial().setDurability(96).setEfficiency(55.0F, 100.0F).setMiningLevel(3).setDamage(5).setBlockHitDelay(0)));
		amethystAxe = new ItemBuilder(MOD_ID)
			.build(new ItemToolAxe("amethystaxe", MOD_ID + ":item/amethyst_axe", 28046, new ToolMaterial().setDurability(96).setEfficiency(55.0F, 100.0F).setMiningLevel(3).setDamage(5).setBlockHitDelay(0)));
		amethystSword = new ItemBuilder(MOD_ID)
			.build(new ItemToolSword("amethystsword", MOD_ID + ":item/amethyst_sword", 28047, new ToolMaterial().setDurability(24).setEfficiency(55.0F, 100.0F).setMiningLevel(3).setDamage(10).setBlockHitDelay(0)));
		amethystShovel = new ItemBuilder(MOD_ID)
			.build(new ItemToolShovel("amethystshovel", MOD_ID + ":item/amethyst_shovel", 28048, new ToolMaterial().setDurability(96).setEfficiency(55.0F, 100.0F).setMiningLevel(3).setDamage(5).setBlockHitDelay(0)));
		amethystHoe = new ItemBuilder(MOD_ID)
			.build(new ItemToolHoe("amethysthoe", MOD_ID + ":item/amethyst_hoe", 28049, new ToolMaterial().setDurability(96).setEfficiency(55.0F, 100.0F).setMiningLevel(3).setDamage(5).setBlockHitDelay(0)));
		amethystHelmet = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("amethysthelmet", "silveon22.deep:item/armor/amethyst_helmet", 28050, amethyst_Armor, 3));
		amethystChestplate = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("amethystchestplate", "silveon22.deep:item/armor/amethyst_chestplate", 28051, amethyst_Armor, 2));
		amethystLeggings = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("amethystleggings", "silveon22.deep:item/armor/amethyst_leggings", 28052, amethyst_Armor, 1));
		amethystBoots = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("amethystboots", "silveon22.deep:item/armor/amethyst_boots", 28053, amethyst_Armor, 0));
		rawSilver = new ItemBuilder(MOD_ID)
			.build(new Item("rawsilver", MOD_ID + ":item/raw_silver", 28054));
		ingotSilver = new ItemBuilder(MOD_ID)
			.build(new Item("ingotsilver", MOD_ID + ":item/ingot_silver", 28055));
		silverHelmet = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("silverhelmet", "silveon22.deep:item/armor/silver_helmet", 28056, silver_Armor, 3));
		silverChestplate = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("silverchestplate", "silveon22.deep:item/armor/silver_chestplate", 28057, silver_Armor, 2));
		silverLeggings = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("silverleggings", "silveon22.deep:item/armor/silver_leggings", 28058, silver_Armor, 1));
		silverBoots = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("silverboots", "silveon22.deep:item/armor/silver_boots", 28059, silver_Armor, 0));
		silverPickaxe = new ItemBuilder(MOD_ID)
			.build(new ItemToolPickaxe("silverpickaxe", MOD_ID + ":item/silver_pickaxe", 28060, new ToolMaterial().setDurability(512).setEfficiency(4.0F, 9.0F).setMiningLevel(2).setSilkTouch(true)));
		silverAxe = new ItemBuilder(MOD_ID)
			.build(new ItemToolAxe("silveraxe", MOD_ID + ":item/silver_axe", 28061, new ToolMaterial().setDurability(512).setEfficiency(4.0F, 9.0F).setMiningLevel(2).setSilkTouch(true)));
		silverSword = new ItemBuilder(MOD_ID)
			.build(new ItemToolSword("silversword", MOD_ID + ":item/silver_sword", 28062, new ToolMaterial().setDurability(512).setEfficiency(4.0F, 9.0F).setMiningLevel(2).setSilkTouch(true).setDamage(2)));
		silverShovel = new ItemBuilder(MOD_ID)
			.build(new ItemToolShovel("silvershovel", MOD_ID + ":item/silver_shovel", 28063, new ToolMaterial().setDurability(512).setEfficiency(4.0F, 9.0F).setMiningLevel(2).setSilkTouch(true)));
		silverHoe = new ItemBuilder(MOD_ID)
			.build(new ItemToolHoe("silverhoe", MOD_ID + ":item/silver_hoe", 28064, new ToolMaterial().setDurability(512).setEfficiency(4.0F, 9.0F).setMiningLevel(2).setSilkTouch(true)));
		uranium = new ItemBuilder(MOD_ID)
			.build(new Item("uranium", MOD_ID + ":item/uranium", 28065));
		rawLead = new ItemBuilder(MOD_ID)
			.build(new Item("rawlead", MOD_ID + ":item/raw_lead", 28066));
		ingotLead = new ItemBuilder(MOD_ID)
			.build(new Item("ingotlead", MOD_ID + ":item/ingot_lead", 28067));
		leadPickaxe = new ItemBuilder(MOD_ID)
			.build(new ItemToolPickaxe("leadpickaxe", MOD_ID + ":item/lead_pickaxe", 28068, new ToolMaterial().setDurability(512).setEfficiency(7.0F, 10.0F).setMiningLevel(2)));
		leadAxe = new ItemBuilder(MOD_ID)
			.build(new ItemToolAxe("leadaxe", MOD_ID + ":item/lead_axe", 28069, new ToolMaterial().setDurability(512).setEfficiency(7.0F, 10.0F).setMiningLevel(2)));
		leadSword = new ItemBuilder(MOD_ID)
			.build(new ItemToolSword("leadsword", MOD_ID + ":item/lead_sword", 28071, new ToolMaterial().setDurability(512).setEfficiency(7.0F, 10.0F).setMiningLevel(2).setDamage(3)));
		leadShovel = new ItemBuilder(MOD_ID)
			.build(new ItemToolShovel("leadshovel", MOD_ID + ":item/lead_shovel", 28072, new ToolMaterial().setDurability(512).setEfficiency(7.0F, 10.0F).setMiningLevel(2)));
		leadHoe = new ItemBuilder(MOD_ID)
			.build(new ItemToolHoe("leadhoe", MOD_ID + ":item/lead_hoe", 28073, new ToolMaterial().setDurability(512).setEfficiency(7.0F, 10.0F).setMiningLevel(2)));
		clayRed = new ItemBuilder(MOD_ID)
			.build(new Item("clayred", MOD_ID + ":item/clay_red", 28074));
		clayBrickBlue = new ItemBuilder(MOD_ID)
			.build(new Item("claybrickblue", MOD_ID + ":item/clay_brick_blue", 28075));
		niter = new ItemBuilder(MOD_ID)
			.build(new Item("niter", MOD_ID + ":item/niter", 28076));
		topaz = new ItemBuilder(MOD_ID)
			.build(new Item("topaz", MOD_ID + ":item/topaz", 28077));
	}
}
