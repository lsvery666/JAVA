public class Test{
	public static void main(String[] args){
		String Username="Jack";
		CustomerService cs=new CustomerService();
		try{
			cs.register(Username);	
		}catch(IllegalNameException e){
			e.printStackTrace();
		}
	}
}