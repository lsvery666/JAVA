package DataType;

/*
char类型用于存放字符的数据类型，占用2个字节，采用unicode编码，它的前128字节编码与ASCII兼容;
字符的存储范围在\u0000~\uFFFF (0 ~ 65535)；
也可以使用八进制或者十六进制表示字符，八进制使用反斜杠加3位数字表示，例如'\141'表示字母a;
十六进制使用反斜杠u加上4位十六进制的数表示，如'\u0061'表示字符a。
 */

public class Test05 {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a);
        System.out.println((int)a);

        char b = '\141';
        System.out.println(b);

        char c = '\u0061';
        System.out.println(c);

        char d = '中';
        System.out.println((int)d);
    }
}
