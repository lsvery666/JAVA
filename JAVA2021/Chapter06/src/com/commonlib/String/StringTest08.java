package com.commonlib.String;

/*
	java.lang.StringBuffer;
	java.lang.StringBuilder;
	1.StringBuffer和StringBuilder是以一个字符串缓冲区
	2.工作原理
		预先在内存中申请一块空间，以容纳字符序列
		如果预留的空间不够用，则进行自动扩容，以容纳更多字符序列
	3.StringBuffer,StringBuilder和String最大的区别？
		String是不可变的字符序列，存储在字符串常量池中
		StringBuffer底层是一个char数组，但是该char数组是可变的，并且可以自动扩容
	4.StringBuffer和StringBuilder的默认初始化容量是16
	5.如何优化StringBuffer和StringBuilder呢？
		最好在创建StringBuffer之前，预测StringBuffer的存储字符数量
		然后再创建StringBuffer的时候采用指定初始化容量的方式创建StringBuffer
		为了减少底层数组的拷贝，提高效率
	6.StringBuffer和StringBuilder的区别？
		StringBuffer是线程安全的，可以在多线程的环境下使用不会出现问题
		StringBuilder是非线程安全的。
    7.StringBuffer是如何保证线程安全的？
        StringBuffer类中的方法都添加了synchronized关键字，也就是给这个方法添加了一个锁，用来保证线程安全。
*/

public class StringTest08 {
    public static void main(String[] args){
        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer(10);//16
        //可以向StringBuffer中追加字符串
        String[] ins = {"运动","音乐","睡觉","美食"};
        //推荐字符串频繁拼接使用StringBuffer或者StringBuilder
        for(int i=0;i<ins.length;i++){
            if(i==ins.length-1){
                sb.append(ins[i]);
            }else{
                sb.append(ins[i]);
                sb.append(",");
            }
        }
        System.out.println(sb);
    }

}
