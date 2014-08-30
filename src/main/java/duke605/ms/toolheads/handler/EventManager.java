package duke605.ms.toolheads.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import duke605.ms.toolheads.api.ToolHeadAPI;
import duke605.ms.toolheads.api.heads.Head;
import duke605.ms.toolheads.api.heads.Head.ToolType;
import duke605.ms.toolheads.util.ToolUtil;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;

public class EventManager {

    @SubscribeEvent
    public void onBreak(PlayerDestroyItemEvent event) {
        String materialName = ToolUtil.getToolMaterial(event.original);
        ToolType type = ToolUtil.getToolType(event.original);
        Head head = ToolHeadAPI.getHead(type, materialName);
        EntityLivingBase entity = event.entityLiving;
        int dropChance;
        int rand;

        // Stack was not a tool or no head found for tool
        if (event.entityLiving.worldObj.isRemote || type == null || materialName == null || head == null)
            return;

        dropChance = head.chance;
        rand = event.entityLiving.worldObj.rand.nextInt(100);

        // Chance not met
        if (rand >= dropChance)
            return;

        if (entity instanceof EntityPlayer) ((EntityPlayer)entity).addChatComponentMessage(new ChatComponentText("\u00a7bThe tool\'s head has popped off."));
        entity.worldObj.spawnEntityInWorld(new EntityItem(entity.worldObj, entity.posX, entity.posY, entity.posZ, head.head.copy()));
    }
}
