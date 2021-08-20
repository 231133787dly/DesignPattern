package com.dly.dpl.singleton.Object;

import com.dly.dpl.core.constant.ShowMessageConstant;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 09:47:15
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    /**
     * 获取SingletonHungry的实例对象
     *
     * @param
     * @return
     */
    public static SingletonHungry getInstance() {
        return instance;
    }

    /**
     * 输出实例信息
     *
     * @param
     * @return
     */
    public void showMessage() {
        System.out.println(ShowMessageConstant.SINGLETON_HUNGRY_SHOW);
    }
}
