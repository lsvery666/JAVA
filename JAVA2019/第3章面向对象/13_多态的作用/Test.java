/*
	����ι������
	��̬�����ã�
		1.ʹ�ö�̬����ʹ����֮�����϶Ƚ���
		2.��Ŀ����չ������ǿ
*/
public class Test{
	public static void main(String[] args){
		
		//����
		Person a = new Person();
	 	a.name = "����";
		
		//����
		Cat b = new Cat();
		
		//����ι������
		a.feed(b);	//Anima a = new Cat();��̬
		
		//�����������������һ��Dog���ͣ�������չ���¼���
		Dog d = new Dog();
		a.feed(d);
		
	}
}