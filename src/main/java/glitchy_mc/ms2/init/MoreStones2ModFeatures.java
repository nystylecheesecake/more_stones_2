
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package glitchy_mc.ms2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import glitchy_mc.ms2.world.features.ores.VerglasFeature;
import glitchy_mc.ms2.world.features.ores.TravertineFeature;
import glitchy_mc.ms2.world.features.ores.SoviteFeature;
import glitchy_mc.ms2.world.features.ores.SoulStoneFeature;
import glitchy_mc.ms2.world.features.ores.SlateFeature;
import glitchy_mc.ms2.world.features.ores.NoriteFeature;
import glitchy_mc.ms2.world.features.ores.LimestoneFeature;
import glitchy_mc.ms2.world.features.ores.LateriteFeature;
import glitchy_mc.ms2.world.features.ores.KimberliteFeature;
import glitchy_mc.ms2.MoreStones2Mod;

@Mod.EventBusSubscriber
public class MoreStones2ModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MoreStones2Mod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> LIMESTONE = register("limestone", LimestoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LimestoneFeature.GENERATE_BIOMES, LimestoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SLATE = register("slate", SlateFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SlateFeature.GENERATE_BIOMES, SlateFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NORITE = register("norite", NoriteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NoriteFeature.GENERATE_BIOMES, NoriteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TRAVERTINE = register("travertine", TravertineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TravertineFeature.GENERATE_BIOMES, TravertineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LATERITE = register("laterite", LateriteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LateriteFeature.GENERATE_BIOMES, LateriteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> KIMBERLITE = register("kimberlite", KimberliteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, KimberliteFeature.GENERATE_BIOMES, KimberliteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SOVITE = register("sovite", SoviteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SoviteFeature.GENERATE_BIOMES, SoviteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VERGLAS = register("verglas", VerglasFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VerglasFeature.GENERATE_BIOMES, VerglasFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SOUL_STONE = register("soul_stone", SoulStoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SoulStoneFeature.GENERATE_BIOMES, SoulStoneFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
