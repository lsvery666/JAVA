public class _06_switch{
	public static void main(String[] args){
		double a=56.7;
		int b=(int)(a/10);
		switch(b){

			//default:
			//	System.out.println("������");
			case 9:case 10:
				System.out.println("����");
				break;
			case 7:case 8:
				System.out.println("����");
				break;
			case 6:
			   System.out.println("����");
			   break;
			default:
				System.out.println("������");
			
		}

		String s = "hello";

		switch(s){
			
			case "hello":

				System.out.println(s);

				break;
		
		}
	}
}