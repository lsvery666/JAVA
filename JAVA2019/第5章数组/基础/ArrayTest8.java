/*
	��������Ŀ���
	
	��ҵ���Լ���дһ�����Կ�������ķ���
	
	java.System���ṩ�ķ�����
	public static void arraycopy(Object scr,int srcPos,Object dest,int destPos,int length)
	������src�д��±�srcPos��ʼ��length��Ԫ�ظ�ֵ������dest�д��±�destPos��ʼ��length��Ԫ��
	
	���ֻ�������û�м̳�Object�࣬��˻�����������int[]�޷��Զ�ת��ΪObject[]����String[]�����Զ�ת��ΪObject[]��������
*/
public class ArrayTest8{
	public static void main(String[] args){
		
		int[] a = {1, 23, 4};
		int[] b = {1, 2, 3, 4, 5};
		System.arraycopy(a,0,b,1,3);
		// ArrayCopy(a,0,b,1,3);	// ����: �����ݵ�����: int[]�޷�ת��ΪObject[]
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
	
	//�Լ���д��������
	public static void ArrayCopy(Object[] a, int x, Object[] b, int y, int l){
		for(int i=0;i<l;i++){
			b[y+i] = a[x+i];
		}
	}
}