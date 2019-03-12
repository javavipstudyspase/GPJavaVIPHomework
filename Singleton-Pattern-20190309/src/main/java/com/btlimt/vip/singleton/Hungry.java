package com.btlimt.vip.singleton;

/**
 * Created by BTLimt on 2019/3/10.
 * 饿汉式加载,线程安全,效率极高
 *
 */
public class Hungry {
    private static Hungry instance=new Hungry();

    public Hungry() {//防止被反射创建
        if(instance!=null) throw new RuntimeException();
    }
    public static Hungry getInstance(){
        return  instance;
    }
}
