package com.Saunderson.steamcraftrb.Item;

import com.Saunderson.steamcraftrb.creativetab.CreativeTabSCRB;
import com.Saunderson.steamcraftrb.reference.Material;
import net.minecraft.item.ItemSword;

public class ItemSteamSword extends ItemSCRB
{
    public ItemSteamSword()
    {
        super();
        this.setUnlocalizedName("steamSword");
        this.setCreativeTab(CreativeTabSCRB.SCRB_TAB);
        this.setTextureName("steamSword");
    }
}