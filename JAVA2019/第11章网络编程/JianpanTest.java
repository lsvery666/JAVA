//���з� '\n' �� "\n"

import java.io.*;

public class JianpanTest
{
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//if(br.readLine().length()==0){ //"" null "\n"������

		//	System.out.println("���������һ���س�");

		//}
		if(br.readLine()==null){

			System.out.println("���������һ��ctrl+c");
		}
	}

}
