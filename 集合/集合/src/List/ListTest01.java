package List;

/*
	List集合存储元素特点：
		1.有序：List集合中的元素有下标
		2.可重复

	List接口特有的方法：
	    void add(int index, Object element) 相当于insert
	    Object get(int index)
	    int indexOf(Object o)
	    int lastIndexOf(Object o)
	    Object remove(int index)
	    Object set(int index, Object element)
*/

import java.util.*;
public class ListTest01 {
    public static void main(String[] args) {
        List l = new ArrayList();   //多态

        l.add(10);
        l.add(1);
        l.add(99);
        l.add(100);
        l.add(250);
        l.add(250);

        // l.add(8, 10);   // java.lang.IndexOutOfBoundsException: Index: 8, Size: 6
        // 这个方法使用不多，因为对于底层是数组的ArrayList来说效率不高
        l.add(2, "hhh");

        Iterator it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println(l.get(2));

        // 另外的一种遍历方式
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        Student s1 = new Student("Tom");
        l.add(s1);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        };

        Student s2 = new Student("Tom");
        System.out.println(l.indexOf(s2));  // 7 说明indexOf也是调用了equals方法

        // 删除
        l.remove(s2);
        System.out.println(l.size());

        // 修改
        l.set(0, "aaa");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        };
    }

}

class Student
{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
