package com.commonlib.Integer;

/*
	关于Integer中常用的方法
*/
public class Test03{
    public static void main(String[] args0){
        //Integer-->int
        Integer i1 = Integer.valueOf(10);
        System.out.println(i1);	// 10
        int i2 = i1.intValue();
        System.out.println(i2+1);//11

        //重要:static int parseInt(String s){}
        int age = Integer.parseInt("25");
        System.out.println(age+1);//26

        //重要：static double parseDouble(String s){}
        double pi = Double.parseDouble("3.1415");
        System.out.println(pi+1.0);//4.1415000000001

        //将Integer类型的十进制转换成2进制
        String s1 = Integer.toBinaryString(Integer.valueOf(10));
        System.out.println(s1);//1010

        //将int类型的十进制转换成8进制
        String s2 = Integer.toOctalString(10);
        System.out.println(s2);//12

        //将int类型的十进制转换成16进制
        String s3 = Integer.toHexString(10);
        System.out.println(s3);//a

        //int-->Integer
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf("10");
        System.out.println(i3);//10
        System.out.println(i4);//10
    }

}
