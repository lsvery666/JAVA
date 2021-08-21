/*
	处理异常的方式二：捕捉处理异常
	语法：
		try{
			可能出现异常的代码;
		}catch(异常类型1 变量){
			处理异常的代码;
		}catch(异常类型2 变量){
			处理异常的代码;
		}catch(异常类型3 变量){
			处理异常的代码;
		}
	1.catch语句块可以写多个
	2.但是从上到下catch的异常类型必须从小到大（从子到父）
	3.catch语句块最多只能执行一个，执行完，try-catch语句就结束了
*/
import java.io.*;
public class TryCatch{
	public static void main(String[] args){
		/*以下程序编译不会通过 因为FileNotFoundException不是ArithmeticException的子类
		try{
			FileInputStream fis=new FileInputStream("ab.txt");
		}catch(ArithmeticException e){
		}
		*/
		
		
		/*以下程序编译通过
		try{
			FileInputStream fis=new FileInputStream("ab.txt");
		}catch(FileNotFoundException e){
		}
		*/
		
		/*以下程序编译不会通过	因为fis.read()会产生另一个叫做IOException的异常
		try{
			FileInputStream fis = new FileInputStream("ab.txt");
			fis.read();
		}catch(FileNotFoundException e){
		}
		*/
		
		
		/*以下程序通过
		try{
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}
		*/
		
		//以下程序编译通过
		try{
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(IOException e){
			
		}
		
		
		/*编译无法通过：catch可以写多个，但是必须从上到下的异常类型从小到大
		try{
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(IOException e){
			
		}catch(FileNotFoundException e){
			
		}
		*/
	}
	
}