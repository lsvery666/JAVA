//��������ʱ����Ĵ���
public class ArrayTest6{
	public static void main(String[] args){
		//��һ�ַ�ʽ
		int[] a = {1, 2, 3, 4, 5};
		m1(a);
		
		//�ڶ��ַ�ʽ
		m1(new int[]{1, 2, 3, 4, 5});

		// m1({1, 2, 3, 4, 5});		// ���󣺷Ƿ��ı��ʽ��ʼ
	}

	public static void m1(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}