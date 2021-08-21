package List;

/*
	List���ϴ洢Ԫ���ص㣺
		1.����List�����е�Ԫ�����±�
		2.���ظ�

	List�ӿ����еķ�����
	    void add(int index, Object element) �൱��insert
	    Object get(int index)
	    int indexOf(Object o)
	    int lastIndexOf(Object o)
	    Object remove(int index)
	    Object set(int index, Object element)
*/

import java.util.*;
public class ListTest01 {
    public static void main(String[] args) {
        List l = new ArrayList();   //��̬

        l.add(10);
        l.add(1);
        l.add(99);
        l.add(100);
        l.add(250);
        l.add(250);

        // l.add(8, 10);   // java.lang.IndexOutOfBoundsException: Index: 8, Size: 6
        // �������ʹ�ò��࣬��Ϊ���ڵײ��������ArrayList��˵Ч�ʲ���
        l.add(2, "hhh");

        Iterator it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println(l.get(2));

        // �����һ�ֱ�����ʽ
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        Student s1 = new Student("Tom");
        l.add(s1);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        };

        Student s2 = new Student("Tom");
        System.out.println(l.indexOf(s2));  // 7 ˵��indexOfҲ�ǵ�����equals����

        // ɾ��
        l.remove(s2);
        System.out.println(l.size());

        // �޸�
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
