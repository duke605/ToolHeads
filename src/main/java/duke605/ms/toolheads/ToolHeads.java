package duke605.ms.toolheads;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import duke605.kingcore.registry.VersionRegistry;
import duke605.ms.toolheads.handler.ConfigurationHandler;
import duke605.ms.toolheads.handler.EventManager;
import duke605.ms.toolheads.lib.LibItems;
import duke605.ms.toolheads.lib.Reference;

@Mod(
        modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION,
        dependencies = Reference.DEPENDENCIES
)
public class ToolHeads {

    @Instance(Reference.MODID)
    public static ToolHeads instance;

    // Creative tab
    public static CreativeTabs tab = new CreativeTabs("toolHeads") {

        @Override
        public Item getTabIconItem() {
            return LibItems.head;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.initConfig(event);
    }

    @EventHandler
    public void init(FMLPostInitializationEvent event) {

        // Registering event handler
        MinecraftForge.EVENT_BUS.register(new EventManager());

        // Loading items
        LibItems.initItems();
        
        if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
        	registerMod();
    }
    
    @SideOnly(Side.CLIENT)
    private void registerMod() {
    	VersionRegistry.instance.register(this, ConfigurationHandler.configFile.getPath());
    }
}
