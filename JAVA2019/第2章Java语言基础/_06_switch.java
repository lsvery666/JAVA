public class _06_switch{
	public static void main(String[] args){
		double a=56.7;
		int b=(int)(a/10);
		switch(b){

			//default:
			//	System.out.println("不及格");
			case 9:case 10:
				System.out.println("优秀");
				break;
			case 7:case 8:
				System.out.println("良好");
				break;
			case 6:
			   System.out.println("及格");
			   break;
			default:
				System.out.println("不及格");
			
		}

		String s = "hello";

		switch(s){
			
			case "hello":

				System.out.println(s);

				break;
		
		}
	}
}