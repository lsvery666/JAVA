public class _04_if{
	public static void main(String[] args){
		int a=10;
		if(1<=a&a<=5){
			System.out.println("幼儿");
		}else if(6<=a&a<=18){
			System.out.println("少年");
		}else if(19<=a&a<=35){
			System.out.println("青年");
		}else if(36<=a&a<=55){
			System.out.println("中年");
		}else{
			System.out.println("老年");
		}
	}
}