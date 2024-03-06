package com.example.eyecandycraft.blocks;

import com.example.eyecandycraft.CreativeTabs.SignsCreativeModeTab;
import com.example.eyecandycraft.EyeCandyCraft;
import com.example.eyecandycraft.items.BasicItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EyeCandyCraft.MODID);

    // emergenza
    public static final RegistryObject<Block> EMERGENZA = registerBlock("emergenza",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> DOCCIA_EMERGENZA = registerBlock("docciaemergenza",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PRONTO_SOCCORSO = registerBlock("prontosoccorso",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> FRANGIVETRO = registerBlock("frangivetro",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> VETRO_FRANGIBILE = registerBlock("vetrofrangibile",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> RITORNO = registerBlock("ritrovo",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ALLARME = registerBlock("allarme",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ESTINTORE = registerBlock("estintore",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> SIRENA = registerBlock("sirena",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);

    // obblighi e arcobaleno

    public static final RegistryObject<Block> OBLPROTEZIONI = registerBlock("oblprotezioni",
            () -> new SquareSignBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops().noOcclusion()), SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return BasicItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
