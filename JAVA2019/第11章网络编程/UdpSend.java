import java.net.*;

/*
	����ͨ��UDP���䷽ʽ ��һ���������ݷ��ͳ�ȥ

	1.����UdpSocket����
	2.�ṩ���ݣ��������ݷ�װ�����ݰ���
	3.ͨ��socket����ķ��͹��ܣ������ݰ����ͳ�ȥ
	4.�ر���Դ
*/
public class UdpSend
{
	public static void main(String[] args) throws Exception{

		//����Udp����
		DatagramSocket ds=new DatagramSocket(8888);

		//ȷ������
		byte[] data="udp is coming.".getBytes();
		DatagramPacket dp=new DatagramPacket(data,data.length,InetAddress.getByName("192.168.56.1"),10000);//192.168.56.255�ǹ㲥 �����ڸ�����ε��������ܽ��ܵ������Ϣ

		//ͨ��Socket���񣬽����е����ݰ����ͳ�ȥ
		ds.send(dp);

		//�ر���Դ
		ds.close();
	}
}