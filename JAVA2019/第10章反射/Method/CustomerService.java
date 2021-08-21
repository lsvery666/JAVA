public class CustomerService
{
	public boolean login(String name,String pwd){
        return "admin".equals(name) && "123".equals(pwd);
    }
	public void logout(){
		System.out.println("ϵͳ�Ѱ�ȫ�˳���");
	}
}