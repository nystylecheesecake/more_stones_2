
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package glitchy_mc.ms2.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreStones2ModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("more_stones_2", "the_underground_soundtrack"),
				new SoundEvent(new ResourceLocation("more_stones_2", "the_underground_soundtrack")));
		REGISTRY.put(new ResourceLocation("more_stones_2", "stones_soundtrack"),
				new SoundEvent(new ResourceLocation("more_stones_2", "stones_soundtrack")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
