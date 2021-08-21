import java.io.*;
//br.readLine()每调用一次 就会获取一次控制台输入
public class Test
{
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	}
}