package com.dly.dpl.abstractfactory.factory;

import com.dly.dpl.abstractfactory.instance.IColor;
import com.dly.dpl.abstractfactory.instance.IShape;
import com.dly.dpl.abstractfactory.instance.impl.Circle;
import com.dly.dpl.abstractfactory.instance.impl.Rectangle;
import com.dly.dpl.abstractfactory.instance.impl.Square;
import com.dly.dpl.core.enumrated.ShapeType;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 16:23:22
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public IShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase(ShapeType.CIRCLE.name())) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase(ShapeType.RECTANGLE.name())) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase(ShapeType.SQUARE.name())) {
            return new Square();
        }
        return null;
    }

    @Override
    public IColor getColor(String color) {
        return null;
    }
}
