package Annotation;

/*
Annotation是从JDK5.0开始引入的新技术

Annotation的作用：
    不是程序本身，可以对程序做出解释。（这一点和comment没什么区别）
    可以被其他程序（如编译器）读取

Annotation的格式：
    注解是以“@注释名”在代码中存在的，还可以添加一些参数值，例如@SuppressWarning(value="unchecked")

Annotation在哪里使用？
    可以附加在package,class,method,filed上面，相当于给他们添加了额外的辅助信息
    我们可以通过反射机制编程实现对这些元数据的访问
 */


import java.util.ArrayList;
import java.util.List;

public class Test01 {
    // 重写 如果方法名不对，则@Override会报错
    @Override
    public String toString() {
        return super.toString();
    }

    // 过时 不推荐使用，但仍可以用
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    // 抑制警告信息 需要添加一个参数，这些参数都是定义好了的
    @SuppressWarnings("all")
    public static void test02(){
        List list = new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }

}
