public class Test{
	public static void main(String[] args){
		//��������
		Engine e = new YAMAHA();//��̬
		//��������
		Car c = new Car(e);
		//��������
		c.testEngine();
		//�����
		c.e = new HONGDA();
		c.testEngine();
	}
}