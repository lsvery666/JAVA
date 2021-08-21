package com.IO.Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializeTest01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Chapter08/src/com/IO/Serialize/User.DBF"));
        User u = new User("Lisen", 18);
        oos.writeObject(u);
        oos.flush();
        oos.close();
    }
}

