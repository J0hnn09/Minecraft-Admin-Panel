
package net.mcreator.obsidianarmor.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.obsidianarmor.ObsidianArmorModElements;

@ObsidianArmorModElements.ModElement.Tag
public class MysidianKeyItem extends ObsidianArmorModElements.ModElement {
	@ObjectHolder("obsidian_armor:mysidian_key")
	public static final Item block = null;

	public MysidianKeyItem(ObsidianArmorModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("mysidian_key");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
