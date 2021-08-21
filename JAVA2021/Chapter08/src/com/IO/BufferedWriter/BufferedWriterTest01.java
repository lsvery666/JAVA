package com.IO.BufferedWriter;

/*
	BufferedWriter(FileWriter fw)
*/
import java.io.*;
public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{
        //创建带有缓冲区的字符输出流
        //BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("temp.txt")));
        bw.write("奥运会!");
        //写入一个行分隔符
        bw.newLine();
        bw.write("开幕式一点都没意思！");
        bw.flush();
        bw.close();
    }
}
