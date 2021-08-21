/*
	java.io.InputStream;
		java.io.FileInputStream; �ļ��ֽ�������

		�����ֽڷ�ʽ��ȡ�ļ�
	
	��Ա������
		int read() ����ֵ-1 ~ 255, -1�����Ѿ��������ļ�ĩβ, 0 ~ 255��һ���ֽڶ�Ӧ��ʮ�����޷�������Χ

	�����������UGB���룬һ����ĸ'a'������һ��ռ�������ֽڵ��ַ�������97����01100001��ռһ���ֽ�
	��һ������'��'�ڱ���ʱռ���������ֽڼ�11010110 11010000	( 214 208 )
*/
import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileInputStream fis=null;
		try{
			//1.Ҫ��ȡĳ�ļ�����������ļ�����һ��"������"��
			//�ļ�·��
			//String filePath="temp01.txt";//���·������Ե�ǰ���ԣ��ڵ�ǰ·������
			//String filePath="D:\\Lisen\\JAVA\\����\\��8��IO��\\02_FileInputStream\\temp01.txt";
			String filePath = "D:/Lisen/JAVA/����/��8��IO��/02_FileInputStream/temp01.txt";
			fis = new FileInputStream(filePath);	// FileNotFoundException if !filePath.exists()
			
			//2.��ʼ��
			int i1 = fis.read();//���ֽڵķ�ʽ��ȡ
			int i2 = fis.read();
			int i3 = fis.read();
			int i4 = fis.read();
			int i5 = fis.read();
			int i6 = fis.read();
			int i7 = fis.read();
			
			System.out.println(i1);//214
			System.out.println(i2);//208
			System.out.println(i3);//97
			System.out.println(i4);//98
			System.out.println(i5);//99
			System.out.println(i6);//100
			System.out.println(i7);//-1 ����Ѿ��������ļ�β������-1
			
		}catch(FileNotFoundException e){

			e.printStackTrace();
		
		}catch(IOException e){
			
			e.printStackTrace();

		}finally{
		
			//Ϊ�˱�֤��һ�����ͷţ�������finally��������
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		
		}
	}
}

