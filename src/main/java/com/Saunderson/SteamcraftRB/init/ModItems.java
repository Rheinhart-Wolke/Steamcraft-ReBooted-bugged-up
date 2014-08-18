package com.Saunderson.steamcraftrb.init;

import com.Saunderson.steamcraftrb.Item.ItemSCRB;
import com.Saunderson.steamcraftrb.Item.ItemSteamSword;
import com.Saunderson.steamcraftrb.Item.ItemWoodenStock;
import com.Saunderson.steamcraftrb.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemSCRB woodenStock = new ItemWoodenStock();
    public static final ItemSCRB steamSword = new ItemSteamSword();

    public static void init()
    {
        GameRegistry.registerItem(woodenStock, "woodenStock");
        GameRegistry.registerItem(steamSword, "steamSword");
    }
}
