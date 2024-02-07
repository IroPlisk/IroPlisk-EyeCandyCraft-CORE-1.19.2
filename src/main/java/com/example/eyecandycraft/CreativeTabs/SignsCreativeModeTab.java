package com.example.eyecandycraft.CreativeTabs;

import com.example.eyecandycraft.items.BasicItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class SignsCreativeModeTab extends CreativeModeTab {
    public static final SignsCreativeModeTab ECC_SIGNS_CREATIVE_MODE_TAB = new SignsCreativeModeTab(CreativeModeTab.TABS.length, "eyecandysigns");
    private SignsCreativeModeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BasicItems.PERIGEN.get());
    }

}
