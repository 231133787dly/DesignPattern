package com.dly.dpl.singleton.Object;

import com.dly.dpl.core.constant.ShowMessageConstant;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 10:03:07
 */
public class SingletonDCL {
    private volatile static SingletonDCL instance;

    private SingletonDCL() {
    }

    /**
     * 获取SingletonDCL的实例对象
     *
     * @param
     * @return
     */
    public static SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
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
        System.out.println(ShowMessageConstant.SINGLETON_DCL_SHOW);
    }
}
