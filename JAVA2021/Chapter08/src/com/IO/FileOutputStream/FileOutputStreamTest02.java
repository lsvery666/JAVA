package com.IO.FileOutputStream;

/*
	关于文件的复制粘贴
	FileInputStream不能读取文件夹，只能读取文件
	FileOutputStream实例化时，如果目标文件不存在，则自动创建，但不可自动创建 不存在的文件夹下的 文件，也不可自动创建文件夹
*/
import java.io.*;
public class FileOutputStreamTest02
{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("测试.txt");//FileInputStream fis=new FileInputStream("文件夹"); 错误
        FileOutputStream fos = new FileOutputStream("copy.txt");//FileOutputStream fos=new FileOutputStream("不存在的文件夹\\copy.txt"); 错误
        byte[] bytes = new byte[1024];
        int temp = 0;
        // 边读边写
        while((temp=fis.read(bytes))!=-1){
            fos.write(bytes,0,temp);
        }
        fos.flush();

        fis.close();

        fos.close();
    }
}
