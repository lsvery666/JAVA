package com;
/*
	���ʿ���Ȩ�����η���public��protected��ȱʡ��private
	
	1.�������ֻ��public��ȱʡ��ȱʡ���ε��಻��ͨ��import����

	2.�������η����������η����ͱ���
	private��ֻ���ڱ����з���
	ȱʡ��������ԣ�ͬһ���������ã���ͬ���²��У������ڰ��ⲻ���ԣ��ڰ��ڿ���
	protected�����࣬ͬһ������,��ͬ���²��У������п���
	public������������λ�÷���

*/
public class User{
	//protected����
	protected String name;

	//ȱʡ(default)����
	int age;	
}

class Test{
	public static void main(String[] args){
		User u=new User();
		System.out.println(u.name);		// null
		System.out.println(u.age);		// 0
	}
}