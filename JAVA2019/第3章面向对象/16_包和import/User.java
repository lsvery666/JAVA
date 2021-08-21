/*
	软件包机制：
	为了解决类的命名冲突问题，在类名前加命名空间（包机制）
	在JAVA中使用package语句定义包（单包，复包）
	package语句只能出现在.java源文件的第一行
	package定义的格式通常采用公司域名倒叙方式
	例如：com.bjpowernode.oa.system;
	以上包含义：bjpowernode公司开发oa项目，system是oa项目中其中一个模块
	package定义的全格式：公司域名倒叙.项目名.模块名
	完整的类名是带有包名的。
	带有package语句的Java源文件必须这样编译：
		javac -d 生成路径 java源文件路径
		且此时编译器无法自动编译相关的类，需要手动编译或者用*.java
	生成的.class文件会存储在生成路径下的<公司域名倒叙>文件夹中的<项目名>文件夹中的<模块名>文件夹中
	运行：java <包名>.<类名>
*/
package com.bjpowernode.javase.day5;
public class User{
	public static void main(String[] args){
		System.out.println("User's main method invokes");
	}

}
