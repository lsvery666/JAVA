/*
	�쳣�Ĳ���
	Throwable�����׳��ġ� 
	|--Error������һ������£�����д����ԵĴ�����д���ͨ����jvm�����ģ���Ҫ�Գ������������OutOfMemoryError��StackOverFlowError
	|--Exception���쳣������������ԵĴ���ʽ IndexOutOfBoundsException��NullPointerException��ClassCastException��FileNotFoundException
	
	�쳣�����֣�
	1������ʱ�������쳣��ֻҪ��Exception�������඼�Ǳ���ʱ�������쳣��
	2������ʱ�쳣������Exception��һ�����������RuntimeException���Լ�RuntimeException�������������쳣��Ҳ��˵����쳣�Ǳ���ʱ���������쳣��

	����ʱ�������쳣������ʱ�쳣������
	����ʱ�������쳣�ں����ڱ��׳�����������Ҫ�����������ʧ�ܡ�
	������ԭ������Ҫ�����߶Ը��쳣���д���
	����ʱ�쳣����ں����ڱ��׳����ں����ϲ���Ҫ������
	��������ԭ�򣺲���Ҫ�����ߴ�������ʱ�쳣�������Ѿ��޷����ó���������У����ԣ����õ��ô���ģ�ֱ���ó���ֹͣ���ɵ����߶Դ������������

*/
import java.io.*;
public class ExceptionTest{
	public static void main(String[]args) throws FileNotFoundException {	//��throws IOException �� throws Exception
		//�����ļ�����������ȡ�ļ�
		FileInputStream fis = new FileInputStream("ab.txt");
	}
}
/*
	���벻ͨ����
	ThrowsTest.java:8: ����: δ������쳣����FileNotFoundException; 
	���������в���������Ա��׳�
			FileInputStream fis = new FileInputStream("ab.txt");
*/