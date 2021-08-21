package Map;

import java.util.Map;
import java.util.Properties;

/*
Properties是线程安全的，因为继承Hashtable，另外key和value支持String类，也叫作属性类
目前只需要掌握Properties属性类对象的相关方法即可
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties pro = new Properties();

        // 需要掌握Properties的两个方法，一个存，一个取
        pro.setProperty("url", "jdbc:mysql://localhost:3306/bjpowernode");
        pro.setProperty("driver", "com.mysql.jdbc.Driver");
        pro.setProperty("username", "root");
        pro.setProperty("password", "123");

        // 通过key获取value
        String s1 = pro.getProperty("url");
        String s2 = pro.getProperty("driver");
        String s3 = pro.getProperty("username");
        String s4 = pro.getProperty("password");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
