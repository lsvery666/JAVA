package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
使用@interfae自定义注解时，自动继承了java.lang.annotation.Annotation接口
 */

public class Test03 {
    // 如果没有默认值，必须给参数显式赋值
    @MyAnnotation2(name="Lisen", schools="西安交通大学")
    public static void test(){

    }

    // 当注解参数名为value时，"value = "可以不写
    @MyAnnotation3("Lisen")
    public static void test2(){

    }

    public static void main(String[] args) {
        test();
    }

}

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    // 注解的参数： 参数类型 + 参数名();
    // 本质还是一个方法，方法的名称就是参数的名称，返回值类型就是参数的类型，可以用default来声明默认值
    String name();
    String[] schools() default {"北京大学","清华大学"};
}

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}