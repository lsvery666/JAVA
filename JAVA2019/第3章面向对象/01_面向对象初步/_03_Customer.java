//����һ���˿�����
public class _03_Customer{

	//˽������
	private int age;//private���ε�����ֻ���ڱ����з���

	//�����ṩ�����ķ������з���
	public int getAge(){  //���η��в���static����Ϊ��Ա������ʵ���������Ǿ�̬����
		return age;
	}

	public void setAge(int _age){
		//��ȫ����
		if(_age<0|_age>0){
			System.out.println("���䲻�Ϸ�");
		}else{
			age=_age;
		}
	}
}