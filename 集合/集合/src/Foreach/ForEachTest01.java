package Foreach;
/*
JDK5.0之后推出的新特性：foreach，或者叫增强for循环
    for(元素类型 变量名：数组或集合）{
        System.out.println(变量名);
    }
    foreach有一个缺点：只有变量名，没有下标
*/
public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        for(int a: arr){
            System.out.println(a);
        }


    }
}
