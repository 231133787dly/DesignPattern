package com.dly.dpl.singleton;

import com.dly.dpl.singleton.Object.SingleObject;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 17:34:06
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //由于private方法，所以不可见
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
