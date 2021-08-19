package com.dly.dpl.abstractfactory.factory;

import com.dly.dpl.abstractfactory.instance.IColor;
import com.dly.dpl.abstractfactory.instance.IShape;
import com.dly.dpl.abstractfactory.instance.impl.Red;
import com.dly.dpl.abstractfactory.instance.impl.Yellow;
import com.dly.dpl.core.enumrated.ColorType;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 16:26:59
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public IColor getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase(ColorType.RED.name())) {
            return new Red();
        } else if (colorType.equalsIgnoreCase(ColorType.YELLOW.name())) {
            return new Yellow();
        }
        return null;
    }

    @Override
    public IShape getShape(String shapeType) {
        return null;
    }
}
