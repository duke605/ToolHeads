package duke605.ms.toolheads.handler;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static File configFile;
    public static Configuration config;

    // Settings
    public static int diamondChance;
    public static int goldChance;
    public static int ironChance;
    public static int stoneChance;
    public static int woodChance;

    /**
     * Loads config settings
     *
     * @param event
     */
    public static void initConfig(FMLPreInitializationEvent event) {
        configFile = new File(event.getModConfigurationDirectory().getPath() + "/Micro/ToolHeads.cfg");
        config = new Configuration(configFile);

        config.load();

        // Getting settings
        diamondChance = config.getInt(Configuration.CATEGORY_GENERAL, "diamondChance", 25, 1, 100, "What is the chance of a diamond tool being dropped? Set to 25 by default. Set to a higher number to increase the chance of the tool head being dropped");
        ironChance = config.getInt(Configuration.CATEGORY_GENERAL, "ironChance", 20, 1, 100, "What is the chance of an iron tool being dropped? Set to 20 by default. Set to a higher number to increase the chance of the tool head being dropped.");
        goldChance = config.getInt(Configuration.CATEGORY_GENERAL, "goldChance", 15, 1, 100, "What is the chance of a gold tool being dropped? Set to 15 by default. Set to a higher number to increase the chance of the tool head being dropped.");
        stoneChance = config.getInt(Configuration.CATEGORY_GENERAL, "stoneChance", 10, 1, 100, "What is the chance of a stone tool being dropped? Set to 10 by default. Set to a higher number to increase the chance of the tool head being dropped");
        woodChance = config.getInt(Configuration.CATEGORY_GENERAL, "woodChance", 5, 1, 100, "What is the chance of a wood tool being dropped? Set to 5 by default. Set to a higher number to increase the chance of the tool head being dropped.");

        config.save();
    }
}
