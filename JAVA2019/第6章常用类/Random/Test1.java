/*
*/
import java.util.Random;
public class Test1{
	public static void main(String[] args){
		//����һ���µ������������
		Random r = new Random();
		//����int���͵������
		int i = r.nextInt(101);//[0,100)֮����������
		System.out.println(i);
		//ѭ������5�������
		for(int j=0;j<5;j++){
			int a=r.nextInt(101);//[0,100)֮����������
			System.out.println(a);
		}
	}
}