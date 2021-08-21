/*
	使用BufferedReader和BufferedWriter完成复制
*/
import java.io.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("temp.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));
		String temp = null;
		while((temp=br.readLine())!=null){
			bw.write(temp+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}