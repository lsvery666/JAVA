import java.util.Scanner;
public class KeyInput{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		//程序执行到此处，停下来，等待用户的输入
		String userInput=s.next();
	
		System.out.println("您输入了："+userInput);
	}
}