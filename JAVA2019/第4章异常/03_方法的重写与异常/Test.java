/*
	1�������า�Ǹ���ķ���ʱ���������ķ����׳����쳣����ô����ķ���Ҫô���׳��쳣Ҫô�׳������쳣���߸��쳣�����࣬�����׳������쳣��
	2����������׳��˶���쳣����ô�����ڸ���ʱֻ���׳�������쳣���Ӽ���

	ע�⣺
	���������߽ӿ��еķ���û���׳����쳣����ô�����ǲ������׳��쳣�ģ��������ĸ��ǵķ����г������쳣��ֻ��try����throws��
	�������쳣�����޷������Ѿ�Ӱ�������෽���ľ������㣬��ʱ���������෽���У�ͨ��throw�׳�RuntimeException�쳣���������࣬����������ķ������ǲ���Ҫthrows�����ġ�
*/
import java.io.*;
//class A{
//	public void m1(){}
//}
//class B extends A{
//	public void m1() throws Exception{}
//}

//class C{
//	public void m1() throws FileNotFoundException{}
//}
//class D extends C{
//	public void m1() throws IOException{}
//}

class E{
	public void m1() throws IOException{}
}
class F extends E{
	public void m1() throws FileNotFoundException{}
}

