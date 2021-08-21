package com.IO.BufferedReader;

/*
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Test02.java")));
*/
import java.io.*;
public class BufferedReaderTest02
{
    public static void main(String[] args) throws Exception{
		/*

		//创建带有缓冲区的字符输入流
		FileInputStream fis = new FileInputStream("Test02.java");//文件字节输入流

		//转换流（将字节流转换成字符流）
		InputStreamReader isr = new InputStreamReader(fis);//isr是字符流

		BufferedReader br = new BufferedReader(isr);//isr是以个Reader类型

		*/
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Test02.java")));

        //开始读
        String temp = null;
        while((temp=br.readLine())!=null){
            System.out.println(temp);
        }

        br.close();
    }
}