package com.net.IP;

import java.net.*;

public class IPTest01 {
    public static void main(String[] args) throws Exception {

        InetAddress i = InetAddress.getLocalHost();

        System.out.println(i.toString());

        System.out.println("address:" + i.getHostAddress());

        System.out.println("name:" + i.getHostName());

        InetAddress ia = InetAddress.getByName("10.248.98.2");

        System.out.println("address:" + ia.getHostAddress());

        System.out.println("name:" + ia.getHostName());


        InetAddress[] bd = InetAddress.getAllByName("www.baidu.com");

        for (int j = 0; j < bd.length; j++) {

            System.out.println("address:" + bd[j].getHostAddress());

            System.out.println("name:" + bd[j].getHostName());
        }

    }


}
