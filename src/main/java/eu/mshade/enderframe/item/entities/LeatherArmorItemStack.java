package eu.mshade.enderframe.item.entities;

import eu.mshade.enderframe.item.ItemStack;
import eu.mshade.enderframe.item.Material;
import eu.mshade.enderframe.mojang.Color;

public class LeatherArmorItemStack extends ItemStack {

    private Color color = Color.YELLOW;

    public LeatherArmorItemStack(Material material, int count, int durability) {
        super(material, count, durability);
    }

    public Color getColor() {
        return color;
    }

    public LeatherArmorItemStack setColor(Color color) {
        this.color = color;
        return this;
    }
}
