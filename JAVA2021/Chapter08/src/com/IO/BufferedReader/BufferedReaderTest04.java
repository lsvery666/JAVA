package com.IO.BufferedReader;

import java.io.*;

//br.readLine()ÿ����һ�� �ͻ��ȡһ�ο���̨����
public class BufferedReaderTest04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
