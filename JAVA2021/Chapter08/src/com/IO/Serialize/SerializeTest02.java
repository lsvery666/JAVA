package com.IO.Serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializeTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Chapter08/src/com/IO/Serialize/User.DBF"));
        User u = (User)ois.readObject();
        // 在User中添加age属性后，java.io.InvalidClassException
        System.out.println(u);
        // 自定义序列号后：User{name='Lisen', age=0}
        ois.close();
    }
}
