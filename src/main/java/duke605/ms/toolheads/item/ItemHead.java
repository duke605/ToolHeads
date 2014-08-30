package duke605.ms.toolheads.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import duke605.ms.toolheads.lib.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class ItemHead extends Item {

    private final String[] names = {"headAxeDiamond", "headAxeGold", "headAxeIron", "headAxeStone", "headAxeWood",
                                    "headPickaxeDiamond", "headPickaxeGold", "headPickaxeIron", "headPickaxeStone", "headPickaxeWood",
                                    "headHoeDiamond", "headHoeGold", "headHoeIron", "headHoeStone", "headHoeWood",
                                    "headShovelDiamond", "headShovelGold", "headShovelIron", "headShovelStone", "headShovelWood"};

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemHead() {
        setHasSubtypes(true);
        setMaxStackSize(1);
    }

    public void getSubItems(Item item, CreativeTabs tab, List l) {
        for (int i = 0;i < names.length;i++)
            l.add(new ItemStack(item, 1, i));
    }

    public String getUnlocalizedName(ItemStack stack){
        return getUnlocalizedName() + "." + names[MathHelper.clamp_int(stack.getItemDamage(), 0, names.length - 1)];
    }

    public IIcon getIconFromDamage(int damage) {
        return icons[MathHelper.clamp_int(damage, 0, icons.length - 1)];
    }

    public void registerIcons(IIconRegister reg) {
        icons = new IIcon[names.length];

        for (int i = 0;i < icons.length;i++)
            icons[i] = reg.registerIcon(Reference.DOMAIN + names[i]);
    }
}
