/*
	����IO��Properties����Ӧ��

	dbinfo�������ļ����ǳ��������ļ�
	�����ļ������þ��ǣ�ʹ����������

	һ���ڳ����пɱ�Ķ�����Ҫд�����Ƽ�д�������ļ���
	����ͬ���ĳ���õ���ͬ�Ľ��

	��dbinfo����һ�������������ݵ������ļ������ֽ��������ļ�
	java�淶��Ҫ�������ļ���.properties��β

	�����ļ�������Ҫ��
		key��value֮�������"=",":"," "������
		���" "��"=",":"���У�����ǰ�����Ϊ�ָ���
*/
import java.io.*;
import java.util.*;
public class Test
{
	public static void main(String[] args) throws Exception{
		//1.�������Զ���
		Properties p=new Properties();//��Mapһ����ֻ����key��valueֻ�ܴ洢�ַ�������
												//key�����ظ�������ظ���value����

		//2.����������
		FileInputStream fis=new FileInputStream("dbinfo.properties");
		
		//��fis���е��������ݼ��ص����Զ�����
		//3.����
		p.load(fis);
		fis.close();
		String v=p.getProperty("username");
		System.out.println(v);
	}
}