package com.commonlib.String;
/*
int length()
char charAt(int index)

int indexOf(int ch)
int indexOf(int ch, int fromIndex)
int indexOf(String str)
int indexOf(String str, int fromIndex)
int lastIndexOf(char ch)

byte[] getBytes()
char[] toCharArray()

boolean startsWith(String str)
boolean endsWith(String str)
boolean equals(String str)
boolean equalsIgnoreCase(String str)
boolean contains(String str)

String subString(int begin)
String subString(int beginIdx, int endIdx)
String toUpperCase()
String toLowerCase()
String trim()

static String valueOf()

String replace(char[] oldChars, char[] newChars)
String replace(String oldStr, String newStr)
String replaceAll(String oldStr, String newStr)
String[] split(String s)

 */
public class StringTest06 {
    public static void main(String[] args) {
        String s = "中";
        // 外码是UTF-8，一个汉字对应3个字节
        byte[] bytes = s.getBytes();
        for(byte b: bytes){
            System.out.println(b);
        }

        // 内码是UTF-16，一个字符对应2个字节
        char[] chars = s.toCharArray();
        for(char ch: chars){
            System.out.println(ch);
        }

        System.out.println(s.length());

        char c = '中';
        // String s1 = (String) c; // char无法转换为java.lang.String
        // String s1 = new String(c); // 参数不匹配
        String s1 = String.valueOf(c);
        System.out.println(s1);

        String s2 = "  aaa哈哈哈aaa \n  ";
        String s3 = s2.trim();
        System.out.println(s3);
        System.out.println(s2.contains("哈哈哈"));

        String s4 = s2.replace("哈哈哈","嘿嘿嘿");
        System.out.println(s2);
        System.out.println(s4);
    }
}
