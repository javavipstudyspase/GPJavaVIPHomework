package com.btlimt.vip.singleton;

import java.io.*;

/**
 * Created by BTLimt on 2019/3/10.
 * 对于防止反序列化对单例破坏的测试
 */
public class TestBetterLasy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(BetterLasy.getInstance());
        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        BetterLasy newInstance= (BetterLasy) ois.readObject();
        System.out.println(BetterLasy.getInstance()==newInstance);
    }
}
