/*
	import 语句可以引入其他类
	import语句只能出现在package语句之下，class定义的语句之上,import语句可以有多个
	java.lang软件包下所有类不需要手动导入，系统默人导入，如Object
	import仅仅是为了简化代码书写
*/
package com;
//import com.bjpowernode.javase.day5.User;
//import com.bjpowernode.javase.day5.*;
import java.util.Date;
public class Test02{
	public static void main(String[] args){
		//User u=new User();错误 当前包和引用包中找不到User.class
		com.bjpowernode.javase.day5.User u=new com.bjpowernode.javase.day5.User();
		System.out.println(u);//com.bjpowernode.javase.day5.User@5f8ed237
		
		//import之后，可以简化：
		//User u1 = new User();
		//System.out.println(u);
		
		// java.util.Date d = new java.util.Date();		// 不import，直接这样写也可以
		Date d = new Date();
		System.out.println(d);//Wed Nov 14 14:50:10 CST 2018
		
		Object o = new Object();
		System.out.println(o);//java.lang.Object@e580929
	}
}