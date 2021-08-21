package DataType;

/*
byte short char之间的转换
byte类型可以自动转换为short，其他的都不可以
英文字符可以自动转换为byte，short，int
中文字符可以自动转换为short，int
 */

public class Test04 {
    public static void main(String[] args) {
        // byte和short
        byte m = 1;
        short n = m;
        System.out.println(n);  // 1

        // short x = 1;
		// byte z = x;		    // 错误: 不兼容的类型: 从short转换到byte可能会有损失

        // byte和char
		// byte x = 97;
		// char z = x;	        // 错误: 不兼容的类型: 从byte转换到char可能会有损失

        // char a = 'a';
        // byte b = a;          // 错误：不兼容的类型: 从char转换到byte可能会有损失

        // short和char
        // char a = 'a';
        // short b = a;         // 错误：不兼容的类型: 从char转换到short可能会有损失

        // short a = 97;
        // char b = a;          // 错误：不兼容的类型: 从short转换到char可能会有损失

        byte a = 'a';
        short b = 'a';
        int c = 'a';

        short x = '中';
        int y = '中';
    }
}
