package com.example.eyecandycraft.items;

import com.example.eyecandycraft.CreativeTabs.DiscsCreativeModeTab;
import com.example.eyecandycraft.CreativeTabs.SignsCreativeModeTab;
import com.example.eyecandycraft.EyeCandyCraft;
import com.example.eyecandycraft.sound.EyeCandyCraftSoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasicItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EyeCandyCraft.MODID);
    //Dischi musicali

    public static final RegistryObject<Item> MUSIC_DISC_CLAIRE_DE_LUNE = ITEMS.register("music_disc_claire_de_lune",
            () -> new RecordItem(4, EyeCandyCraftSoundEvents.MUSIC_DISC_CLAIRE_DE_LUNE, (new Item.Properties().rarity(Rarity.EPIC).tab(DiscsCreativeModeTab.ECC_DISCS_CREATIVE_MODE_TAB).stacksTo(1)), 7000));
    public static final RegistryObject<Item> MUSIC_DISC_DREAM_SWEET_IN_SEA_MAJOR = ITEMS.register("music_disc_dream_sweet_in_sea_major",
            () -> new RecordItem(4, EyeCandyCraftSoundEvents.MUSIC_DISC_DREAM_SWEET_IN_SEA_MAJOR, (new Item.Properties().rarity(Rarity.EPIC).tab(DiscsCreativeModeTab.ECC_DISCS_CREATIVE_MODE_TAB).stacksTo(1)), 7000));

    // cartelli pericolo
    public static final RegistryObject<Item> PERIGEN = ITEMS.register("perigen",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIAEA = ITEMS.register("periaea",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIASF = ITEMS.register("periasf",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIATEX = ITEMS.register("periatex",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIBAT = ITEMS.register("peribat",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIBIO = ITEMS.register("peribio",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERICRYO = ITEMS.register("pericryo",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIESPL = ITEMS.register("periespl",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIFOLG = ITEMS.register("perifolg",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIINF = ITEMS.register("periinf",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERILASER = ITEMS.register("perilaser",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIRAD = ITEMS.register("perirad",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERITORO = ITEMS.register("peritoro",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERITOX = ITEMS.register("peritox",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PERIVOLT = ITEMS.register("perivolt",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));

    // cartelli divieto

    public static final RegistryObject<Item> DIVACCESSO = ITEMS.register("divaccesso",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DIVFIAMMA = ITEMS.register("divfiamma",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DIVFIAMMACQ = ITEMS.register("divfiammacq",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DIVMANGIARE = ITEMS.register("divmangiare",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DIVPARKOUR = ITEMS.register("divparkour",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DIVPOTABILE = ITEMS.register("divpotabile",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DIVSPEGNERE = ITEMS.register("divspegnere",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DIVUMANI = ITEMS.register("divumani",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));

    // informazione
    public static final RegistryObject<Item> CABINAELETTRICA = ITEMS.register("cabinaelettrica",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CENTRALETERMICA = ITEMS.register("centraletermica",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DPI = ITEMS.register("dpi",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> DP1 = ITEMS.register("dpi1",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> INTERRUTTOREGENERALE = ITEMS.register("interruttoregenerale",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LOCALECALDAIE = ITEMS.register("localecaldaie",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LOCALEPOMPE = ITEMS.register("localepompe",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LOCALESERBATOI = ITEMS.register("localeserbatoi",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> MANUALE = ITEMS.register("manuale",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> PROPRIETAPRIVATA = ITEMS.register("proprietaprivata",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));


    // obblighi e arcobaleno(?)

    //public static final RegistryObject<Item> OBLPROTEZIONI = ITEMS.register("oblprotezioni",
    //        () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> OBLRIFIUTI = ITEMS.register("oblrifiuti",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> OBLRTFM = ITEMS.register("oblrtfm",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> ARCOBALENO = ITEMS.register("arcobaleno",
            () -> new Item(new Item.Properties().tab(SignsCreativeModeTab.ECC_SIGNS_CREATIVE_MODE_TAB)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
