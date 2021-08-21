package com.Exception.basic;
import java.io.*;
public class Test04{
	/*以下程序编译无法通过
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("abc");
		fis.read();
	}
	*/

	/*以下程序编译可以通过
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis = new FileInputStream("abc");
		fis.read();
	}
	*/

	/*以下程序编译可以通过
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("abc");
		fis.read();
	}
	*/

    //以下程序编译可以通过
    public static void main(String[] args) throws IOException{
        try{

            //程序执行到此处发生了FileNotFoundException类型的异常
            //JVM会自动创建一个FileNotFoundException类型的对象，将该对象的内存地址复制给catch语句块中的e变量
            FileInputStream fis = new FileInputStream("abc");

            //上面的代码出现了异常，try语句块的代码不再继续执行，直接进入catch语句块中执行

            fis.read();

        }catch(FileNotFoundException e){

            System.out.println("读取的文件不存在！");

            //FileNotFoundException将Object中的toString方法进行了重写

            System.out.println(e);//java.io.FileNotFoundException: abc (系统找不到指定的文件。)

        }catch(IOException e){

            System.out.println("其他IO异常！");
        }

        System.out.println("try-catch语句块执行完毕！");

    }

}
