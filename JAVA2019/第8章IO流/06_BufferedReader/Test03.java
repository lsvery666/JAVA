/*
	�����û��������� 
*/
import java.util.*;
import java.io.*;
public class Test03
{
	public static void main(String[] args) throws Exception{
		/*
		//��ǰ�ķ�ʽ
		Scanner s = new Scanner(System.in);//System.in��һ��static InputStream���͵ĳ�Ա��������׼����������Ĭ�Ͻ��ܼ��̵�����  
		String str = s.next();//ֻ�ܻ�ÿո�ǰ���ַ�������Hello Worldֻ�ܽ��ܵ�Hello
		System.out.println("��������:"+str);
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("��������:"+str);
		br.close();
	}
}