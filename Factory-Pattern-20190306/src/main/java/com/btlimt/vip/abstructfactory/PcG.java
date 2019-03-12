package com.btlimt.vip.abstructfactory;

/**
 * Created by BTLimt on 2019/3/9.
 */
public class PcG implements GraphicsProcessor {
    @Override
    public void name() {
        System.out.println("NVIDIA 1080Ti");
    }
}
