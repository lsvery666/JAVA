package ControlStructure;

/*
switch语句在运行时首先计算switch圆括号中“表达式”的值，这个值只能是byte(Byte)，short(Short)，int(Integer)，char(Character)，String和enum。
一个case语句代表一个指定操作，然后转向结构出口。
default子句是可选的，当表达式的值与case表达式常量的值都不匹配时，就运行default子句，转向结构出口。
default可以写在switch结构中的任意位置。

当程序已经执行了一条case或default中的语句后，程序会直接执行其后的语句，而不再判断case，直到遇到break或continue。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("您输入了:"+str);
        br.close();

        int a = Integer.parseInt(str);

        switch(a){
            default:
                // 只有当所有的case都不满足时，下面这条语句才会执行
                // 一旦一条case或default中的语句执行之后，会直接执行后面的语句而不再判断case中的条件，直到遇到break或return
                System.out.println("不及格");
                // break;
            case 9:case 10:
                System.out.println("优秀");
                break;
            case 7:case 8:
                System.out.println("良好");
                break;
            case 6:
                System.out.println("及格");
                break;
        }


    }
}
