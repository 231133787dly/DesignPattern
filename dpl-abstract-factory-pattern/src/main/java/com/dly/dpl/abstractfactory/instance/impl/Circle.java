package com.dly.dpl.abstractfactory.instance.impl;

import com.dly.dpl.abstractfactory.instance.IShape;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 16:12:44
 */
public class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("画出了一个圆形");
    }
}
