package com.Saunderson.SteamcraftRB.init;

import com.Saunderson.SteamcraftRB.Item.ItemSCRB;
import com.Saunderson.SteamcraftRB.Item.ItemWoodenStock;
import com.Saunderson.SteamcraftRB.reference.reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(reference.MOD_ID)
public class ModItems
{
    public static final ItemSCRB woodenStock = new ItemWoodenStock();


    public static void init()
    {
        GameRegistry.registerItem(woodenStock, "woodenStock");
    }
}