//Garbage collection
//����û�����ã�����������
public class _07_GC{
	public static void main(String[] args){
		//u1�����ã�����ָ����ж�����ڴ��ַ��
		_05_User u1 = new _05_User();

		//����ִ�е��˴���u1����ָ����еĶ��󣬶�������������
		u1 = null;
		
		//ʹ��һ���յ�����ȥ���ʳ�Ա�������ʲô���⣿
		System.out.println(u1.name);
		//�����ͨ���������л����NullPointerException(��ָ���쳣)
		
		Star s = new Star();
		s = null;
		s.sing(); //NullPointerException
	}
}
class Star{
	//��Ա����
	public void sing(){
		System.out.println("Sing a song");
	}
}