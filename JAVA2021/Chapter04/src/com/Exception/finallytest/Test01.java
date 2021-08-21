package com.Exception.finallytest;
import java.io.*;

/*
	1.finally语句块可以直接和try语句块连用 try...finally... 先执行try再执行finally
	2.try...catch...finally也可以
	3.在finally语句块中的代码是一定会执行的，return也无法打断
	4.只有程序在执行finally之前退出了JVM，如遇到Error或System.exit(0)，finally语句块才不会执行
	5.finally很有用，主要用户关闭资源。无论是否发生异常，资源都必须进行关闭。
*/

public class Test01{
    public static void main(String[] args){
		/*编译通过
		try{
			System.out.println("ABC");
			return;
		}finally{
			//执行
			System.out.println("Test");
		}
		*/

		/*编译不通过
		try{
			FileInputStream fis=new FileInputStream("abc.java");

			System.out.println("TTT");

		}finally{

			System.out.println("AAA");
		}
		*/

		/*main()后加上throws FileNotFoundException
		try{
			FileInputStream fis = new FileInputStream("abc.java");

			//不执行
			System.out.println("TTT");

		}finally{

			//执行
			System.out.println("AAA");

		}
		编译通过
		运行结果为：
			AAA
			Exception in thread "main" java.io.FileNotFoundException: abc.java (系统找不到指定的文件。)
			at java.base/java.io.FileInputStream.open0(Native Method)
			at java.base/java.io.FileInputStream.open(Unknown Source)
			at java.base/java.io.FileInputStream.<init>(Unknown Source)
			at java.base/java.io.FileInputStream.<init>(Unknown Source)
			at Test.main(Test.java:18)
		*/

		/*
		//只有程序在执行finally之前退出了JVM，finally语句块才不会执行
		try{
			//退出JVM
			System.exit(0);
		}finally{
			//不会执行
			System.out.println("AAA");
		}
		*/

        try{
            FileInputStream fis = new FileInputStream("abc.java");
            //不执行
            System.out.println("TTT");

        }catch(FileNotFoundException e){
            //执行
            System.out.println("BBB");
            return;
        }finally{
            //执行
            System.out.println("AAA");
        }
		/*
		结果为：
		BBB
		AAA
		*/
    }
}
