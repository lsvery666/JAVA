import java.util.Arrays;

/*
OOM
堆内存初始大小 最大大小 打印GC内存管理
-Xms2m -Xmx2m -XX:+PrintGCDetails
 */
public class Test02 {
    public static void main(String[] args) {
        String s = "hhhhhh";
        while(true){
            s += "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
        }
    }
}
