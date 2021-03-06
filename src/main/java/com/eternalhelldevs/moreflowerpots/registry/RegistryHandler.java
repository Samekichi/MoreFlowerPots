package com.eternalhelldevs.moreflowerpots.registry;

import com.eternalhelldevs.moreflowerpots.blocks.TemplatePotBlock;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryHandler {
    public static final String ModIdentifier = "more_flower_pots";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(ModIdentifier, "item_group"))
            .icon(() -> new ItemStack(Items.FLOWER_POT))
            .build();
    public static final Block WHITE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block ORANGE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block MAGENTA_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block LIGHT_BLUE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block YELLOW_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block LIME_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block PINK_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block GRAY_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block LIGHT_GRAY_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block CYAN_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block PURPLE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block BLUE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block BROWN_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block GREEN_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block RED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block BLACK_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block IRON_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block GOLD_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block WHITE_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block ORANGE_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block MAGENTA_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block LIGHT_BLUE_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block YELLOW_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block LIME_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block PINK_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block GRAY_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block LIGHT_GRAY_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block CYAN_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block PURPLE_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block BLUE_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block BROWN_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block GREEN_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block RED_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());
    public static final Block BLACK_GLAZED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.SUPPORTED).strength(0.0f).nonOpaque());

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "white_flower_pot"), WHITE_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "white_flower_pot"), new BlockItem(WHITE_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "orange_flower_pot"), ORANGE_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "orange_flower_pot"), new BlockItem(ORANGE_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "magenta_flower_pot"), MAGENTA_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "magenta_flower_pot"), new BlockItem(MAGENTA_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "light_blue_flower_pot"), LIGHT_BLUE_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "light_blue_flower_pot"), new BlockItem(LIGHT_BLUE_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "yellow_flower_pot"), YELLOW_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "yellow_flower_pot"), new BlockItem(YELLOW_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "lime_flower_pot"), LIME_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "lime_flower_pot"), new BlockItem(LIME_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "pink_flower_pot"), PINK_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "pink_flower_pot"), new BlockItem(PINK_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "gray_flower_pot"), GRAY_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "gray_flower_pot"), new BlockItem(GRAY_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "light_gray_flower_pot"), LIGHT_GRAY_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "light_gray_flower_pot"), new BlockItem(LIGHT_GRAY_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "cyan_flower_pot"), CYAN_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "cyan_flower_pot"), new BlockItem(CYAN_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "purple_flower_pot"), PURPLE_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "purple_flower_pot"), new BlockItem(PURPLE_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "blue_flower_pot"), BLUE_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "blue_flower_pot"), new BlockItem(BLUE_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "brown_flower_pot"), BROWN_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "brown_flower_pot"), new BlockItem(BROWN_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "green_flower_pot"), GREEN_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "green_flower_pot"), new BlockItem(GREEN_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "red_flower_pot"), RED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "red_flower_pot"), new BlockItem(RED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "black_flower_pot"), BLACK_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "black_flower_pot"), new BlockItem(BLACK_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "iron_flower_pot"), IRON_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "iron_flower_pot"), new BlockItem(IRON_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "gold_flower_pot"), GOLD_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "gold_flower_pot"), new BlockItem(GOLD_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "white_glazed_flower_pot"), WHITE_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "white_glazed_flower_pot"), new BlockItem(WHITE_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "orange_glazed_flower_pot"), ORANGE_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "orange_glazed_flower_pot"), new BlockItem(ORANGE_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "magenta_glazed_flower_pot"), MAGENTA_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "magenta_glazed_flower_pot"), new BlockItem(MAGENTA_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "light_blue_glazed_flower_pot"), LIGHT_BLUE_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "light_blue_glazed_flower_pot"), new BlockItem(LIGHT_BLUE_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "yellow_glazed_flower_pot"), YELLOW_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "yellow_glazed_flower_pot"), new BlockItem(YELLOW_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "lime_glazed_flower_pot"), LIME_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "lime_glazed_flower_pot"), new BlockItem(LIME_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "pink_glazed_flower_pot"), PINK_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "pink_glazed_flower_pot"), new BlockItem(PINK_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "gray_glazed_flower_pot"), GRAY_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "gray_glazed_flower_pot"), new BlockItem(GRAY_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "light_gray_glazed_flower_pot"), LIGHT_GRAY_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "light_gray_glazed_flower_pot"), new BlockItem(LIGHT_GRAY_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "cyan_glazed_flower_pot"), CYAN_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "cyan_glazed_flower_pot"), new BlockItem(CYAN_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "purple_glazed_flower_pot"), PURPLE_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "purple_glazed_flower_pot"), new BlockItem(PURPLE_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "blue_glazed_flower_pot"), BLUE_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "blue_glazed_flower_pot"), new BlockItem(BLUE_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "brown_glazed_flower_pot"), BROWN_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "brown_glazed_flower_pot"), new BlockItem(BROWN_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "green_glazed_flower_pot"), GREEN_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "green_glazed_flower_pot"), new BlockItem(GREEN_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "red_glazed_flower_pot"), RED_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "red_glazed_flower_pot"), new BlockItem(RED_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(ModIdentifier, "black_glazed_flower_pot"), BLACK_GLAZED_FLOWER_POT);
        Registry.register(Registry.ITEM, new Identifier(ModIdentifier, "black_glazed_flower_pot"), new BlockItem(BLACK_GLAZED_FLOWER_POT, new Item.Settings().group(ITEM_GROUP)));
    }
}
