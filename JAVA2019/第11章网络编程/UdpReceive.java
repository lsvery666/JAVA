import java.net.*;

/*
	���󣺶���һ��Ӧ�ó������ڽ���UDPЭ�鴫������ݲ������
	
	˼·��
	1.����UDPSocket����,ͨ�������һ���˿ڣ���ʵ���Ǹ������������Ӧ�ó�����һ�����ֱ�ʶ����������ȷ��Щ���ݹ�������Ӧ�ó�����д���
	2.����һ�����ݰ�����ΪҪ�洢���ܵ�������
	3.ͨ��socket�����receive�������յ������ݴ����Ѷ���õ����ݰ���
	4.ͨ�����ݰ�����Ĺ��ܣ�������ȡ��
	5.�ر���Դ
*/

public class UdpReceive
{
	public static void main(String[] args) throws Exception{
		
		//����udpsocket���񣬽����˵�
		DatagramSocket ds=new DatagramSocket(10000);//��仰���ܷŵ�whileѭ��������Exception in thread "main" java.net.BindException: Address already in use: Cannot bind

		while(true){
			//�������ݰ������ڴ洢����
			byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf,buf.length);

			//ͨ�������receive�������յ������ݴ������ݰ���
			ds.receive(dp);//����ʽ����

			//ͨ�����ݰ��ķ�����ȡ���е�����
			String ip=dp.getAddress().getHostAddress();

			String data=new String(dp.getData(),0,dp.getLength());//dp.getLength()��ȡ��Ч����

			int port=dp.getPort();

			System.out.println(ip+"::"+data+"::"+port);
		}
		//�ر���Դ
		//ds.close();

	}
}