package com.btlimt.vip.simplefactory;

/**
 * Created by BTLimt on 2019/3/9.
 */
public class PhoneFactory2 {
    public static Phone createIpone(){
        return  new Iphone();
    }
    public  static Phone createXiaoMi(){
        return new XiaoMi();
    }
    public static HuanWei createHuaWei(){
        return new HuanWei();
    }
}
