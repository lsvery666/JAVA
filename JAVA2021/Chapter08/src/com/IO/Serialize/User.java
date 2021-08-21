package com.IO.Serialize;

import java.io.Serializable;
//因为User实现了Serializable接口，JVM会特殊待遇：会给该类添加一个属性：static final long serialVersionUID=-7020619477594468968

public class User implements Serializable {
    //如果不想让该属性参加序列化，需要使用transient关键字修饰
    transient String name;

    // 添加age属性，反序列化时出现错误
    int age;

    // 解决方法：不让系统自动生成序列化，自己写一个序列化版本号
    static final long serialVersionUID = 123123;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
