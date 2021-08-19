package com.dly.dpl.abstractfactory.instance.impl;

import com.dly.dpl.abstractfactory.instance.IColor;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 16:17:18
 */
public class Yellow implements IColor {

    @Override
    public void fill() {
        System.out.println("涂上了黄色");
    }
}
