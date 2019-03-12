package com.btlimt.vip.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {
    public float h = 1000;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
