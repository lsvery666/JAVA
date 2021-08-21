package com.oop.thisTest;

/*
this代表对象，哪个对象调用了this所在的函数，this就代表哪个对象。
this对象后面跟上 .  调用的是成员属性和成员方法(一般方法)；
this对象后面跟上 () 调用的是本类中的对应参数的构造函数。
用this调用构造函数，必须定义在构造函数的第一行。因为构造函数是用于初始化的，所以初始化动作一定要执行。否则编译失败。
 */

public class ThisTest02 {
    public static void main(String[] args){
        Employee e = new Employee(7369, "Smith");
        e.work();
        Employee e1 = new Employee(7370, "FORD");
        e1.work();
        e.m1();
    }
}

class Employee{
    int empNo;
    String name;
    Employee(){}

    Employee(int _empNo, String _name){
        empNo = _empNo;
        name = _name;
    }

    public void work(){
        System.out.println(name+" is working.");
        //System.out.println(this.name+" is working.");
    }
    public void m1(){
        //this.m2();
        m2();
    }
    public void m2(){
        System.out.println("TESTING");
    }
}
