package com.btlimt.vip.factorymethod;


/**
 * Created by BTLimt on 2019/3/9.
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1=new HuaWeiFactory().createPhone();
        Phone phone2=new XiaoMiFactory().createPhone();
        Phone phone3=new IphoneFactory().createPhone();
        phone2.function();
    }
}
