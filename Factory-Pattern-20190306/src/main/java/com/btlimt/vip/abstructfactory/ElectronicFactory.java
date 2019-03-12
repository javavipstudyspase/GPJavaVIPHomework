package com.btlimt.vip.abstructfactory;



public interface ElectronicFactory {
    CPU createCpu();
    GraphicsProcessor createG();
    Screen createScreen();
}
