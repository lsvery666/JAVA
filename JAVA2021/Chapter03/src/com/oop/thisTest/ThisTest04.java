package com.oop.thisTest;

/*
	this关键字可以用在构造方法中，通过一个构造方法来调用另一个构造方法
	用this调用构造函数，必须定义在构造函数的第一行。因为构造函数是用于初始化的，所以初始化动作一定要执行。否则编译失败。
*/
public class ThisTest04{
    public static void main(String[] args){
        Mydate t1 = new Mydate();
        System.out.println(t1.year+"年"+t1.month+"月"+t1.date+"日");

    }
}

class Mydate{
    //成员变量
    int year;
    int month;
    int date;

    //构造方法
    //需求：在创建日期时，默认的日期是1997-1-1
    Mydate(){
		/*
			year=1997;
			month=1;
			date=1;
		*/
        // System.out.println("无参构造方法执行");	// 错误: 对this的调用必须是构造器中的第一个语句
        this(1997,1,1);
    }

    Mydate(int _year,int _month,int _date){
        year = _year;
        month = _month;
        date = _date;
    }
}
