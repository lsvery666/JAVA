import java.net.*;

/*
	需求：通过UDP传输方式 将一段文字数据发送出去

	1.建立UdpSocket服务
	2.提供数据，并将数据封装到数据包里
	3.通过socket服务的发送功能，将数据包发送出去
	4.关闭资源
*/
public class UdpSend
{
	public static void main(String[] args) throws Exception{

		//创建Udp服务
		DatagramSocket ds=new DatagramSocket(8888);

		//确定数据
		byte[] data="udp is coming.".getBytes();
		DatagramPacket dp=new DatagramPacket(data,data.length,InetAddress.getByName("192.168.56.1"),10000);//192.168.56.255是广播 所有在该网络段的主机都能接受到这个信息

		//通过Socket服务，将已有的数据包发送出去
		ds.send(dp);

		//关闭资源
		ds.close();
	}
}