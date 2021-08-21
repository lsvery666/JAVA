package ControlStructure;

/*
case后面是一个常量表达式，表达式常量的值的类型应与switch圆括号中“表达式”的值类型一致。
常量表达式是一个代表基本数据类型或者String数据类型的表达式，是在编译期间能计算出来的值.
 */

public class Test04 {
    public static void main(String[] args) {
        final int a = 1;
        final int b = 2;
        final int c = 3;

        int x = 2;
        switch (x){
            case a:
                System.out.println(1);
                break;
            case b:
                System.out.println(2);
                break;
            case c:
                System.out.println(3);
                break;
        }
    }
}
