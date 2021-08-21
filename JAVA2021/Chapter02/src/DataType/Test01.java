package DataType;
/*
	基本数据类型：byte(1) short(2) int(4) long(8) float(4) double(8) boolean(1) char(2)
	引用数据类型：数组、类、接口
	级别从低到高为：byte char short (这三个平级) --> int --> float --> long --> double
	自动类型转换：从低级别到高级别，系统自动转的，平级之间无法自动转换
	强制类型转换：把一个高级别的数赋给一个比该数的级别低的变量

    byte的取值范围为-128~127，占用1个字节（-2的7次方到2的7次方-1）；
	short的取值范围为-32768~32767，占用2个字节（-2的15次方到2的15次方-1）；
	int的取值范围为（-2147483648~2147483647），占用4个字节（-2的31次方到2的31次方-1）；
	long的取值范围为（-9223372036854774808~9223372036854774807），占用8个字节（-2的63次方到2的63次方-1）；
    float的取值范围为3.402823e+38 ~ 1.401298e-45，（e+38表示是乘以10的38次方，同样，e-45表示乘以10的负45次方）占用4个字节；
	double的取值范围为1.797693e+308~ 4.9000000e-324 占用8个字节；
    char用于存放字符的数据类型，占用2个字节，采用unicode编码，它的前128个编码与ASCII兼容，字符的存储范围在\u0000~\uFFFF；

    整型字面值：可以用二进制、八进制、十进制、十六进制来表示。
*/

public class Test01 {
    public static void main(String[] args) {
        // 二进制 0B或0b开头
        int a = 0b10;
        System.out.println(a);

        // 八进制 0开头
        int b = 012;
        System.out.println(b);

        // 十进制 默认
        int c = 10;
        System.out.println(c);

        // 十六进制 0X或0x开头
        int d = 0x10;
        System.out.println(d);

        String s = "0x10";
        System.out.println(Integer.valueOf(s));
    }
}
