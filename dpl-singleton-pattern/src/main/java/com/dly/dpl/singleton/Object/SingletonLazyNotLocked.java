package com.dly.dpl.singleton.Object;

import com.dly.dpl.core.constant.ShowMessageConstant;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 08:57:03
 */
public class SingletonLazyNotLocked {
    private static SingletonLazyNotLocked instance;

    private SingletonLazyNotLocked() {
    }

    /**
     * 获取SingletonLazyNotLocked的实例对象
     *
     * @param
     * @return
     */
    public static SingletonLazyNotLocked getInstance() {
        if (instance == null) {
            instance = new SingletonLazyNotLocked();
        }
        return instance;
    }

    /**
     * 输出实例信息
     *
     * @param
     * @return
     */
    public void showMessage() {
        System.out.println(ShowMessageConstant.SINGLETON_LAZY_SHOW);
    }
}
