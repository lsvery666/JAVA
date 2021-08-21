/*
	接受用户键盘输入 
*/
import java.util.*;
import java.io.*;
public class Test03
{
	public static void main(String[] args) throws Exception{
		/*
		//以前的方式
		Scanner s = new Scanner(System.in);//System.in是一个static InputStream类型的成员变量，标准的输入流，默认接受键盘的输入  
		String str = s.next();//只能获得空格前的字符串，如Hello World只能接受到Hello
		System.out.println("您输入了:"+str);
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("您输入了:"+str);
		br.close();
	}
}