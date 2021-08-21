//以下程序存在缺点：频繁访问磁盘
import java.io.*;
public class Test02{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("temp01.txt");
		while(true){
			int temp = fis.read();
			if(temp == -1) break;
			System.out.println(temp);
		}
		//升级循环
		int temp = 0;
		while((temp=fis.read())!=-1){
			System.out.println(temp);
		}
		//关闭
		fis.close();
	}
}