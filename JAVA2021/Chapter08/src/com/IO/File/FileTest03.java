package com.IO.File;

/*
	使用递归找出某目录下的所有子文件
*/
import java.io.*;
public class FileTest03
{
    public static void method(File f){
        if(f.exists()){
            //如果f是文件
            if(f.isFile()){
                System.out.println(f.getAbsolutePath());
                return;
            }
            File[] fs = f.listFiles();//程序执行到此处，f一定是目录
            for(File subf :fs){//subf不一定是目录
                method(subf);
            }
        }
    }

    public static void main(String[] args){
        //E:\学习\Java\代码
        File f = new File("D:\\Lisen\\Java\\JAVA2021");
        method(f);
    }

}
