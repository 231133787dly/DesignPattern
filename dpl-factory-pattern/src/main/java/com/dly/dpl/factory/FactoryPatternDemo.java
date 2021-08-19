package com.dly.dpl.factory;

import com.dly.dpl.factory.factory.ShapeFactory;
import com.dly.dpl.factory.instance.IShape;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 14:51:18
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        IShape shapeCircle = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shapeCircle.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        IShape shapeRectangle = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shapeRectangle.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        IShape shapeSquare = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shapeSquare.draw();
    }
}
