package Operator;

/*
算数运算符 + - * / % ++ --
赋值运算符 = += -= *= /= %=

1. /号运算的结果取决于被除数和除数的数据类型，int类型的数据相除结果为int(10 / 3 = 3)，float类型的数据相除结果为float(10.0 / 3.0 = 3.3333)；
2. 在多种类型混合运算时，先将所有数据转换为容量最大的那种再运算；
3. byte\short\char之间计算不会互相转换，全部转换成int进行计算；
4. 赋值运算符与先运算再赋值的区别：赋值运算符不改变运算结果类型。
5. 前++是先自增再赋值，后++是先赋值在自增
 */

public class Test01 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 0;
        // char c = a + b;     // 不兼容的类型: 从int转换到char可能会有损失
        char c = (char)(a + b);
        System.out.println(c);	// a

        int d = 10;
        int e = 3;
        System.out.println(d / e);	// 3

        float m = 10;   // int到float的自动转换
        float n = 3;
        System.out.println(m / n);  // 3.3333333

        byte h = 127;
        // h = h + 10;    // 不兼容的类型: 从int转换到byte可能会有损失
        h += 10;          // h = (byte)(h + 10)
        System.out.println(h);	// -119

        byte i = 10;
        i += 1000;
        System.out.println(i);	// -14 = (1010%256) - 256

        int x = 1010 % 256;
        System.out.println(x);	// 242
    }
}
