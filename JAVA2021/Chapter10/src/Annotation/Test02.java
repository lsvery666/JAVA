package Annotation;

/*
元注解的作用就是负责注解其他注解，Java定义了4个标准的meta-annotation类型，它们被用来提供对其他annotation类型作说明

这些类型和它们所支持的类在java.lang.annotation包中可以找到（@Target,@Retention,@Documented,@Inherited）
    @Target 用于描述注解的使用范围（即：被描述的注释可以用在什么地方）
    @Retention 表示需要在什么级别保存该注释信息，用于描述注解的生命周期 （SOURCE < CLASS < RUNTIME）
    @Documented 说明该注解被包含在javadoc中
    @Inherited  说明子类可以继承父类中的该注解
 */

import java.lang.annotation.*;

// 测试元注解
public class Test02 {

    @MyAnnotation
    public void test(){

    }

}

// 定义一个注解
// Target 表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})
// Retention 表示我们的注解在什么地方还有效
@Retention(value = RetentionPolicy.RUNTIME)

@Documented
@Inherited
@interface MyAnnotation{
}
