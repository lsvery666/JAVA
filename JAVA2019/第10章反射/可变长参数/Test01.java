/*
	����java�еĿɱ䳤����
*/
import java.util.*;
import java.text.*;
public class Test01
{
	//m1������һ���ɱ䳤����
	public static void m1(int... a){//m1�����ڵ��õ�ʱ�򴫵ݵ�ʵ�ο�����0~n��
		System.out.println("Test");
	}

	//������Ծ�ȷƥ��ķ���������ø÷�����������ȥִ�пɱ䳤�������Ǹ�����
	public static void m1(int i){
		System.out.println(i);
	}

	public static void m2(String... args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}

	public static void m3(Class... args) throws Exception{
		for(int i=0;i<args.length;i++){
			System.out.println(args[i].newInstance());
		}
	}

	//�ɱ䳤����ֻ�ܳ���һ�Σ�����ֻ�ܳ����������βε����һλ
	//public static void m4(String... a,int i){}

	public static void m4(int i,String...a){}

	public static void main(String[] args) throws Exception{
		m1();
		m1(1);
		m1(1,2);
		m1(3,4,5,6,7);

		m2("����","����","����");
		
		String[] s={"����","����","����"};
		m2(s);

		m3(Date.class,Employee.class);
	}
}