/*
	import ����������������
	import���ֻ�ܳ�����package���֮�£�class��������֮��,import�������ж��
	java.lang������������಻��Ҫ�ֶ����룬ϵͳĬ�˵��룬��Object
	import������Ϊ�˼򻯴�����д
*/
package com;
//import com.bjpowernode.javase.day5.User;
//import com.bjpowernode.javase.day5.*;
import java.util.Date;
public class Test02{
	public static void main(String[] args){
		//User u=new User();���� ��ǰ�������ð����Ҳ���User.class
		com.bjpowernode.javase.day5.User u=new com.bjpowernode.javase.day5.User();
		System.out.println(u);//com.bjpowernode.javase.day5.User@5f8ed237
		
		//import֮�󣬿��Լ򻯣�
		//User u1 = new User();
		//System.out.println(u);
		
		// java.util.Date d = new java.util.Date();		// ��import��ֱ������дҲ����
		Date d = new Date();
		System.out.println(d);//Wed Nov 14 14:50:10 CST 2018
		
		Object o = new Object();
		System.out.println(o);//java.lang.Object@e580929
	}
}