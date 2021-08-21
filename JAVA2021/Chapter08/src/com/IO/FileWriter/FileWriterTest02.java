package com.IO.FileWriter;

/*
	文件复制
	只能复制纯文本文件
*/
import java.io.*;
public class FileWriterTest02
{
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("temp.txt");
        FileWriter fw = new FileWriter("copy.txt");

        char[] chars = new char[512];//1KB

        //一边读一边写
        int temp = 0;
        while((temp=fr.read(chars))!=-1){
            fw.write(chars, 0, temp);
        }

        fr.close();
        fw.flush();
        fw.close();
    }
}
