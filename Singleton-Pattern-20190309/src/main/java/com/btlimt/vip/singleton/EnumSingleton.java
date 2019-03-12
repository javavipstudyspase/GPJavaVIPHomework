package com.btlimt.vip.singleton;

/**
 * Created by BTLimt on 2019/3/10.
 * 通过枚举的方式实现单例
 * 无法实现懒加载
 */
public enum EnumSingleton {
    INSTANCE;
    public void singletonOperation(){
        //功能处理
    }
}
