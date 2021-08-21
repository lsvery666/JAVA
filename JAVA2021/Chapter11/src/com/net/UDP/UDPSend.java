package com.net.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
	需求：通过UDP传输方式 将一段文字数据发送出去

	1.建立UdpSocket服务
	2.提供数据，并将数据封装到数据包里
	3.通过socket服务的发送功能，将数据包发送出去
	4.关闭资源
*/
public class UDPSend {
    public static void main(String[] args) throws Exception {

        //创建Udp服务   源端口号
        DatagramSocket ds = new DatagramSocket(8888);

        //确定数据
        byte[] data = "udp is coming.".getBytes();
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 10000);

        //通过Socket服务，将已有的数据包发送出去
        ds.send(dp);

        //关闭资源
        ds.close();
    }
}
