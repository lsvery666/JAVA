/*��̬��ʼ��
	��̬��ʼ��һά���飬�����ڶ��ڴ��з���������飬����������ÿһ��Ԫ�ض�����Ĭ��ֵ
	println(a) aΪ���ã���aΪ��ָ�룬ֱ�����null����a��Ϊ��ָ�룬�����a.toString
	���������println(a.toString()) aΪ���ã���aΪ��ָ�룬��������ʱ������ָ���쳣
*/

public class ArrayTest3{
	public static void main(String[] args){
		
		//��̬����һ��int���͵����飬�����Դ洢�ĸ�Ԫ��
		int[] a1 = new int[4];
		
		//����
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		
		//��ֵ
		a1[0] = 21;
		a1[1] = 22;
		a1[2] = 23;
		a1[3] = 24;
		
		//�ٴα���
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		
		//�������͵�����
		Object[] objs = new Object[3];
		
		/*��һ�ֱ�������
		for(int i=0;i<objs.length;i++){
			System.out.println(objs[i]);
		}
		����ͨ�������н��Ϊ��
		null
		null
		null
		*/
		
		System.out.println("============");//�ָ���
		
		/*�ڶ��ֱ�������
		for(int i=0;i<objs.length;i++){
			Object o = objs[i];
			System.out.println(o.toString());
		}
		����ͨ�������н��Ϊ��
		Exception in thread "main" java.lang.NullPointerException
        at ArrayTest3.main(ArrayTest3.java:26)
      */
      
      System.out.println("============");//�ָ���
      
      /*�����ֱ�������
      for(int i=0;i<objs.length;i++){
			Object o = objs[i];
			System.out.println(o);
		}
		����ͨ�������н��Ϊ��
		null
		null
		null
		*/
		
		 System.out.println("============");//�ָ���
		 
		//�����ֱ�������
		for(int i=0;i<objs.length;i++){
			objs[i] = new Object();
			System.out.println(objs[i]);
		}
		/*����ͨ�������н��Ϊ��
		java.lang.Object@161cd475
		java.lang.Object@532760d8
		java.lang.Object@57fa26b7
		*/
	}
}