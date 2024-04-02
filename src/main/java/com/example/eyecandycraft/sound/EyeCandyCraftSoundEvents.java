package com.example.eyecandycraft.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EyeCandyCraftSoundEvents {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS;
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CLAIRE_DE_LUNE;
    public static final RegistryObject<SoundEvent> MUSIC_DISC_DREAM_SWEET_IN_SEA_MAJOR;

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> {
            return new SoundEvent(new ResourceLocation("eyecandycraft", name));
        });
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

    static {
        SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "eyecandycraft");
        MUSIC_DISC_CLAIRE_DE_LUNE = registerSoundEvent("music_disc_claire_de_lune");
        MUSIC_DISC_DREAM_SWEET_IN_SEA_MAJOR = registerSoundEvent("music_disc_dream_sweet_in_sea_major");
    }
}
