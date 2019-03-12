package com.btlimt.vip;

import com.btlimt.vip.dynamicp.cglib.BuyHouseClass;
import com.btlimt.vip.dynamicp.cglib.CglibProxy;
import com.btlimt.vip.dynamicp.jdk.DynamicProxyHandler;
import com.btlimt.vip.staticp.BuyHouse;
import com.btlimt.vip.staticp.BuyHouseImpl;
import com.btlimt.vip.staticp.BuyHouseProxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        //static proxy test
        //testStatic();

        //dynamic Proxy Test
        //dynamicProxyTest();

        //cglib Proxy Test
        cglibProxyTest();
    }

    private static void testStatic() {
        /**
         * static proxy test
         * 静态代理总结：
         * 优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
         * 缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改。
         */
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }

    private static void dynamicProxyTest(){
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
                new Class[] {BuyHouse.class},new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHouse();
    }

    private static void cglibProxyTest(){
        BuyHouseClass buyHouseClass = new BuyHouseClass();
        CglibProxy cglibProxy = new CglibProxy();
        //BuyHouseClass buyHouseCglibProxy = (BuyHouseClass) cglibProxy.getInstance(buyHouseClass);
        BuyHouseClass buyHouseCglibProxy = (BuyHouseClass) cglibProxy.getInstance(BuyHouseClass.class);
        buyHouseCglibProxy.buyHouse();
    }
}
