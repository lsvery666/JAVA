package com.Exception.myexception;

/*
	需求：注册时要求用户名长度不得少于6位
	自定义无效名字异常：
		1.编译时异常，直接继承Exception
		2.运行时异常，直接继承RunTimeException
*/

public class IllegalNameException extends Exception{
    //定义两个构造方法
    public IllegalNameException(){}
    public IllegalNameException(String msg){
        super(msg);
    }
}