/*
	����JAVA�����е�����ת�ͺ�����ת��
	����ת�ͣ�upcasting ��ת��
	����ת�ͣ�downcasting ��ת��
	����������ת�ͻ�������ת�ͣ�������֮�����Ҫ�м̳й�ϵ

	��Ա���� --- �������ж��� = ��ߡ�
	��Ա���� --- ���뿴 = ��ߣ����п� = �ұߡ�
	��̬���� --- �������ж��� = ��ߡ�
*/
public class Test2{
	public static void main(String[] args){
		
		//����ת���ֱ��������Զ�����ת��
		//�����͵�����ָ�������Ͷ���
		//����������׶Σ�����׶Σ����н׶�
		//�������׶�ֻ֪��a1��һ��Animal����
		//���������е�ʱ����е�ʵ�ʶ�����Cat����
		Animal a1 = new Cat();

		//�Ӹ����Ա����ͬ�� ���۱�������У���Ա�����ο��Ķ������ñ������������еĳ�Ա����
		System.out.println(a1.name);//animal
		System.out.println(((Cat)a1).name);//cat
		
		//�����ڱ���׶�a1��������������Animal����
		//���Գ����ڱ���׶�a1���ð󶨵���Animal���е�eat��������̬�󶨣�
		//���������е�ʱ����еĶ���ʵ������Cat���ͣ���Cat�Ѿ���д��eat����
		//���Գ��������н׶ζ���İ󶨵ķ�����Cat�е�eat����(��̬��)
		a1.eat();//è����
		
		
		Animal a2 = new Cat();//����ת��
		
		//Ҫִ��move��������ô����
		// a2.run();	// ����: �Ҳ������� a2.run();
		//ֻ��ǿ������ת������Ҫ��ǿ������ת����
		//����ת�ͣ�ǿ������ת��
		Cat c1 = (Cat)a2;
		c1.run();//è����è��
		
		//�ж�һ�³������е�ʱ����ʲô���⣿
		/*
		Animal a3 = new Dog();
		Cat c2 = (Cat)a3;//����ͨ����������ʱ�ᱨClassCastException�쳣
		*/
		//����ǿ������ת����ʱ������Ǵ��ڷ��յ�
		//Ϊ�˱���ClassCastException�ķ�����JAVA������instanceof
		
		/*
			�÷���
			instanceof�������������ʱboolean����
			��<����> instanceof <����>)    ֵΪtrue or false
			���磺(a instanceof Cat)��������true
			��ʾa����ָ����е�JAVA����ʱCat����
		*/
		Animal a3 = new Dog();
		System.out.println(a3 instanceof Cat);	//False
		
		//�Ƽ�����������ת�͵�ʱ��Ҫʹ��instanceof������жϣ�����ClassCastException
		if(a3 instanceof Cat){
			Cat c2 = (Cat)a3;
		}
	}
}