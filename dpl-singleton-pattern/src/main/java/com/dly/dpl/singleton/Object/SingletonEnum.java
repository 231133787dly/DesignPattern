package com.dly.dpl.singleton.Object;

import com.dly.dpl.core.constant.ShowMessageConstant;

/**
 * @author dly Email:dingly2@shanghai-electric.com
 * @date 2021/8/20 10:35:47
 */
public enum SingletonEnum {
    //对象实例
    INSTANCE;

    /**
     * 输出实例信息
     *
     * @param
     * @return
     */
    public void showMessage() {
        System.out.println(ShowMessageConstant.SINGLETON_ENUM_SHOW);
    }
}
