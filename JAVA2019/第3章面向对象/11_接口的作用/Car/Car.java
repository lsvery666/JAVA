//��������
public class Car{
	//����
	Engine e;
	//���췽��
	Car(Engine e){
		this.e = e;
	}
	//����Ӧ���ܹ���������
	public void testEngine(){
		e.start();//����ӿڵ���
	}
}