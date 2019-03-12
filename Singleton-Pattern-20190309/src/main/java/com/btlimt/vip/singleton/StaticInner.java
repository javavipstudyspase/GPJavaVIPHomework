package com.btlimt.vip.singleton;

/**
 * Created by BTLimt on 2019/3/10.
 * 类加载的过程是线程安全的
 *
 */
public class StaticInner {
    private static class InnerClass{
        private static final StaticInner instance=new StaticInner();
    }
    public static StaticInner getInstance(){
        return InnerClass.instance;
    }
}
