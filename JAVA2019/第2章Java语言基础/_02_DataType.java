/*	
	基本数据类型：byte(1) short(2) int(4) long(8) float(4) double(8) char(2) boolean(1)
	引用数据类型：数组、类、接口
	级别从低到高为：byte char short (这三个平级) --> int --> float --> long --> double
	自动类型转换：从低级别到高级别，系统自动转的，平级之间无法自动转换
	强制类型转换：把一个高级别的数赋给一个比该数的级别低的变量

	整型字面值：可以用二进制、八进制、十进制、十六进制来表示。
	一般情况下，字面值创建的是int类型。
	但是int字面值可以赋值给byte， short ，char ，long ，int，只要字面值在目标范围以内，Java会自动完成转换。
	但是int变量不可以赋值给byte， short ，char ，long ，int，即使字面值在目标范围以内，需要加强制类型转换。
	如果试图将超出范围的字面值赋给某一类型（比如把128赋给byte类型），编译通不过。
	如果想创建一个int类型无法表示的long类型，则需要在字面值最后面加上L或者l。
	通常建议使用容易区分的L。所以整型字面值包括int字面值和long字面值两种。
	
	浮点型字面值：默认为double型，可以通过后面加D(d)或F(f)来指定double型字面值或float型字面值

	char类型用于存放字符的数据类型，占用2个字节，采用unicode编码，它的前128字节编码与ASCII兼容;
	字符的存储范围在\u0000~\uFFFF (0 ~ 65535)；
	也可以使用八进制或者十六进制表示字符，八进制使用反斜杠加3位数字表示，例如'\141'表示字母a;
	十六进制使用反斜杠u加上4位十六进制的数表示，如'\u0061'表示字符a。

	char可以表示中文字符，byte不可以
	char、byte、int对于英文字符，可以相互转化
	char字面值可以赋值给byte， short ，char ，long ，int，只要字面值在目标范围以内（即英文字符），Java会自动完成转换。
	char变量不可以赋值给byte， short ，char ，long ，int，即使字面值在目标范围以内（即英文字符），需要加强制类型转换。
*/
public class _02_DataType{
	public static void main(String[] args){
		// byte a = -128;
		// byte a = -129;	// 编译错误：不兼容的类型: 从int转换到byte可能会有损失
		// 强制类型转换
		byte a = (byte)-129;
		System.out.println(a);	// 127

//		short x = 1;
//		byte z = x;		// 错误: 不兼容的类型: 从short转换到byte可能会有损失
//		System.out.println(z);

//		byte x = 97;
//		char z = x;	//  错误: 不兼容的类型: 从byte转换到char可能会有损失


		// 自动类型转换
		int b = a;
		System.out.println(b);	// 127

		// long c = 2147483648; // 错误：整数太大，int类型字面值最大为2147483647
		long c = 2147483648L;
		System.out.println(c);	// 2147483648

		// float d = 1.2;	// 编译错误：不兼容的类型: 从double转换到float可能会有损失
		float d = 1.2F;
		System.out.println(d);	// 1.2

		char e = 'a';

		// byte f = e + 10;	// 错误: 不兼容的类型: 从int转换到byte可能会有损失
		int f = e + 10;

		char g = (char)f;

		System.out.println(e);	// a
		System.out.println(f);	// 107
		System.out.println(g);	// k

		char h = 0;
		System.out.println(h);	// \n

		// char i = 65536;	// 错误: 不兼容的类型: 从int转换到char可能会有损失
		char i = (char)65536;
		System.out.println((int)i);	// 0
	}
}
