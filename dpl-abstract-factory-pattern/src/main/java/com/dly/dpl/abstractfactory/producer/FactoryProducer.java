package com.dly.dpl.abstractfactory.producer;

import com.dly.dpl.abstractfactory.factory.AbstractFactory;
import com.dly.dpl.abstractfactory.factory.ColorFactory;
import com.dly.dpl.abstractfactory.factory.ShapeFactory;
import com.dly.dpl.core.enumrated.FactoryType;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 16:32:23
 */
public class FactoryProducer {
    /**
     * 创建工厂
     *
     * @param choice 所要创建的工厂类型
     * @return AbstractFactory 创建的工厂
     */
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase(FactoryType.SHAPE.name())) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase(FactoryType.COLOR.name())) {
            return new ColorFactory();
        }
        return null;
    }
}
