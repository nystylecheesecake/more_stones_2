
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package glitchy_mc.ms2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import glitchy_mc.ms2.block.VerglasWallBlock;
import glitchy_mc.ms2.block.VerglasTilesBlock;
import glitchy_mc.ms2.block.VerglasTileWallBlock;
import glitchy_mc.ms2.block.VerglasTileStairsBlock;
import glitchy_mc.ms2.block.VerglasTileSlabBlock;
import glitchy_mc.ms2.block.VerglasStairsBlock;
import glitchy_mc.ms2.block.VerglasSlabBlock;
import glitchy_mc.ms2.block.VerglasPillarBlock;
import glitchy_mc.ms2.block.VerglasBricksBlock;
import glitchy_mc.ms2.block.VerglasBrickWallBlock;
import glitchy_mc.ms2.block.VerglasBrickStairsBlock;
import glitchy_mc.ms2.block.VerglasBlock;
import glitchy_mc.ms2.block.VergalsBrickSlabBlock;
import glitchy_mc.ms2.block.TravertineWallBlock;
import glitchy_mc.ms2.block.TravertineTilesBlock;
import glitchy_mc.ms2.block.TravertineTileWallBlock;
import glitchy_mc.ms2.block.TravertineTileStairsBlock;
import glitchy_mc.ms2.block.TravertineTileSlabBlock;
import glitchy_mc.ms2.block.TravertineStairsBlock;
import glitchy_mc.ms2.block.TravertineSlabBlock;
import glitchy_mc.ms2.block.TravertinePillarBlock;
import glitchy_mc.ms2.block.TravertineBricksBlock;
import glitchy_mc.ms2.block.TravertineBrickWallBlock;
import glitchy_mc.ms2.block.TravertineBrickStairsBlock;
import glitchy_mc.ms2.block.TravertineBrickSlabBlock;
import glitchy_mc.ms2.block.TravertineBlock;
import glitchy_mc.ms2.block.SoviteWallBlock;
import glitchy_mc.ms2.block.SoviteTilesBlock;
import glitchy_mc.ms2.block.SoviteTileWallBlock;
import glitchy_mc.ms2.block.SoviteTileStairsBlock;
import glitchy_mc.ms2.block.SoviteTileSlabBlock;
import glitchy_mc.ms2.block.SoviteStairsBlock;
import glitchy_mc.ms2.block.SoviteSlabBlock;
import glitchy_mc.ms2.block.SovitePillarBlock;
import glitchy_mc.ms2.block.SoviteBricksBlock;
import glitchy_mc.ms2.block.SoviteBrickWallBlock;
import glitchy_mc.ms2.block.SoviteBrickStairsBlock;
import glitchy_mc.ms2.block.SoviteBrickSlabBlock;
import glitchy_mc.ms2.block.SoviteBlock;
import glitchy_mc.ms2.block.SoulStoneWallBlock;
import glitchy_mc.ms2.block.SoulStoneTilesBlock;
import glitchy_mc.ms2.block.SoulStoneTileWallBlock;
import glitchy_mc.ms2.block.SoulStoneTileStairsBlock;
import glitchy_mc.ms2.block.SoulStoneTileSlabBlock;
import glitchy_mc.ms2.block.SoulStoneStairsBlock;
import glitchy_mc.ms2.block.SoulStoneSlabBlock;
import glitchy_mc.ms2.block.SoulStonePillarBlock;
import glitchy_mc.ms2.block.SoulStoneBricksBlock;
import glitchy_mc.ms2.block.SoulStoneBrickWAllBlock;
import glitchy_mc.ms2.block.SoulStoneBrickStairsBlock;
import glitchy_mc.ms2.block.SoulStoneBrickSlabBlock;
import glitchy_mc.ms2.block.SoulStoneBlock;
import glitchy_mc.ms2.block.SlateWallsBlock;
import glitchy_mc.ms2.block.SlateTilesBlock;
import glitchy_mc.ms2.block.SlateTileWallBlock;
import glitchy_mc.ms2.block.SlateTileStairsBlock;
import glitchy_mc.ms2.block.SlateTileSlabBlock;
import glitchy_mc.ms2.block.SlateStairsBlock;
import glitchy_mc.ms2.block.SlateSlabBlock;
import glitchy_mc.ms2.block.SlatePillarBlock;
import glitchy_mc.ms2.block.SlateBricksBlock;
import glitchy_mc.ms2.block.SlateBrickWallBlock;
import glitchy_mc.ms2.block.SlateBrickStairsBlock;
import glitchy_mc.ms2.block.SlateBrickSlabBlock;
import glitchy_mc.ms2.block.SlateBlock;
import glitchy_mc.ms2.block.PolishedVerglasWallBlock;
import glitchy_mc.ms2.block.PolishedVerglasStairsBlock;
import glitchy_mc.ms2.block.PolishedVerglasSlabBlock;
import glitchy_mc.ms2.block.PolishedVerglasPressurePlateBlock;
import glitchy_mc.ms2.block.PolishedVerglasButtonBlock;
import glitchy_mc.ms2.block.PolishedVerglasBlock;
import glitchy_mc.ms2.block.PolishedTravertineWallBlock;
import glitchy_mc.ms2.block.PolishedTravertineStairsBlock;
import glitchy_mc.ms2.block.PolishedTravertineSlabBlock;
import glitchy_mc.ms2.block.PolishedTravertinePressurePlateBlock;
import glitchy_mc.ms2.block.PolishedTravertineButtonBlock;
import glitchy_mc.ms2.block.PolishedTravertineBlock;
import glitchy_mc.ms2.block.PolishedSoviteWallBlock;
import glitchy_mc.ms2.block.PolishedSoviteStairsBlock;
import glitchy_mc.ms2.block.PolishedSoviteSlabBlock;
import glitchy_mc.ms2.block.PolishedSovitePressurePlateBlock;
import glitchy_mc.ms2.block.PolishedSoviteButtonBlock;
import glitchy_mc.ms2.block.PolishedSoviteBlock;
import glitchy_mc.ms2.block.PolishedSoulStoneWallBlock;
import glitchy_mc.ms2.block.PolishedSoulStoneTilesBlock;
import glitchy_mc.ms2.block.PolishedSoulStoneStairsBlock;
import glitchy_mc.ms2.block.PolishedSoulStoneSlabBlock;
import glitchy_mc.ms2.block.PolishedSoulStonePressurePlateBlock;
import glitchy_mc.ms2.block.PolishedSoulStoneButtonBlock;
import glitchy_mc.ms2.block.PolishedSlateWallBlock;
import glitchy_mc.ms2.block.PolishedSlateStairsBlock;
import glitchy_mc.ms2.block.PolishedSlateSlabBlock;
import glitchy_mc.ms2.block.PolishedSlatePressurePlateBlock;
import glitchy_mc.ms2.block.PolishedSlateButtonBlock;
import glitchy_mc.ms2.block.PolishedSlateBlock;
import glitchy_mc.ms2.block.PolishedNoriteWallBlock;
import glitchy_mc.ms2.block.PolishedNoriteStairsBlock;
import glitchy_mc.ms2.block.PolishedNoriteSlabBlock;
import glitchy_mc.ms2.block.PolishedNoritePressurePlateBlock;
import glitchy_mc.ms2.block.PolishedNoriteButtonBlock;
import glitchy_mc.ms2.block.PolishedNoriteBlock;
import glitchy_mc.ms2.block.PolishedLimestoneWallBlock;
import glitchy_mc.ms2.block.PolishedLimestoneStairsBlock;
import glitchy_mc.ms2.block.PolishedLimestoneSlabBlock;
import glitchy_mc.ms2.block.PolishedLimestonePressurePlateBlock;
import glitchy_mc.ms2.block.PolishedLimestoneButtonBlock;
import glitchy_mc.ms2.block.PolishedLimestoneBlock;
import glitchy_mc.ms2.block.PolishedLateriteWallBlock;
import glitchy_mc.ms2.block.PolishedLateriteStairBlock;
import glitchy_mc.ms2.block.PolishedLateriteSlabBlock;
import glitchy_mc.ms2.block.PolishedLateritePressurePlateBlock;
import glitchy_mc.ms2.block.PolishedLateriteButtonBlock;
import glitchy_mc.ms2.block.PolishedLateriteBlock;
import glitchy_mc.ms2.block.PolishedKimberliteWallBlock;
import glitchy_mc.ms2.block.PolishedKimberliteStairsBlock;
import glitchy_mc.ms2.block.PolishedKimberliteSlabBlock;
import glitchy_mc.ms2.block.PolishedKimberlitePressurePlateBlock;
import glitchy_mc.ms2.block.PolishedKimberliteButtonBlock;
import glitchy_mc.ms2.block.PolishedKimberliteBlock;
import glitchy_mc.ms2.block.NoriteWallBlock;
import glitchy_mc.ms2.block.NoriteTilesBlock;
import glitchy_mc.ms2.block.NoriteTileWallBlock;
import glitchy_mc.ms2.block.NoriteTileStairsBlock;
import glitchy_mc.ms2.block.NoriteTileSlabBlock;
import glitchy_mc.ms2.block.NoriteStairsBlock;
import glitchy_mc.ms2.block.NoriteSlabBlock;
import glitchy_mc.ms2.block.NoritePillarBlock;
import glitchy_mc.ms2.block.NoriteBricksBlock;
import glitchy_mc.ms2.block.NoriteBrickWallBlock;
import glitchy_mc.ms2.block.NoriteBrickStairsBlock;
import glitchy_mc.ms2.block.NoriteBrickSlabBlock;
import glitchy_mc.ms2.block.NoriteBlock;
import glitchy_mc.ms2.block.Ms2AnimateBlock;
import glitchy_mc.ms2.block.LimestoneWallBlock;
import glitchy_mc.ms2.block.LimestoneTilesBlock;
import glitchy_mc.ms2.block.LimestoneTileWallBlock;
import glitchy_mc.ms2.block.LimestoneTileStairsBlock;
import glitchy_mc.ms2.block.LimestoneTileSlabBlock;
import glitchy_mc.ms2.block.LimestoneStairsBlock;
import glitchy_mc.ms2.block.LimestoneSlabBlock;
import glitchy_mc.ms2.block.LimestonePillarBlock;
import glitchy_mc.ms2.block.LimestoneBricksBlock;
import glitchy_mc.ms2.block.LimestoneBrickWallBlock;
import glitchy_mc.ms2.block.LimestoneBrickStairsBlock;
import glitchy_mc.ms2.block.LimestoneBrickSlabBlock;
import glitchy_mc.ms2.block.LimestoneBlock;
import glitchy_mc.ms2.block.LateriteWallBlock;
import glitchy_mc.ms2.block.LateriteTilesBlock;
import glitchy_mc.ms2.block.LateriteTileWallBlock;
import glitchy_mc.ms2.block.LateriteTileStairsBlock;
import glitchy_mc.ms2.block.LateriteTileSlabBlock;
import glitchy_mc.ms2.block.LateriteStairsBlock;
import glitchy_mc.ms2.block.LateriteSlabBlock;
import glitchy_mc.ms2.block.LateritePillarBlock;
import glitchy_mc.ms2.block.LateriteBricksBlock;
import glitchy_mc.ms2.block.LateriteBrickWallBlock;
import glitchy_mc.ms2.block.LateriteBrickStairsBlock;
import glitchy_mc.ms2.block.LateriteBrickSlabBlock;
import glitchy_mc.ms2.block.LateriteBlock;
import glitchy_mc.ms2.block.KimerbliteStairsBlock;
import glitchy_mc.ms2.block.KimberliteWallBlock;
import glitchy_mc.ms2.block.KimberliteTilesBlock;
import glitchy_mc.ms2.block.KimberliteTileWallBlock;
import glitchy_mc.ms2.block.KimberliteTileStairsBlock;
import glitchy_mc.ms2.block.KimberliteTileSlabBlock;
import glitchy_mc.ms2.block.KimberliteSlabBlock;
import glitchy_mc.ms2.block.KimberlitePillarBlock;
import glitchy_mc.ms2.block.KimberliteBricksBlock;
import glitchy_mc.ms2.block.KimberliteBrickWallBlock;
import glitchy_mc.ms2.block.KimberliteBrickStairsBlock;
import glitchy_mc.ms2.block.KimberliteBrickSlabBlock;
import glitchy_mc.ms2.block.KimberliteBlock;
import glitchy_mc.ms2.block.CrackedVerglasBricksBlock;
import glitchy_mc.ms2.block.CrackedTravertineBricksBlock;
import glitchy_mc.ms2.block.CrackedSoviteBricksBlock;
import glitchy_mc.ms2.block.CrackedSoulStoneBricksBlock;
import glitchy_mc.ms2.block.CrackedSlateBricksBlock;
import glitchy_mc.ms2.block.CrackedNoriteBricksBlock;
import glitchy_mc.ms2.block.CrackedLimestoneBricksBlock;
import glitchy_mc.ms2.block.CrackedLateriteBricksBlock;
import glitchy_mc.ms2.block.CrackedKimberliteBricksBlock;
import glitchy_mc.ms2.block.ChiseledVerglasBricksBlock;
import glitchy_mc.ms2.block.ChiseledTravertineBricksBlock;
import glitchy_mc.ms2.block.ChiseledSoviteBricksBlock;
import glitchy_mc.ms2.block.ChiseledSoulStoneBricksBlock;
import glitchy_mc.ms2.block.ChiseledSlateBricksBlock;
import glitchy_mc.ms2.block.ChiseledNoriteBricksBlock;
import glitchy_mc.ms2.block.ChiseledLimestoneBricksBlock;
import glitchy_mc.ms2.block.ChiseledLateriteBricksBlock;
import glitchy_mc.ms2.block.ChiseledKimberliteBricksBlock;
import glitchy_mc.ms2.MoreStones2Mod;

public class MoreStones2ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreStones2Mod.MODID);
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE = REGISTRY.register("polished_limestone", () -> new PolishedLimestoneBlock());
	public static final RegistryObject<Block> LIMESTONE_BRICKS = REGISTRY.register("limestone_bricks", () -> new LimestoneBricksBlock());
	public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICKS = REGISTRY.register("cracked_limestone_bricks",
			() -> new CrackedLimestoneBricksBlock());
	public static final RegistryObject<Block> CHISELED_LIMESTONE_BRICKS = REGISTRY.register("chiseled_limestone_bricks",
			() -> new ChiseledLimestoneBricksBlock());
	public static final RegistryObject<Block> LIMESTONE_TILES = REGISTRY.register("limestone_tiles", () -> new LimestoneTilesBlock());
	public static final RegistryObject<Block> LIMESTONE_PILLAR = REGISTRY.register("limestone_pillar", () -> new LimestonePillarBlock());
	public static final RegistryObject<Block> LIMESTONE_STAIRS = REGISTRY.register("limestone_stairs", () -> new LimestoneStairsBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_STAIRS = REGISTRY.register("polished_limestone_stairs",
			() -> new PolishedLimestoneStairsBlock());
	public static final RegistryObject<Block> LIMESTONE_BRICK_STAIRS = REGISTRY.register("limestone_brick_stairs",
			() -> new LimestoneBrickStairsBlock());
	public static final RegistryObject<Block> LIMESTONE_TILE_STAIRS = REGISTRY.register("limestone_tile_stairs",
			() -> new LimestoneTileStairsBlock());
	public static final RegistryObject<Block> LIMESTONE_SLAB = REGISTRY.register("limestone_slab", () -> new LimestoneSlabBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_SLAB = REGISTRY.register("polished_limestone_slab",
			() -> new PolishedLimestoneSlabBlock());
	public static final RegistryObject<Block> LIMESTONE_BRICK_SLAB = REGISTRY.register("limestone_brick_slab", () -> new LimestoneBrickSlabBlock());
	public static final RegistryObject<Block> LIMESTONE_TILE_SLAB = REGISTRY.register("limestone_tile_slab", () -> new LimestoneTileSlabBlock());
	public static final RegistryObject<Block> LIMESTONE_WALL = REGISTRY.register("limestone_wall", () -> new LimestoneWallBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_WALL = REGISTRY.register("polished_limestone_wall",
			() -> new PolishedLimestoneWallBlock());
	public static final RegistryObject<Block> LIMESTONE_BRICK_WALL = REGISTRY.register("limestone_brick_wall", () -> new LimestoneBrickWallBlock());
	public static final RegistryObject<Block> LIMESTONE_TILE_WALL = REGISTRY.register("limestone_tile_wall", () -> new LimestoneTileWallBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_PRESSURE_PLATE = REGISTRY.register("polished_limestone_pressure_plate",
			() -> new PolishedLimestonePressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_BUTTON = REGISTRY.register("polished_limestone_button",
			() -> new PolishedLimestoneButtonBlock());
	public static final RegistryObject<Block> SLATE = REGISTRY.register("slate", () -> new SlateBlock());
	public static final RegistryObject<Block> POLISHED_SLATE = REGISTRY.register("polished_slate", () -> new PolishedSlateBlock());
	public static final RegistryObject<Block> SLATE_BRICKS = REGISTRY.register("slate_bricks", () -> new SlateBricksBlock());
	public static final RegistryObject<Block> CRACKED_SLATE_BRICKS = REGISTRY.register("cracked_slate_bricks", () -> new CrackedSlateBricksBlock());
	public static final RegistryObject<Block> CHISELED_SLATE_BRICKS = REGISTRY.register("chiseled_slate_bricks",
			() -> new ChiseledSlateBricksBlock());
	public static final RegistryObject<Block> SLATE_TILES = REGISTRY.register("slate_tiles", () -> new SlateTilesBlock());
	public static final RegistryObject<Block> SLATE_PILLAR = REGISTRY.register("slate_pillar", () -> new SlatePillarBlock());
	public static final RegistryObject<Block> SLATE_STAIRS = REGISTRY.register("slate_stairs", () -> new SlateStairsBlock());
	public static final RegistryObject<Block> POLISHED_SLATE_STAIRS = REGISTRY.register("polished_slate_stairs",
			() -> new PolishedSlateStairsBlock());
	public static final RegistryObject<Block> SLATE_BRICK_STAIRS = REGISTRY.register("slate_brick_stairs", () -> new SlateBrickStairsBlock());
	public static final RegistryObject<Block> SLATE_TILE_STAIRS = REGISTRY.register("slate_tile_stairs", () -> new SlateTileStairsBlock());
	public static final RegistryObject<Block> SLATE_SLAB = REGISTRY.register("slate_slab", () -> new SlateSlabBlock());
	public static final RegistryObject<Block> POLISHED_SLATE_SLAB = REGISTRY.register("polished_slate_slab", () -> new PolishedSlateSlabBlock());
	public static final RegistryObject<Block> SLATE_BRICK_SLAB = REGISTRY.register("slate_brick_slab", () -> new SlateBrickSlabBlock());
	public static final RegistryObject<Block> SLATE_TILE_SLAB = REGISTRY.register("slate_tile_slab", () -> new SlateTileSlabBlock());
	public static final RegistryObject<Block> SLATE_WALLS = REGISTRY.register("slate_walls", () -> new SlateWallsBlock());
	public static final RegistryObject<Block> POLISHED_SLATE_WALL = REGISTRY.register("polished_slate_wall", () -> new PolishedSlateWallBlock());
	public static final RegistryObject<Block> SLATE_BRICK_WALL = REGISTRY.register("slate_brick_wall", () -> new SlateBrickWallBlock());
	public static final RegistryObject<Block> SLATE_TILE_WALL = REGISTRY.register("slate_tile_wall", () -> new SlateTileWallBlock());
	public static final RegistryObject<Block> POLISHED_SLATE_PRESSURE_PLATE = REGISTRY.register("polished_slate_pressure_plate",
			() -> new PolishedSlatePressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_SLATE_BUTTON = REGISTRY.register("polished_slate_button",
			() -> new PolishedSlateButtonBlock());
	public static final RegistryObject<Block> NORITE = REGISTRY.register("norite", () -> new NoriteBlock());
	public static final RegistryObject<Block> POLISHED_NORITE = REGISTRY.register("polished_norite", () -> new PolishedNoriteBlock());
	public static final RegistryObject<Block> NORITE_BRICKS = REGISTRY.register("norite_bricks", () -> new NoriteBricksBlock());
	public static final RegistryObject<Block> CRACKED_NORITE_BRICKS = REGISTRY.register("cracked_norite_bricks",
			() -> new CrackedNoriteBricksBlock());
	public static final RegistryObject<Block> CHISELED_NORITE_BRICKS = REGISTRY.register("chiseled_norite_bricks",
			() -> new ChiseledNoriteBricksBlock());
	public static final RegistryObject<Block> NORITE_TILES = REGISTRY.register("norite_tiles", () -> new NoriteTilesBlock());
	public static final RegistryObject<Block> NORITE_PILLAR = REGISTRY.register("norite_pillar", () -> new NoritePillarBlock());
	public static final RegistryObject<Block> NORITE_STAIRS = REGISTRY.register("norite_stairs", () -> new NoriteStairsBlock());
	public static final RegistryObject<Block> POLISHED_NORITE_STAIRS = REGISTRY.register("polished_norite_stairs",
			() -> new PolishedNoriteStairsBlock());
	public static final RegistryObject<Block> NORITE_BRICK_STAIRS = REGISTRY.register("norite_brick_stairs", () -> new NoriteBrickStairsBlock());
	public static final RegistryObject<Block> NORITE_TILE_STAIRS = REGISTRY.register("norite_tile_stairs", () -> new NoriteTileStairsBlock());
	public static final RegistryObject<Block> NORITE_SLAB = REGISTRY.register("norite_slab", () -> new NoriteSlabBlock());
	public static final RegistryObject<Block> POLISHED_NORITE_SLAB = REGISTRY.register("polished_norite_slab", () -> new PolishedNoriteSlabBlock());
	public static final RegistryObject<Block> NORITE_BRICK_SLAB = REGISTRY.register("norite_brick_slab", () -> new NoriteBrickSlabBlock());
	public static final RegistryObject<Block> NORITE_TILE_SLAB = REGISTRY.register("norite_tile_slab", () -> new NoriteTileSlabBlock());
	public static final RegistryObject<Block> NORITE_WALL = REGISTRY.register("norite_wall", () -> new NoriteWallBlock());
	public static final RegistryObject<Block> POLISHED_NORITE_WALL = REGISTRY.register("polished_norite_wall", () -> new PolishedNoriteWallBlock());
	public static final RegistryObject<Block> NORITE_BRICK_WALL = REGISTRY.register("norite_brick_wall", () -> new NoriteBrickWallBlock());
	public static final RegistryObject<Block> NORITE_TILE_WALL = REGISTRY.register("norite_tile_wall", () -> new NoriteTileWallBlock());
	public static final RegistryObject<Block> POLISHED_NORITE_PRESSURE_PLATE = REGISTRY.register("polished_norite_pressure_plate",
			() -> new PolishedNoritePressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_NORITE_BUTTON = REGISTRY.register("polished_norite_button",
			() -> new PolishedNoriteButtonBlock());
	public static final RegistryObject<Block> TRAVERTINE = REGISTRY.register("travertine", () -> new TravertineBlock());
	public static final RegistryObject<Block> POLISHED_TRAVERTINE = REGISTRY.register("polished_travertine", () -> new PolishedTravertineBlock());
	public static final RegistryObject<Block> TRAVERTINE_BRICKS = REGISTRY.register("travertine_bricks", () -> new TravertineBricksBlock());
	public static final RegistryObject<Block> CRACKED_TRAVERTINE_BRICKS = REGISTRY.register("cracked_travertine_bricks",
			() -> new CrackedTravertineBricksBlock());
	public static final RegistryObject<Block> CHISELED_TRAVERTINE_BRICKS = REGISTRY.register("chiseled_travertine_bricks",
			() -> new ChiseledTravertineBricksBlock());
	public static final RegistryObject<Block> TRAVERTINE_TILES = REGISTRY.register("travertine_tiles", () -> new TravertineTilesBlock());
	public static final RegistryObject<Block> TRAVERTINE_PILLAR = REGISTRY.register("travertine_pillar", () -> new TravertinePillarBlock());
	public static final RegistryObject<Block> TRAVERTINE_STAIRS = REGISTRY.register("travertine_stairs", () -> new TravertineStairsBlock());
	public static final RegistryObject<Block> POLISHED_TRAVERTINE_STAIRS = REGISTRY.register("polished_travertine_stairs",
			() -> new PolishedTravertineStairsBlock());
	public static final RegistryObject<Block> TRAVERTINE_BRICK_STAIRS = REGISTRY.register("travertine_brick_stairs",
			() -> new TravertineBrickStairsBlock());
	public static final RegistryObject<Block> TRAVERTINE_TILE_STAIRS = REGISTRY.register("travertine_tile_stairs",
			() -> new TravertineTileStairsBlock());
	public static final RegistryObject<Block> TRAVERTINE_SLAB = REGISTRY.register("travertine_slab", () -> new TravertineSlabBlock());
	public static final RegistryObject<Block> POLISHED_TRAVERTINE_SLAB = REGISTRY.register("polished_travertine_slab",
			() -> new PolishedTravertineSlabBlock());
	public static final RegistryObject<Block> TRAVERTINE_BRICK_SLAB = REGISTRY.register("travertine_brick_slab",
			() -> new TravertineBrickSlabBlock());
	public static final RegistryObject<Block> TRAVERTINE_TILE_SLAB = REGISTRY.register("travertine_tile_slab", () -> new TravertineTileSlabBlock());
	public static final RegistryObject<Block> TRAVERTINE_WALL = REGISTRY.register("travertine_wall", () -> new TravertineWallBlock());
	public static final RegistryObject<Block> POLISHED_TRAVERTINE_WALL = REGISTRY.register("polished_travertine_wall",
			() -> new PolishedTravertineWallBlock());
	public static final RegistryObject<Block> TRAVERTINE_BRICK_WALL = REGISTRY.register("travertine_brick_wall",
			() -> new TravertineBrickWallBlock());
	public static final RegistryObject<Block> TRAVERTINE_TILE_WALL = REGISTRY.register("travertine_tile_wall", () -> new TravertineTileWallBlock());
	public static final RegistryObject<Block> POLISHED_TRAVERTINE_PRESSURE_PLATE = REGISTRY.register("polished_travertine_pressure_plate",
			() -> new PolishedTravertinePressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_TRAVERTINE_BUTTON = REGISTRY.register("polished_travertine_button",
			() -> new PolishedTravertineButtonBlock());
	public static final RegistryObject<Block> LATERITE = REGISTRY.register("laterite", () -> new LateriteBlock());
	public static final RegistryObject<Block> POLISHED_LATERITE = REGISTRY.register("polished_laterite", () -> new PolishedLateriteBlock());
	public static final RegistryObject<Block> LATERITE_BRICKS = REGISTRY.register("laterite_bricks", () -> new LateriteBricksBlock());
	public static final RegistryObject<Block> CRACKED_LATERITE_BRICKS = REGISTRY.register("cracked_laterite_bricks",
			() -> new CrackedLateriteBricksBlock());
	public static final RegistryObject<Block> CHISELED_LATERITE_BRICKS = REGISTRY.register("chiseled_laterite_bricks",
			() -> new ChiseledLateriteBricksBlock());
	public static final RegistryObject<Block> LATERITE_TILES = REGISTRY.register("laterite_tiles", () -> new LateriteTilesBlock());
	public static final RegistryObject<Block> LATERITE_PILLAR = REGISTRY.register("laterite_pillar", () -> new LateritePillarBlock());
	public static final RegistryObject<Block> LATERITE_STAIRS = REGISTRY.register("laterite_stairs", () -> new LateriteStairsBlock());
	public static final RegistryObject<Block> POLISHED_LATERITE_STAIR = REGISTRY.register("polished_laterite_stair",
			() -> new PolishedLateriteStairBlock());
	public static final RegistryObject<Block> LATERITE_BRICK_STAIRS = REGISTRY.register("laterite_brick_stairs",
			() -> new LateriteBrickStairsBlock());
	public static final RegistryObject<Block> LATERITE_TILE_STAIRS = REGISTRY.register("laterite_tile_stairs", () -> new LateriteTileStairsBlock());
	public static final RegistryObject<Block> LATERITE_SLAB = REGISTRY.register("laterite_slab", () -> new LateriteSlabBlock());
	public static final RegistryObject<Block> POLISHED_LATERITE_SLAB = REGISTRY.register("polished_laterite_slab",
			() -> new PolishedLateriteSlabBlock());
	public static final RegistryObject<Block> LATERITE_BRICK_SLAB = REGISTRY.register("laterite_brick_slab", () -> new LateriteBrickSlabBlock());
	public static final RegistryObject<Block> LATERITE_TILE_SLAB = REGISTRY.register("laterite_tile_slab", () -> new LateriteTileSlabBlock());
	public static final RegistryObject<Block> LATERITE_WALL = REGISTRY.register("laterite_wall", () -> new LateriteWallBlock());
	public static final RegistryObject<Block> POLISHED_LATERITE_WALL = REGISTRY.register("polished_laterite_wall",
			() -> new PolishedLateriteWallBlock());
	public static final RegistryObject<Block> LATERITE_BRICK_WALL = REGISTRY.register("laterite_brick_wall", () -> new LateriteBrickWallBlock());
	public static final RegistryObject<Block> LATERITE_TILE_WALL = REGISTRY.register("laterite_tile_wall", () -> new LateriteTileWallBlock());
	public static final RegistryObject<Block> POLISHED_LATERITE_PRESSURE_PLATE = REGISTRY.register("polished_laterite_pressure_plate",
			() -> new PolishedLateritePressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_LATERITE_BUTTON = REGISTRY.register("polished_laterite_button",
			() -> new PolishedLateriteButtonBlock());
	public static final RegistryObject<Block> KIMBERLITE = REGISTRY.register("kimberlite", () -> new KimberliteBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE = REGISTRY.register("polished_kimberlite", () -> new PolishedKimberliteBlock());
	public static final RegistryObject<Block> KIMBERLITE_BRICKS = REGISTRY.register("kimberlite_bricks", () -> new KimberliteBricksBlock());
	public static final RegistryObject<Block> CRACKED_KIMBERLITE_BRICKS = REGISTRY.register("cracked_kimberlite_bricks",
			() -> new CrackedKimberliteBricksBlock());
	public static final RegistryObject<Block> CHISELED_KIMBERLITE_BRICKS = REGISTRY.register("chiseled_kimberlite_bricks",
			() -> new ChiseledKimberliteBricksBlock());
	public static final RegistryObject<Block> KIMBERLITE_TILES = REGISTRY.register("kimberlite_tiles", () -> new KimberliteTilesBlock());
	public static final RegistryObject<Block> KIMBERLITE_PILLAR = REGISTRY.register("kimberlite_pillar", () -> new KimberlitePillarBlock());
	public static final RegistryObject<Block> KIMERBLITE_STAIRS = REGISTRY.register("kimerblite_stairs", () -> new KimerbliteStairsBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE_STAIRS = REGISTRY.register("polished_kimberlite_stairs",
			() -> new PolishedKimberliteStairsBlock());
	public static final RegistryObject<Block> KIMBERLITE_BRICK_STAIRS = REGISTRY.register("kimberlite_brick_stairs",
			() -> new KimberliteBrickStairsBlock());
	public static final RegistryObject<Block> KIMBERLITE_TILE_STAIRS = REGISTRY.register("kimberlite_tile_stairs",
			() -> new KimberliteTileStairsBlock());
	public static final RegistryObject<Block> KIMBERLITE_SLAB = REGISTRY.register("kimberlite_slab", () -> new KimberliteSlabBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE_SLAB = REGISTRY.register("polished_kimberlite_slab",
			() -> new PolishedKimberliteSlabBlock());
	public static final RegistryObject<Block> KIMBERLITE_BRICK_SLAB = REGISTRY.register("kimberlite_brick_slab",
			() -> new KimberliteBrickSlabBlock());
	public static final RegistryObject<Block> KIMBERLITE_TILE_SLAB = REGISTRY.register("kimberlite_tile_slab", () -> new KimberliteTileSlabBlock());
	public static final RegistryObject<Block> KIMBERLITE_WALL = REGISTRY.register("kimberlite_wall", () -> new KimberliteWallBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE_WALL = REGISTRY.register("polished_kimberlite_wall",
			() -> new PolishedKimberliteWallBlock());
	public static final RegistryObject<Block> KIMBERLITE_BRICK_WALL = REGISTRY.register("kimberlite_brick_wall",
			() -> new KimberliteBrickWallBlock());
	public static final RegistryObject<Block> KIMBERLITE_TILE_WALL = REGISTRY.register("kimberlite_tile_wall", () -> new KimberliteTileWallBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE_PRESSURE_PLATE = REGISTRY.register("polished_kimberlite_pressure_plate",
			() -> new PolishedKimberlitePressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE_BUTTON = REGISTRY.register("polished_kimberlite_button",
			() -> new PolishedKimberliteButtonBlock());
	public static final RegistryObject<Block> SOVITE = REGISTRY.register("sovite", () -> new SoviteBlock());
	public static final RegistryObject<Block> POLISHED_SOVITE = REGISTRY.register("polished_sovite", () -> new PolishedSoviteBlock());
	public static final RegistryObject<Block> SOVITE_BRICKS = REGISTRY.register("sovite_bricks", () -> new SoviteBricksBlock());
	public static final RegistryObject<Block> CRACKED_SOVITE_BRICKS = REGISTRY.register("cracked_sovite_bricks",
			() -> new CrackedSoviteBricksBlock());
	public static final RegistryObject<Block> CHISELED_SOVITE_BRICKS = REGISTRY.register("chiseled_sovite_bricks",
			() -> new ChiseledSoviteBricksBlock());
	public static final RegistryObject<Block> SOVITE_TILES = REGISTRY.register("sovite_tiles", () -> new SoviteTilesBlock());
	public static final RegistryObject<Block> SOVITE_PILLAR = REGISTRY.register("sovite_pillar", () -> new SovitePillarBlock());
	public static final RegistryObject<Block> SOVITE_STAIRS = REGISTRY.register("sovite_stairs", () -> new SoviteStairsBlock());
	public static final RegistryObject<Block> POLISHED_SOVITE_STAIRS = REGISTRY.register("polished_sovite_stairs",
			() -> new PolishedSoviteStairsBlock());
	public static final RegistryObject<Block> SOVITE_BRICK_STAIRS = REGISTRY.register("sovite_brick_stairs", () -> new SoviteBrickStairsBlock());
	public static final RegistryObject<Block> SOVITE_TILE_STAIRS = REGISTRY.register("sovite_tile_stairs", () -> new SoviteTileStairsBlock());
	public static final RegistryObject<Block> SOVITE_SLAB = REGISTRY.register("sovite_slab", () -> new SoviteSlabBlock());
	public static final RegistryObject<Block> POLISHED_SOVITE_SLAB = REGISTRY.register("polished_sovite_slab", () -> new PolishedSoviteSlabBlock());
	public static final RegistryObject<Block> SOVITE_BRICK_SLAB = REGISTRY.register("sovite_brick_slab", () -> new SoviteBrickSlabBlock());
	public static final RegistryObject<Block> SOVITE_TILE_SLAB = REGISTRY.register("sovite_tile_slab", () -> new SoviteTileSlabBlock());
	public static final RegistryObject<Block> SOVITE_WALL = REGISTRY.register("sovite_wall", () -> new SoviteWallBlock());
	public static final RegistryObject<Block> POLISHED_SOVITE_WALL = REGISTRY.register("polished_sovite_wall", () -> new PolishedSoviteWallBlock());
	public static final RegistryObject<Block> SOVITE_BRICK_WALL = REGISTRY.register("sovite_brick_wall", () -> new SoviteBrickWallBlock());
	public static final RegistryObject<Block> SOVITE_TILE_WALL = REGISTRY.register("sovite_tile_wall", () -> new SoviteTileWallBlock());
	public static final RegistryObject<Block> POLISHED_SOVITE_PRESSURE_PLATE = REGISTRY.register("polished_sovite_pressure_plate",
			() -> new PolishedSovitePressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_SOVITE_BUTTON = REGISTRY.register("polished_sovite_button",
			() -> new PolishedSoviteButtonBlock());
	public static final RegistryObject<Block> VERGLAS = REGISTRY.register("verglas", () -> new VerglasBlock());
	public static final RegistryObject<Block> POLISHED_VERGLAS = REGISTRY.register("polished_verglas", () -> new PolishedVerglasBlock());
	public static final RegistryObject<Block> VERGLAS_BRICKS = REGISTRY.register("verglas_bricks", () -> new VerglasBricksBlock());
	public static final RegistryObject<Block> CRACKED_VERGLAS_BRICKS = REGISTRY.register("cracked_verglas_bricks",
			() -> new CrackedVerglasBricksBlock());
	public static final RegistryObject<Block> CHISELED_VERGLAS_BRICKS = REGISTRY.register("chiseled_verglas_bricks",
			() -> new ChiseledVerglasBricksBlock());
	public static final RegistryObject<Block> VERGLAS_TILES = REGISTRY.register("verglas_tiles", () -> new VerglasTilesBlock());
	public static final RegistryObject<Block> VERGLAS_PILLAR = REGISTRY.register("verglas_pillar", () -> new VerglasPillarBlock());
	public static final RegistryObject<Block> VERGLAS_STAIRS = REGISTRY.register("verglas_stairs", () -> new VerglasStairsBlock());
	public static final RegistryObject<Block> POLISHED_VERGLAS_STAIRS = REGISTRY.register("polished_verglas_stairs",
			() -> new PolishedVerglasStairsBlock());
	public static final RegistryObject<Block> VERGLAS_BRICK_STAIRS = REGISTRY.register("verglas_brick_stairs", () -> new VerglasBrickStairsBlock());
	public static final RegistryObject<Block> VERGLAS_TILE_STAIRS = REGISTRY.register("verglas_tile_stairs", () -> new VerglasTileStairsBlock());
	public static final RegistryObject<Block> VERGLAS_SLAB = REGISTRY.register("verglas_slab", () -> new VerglasSlabBlock());
	public static final RegistryObject<Block> POLISHED_VERGLAS_SLAB = REGISTRY.register("polished_verglas_slab",
			() -> new PolishedVerglasSlabBlock());
	public static final RegistryObject<Block> VERGALS_BRICK_SLAB = REGISTRY.register("vergals_brick_slab", () -> new VergalsBrickSlabBlock());
	public static final RegistryObject<Block> VERGLAS_TILE_SLAB = REGISTRY.register("verglas_tile_slab", () -> new VerglasTileSlabBlock());
	public static final RegistryObject<Block> VERGLAS_WALL = REGISTRY.register("verglas_wall", () -> new VerglasWallBlock());
	public static final RegistryObject<Block> POLISHED_VERGLAS_WALL = REGISTRY.register("polished_verglas_wall",
			() -> new PolishedVerglasWallBlock());
	public static final RegistryObject<Block> VERGLAS_BRICK_WALL = REGISTRY.register("verglas_brick_wall", () -> new VerglasBrickWallBlock());
	public static final RegistryObject<Block> VERGLAS_TILE_WALL = REGISTRY.register("verglas_tile_wall", () -> new VerglasTileWallBlock());
	public static final RegistryObject<Block> POLISHED_VERGLAS_PRESSURE_PLATE = REGISTRY.register("polished_verglas_pressure_plate",
			() -> new PolishedVerglasPressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_VERGLAS_BUTTON = REGISTRY.register("polished_verglas_button",
			() -> new PolishedVerglasButtonBlock());
	public static final RegistryObject<Block> SOUL_STONE = REGISTRY.register("soul_stone", () -> new SoulStoneBlock());
	public static final RegistryObject<Block> POLISHED_SOUL_STONE_TILES = REGISTRY.register("polished_soul_stone_tiles",
			() -> new PolishedSoulStoneTilesBlock());
	public static final RegistryObject<Block> SOUL_STONE_BRICKS = REGISTRY.register("soul_stone_bricks", () -> new SoulStoneBricksBlock());
	public static final RegistryObject<Block> CRACKED_SOUL_STONE_BRICKS = REGISTRY.register("cracked_soul_stone_bricks",
			() -> new CrackedSoulStoneBricksBlock());
	public static final RegistryObject<Block> CHISELED_SOUL_STONE_BRICKS = REGISTRY.register("chiseled_soul_stone_bricks",
			() -> new ChiseledSoulStoneBricksBlock());
	public static final RegistryObject<Block> SOUL_STONE_TILES = REGISTRY.register("soul_stone_tiles", () -> new SoulStoneTilesBlock());
	public static final RegistryObject<Block> SOUL_STONE_PILLAR = REGISTRY.register("soul_stone_pillar", () -> new SoulStonePillarBlock());
	public static final RegistryObject<Block> SOUL_STONE_STAIRS = REGISTRY.register("soul_stone_stairs", () -> new SoulStoneStairsBlock());
	public static final RegistryObject<Block> POLISHED_SOUL_STONE_STAIRS = REGISTRY.register("polished_soul_stone_stairs",
			() -> new PolishedSoulStoneStairsBlock());
	public static final RegistryObject<Block> SOUL_STONE_BRICK_STAIRS = REGISTRY.register("soul_stone_brick_stairs",
			() -> new SoulStoneBrickStairsBlock());
	public static final RegistryObject<Block> SOUL_STONE_TILE_STAIRS = REGISTRY.register("soul_stone_tile_stairs",
			() -> new SoulStoneTileStairsBlock());
	public static final RegistryObject<Block> SOUL_STONE_SLAB = REGISTRY.register("soul_stone_slab", () -> new SoulStoneSlabBlock());
	public static final RegistryObject<Block> POLISHED_SOUL_STONE_SLAB = REGISTRY.register("polished_soul_stone_slab",
			() -> new PolishedSoulStoneSlabBlock());
	public static final RegistryObject<Block> SOUL_STONE_BRICK_SLAB = REGISTRY.register("soul_stone_brick_slab", () -> new SoulStoneBrickSlabBlock());
	public static final RegistryObject<Block> SOUL_STONE_TILE_SLAB = REGISTRY.register("soul_stone_tile_slab", () -> new SoulStoneTileSlabBlock());
	public static final RegistryObject<Block> SOUL_STONE_WALL = REGISTRY.register("soul_stone_wall", () -> new SoulStoneWallBlock());
	public static final RegistryObject<Block> POLISHED_SOUL_STONE_WALL = REGISTRY.register("polished_soul_stone_wall",
			() -> new PolishedSoulStoneWallBlock());
	public static final RegistryObject<Block> SOUL_STONE_BRICK_W_ALL = REGISTRY.register("soul_stone_brick_w_all",
			() -> new SoulStoneBrickWAllBlock());
	public static final RegistryObject<Block> SOUL_STONE_TILE_WALL = REGISTRY.register("soul_stone_tile_wall", () -> new SoulStoneTileWallBlock());
	public static final RegistryObject<Block> POLISHED_SOUL_STONE_PRESSURE_PLATE = REGISTRY.register("polished_soul_stone_pressure_plate",
			() -> new PolishedSoulStonePressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_SOUL_STONE_BUTTON = REGISTRY.register("polished_soul_stone_button",
			() -> new PolishedSoulStoneButtonBlock());
	public static final RegistryObject<Block> MS_2_ANIMATE = REGISTRY.register("ms_2_animate", () -> new Ms2AnimateBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PolishedLimestonePressurePlateBlock.registerRenderLayer();
			PolishedLimestoneButtonBlock.registerRenderLayer();
			PolishedSlatePressurePlateBlock.registerRenderLayer();
			PolishedSlateButtonBlock.registerRenderLayer();
			PolishedNoritePressurePlateBlock.registerRenderLayer();
			PolishedNoriteButtonBlock.registerRenderLayer();
			PolishedTravertinePressurePlateBlock.registerRenderLayer();
			PolishedTravertineButtonBlock.registerRenderLayer();
			PolishedLateritePressurePlateBlock.registerRenderLayer();
			PolishedLateriteButtonBlock.registerRenderLayer();
			PolishedVerglasPressurePlateBlock.registerRenderLayer();
			PolishedVerglasButtonBlock.registerRenderLayer();
			PolishedSoulStonePressurePlateBlock.registerRenderLayer();
			PolishedSoulStoneButtonBlock.registerRenderLayer();
		}
	}
}
