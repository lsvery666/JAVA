package com.IO.FileInputStream;

import java.io.*;
public class FileInputStreamTest05
{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:/Lisen/JAVA/JAVA2021/Chapter08/src/com/IO/FileInputStream/test.txt");
        System.out.println(fis.available());	// 7
        System.out.println(fis.read());	// 228
        //int available();返回流中剩余的估计字节数
        System.out.println(fis.available());	// 5

        //跳过两个字节
        fis.skip(2);
        System.out.println(fis.read());	// 98
        fis.close();
    }
}
