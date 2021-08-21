package DataType;

/*
如果等号右边的数据没有超出左边数据类型的范围，编译器会自动补上如果超出范围，编译器会报错。这就称为“编译器的常量优化”
如int字面值可以赋值给byte(-128~127)， short(-32768~32767) ，char(-128~127)，只要字面值在目标范围以内，Java会自动完成转换。
但是这种优化只使用于常量，一旦表达式中有变量便会报错！
 */

public class Test03 {
    public static void main(String[] args) {
        // 自动类型转换 常量优化
        byte a = -128;
        // byte b = -129;   // 编译报错：不兼容的类型: 从int转换到byte可能会有损失

        // 强制类型转换
        byte b = (byte)-129;
        System.out.println(b);	// 127

        // 表达式中含有变量
        // int i = -128;
        // byte c = i;     // 编译报错：不兼容的类型: 从int转换到byte可能会有损失
    }
}
