package com.dly.dpl.abstractfactory.factory;

import com.dly.dpl.abstractfactory.instance.IColor;
import com.dly.dpl.abstractfactory.instance.IShape;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 16:19:23
 */
public abstract class AbstractFactory {
    /**
     * 获取颜色的绘画方法
     *
     * @param color 所要画的颜色
     * @return IColor 颜色绘画类
     */
    public abstract IColor getColor(String color);
    /**
     * 获取形状的绘画方法
     *
     * @param shape 所要画的形状
     * @return IShape 形状绘画类
     */
    public abstract IShape getShape(String shape);
}
