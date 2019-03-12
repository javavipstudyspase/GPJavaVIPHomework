package com.btlimt.vip.factorymethod;




/**
 * Created by BTLimt on 2019/3/9.
 */
public class IphoneFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
