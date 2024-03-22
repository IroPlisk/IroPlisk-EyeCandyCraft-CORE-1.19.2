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

    public static final RegistryObject<PaintingVariant> MICHELE = PAINTING_VARIANTS.register("michele",
            () -> new PaintingVariant(32, 32));

    public static void register(IEventBus eventBus){
        PAINTING_VARIANTS.register(eventBus);
    }
}
