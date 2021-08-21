package com.commonlib.Integer;
/*
	深入自动装箱和自动拆箱：
		1.自动装箱和自动拆箱是程序编译阶段的一个概念，和程序运行无关。
		2.自动装箱和自动拆箱主要目的是方便程序员编码。
*/
public class Test06{
    public static void main(String[] args){
        //对于包装类，如果数据是在(-128~127)之间，JAVA中引入了一个"整型常量池"
        //该整型常量池只存储-128~127之间的数据

        Integer i1 = 100;//这个程序不会在堆中创建对象
        Integer i2 = 100;
        System.out.println(i1==i2);//true

        Integer i3 = -128;
        Integer i4 = -128;
        System.out.println(i3==i4);//true

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5==i6);//false

        Integer i7 = Integer.valueOf(128);
        Integer i8 = Integer.valueOf(128);
        System.out.println(i7==i8);//false

        Integer i9 = Integer.valueOf(100);
        Integer i10 = Integer.valueOf(100);
        System.out.println(i9==i10);//true

        int a = 3;
        int b = a;
        System.out.println(a==b);	// true
        a = 4;
        System.out.println(a==b);	// false
        System.out.println(b);		// 3

        Integer x = 3;
        Integer y = x;
        System.out.println(x==y);	// true
        x = 4;	// x指向了另一个对象，而不是将3改成了4
        System.out.println(x==y);	// false
        System.out.println(y);		// 3

    }
}
