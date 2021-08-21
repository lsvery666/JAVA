import java.net.*;
import java.io.*;

public class UdpSend2
{
	public static void main(String[] args) throws Exception{

		DatagramSocket ds=new DatagramSocket();

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String line=null;

		while((line=br.readLine())!=null){

			byte[] buf=line.getBytes();

			DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("lisen-PC"),10000);

			ds.send(dp);

		}

		ds.close();
	}
}