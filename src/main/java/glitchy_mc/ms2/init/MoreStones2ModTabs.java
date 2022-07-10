
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package glitchy_mc.ms2.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MoreStones2ModTabs {
	public static CreativeModeTab TAB_MORE_STONE_II;

	public static void load() {
		TAB_MORE_STONE_II = new CreativeModeTab("tabmore_stone_ii") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MoreStones2ModBlocks.MS_2_ANIMATE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
