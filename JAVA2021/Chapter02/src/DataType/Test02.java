package DataType;

/*
一般情况下，字面值默认是int类型。
如果想创建一个int类型无法表示的long类型，则需要在字面值最后面加上L或者l。
通常建议使用容易区分的L。所以整型字面值包括int字面值和long字面值两种。
浮点型字面值：默认为double型，可以通过后面加D(d)或F(f)来指定double型字面值或float型字面值
 */

public class Test02 {
    public static void main(String[] args) {
        // long a = 2147483648; // 错误：整数太大，int类型字面值最大为2147483647
        long a = 2147483648L;
        System.out.println(a);	// 2147483648

        // float b = 1.2;	// 编译错误：不兼容的类型: 从double转换到float可能会有损失
        float b = 1.2F;
        System.out.println(b);	// 1.2
    }
}
