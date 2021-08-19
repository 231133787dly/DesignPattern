package com.dly.dpl.abstractfactory;

import com.dly.dpl.abstractfactory.factory.AbstractFactory;
import com.dly.dpl.abstractfactory.instance.IColor;
import com.dly.dpl.abstractfactory.instance.IShape;
import com.dly.dpl.abstractfactory.producer.FactoryProducer;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 16:09:31
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为 Circle 的对象
        IShape shapeCircle = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shapeCircle.draw();

        //获取形状为 Rectangle 的对象
        IShape shapeRectangle = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shapeRectangle.draw();

        //获取形状为 Square 的对象
        IShape shapeSquare = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shapeSquare.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为 Red 的对象
        IColor colorRed = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        colorRed.fill();

        //获取颜色为 YELLOW 的对象
        IColor colorYellow = colorFactory.getColor("Yellow");

        //调用 YELLOW 的 fill 方法
        colorYellow.fill();
    }

}
