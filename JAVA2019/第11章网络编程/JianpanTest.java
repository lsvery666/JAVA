//换行符 '\n' 或 "\n"

import java.io.*;

public class JianpanTest
{
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//if(br.readLine().length()==0){ //"" null "\n"都不对

		//	System.out.println("您输入的是一个回车");

		//}
		if(br.readLine()==null){

			System.out.println("您输入的是一个ctrl+c");
		}
	}

}
