/*
	���̵߳Ĵ�����ʹ��
	��һ�ַ�ʽ��
		����һ���̣߳��̳�java.lang.Thread;
							��дrun����
		����һ���̣߳�new
		����һ���̣߳�start()
*/
public class Test02
{
	public static void main(String[] args){
		//�����߳�
		Thread t = new MyThread();
		
		//����
		t.start();
		//��δ���ִ��˲�����������JVM�ٷ���һ���µ�ջ��t�߳�
		//run����Ҫ����Ա�ֶ����ã�ϵͳ�߳�����֮���Զ�����run����
		
		//t.run();//������ͨ�������ã�����ֻ��һ���̣߳�run��������֮������������ִ��

		//��δ��������߳�������
		for(int i=0;i<100;i++){
			System.out.println("main-->"+i);
		}

		//���˶��߳�֮��main��������ֻ�����߳�ջ��û�з���ջ֡��
		//���������̻߳�������ջ�л���ջ֡
		//main����������������ܻ�������
	}
}
//����һ���߳�
class MyThread extends Thread
{
	//��дrun����
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("run--->"+i);
		}
	}
}