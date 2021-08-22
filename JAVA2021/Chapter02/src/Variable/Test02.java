package Variable;

public class Test02 {
    public static void main(String[] args) {
        Integer a = 129;
        change(a);
        System.out.println(a);

        MyInteger b = new MyInteger(100);
        change(b);
        System.out.println(b.value);
    }
    public static void change(Integer a){
        // 形参和实参指向的是同一个对象
        a = 900;    // 在堆中创建了一个Integer类型“900”，让a指向了它，并没有让实参指向它
    }
    public static void change(MyInteger a){
        // 形参和实参指向同一个对象
        a.value = 900;  // 在堆中创建一个“900”，让a.value指向了它，所以也就改变了实参.value
    }
}

class MyInteger{
    int value;
    MyInteger(int value){ this.value = value; }
}

