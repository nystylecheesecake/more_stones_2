
package glitchy_mc.ms2.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import glitchy_mc.ms2.init.MoreStones2ModTabs;
import glitchy_mc.ms2.init.MoreStones2ModSounds;

public class MusicDiscStonesItem extends RecordItem {
	public MusicDiscStonesItem() {
		super(0, MoreStones2ModSounds.REGISTRY.get(new ResourceLocation("more_stones_2:stones_soundtrack")),
				new Item.Properties().tab(MoreStones2ModTabs.TAB_MORE_STONE_II).stacksTo(1).rarity(Rarity.RARE));
	}
}
