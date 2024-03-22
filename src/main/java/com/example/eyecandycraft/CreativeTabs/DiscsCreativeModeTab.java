package com.example.eyecandycraft.CreativeTabs;

import com.example.eyecandycraft.items.BasicItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DiscsCreativeModeTab extends CreativeModeTab {
    public static final DiscsCreativeModeTab ECC_DISCS_CREATIVE_MODE_TAB = new DiscsCreativeModeTab(CreativeModeTab.TABS.length, "eyecandydiscs");
    private DiscsCreativeModeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BasicItems.MUSIC_DISC_CLAIRE_DE_LUNE.get());
    }

}
