/*
	�����ڲ���
	��Ҫ���������ڲ��ࣺ��Ҫǰ�ᣬ�ڲ������̳�һ�������ʵ�ֽӿڡ�
	�ŵ㣺�ٶ���һ����
	ȱ�㣺�޷�ʵ�ִ��븴��
*/
public class OuterClass{
	//��̬����
	public static void test(CustomerService cs){
		cs.logout();
	}
	public static void main(String[]	args){
		//����test����
		test(new CustomerServiceImpl());

		//ʹ�������ڲ���ķ�ʽִ��test����
		//�������"new CustomerService(){}"���Ǹ������ڲ���
		test(new CustomerService(){
			public void logout(){
				System.out.println("ϵͳ�Ѿ���ȫ�˳�!");
			}
		});
	}
}

//�ӿ�
interface CustomerService{
	void logout();
}

//��дһ����ʵ���Ͻӿ�
class CustomerServiceImpl implements CustomerService{
	public void logout(){
		System.out.println("ϵͳ�Ѿ���ȫ�˳�!");
	}
}
