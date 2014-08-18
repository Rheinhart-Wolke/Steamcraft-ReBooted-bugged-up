package com.Saunderson.SteamcraftRB;


import com.Saunderson.SteamcraftRB.handler.ConfigurationHandler;
import com.Saunderson.SteamcraftRB.init.ModItems;
import com.Saunderson.SteamcraftRB.proxy.IProxy;
import com.Saunderson.SteamcraftRB.reference.reference;
import com.Saunderson.SteamcraftRB.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid= reference.MOD_ID, name= reference.MOD_NAME, version= reference.VERSION, guiFactory= reference.GUI_FACTORY_CLASS)

public class SteamcraftRB
{
    @Mod.Instance(reference.MOD_ID)
    public static SteamcraftRB instance;

    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.SERVER_PROXY_CLASS)
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