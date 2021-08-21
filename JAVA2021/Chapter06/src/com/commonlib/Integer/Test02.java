package com.commonlib.Integer;

/*
	以java.lang.Integer类型为例，讲解八种基本数据类型
*/
public class Test02{
    public static void main(String[] args){
        //获取int类型的最大值和最小值
        System.out.println("int最小值："+Integer.MIN_VALUE);//int最小值：-2147483648
        System.out.println("int最大值："+Integer.MAX_VALUE);//int最大值：2147483647

        //创建Integer类型的对象
        Integer i1 = 10; //int-->Integer
        Integer i2 = Integer.valueOf("123"); //String-->Integer
        System.out.println(i1);//10
        System.out.println(i2);//123

        //以下程序编译可以通过，但是运行的时候会报异常，数字格式化异常
        //虽然可以将字符串转换成Integer类型，但是该字符串也必须是数字字符串
        Integer i3 = Integer.valueOf("abc");//NumberFormatException
    }

}
