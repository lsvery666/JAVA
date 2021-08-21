/*
	byte类型取值范围-128-127，即10000000-01111111

	键盘输入采用UGB编码，一个字母'a'并不是一个占用两个字节的字符，而是97，即01100001，占一个字节
	但一个汉字'王'在编码时占用了两个字节即10110011 10001011

	因此按字节流输入时，英文字母可以正确读入，但是汉字会产生乱码，如“王”字读入时，会变成-51 -11（即二进制数10110011 10001011）
	但是String(bytes)可以将-51 -11 再次转换为“中”

	按字符流输入时，汉字可以正确读入，英文字母'a'（即01100001），尽管占一个字节，但是按字符流输入时，高位会自动补零，即00000000 01100001
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		//文件字节输入流读取汉字“王”到一个byte类型数组
		FileInputStream fis=new FileInputStream("王.txt");//王.txt 里写一个汉字"王"
		byte[] bytes=new byte[2];
		int temp=0;
		while((temp=fis.read(bytes))!=-1){
			System.out.println(new String(bytes));//王
		}
		for(int i=0;i<2;i++){
			System.out.println(bytes[i]);//-51 -11
		}
		fis.close();

		//文件字符输入流读取英文字母
		FileReader fr=new FileReader("ab.txt");//ab.txt 里写两个字母"ab"
		char[] ch=new char[2];
		int temp2=0;
		while((temp2=fr.read(ch))!=-1){
			System.out.println(new String(ch));//ab
		}
		for(int i=0;i<2;i++){
			System.out.println(ch[i]);//a b
		}
		fr.close();

		//将汉字“王”以byte类型数组的形式写入文件 输出.txt
		byte[] bytes2={-51,-11};
		System.out.println(new String(bytes2));
		FileOutputStream fos=new FileOutputStream("输出.txt");
		fos.write(bytes2);
		fos.flush();
		fos.close();
	}
}