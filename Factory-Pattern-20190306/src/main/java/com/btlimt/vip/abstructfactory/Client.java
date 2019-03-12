package com.btlimt.vip.abstructfactory;


public class Client {
    public static void main(String[] args) {
        PcFactory pf=new PcFactory();
        pf.createCpu().name();
        PhoneFactory pfy=new PhoneFactory();
        pfy.createG().name();
    }
}
