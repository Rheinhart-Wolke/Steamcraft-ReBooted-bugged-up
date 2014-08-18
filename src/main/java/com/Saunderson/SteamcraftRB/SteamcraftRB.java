package com.Saunderson.steamcraftrb;


import com.Saunderson.steamcraftrb.handler.ConfigurationHandler;
import com.Saunderson.steamcraftrb.init.ModItems;
import com.Saunderson.steamcraftrb.proxy.IProxy;
import com.Saunderson.steamcraftrb.reference.Reference;
import com.Saunderson.steamcraftrb.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory= Reference.GUI_FACTORY_CLASS)

public class SteamcraftRB
{
    @Mod.Instance(Reference.MOD_ID)
    public static SteamcraftRB instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Blocks, Items, Server Networking, ext..
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModItems.init();
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // recipes, gui's, tile entities, ext..
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Wrapping shit up, ext..
        LogHelper.info("Post Initialization Complete!");
    }
}