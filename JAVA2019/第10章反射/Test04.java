/*
	��ȡClass���͵Ķ���֮�󣬿��Դ�����Ӧ��Ķ���
*/
public class Test04
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("Employee");
		//T newInstance(){}
		Object o=c.newInstance();//������Employee���޲������췽��
		System.out.println(o);
	}
}