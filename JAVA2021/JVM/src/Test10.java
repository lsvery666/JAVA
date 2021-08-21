/*
成员内部类
1 内部类对象的创建依赖于外部类对象；

2 内部类对象持有指向外部类对象的引用。

关于内部类如何访问外部类的成员， 分析之后其实也很简单， 主要是通过以下几步做到的：

1 编译器自动为内部类添加一个final成员变量， 这个成员变量的类型和外部类的类型相同， 这个成员变量就是指向外部类对象的引用；

2 编译器自动为内部类的构造方法添加一个参数， 参数的类型是外部类的类型， 在构造方法内部使用这个参数为1中添加的成员变量赋值；

3 在调用内部类的构造函数初始化内部类对象时， 会默认传入外部类的引用。

成员内部类和匿名内部类中确实都持有外部类的引用， 静态内部类中未持有外部类的引用
解决方案：将匿名内部类，改为静态内部类或声明为单独的类。

 */
public class Test10 {
    int num = 10;

    static class MyThread extends Thread {
        @Override
        public void run() {
            // 静态内部类中未持有外部类的引用
            // System.out.println(num);
            System.out.println("静态内部类");
        }
    }

    Thread t = new Thread() {
        @Override
        public void run() {
            // 匿名内部类中持有一个外部类Test10的引用
            System.out.println(num);
            System.out.println("匿名内部类");
        }
    };

}
