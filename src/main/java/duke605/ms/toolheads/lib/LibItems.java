package duke605.ms.toolheads.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import duke605.ms.toolheads.ToolHeads;
import duke605.ms.toolheads.api.ToolHeadAPI;
import duke605.ms.toolheads.api.heads.Head;
import duke605.ms.toolheads.handler.ConfigurationHandler;
import duke605.ms.toolheads.item.ItemHead;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class LibItems {

    // Items
    public static Item head;

    /**
     * Loads items
     */
    public static void initItems() {
        assignItems();
        registerItems();
        addRecipes();
    }

    private static void assignItems() {
        head = new ItemHead().setCreativeTab(ToolHeads.tab).setUnlocalizedName("toolHead");
    }

    private static void registerItems() {
        // Registering Items
        GameRegistry.registerItem(head, "toolHead");

        // Axes
        ToolHeadAPI.registerHead(new Head(Head.ToolType.AXE, "EMERALD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 0)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.AXE, "GOLD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 1)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.AXE, "IRON", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 2)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.AXE, "STONE", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 3)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.AXE, "WOOD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 4)));

        // Pickaxes
        ToolHeadAPI.registerHead(new Head(Head.ToolType.PICKAXE, "EMERALD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 5)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.PICKAXE, "GOLD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 6)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.PICKAXE, "IRON", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 7)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.PICKAXE, "STONE", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 8)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.PICKAXE, "WOOD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 9)));

        // Hoes
        ToolHeadAPI.registerHead(new Head(Head.ToolType.HOE, "EMERALD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 10)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.HOE, "GOLD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 11)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.HOE, "IRON", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 12)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.HOE, "STONE", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 13)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.HOE, "WOOD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 14)));

        // Shovels
        ToolHeadAPI.registerHead(new Head(Head.ToolType.SHOVEL, "EMERALD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 15)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.SHOVEL, "GOLD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 16)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.SHOVEL, "IRON", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 17)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.SHOVEL, "STONE", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 18)));
        ToolHeadAPI.registerHead(new Head(Head.ToolType.SHOVEL, "WOOD", ConfigurationHandler.diamondChance, new ItemStack(head, 1, 19)));
    }

    private static void addRecipes() {

    	// Axes
    	GameRegistry.addRecipe(new ItemStack(Items.diamond_axe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 0));
    	GameRegistry.addRecipe(new ItemStack(Items.golden_axe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 1));
    	GameRegistry.addRecipe(new ItemStack(Items.iron_axe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 2));
    	GameRegistry.addRecipe(new ItemStack(Items.stone_axe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 3));
    	GameRegistry.addRecipe(new ItemStack(Items.wooden_axe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 4));

    	// Pickaxes
    	GameRegistry.addRecipe(new ItemStack(Items.diamond_pickaxe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 5));
    	GameRegistry.addRecipe(new ItemStack(Items.golden_pickaxe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 6));
    	GameRegistry.addRecipe(new ItemStack(Items.iron_pickaxe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 7));
    	GameRegistry.addRecipe(new ItemStack(Items.stone_pickaxe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 8));
    	GameRegistry.addRecipe(new ItemStack(Items.wooden_pickaxe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 9));
    	
    	// Hoes
    	GameRegistry.addRecipe(new ItemStack(Items.diamond_hoe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 10));
    	GameRegistry.addRecipe(new ItemStack(Items.golden_hoe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 11));
    	GameRegistry.addRecipe(new ItemStack(Items.iron_hoe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 12));
    	GameRegistry.addRecipe(new ItemStack(Items.stone_hoe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 13));
    	GameRegistry.addRecipe(new ItemStack(Items.wooden_hoe), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 14));
    	
    	// Shovels
    	GameRegistry.addRecipe(new ItemStack(Items.diamond_shovel), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 15));
    	GameRegistry.addRecipe(new ItemStack(Items.golden_shovel), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 16));
    	GameRegistry.addRecipe(new ItemStack(Items.iron_shovel), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 17));
    	GameRegistry.addRecipe(new ItemStack(Items.stone_shovel), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 18));
    	GameRegistry.addRecipe(new ItemStack(Items.wooden_shovel), "H", "S", "S", 'S', Items.stick, 'H', new ItemStack(head, 0, 19));
    }
}
