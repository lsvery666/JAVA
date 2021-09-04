package com.commonlib.Enum;

/*
	需求：定义一个方法，该方法的作用是计算两个int类型数据的商
	如果计算成功则该方法返回1，如果执行失败则该方法返回0

	程序执行成功，但是该程序存在风险，如果误将return 0写成了return 10，则无法满足需求。

	程序中的问题能在编译阶段解决的，绝对不会放在运行期解决，所以可引入“枚举类型”
*/
public class Test{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        Result retValue = divide(a,b);
        if(retValue == Result.SUCCESS){
            System.out.println("成功");
        }else if(retValue == Result.FAIL){
            System.out.println("失败");
        }

    }
    public static Result divide(int a,int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch(Exception e){
            return Result.FAIL;
        }
    }
}
//定义一个枚举类型
enum Result{//关键字enum 标识符Result
    //成功和失败
    //规范要求：大写
    SUCCESS, FAIL
}
//四季
enum Season{
    SPRING, SUMMER, AUTUMN, WINTER
}
//颜色
enum Color{
    GREEN, BLUE, RED
}
