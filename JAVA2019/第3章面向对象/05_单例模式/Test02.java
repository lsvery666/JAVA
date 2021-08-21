public class Test02{
	public static void main(String[] args){
		Customer c1 = Customer.getInstance();
		Customer c2 = Customer.getInstance();
		System.out.println(c1==c2);
	}
}