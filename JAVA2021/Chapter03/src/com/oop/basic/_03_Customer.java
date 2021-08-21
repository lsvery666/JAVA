package com.oop.basic;

// 定义一个顾客类型
public class _03_Customer{

    // 私有属性
    private int age; //private修饰的数据只能在本类中访问

    // 可以提供公共的方法进行访问
    public int getAge(){  // 修饰符中不加static，称为成员方法，实例方法，非静态方法
        return age;
    }

    public void setAge(int _age){
        // 安全控制
        if(_age<0 | _age>0){
            System.out.println("年龄不合法");
        }else{
            age = _age;
        }
    }
}
