package Reflection;

/*
类的加载
1. 加载
    将class文件字节码内容加载到内存中，并将这些静态数据（静态变量、静态方法、常量池、代码等）转换成方法区的运行时数据结构，
    然后生成一个代表这个类的java.lang.Class对象
2. 链接
    将Java类的二进制代码合并到JVM的运行状态之中的过程
    验证：确保加载的类信息符号JVM规范，没有安全方面问题
    准备：正式为静态变量分配内存并设置类变量默认初始值的阶段，这些内存都将在方法区中进行分配
    解析：虚拟机常量池内的符号引用（常量名）替换为直接引用（地址）的过程
3. 初始化
    执行类构造器<clinit>()方法的过程。类构造器<clinit>()方法是由编译期自动收集类中所有类变量的赋值动作和静态代码块中的语句合并产生的。
    当初始化一个类的时候，如果发现其父类还没有进行初始化，则需要先触发其父类的初始化
    虚拟机会保证一个类的<clinit>()方法在多线程环境中被正确加锁和同步
 */

public class Test04 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(A.m);
        System.out.println(B.n);
    }
}

class A{
    static{
        System.out.println("A类静态代码块初始化");
        m = 300;
    }
    static int m =  100;

    public A(){
        System.out.println("A类的无参构造初始化");
    }
}

class B extends A{
    static final int M = 10;
    static int n =  100;
    static{
        System.out.println("B类静态代码块初始化");
        n = 300;
    }

    public B(){
        System.out.println("B类的无参构造初始化");
    }
}