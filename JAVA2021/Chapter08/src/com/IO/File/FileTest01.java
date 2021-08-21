package com.IO.File;

/*
    java.io.File;
	File类和流无关，不能通过该类完成文件的读和写
	File是文件和目录路径名的抽象表示形式
	File只是文件或目录的路径名，并不是真实的文件
	如：E:\学习\JAVA\代码\第8章IO流\File  目录
		E:\学习\JAVA\代码\第8章IO流\File\Test01.java  文件
	File代表的是硬盘上的Directory和file

    f.exists() 判断路径或文件是否存在
    f.mkdir() 只能在已有的路径下创建路径，如果没有，不会报错，会返回False
    f.createNewFile()  只能在已有的路径下创建文件，如果没有，则会报错
    f.mkdirs() 可以递归创建不存在的多重路径
 */

import java.io.*;
public class FileTest01
{
    public static void main(String[] args) throws IOException {

        File f1 = new File("Test01.java");
        File f2 = new File("D:\\Lisen\\JAVA\\代码\\第8章IO流\\01_File\\Test01.java");
        File f3 = new File("D:\\Lisen\\JAVA\\代码\\第8章IO流\\01_File");

        System.out.println(f1.exists());//false
        System.out.println(f2.exists());//true
        System.out.println(f3.exists());//true

        File f4 = new File("文件夹/temp"); // 当前路径是D:\Lisen\JAVA\JAVA2021
        System.out.println(f4.exists());//false

        //如果不存在则以目录的形式创建
        if(!f4.exists()){
            System.out.println(f4.mkdir());  // False
        }

        //如果不存在则创建文件
        if(!f4.exists()){
            f4.createNewFile();     // 这句话会抛出异常
        }
		/* 错误：
		createNewFile()只能在已存在的目录下创建文件，不能创建 不存在的文件夹下的 文件
		*/

        File f6 = new File("D:/Lisen/JAVA/代码/第8章IO流/01_File/a/b/c/d");
        //如果不存在则创建多重路径
        if(!f6.exists()){
            f6.mkdirs();
        }

    }
}
