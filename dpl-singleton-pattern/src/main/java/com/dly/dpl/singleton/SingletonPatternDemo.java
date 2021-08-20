package com.dly.dpl.singleton;

import com.dly.dpl.singleton.Object.*;

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

        //测试懒汉式非线程安全
        SingletonLazyNotLocked singletonLazyNotLocked = SingletonLazyNotLocked.getInstance();
        singletonLazyNotLocked.showMessage();

        //测试懒汉式且线程安全
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        singletonLazy.showMessage();

        //测试饿汉式
        SingletonHungry singletonHungry = SingletonHungry.getInstance();
        singletonHungry.showMessage();

        //测试双检锁
        SingletonDCL singletonDCL = SingletonDCL.getInstance();
        singletonDCL.showMessage();

        //测试静态内部类
        SingletonStatic singletonStatic = SingletonStatic.getInstance();
        singletonStatic.showMessage();

        //测试枚举
        SingletonEnum.INSTANCE.showMessage();
    }
}
