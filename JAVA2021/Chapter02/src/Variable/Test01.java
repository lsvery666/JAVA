package Variable;

/*
标识符：只能由数字、字母、$和_组成。数字不可以开头。不可以使用关键字。

变量
1.Java中的局部变量必须要初始化；
2.作用域：大括号

 */
public class Test01 {
    int x;

    public static void main(String[] args) {
        int i;
        // System.out.println(i); // Variable i might not have been initialized.
        // 初始化有两种方式：
        // 1. int i = 0;
        // 2. int i; i = 0;
        i = 0;
        System.out.println(i);

        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println(i);

        // System.out.println(x);

        Test01 test01 = new Test01();
        test01.test();

    }

    public void test() {
        System.out.println(x);
    }
}

