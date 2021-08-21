public class Customer{//����ʽ
	//����ؽ׶θ�ֵ����ֻ��ֵһ��
	private static final Customer c = new Customer();
	//���췽��˽�л�
	private Customer(){}

    public static Customer getInstance(){
		return c;
	}
}