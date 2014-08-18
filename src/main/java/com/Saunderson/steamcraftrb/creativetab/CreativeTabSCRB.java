package com.Saunderson.steamcraftrb.creativetab;


import com.Saunderson.steamcraftrb.init.ModItems;
import com.Saunderson.steamcraftrb.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSCRB
{
    public static final CreativeTabs SCRB_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.steamSword;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Steamcraft-ReBooted";
        }
    };
}
