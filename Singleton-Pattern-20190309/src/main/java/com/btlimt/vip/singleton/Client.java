package com.btlimt.vip.singleton;

/**
 * Created by BTLimt on 2019/3/10.
 */
public class Client{
    public static void main(String[] args) throws InterruptedException {
        DoubleCheck dc=DoubleCheck.getInstance();
        DoubleCheck dc2=DoubleCheck.getInstance();
        System.out.println(dc==dc2);
    }
}
