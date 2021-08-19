package com.dly.dpl.factory.instance.impl;

import com.dly.dpl.factory.instance.IShape;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 14:37:46
 */
public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
