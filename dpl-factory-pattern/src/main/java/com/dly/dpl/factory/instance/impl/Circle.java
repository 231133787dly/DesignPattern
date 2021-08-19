package com.dly.dpl.factory.instance.impl;

import com.dly.dpl.factory.instance.IShape;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 14:37:25
 */
public class Circle implements IShape {

    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }
}
