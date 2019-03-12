package com.btlimt.vip.staticp;

public class BuyHouseProxy implements BuyHouse {

    private BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {

        System.out.println("S买房前准备-------");
        buyHouse.buyHouse();
        System.out.println("S买房后装修-------");
    }
}
