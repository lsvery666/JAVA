package Set;

import java.util.Objects;
import java.util.TreeSet;

/*
对于自定义数据类型，需要实现java.lang.Comparable接口，才能存入TreeSet集合中，Object没有compareTo()方法
否则，存入两个以上元素时，会报错：java.lang.ClassCastException: class Set.Person cannot be cast to class java.lang.Comparable
compareTo方法返回为0，则视为两个key相同，此时value发生覆盖，而对于TreeSet，它的value是一个Object常量
所以对于TreeSet而言，调用add方法，相同的两个key只会保留第一个add进去的key
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();

        Person p1 = new Person(15, "Tom");
        Person p2 = new Person(34, "Curry");
        Person p3 = new Person(44, "James");
        Person p4 = new Person(34, "Harden");

        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);     // 注意：覆盖的是value，不是key

        for(Person p: ts){
            System.out.println(p);
        }
    }
}

class Person implements Comparable<Person>{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name="+name+"}";
    }

    @Override
    /**
     * 需要在这个方法中编写比较的逻辑
     * this.compareTo(o)
     * 拿着参数key和集合中每个key进行比较，返回值可能是>0 <0 =0
     * 返回值小于0时，this放在左树，o放在右树
     * 返回值大于0时，this放在右树，o放在左树
     * 返回值等于0时，value发生覆盖，这就是为什么TreeMap/TreeSet集合元素不可重复的原因
     */
    public int compareTo(Person o) {
        return this.age - o.age;    // 升序
        // return o.age - this.age;    // 降序
    }

}
