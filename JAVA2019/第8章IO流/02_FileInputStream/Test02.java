//���³������ȱ�㣺Ƶ�����ʴ���
import java.io.*;
public class Test02{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("temp01.txt");
		while(true){
			int temp = fis.read();
			if(temp == -1) break;
			System.out.println(temp);
		}
		//����ѭ��
		int temp = 0;
		while((temp=fis.read())!=-1){
			System.out.println(temp);
		}
		//�ر�
		fis.close();
	}
}