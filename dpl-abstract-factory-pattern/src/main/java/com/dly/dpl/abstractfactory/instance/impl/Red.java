package com.dly.dpl.abstractfactory.instance.impl;

import com.dly.dpl.abstractfactory.instance.IColor;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 16:16:35
 */
public class Red implements IColor {

    @Override
    public void fill() {
        System.out.println("涂上了红色");
    }
}
