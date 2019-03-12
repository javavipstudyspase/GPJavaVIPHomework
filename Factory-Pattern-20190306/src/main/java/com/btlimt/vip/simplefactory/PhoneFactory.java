package com.btlimt.vip.simplefactory;

/**
 * Created by BTLimt on 2019/3/9.
 * 普通小作坊
 */
public class PhoneFactory {
    public static Phone createPhone(String type){
        if ("小米".equals(type)){
            return new XiaoMi();
        }
        else if ("华为".equals(type)){
            return new HuanWei();
        }
        else if ("Iphone".equals(type)){
            return new Iphone();

        }
        else return  null;

    }
}
