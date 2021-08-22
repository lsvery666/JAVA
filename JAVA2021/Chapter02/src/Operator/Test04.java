package Operator;

/*
位的运算符 & | ^ ~ >>(高位补符号位) << >>>(高位补0) 与或非异或都是包含符号位的
*/

public class Test04 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-1));  // -1:11111111 11111111 11111111 11111111
        System.out.println(Integer.toBinaryString(2));   //  2:00000000 00000000 00000000 00000010
        System.out.println(-1 & 2);		// 2
        System.out.println(-1 | 2);		// -1
        System.out.println(~ -1);       // 0
        System.out.println(-1 ^ 2);		// -3
        System.out.println(-1 << 2);    // -4
        System.out.println(-1 >> 2);	// -1
        System.out.println(-1 >>> 2);	// 1073741823
    }
}
