package com.example.eyecandycraft.painting;

import com.example.eyecandycraft.EyeCandyCraft;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EyeCandyCraftPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, EyeCandyCraft.MODID);


    // 4x4
    public static final RegistryObject<PaintingVariant> LENIN_GIOVANE = PAINTING_VARIANTS.register("lenin_giovane",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> INGSOC = PAINTING_VARIANTS.register("ingsoc",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> BIGBRO = PAINTING_VARIANTS.register("bigbro",
            () -> new PaintingVariant(64, 64));

    // 4x3
    public static final RegistryObject<PaintingVariant> BIGSIS = PAINTING_VARIANTS.register("bigsis",
            () -> new PaintingVariant(64, 48));
    public static final RegistryObject<PaintingVariant> SPACCCP = PAINTING_VARIANTS.register("spacccp",
            () -> new PaintingVariant(64, 48));
    public static final RegistryObject<PaintingVariant> SOGNO = PAINTING_VARIANTS.register("sogno",
            () -> new PaintingVariant(64, 48));


    //4x2
    public static final RegistryObject<PaintingVariant> TAVOLA_PERIODICA = PAINTING_VARIANTS.register("tavola_periodica",
            () -> new PaintingVariant(64, 32));

    //2x2
    public static final RegistryObject<PaintingVariant> MICHELE = PAINTING_VARIANTS.register("michele",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> CCCPENERGY = PAINTING_VARIANTS.register("cccpenergy",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> SMOLBRO = PAINTING_VARIANTS.register("smolbro",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> SOGNI_INFRANTI = PAINTING_VARIANTS.register("sogni_infranti",
            () -> new PaintingVariant(32, 32));


    //1x2
    public static final RegistryObject<PaintingVariant> STARSKY = PAINTING_VARIANTS.register("starsky",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> SOZHIALIZM = PAINTING_VARIANTS.register("sozhializm",
            () -> new PaintingVariant(16, 32));

    //1x1
    public static final RegistryObject<PaintingVariant> SMOLSOC = PAINTING_VARIANTS.register("smolsoc",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> BLACKMESA = PAINTING_VARIANTS.register("blackmesa",
            () -> new PaintingVariant(16, 16));


    public static void register(IEventBus eventBus){
        PAINTING_VARIANTS.register(eventBus);
    }
}
