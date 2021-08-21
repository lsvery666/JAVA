/*
	集合：用于存储数据的容器
	集合和数组和区别：
	1.数组是固定长度的，集合是可变长度的；
	2.数组可以存储基本数据类型，也可以存储引用数据类型，但是集合只能存储引用数据类型
	3.数组存储的元素必须是同一个数据类型，集合存储的元素可以是不同数据类型
*/
import java.util.ArrayList;
import java.util.Collection;
public class Test01{
    public static void main(String[] args){
        //创建集合
        Collection c = new ArrayList();//多态

        //添加元素
        c.add(1);//自动装箱

        Object o=new Object();
        c.add(o);//Collection集合只能单个存储元素，并且只能存储引用类型

        Customer cus=new Customer("张三",10);
        c.add(cus);

        //获取元素个数
        System.out.println(c.size());//3

        //是否为空
        System.out.println(c.isEmpty());//false

        //将集合转换成Object类型的数组
        Object[] objs = c.toArray();
        for(int i=0;i<objs.length;i++){
            System.out.println(objs[i]);
        }
		/*
			1
			java.lang.Object@532760d8
			张三
		*/

        //清空
        c.clear();
        System.out.println(c.size());//0
        System.out.println(c.isEmpty());//true

    }
}

class Customer{
    String name;
    int age;
    Customer(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name;
    }
}