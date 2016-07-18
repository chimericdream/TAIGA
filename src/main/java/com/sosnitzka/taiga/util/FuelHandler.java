package com.sosnitzka.taiga.util;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import org.apache.commons.lang3.RandomUtils;

import static com.sosnitzka.taiga.Items.fuel_brick;
import static com.sosnitzka.taiga.Items.glimmercoal;
import static com.sosnitzka.taiga.Items.lignite;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem().equals(lignite)) {
            return 200 * 2;
        }
        if (fuel.getItem().equals(fuel_brick)) {
            return RandomUtils.nextInt(1, RandomUtils.nextInt(1, RandomUtils.nextInt(1, 32))) * 100;
        }
        if (fuel.getItem().equals(glimmercoal)) {
            return RandomUtils.nextInt(1, RandomUtils.nextInt(1, RandomUtils.nextInt(16, 64))) * 200;
        }
        return 0;
    }

}