/*
	java��ʵ���̵߳ĵڶ��ַ�ʽ��
		��һ����дһ����ʵ��java.lang.Runnable�ӿ�
		�ڶ�������дrun����

		���ַ�ʽ���Ƽ��ģ���Ϊ��������ļ̳�
*/
public class Test03
{
	public static void main(String[] args){
		Thread t = new Thread(new Processor());
		t.start();
	}
}
class Processor implements Runnable
{
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println("run-->"+i);
		}
	}
}