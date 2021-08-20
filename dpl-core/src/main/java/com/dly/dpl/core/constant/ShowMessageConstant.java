package com.dly.dpl.core.constant;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/19 17:42:31
 */
public interface ShowMessageConstant {
    //单例模式中打印的消息
    String SINGLETON_MESSAGE_SHOW = "This is a singleton";

    //懒汉式单例模式中打印的消息
    String SINGLETON_LAZY_SHOW = "这是一个懒汉式的单例设计模式";

    //饿汉式单例模式中打印的消息
    String SINGLETON_HUNGRY_SHOW = "这是一个饿汉式的单例设计模式";

    //双检锁单例模式中打印的消息
    String SINGLETON_DCL_SHOW = "这是一个双检锁的单例设计模式";

    //静态内部类单例模式中打印的消息
    String SINGLETON_HOLDER_SHOW = "这是一个静态内部类的单例设计模式";

    //枚举单例模式中打印的消息
    String SINGLETON_ENUM_SHOW = "这是一个枚举的单例设计模式";
}
