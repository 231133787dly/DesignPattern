package com.dly.dpl.factory.factory;

import com.dly.dpl.factory.instance.IShape;
import com.dly.dpl.factory.instance.impl.Circle;
import com.dly.dpl.factory.instance.impl.Rectangle;
import com.dly.dpl.factory.instance.impl.Square;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 14:29:35
 */
public class ShapeFactory {
    /**
     * 获取形状类型的对象
     *
     * @param shapeType 形状类型
     * @return IShape 返回的形状
     */
    public IShape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
