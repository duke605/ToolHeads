package duke605.ms.toolheads.util;

import duke605.ms.toolheads.api.head.Head.ToolType;
import net.minecraft.item.*;

public class ToolUtil {

    /**
     * Gets the type of tool the stack is
     *
     * @param stack The stack being analyzed
     * @return the tool type or null is stack is not a tool
     */
    public static ToolType getToolType(ItemStack stack) {
        if (!isTool(stack))
            return null;

        Item item = stack.getItem();

        if (item instanceof ItemPickaxe)
            return ToolType.PICKAXE;
        else if (item instanceof ItemAxe)
            return ToolType.AXE;
        else if (item instanceof ItemSpade)
            return ToolType.SHOVEL;
        else if (item instanceof ItemHoe)
            return ToolType.HOE;
        else
            return null;
    }

    /**
     * Gets the name of the material
     *
     * @param stack The tool as an item stack
     * @return the tool material as a string or null if stack is not a tool
     */
    public static String getToolMaterial(ItemStack stack) {
        if (!isTool(stack))
            return null;
      
        if (stack.getItem() instanceof ItemTool)
            return ((ItemTool)stack.getItem()).getToolMaterialName();
        else if (stack.getItem() instanceof ItemHoe)
        	return ((ItemHoe)stack.getItem()).getToolMaterialName();
        
        return null;
    }

    /**
     * Determines if an stack is a tool or not
     *
     * @param tool The ItemStack being analyzed
     * @return true if the stack is a tool
     */
    public static boolean isTool(ItemStack tool) {
        return tool != null && (tool.getItem() instanceof ItemTool || tool.getItem() instanceof ItemHoe);
    }
}
