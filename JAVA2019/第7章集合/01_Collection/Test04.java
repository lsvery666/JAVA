/*
	boolean removes(Object o);
	remove �� contains��������Ҫ�����е�Ԫ����дequals����
*/
import java.util.*;
public class Test04{
	public static void main(String[] args){
		Collection c = new ArrayList();
		Integer i1 = 10;
		c.add(i1);
		Integer i2 = 10;
		c.remove(i2);
		System.out.println(c.size());//0

		Manager m1 = new Manager(100,"SMITH");
		c.add(m1);
		Manager m2 = new Manager(100,"SMITH");
		c.remove(m2);
		System.out.println(c.size());//1����equals������д�����0
	}
}