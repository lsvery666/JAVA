public class CustomerService{
	public void register(String name) throws IllegalNameException{
		if(name.length()<6){
			//IllegalNameException e = new IllegalNameException("�û������Ȳ�������6λ");
			//throw e;
			throw new IllegalNameException("�û������Ȳ�������6λ");
		}
		System.out.println("ע��ɹ�");
	}
}