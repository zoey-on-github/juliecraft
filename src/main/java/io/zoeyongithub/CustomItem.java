package io.zoeyongithub;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.apache.commons.io.input.TeeInputStream;

public class CustomItem extends Item {
    public CustomItem(Settings settings) {
        super(settings);
    }
@Override
public void appendTooltip (ItemStack itemStack, World world, List tooltip, TooltipContext tooltipContext){
        tooltip.add(Text.translatable("item.juliecrraft.custom_item.tooltip"));
}
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.setHealth(0);
        JulieCraft.LOGGER.info("yeah");
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}

