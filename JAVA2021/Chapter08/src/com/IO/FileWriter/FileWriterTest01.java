package com.IO.FileWriter;
/*
	java.io.Writer;
		java.io.OutputStreamWriter;
			java.io.FileWriter;�ļ��ַ������

	fw.write(char[] chars)
	fw.write(char[] chars, start, end)
	fw.write(String str)
*/

import java.io.*;

public class FileWriterTest01 {
    public static void main(String[] args) throws Exception {
        //�����ļ��ַ������
        //FileWriter fw = new FileWriter("temp.txt");//����
        FileWriter fw = new FileWriter("temp.txt", true);//׷��
        fw.write("�����������");
        char[] chars = {'��', '��', '��', '��', '��', '!'};
        fw.write(chars);
        fw.write(chars, 0, 6);
        String s = "�����й��ˣ�";
        fw.write(s);
        fw.flush();
        fw.close();
    }
}
