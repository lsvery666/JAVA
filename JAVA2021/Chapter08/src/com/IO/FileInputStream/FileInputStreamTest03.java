package com.IO.FileInputStream;

import java.io.*;
/*
	native int read(byte[] bytes);	// 本地方法
	读取之前在内存中准备一个byte数组，每次读取多个字节存储到byte数组中
	一次读取多个字节，不是单字节读取了。
	效率高
*/
public class FileInputStreamTest03{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:/Lisen/JAVA/JAVA2021/Chapter08/src/com/IO/FileInputStream/test.txt");

        byte[] bytes = new byte[3];//每一次最多读取三个字节

        //int read(byte[] bytes);该方法返回的int类型的值代表的是这次读取了多少个字节
        int i1 = fis.read(bytes);
        System.out.println(i1);//3
        //将byte数组转换成字符串
        System.out.println(new String(bytes, 0, i1));//中

        int i2 = fis.read(bytes);
        System.out.println(i2);//3
        System.out.println(new String(bytes, 0, i2));//abc

        int i3 = fis.read(bytes);
        System.out.println(i3);//1
        System.out.println(new String(bytes, 0, i3));//d

        int i4 = fis.read(bytes);
        System.out.println(i4);//-1
//         System.out.println(new String(bytes, 0, i4));//java.lang.StringIndexOutOfBoundsException

        fis.close();
    }
}
