package com.IO.FileInputStream;

import java.io.FileInputStream;
public class FileInputStreamTest04
{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("Test04.java");
        byte[] bytes = new byte[1024];
		/*
            while(true){
                int temp=fis.read(bytes);
                if(temp==-1) break;
                System.out.println(new String(bytes,0,temp));
            }
		*/
        //升级循环
        int temp;
        while((temp=fis.read(bytes))!=-1){
            System.out.print(new String(bytes, 0, temp));
        }
        fis.close();
    }
}
