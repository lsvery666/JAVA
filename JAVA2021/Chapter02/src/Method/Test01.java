package Method;

/*
修饰符 返回值类型 函数名(参数类型 形式参数1，参数类型 形式参数1，…){
    执行语句；
    return 返回值；
}
 */

public class Test01 {
    public static void main(String[] args) {
        m1();
        A.m1();
    }
    public static void m1()
    {
        System.out.println("m1()执行");
    }
}

class A{
    public static void m1()
    {
        System.out.println("class Method.Test01.A m1()执行");
    }
}
