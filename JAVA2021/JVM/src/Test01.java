/*
双亲委派机制

JVM中提供了三层的ClassLoader：

根加载器            Bootstrap classLoader:主要负责加载核心的类库(java.lang.*等)，构造ExtClassLoader和APPClassLoader。
扩展加载器          ExtClassLoader：主要负责加载jre/lib/ext目录下的一些扩展的jar。
系统（应用）加载器   AppClassLoader：主要负责加载自己定义的类


当一个Student.class这样的文件要被加载时。
不考虑我们自定义类加载器，首先会在AppClassLoader中检查是否加载过，如果有那就无需再加载了。
如果没有，那么会拿到父加载器，然后调用父加载器的loadClass方法。
父类中同理也会先检查自己是否已经加载过，如果没有再往上。
注意这个类似递归的过程，直到到达Bootstrap classLoader之前，都是在检查是否加载过，并不会选择自己去加载。
直到BootstrapClassLoader，已经没有父加载器了，这时候开始考虑自己是否能加载了，
如果自己无法加载，会下沉到子加载器去加载，一直到最底层，如果没有任何加载器能加载，就会抛出ClassNotFoundException。

 */
public class Test01 {
    public static void main(String[] args) {
        Class<?> c = Student.class;

        // jdk.internal.loader.ClassLoaders$AppClassLoader@2f0e140b
        System.out.println(c.getClassLoader());
        // 获取系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));  // D:\Lisen\JAVA\JAVA2021\out\production\JVM

        // jdk.internal.loader.ClassLoaders$PlatformClassLoader@16b98e56
        System.out.println(c.getClassLoader().getParent());

        // null 底层是用C/C++写的
        System.out.println(c.getClassLoader().getParent().getParent());
    }
}

class Student{
    private String name;

    Student(){}

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}