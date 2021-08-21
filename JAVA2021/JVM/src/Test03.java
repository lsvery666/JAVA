/*
输出堆内存的初始化大小和最大大小
默认最大内存是电脑内存的1/4，初始化内存是1/64
Add VMOptions: -Xms2m -Xmx2m -XX:+PrintGCDetails
 */
public class Test03 {
    public static void main(String[] args) {
        long max = Runtime.getRuntime().maxMemory();
        long init = Runtime.getRuntime().totalMemory();

        System.out.println("max = " + max + "B (" + (max / (double) 1024 / 1024) + "MB)");
        System.out.println("init = " + init + "B (" + (init / (double) 1024 / 1024) + "MB)");
    }
}
