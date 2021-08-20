package com.dly.dpl.singleton.Object;

import com.dly.dpl.core.constant.ShowMessageConstant;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 10:19:22
 */
public class SingletonStatic {
    public static class SingletonHolder {
        private static final SingletonStatic instance = new SingletonStatic();
    }

    private SingletonStatic() {
    }

    /**
     * 获取SingletonStatic的实例对象
     *
     * @param
     * @return
     */
    public static final SingletonStatic getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * 输出实例信息
     *
     * @param
     * @return
     */
    public void showMessage() {
        System.out.println(ShowMessageConstant.SINGLETON_HOLDER_SHOW);
    }
}
