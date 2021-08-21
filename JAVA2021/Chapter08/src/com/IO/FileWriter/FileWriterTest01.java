package com.IO.FileWriter;
/*
	java.io.Writer;
		java.io.OutputStreamWriter;
			java.io.FileWriter;文件字符输出流

	fw.write(char[] chars)
	fw.write(char[] chars, start, end)
	fw.write(String str)
*/

import java.io.*;

public class FileWriterTest01 {
    public static void main(String[] args) throws Exception {
        //创建文件字符输出流
        //FileWriter fw = new FileWriter("temp.txt");//覆盖
        FileWriter fw = new FileWriter("temp.txt", true);//追加
        fw.write("李海波！！！！");
        char[] chars = {'我', '是', '中', '国', '人', '!'};
        fw.write(chars);
        fw.write(chars, 0, 6);
        String s = "我是中国人！";
        fw.write(s);
        fw.flush();
        fw.close();
    }
}
