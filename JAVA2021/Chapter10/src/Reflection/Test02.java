package Reflection;

/*
获取Class对象的方法
 */

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Student();
        p.say();

        // 方式一：通过对象.getClass()获得
        Class c1 = p.getClass();
        System.out.println(c1);

        // 方式二：通过Class.forName(name)获得
        Class c2 = Class.forName("Reflection.Student");
        System.out.println(c2);

        // 方式三：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);

        // 方法四：对于基本数据类型，可以通过包装类.TYPE获得
        Class c = Integer.TYPE;
        System.out.println(c);
    }
}

class Person{
    String name;

    public Person() {
        this.name = "Person";
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void say(){
        System.out.println("I'm a person.");
    }
}

class Student extends Person{
    public Student() {
        this.name = "Student";
    }

    public void say(){
        System.out.println("I'm a student.");
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "Teacher";
    }
    public void say(){
        System.out.println("I'm a teacher.");
    }
}
