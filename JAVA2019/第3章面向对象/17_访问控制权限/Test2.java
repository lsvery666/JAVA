package bjpowernode;
import com.User;	// ��ǰ·���µ�com.User�������pulic�ģ������ڱ�İ�������
// import com.Test;	// ����: Test��com�в��ǹ�����; �޷����ⲿ������ж�����з���
public class Test2{
	public static void main(String[]	args){
		// ������ķ������в����Է���protected��ȱʡ���εı���
		User u = new User();
		//System.out.println(u.name);	
		//System.out.prntln(u.age);
		
		// ������������п��Է��ʵ�protected���εı������޷����ʵ�ȱʡ���εı���
		MyUser u2 = new MyUser();
		u2.m1();
	}
}

class MyUser extends User{
	public void m1(){
		System.out.println(this.name);	// null
		//System.out.println(this.age);
	}
}