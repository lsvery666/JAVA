package com.oop.innerClass.anonymousInnerClass;

/*
匿名内部类就是一个没有名字的方法内部类，因此特点和方法与方法内部类完全一致，除此之外，还有自己的特点：
1.匿名内部类必须继承一个抽象类或者实现一个接口。
2.匿名内部类没有类名，因此没有构造方法。
3.匿名内部类也会生成.class文件
 */

public class Test01 {
    public static void main(String[] args)
    {
        Outer out = new Outer();
        out.dispaly(3);
        out.i.test();
    }
}

//匿名内部类
//声明一个接口
interface MyInterface {
    //接口中方法没有方法体
    void test();
}
class Outer{
    private int num = 5;
    // Outer$1.class
    public MyInterface i = new MyInterface() {
        @Override
        public void test() {
            System.out.println("匿名实现MyInterface接口");
        }
    };
    public void dispaly(int temp)
    {
        //匿名内部类，匿名的实现了MyInterface接口
        //隐藏的class声明
        // Outer$2.class
        new MyInterface()
        {
            public void test()
            {
                System.out.println("匿名实现MyInterface接口");
                System.out.println(temp);
            }
        }.test();
    }
}

