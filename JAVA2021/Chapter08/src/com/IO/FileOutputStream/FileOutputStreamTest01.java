package com.IO.FileOutputStream;

/*
	java.io.*
		java.io.FileOutputStream;文件字节输出流
		将计算机内存中的数据写入硬盘文件中

	fos.write(bytes[], start, end)	[start, end)
	fos.flush()
	fos.close()
*/
import java.io.*;
public class FileOutputStreamTest01
{
    public static void main(String[] args){
        FileOutputStream fos = null;
        try{
            //fos = new FileOutputStream("temp02");
            //上面的方式谨慎使用，会将源文件覆盖

            //以追加的方式写入
            fos = new FileOutputStream("D:/Lisen/JAVA/JAVA2021/Chapter08/src/com/IO/FileOutputStream/temp.txt", true);

            //开始写
            String msg = "HelloWorld";
            //将String类型转换成byte数组
            byte[] bytes = msg.getBytes();

            //将byte数组的全部数据写入
            //fos.write(bytes);
            //将byte数组的一部分数据写入
            fos.write(bytes,0,3);

            //最后的时候为了保证数据完全写入硬盘，所以要刷新
            fos.flush();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(fos!=null){
                try{
                    fos.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }


    }
}