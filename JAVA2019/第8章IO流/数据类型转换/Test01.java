/*
	byte����ȡֵ��Χ-128-127����10000000-01111111

	�����������UGB���룬һ����ĸ'a'������һ��ռ�������ֽڵ��ַ�������97����01100001��ռһ���ֽ�
	��һ������'��'�ڱ���ʱռ���������ֽڼ�10110011 10001011

	��˰��ֽ�������ʱ��Ӣ����ĸ������ȷ���룬���Ǻ��ֻ�������룬�硰�����ֶ���ʱ������-51 -11������������10110011 10001011��
	����String(bytes)���Խ�-51 -11 �ٴ�ת��Ϊ���С�

	���ַ�������ʱ�����ֿ�����ȷ���룬Ӣ����ĸ'a'����01100001��������ռһ���ֽڣ����ǰ��ַ�������ʱ����λ���Զ����㣬��00000000 01100001
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		//�ļ��ֽ���������ȡ���֡�������һ��byte��������
		FileInputStream fis=new FileInputStream("��.txt");//��.txt ��дһ������"��"
		byte[] bytes=new byte[2];
		int temp=0;
		while((temp=fis.read(bytes))!=-1){
			System.out.println(new String(bytes));//��
		}
		for(int i=0;i<2;i++){
			System.out.println(bytes[i]);//-51 -11
		}
		fis.close();

		//�ļ��ַ���������ȡӢ����ĸ
		FileReader fr=new FileReader("ab.txt");//ab.txt ��д������ĸ"ab"
		char[] ch=new char[2];
		int temp2=0;
		while((temp2=fr.read(ch))!=-1){
			System.out.println(new String(ch));//ab
		}
		for(int i=0;i<2;i++){
			System.out.println(ch[i]);//a b
		}
		fr.close();

		//�����֡�������byte�����������ʽд���ļ� ���.txt
		byte[] bytes2={-51,-11};
		System.out.println(new String(bytes2));
		FileOutputStream fos=new FileOutputStream("���.txt");
		fos.write(bytes2);
		fos.flush();
		fos.close();
	}
}