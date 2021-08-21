package com.Thread.JMM;

/*
volatile关键字
volatile是Java虚拟机提供的轻量级的同步机制。
volatile关键字有如下两个作用：
1.保证被volatile修饰的共享变量对所有线程总数可见的，也就是当一个线程修改了一个被volatile修饰共享变量的值，新值可以被其他线程立即得知。
  （1）当写一个volatile变量时，JMM会把该线程本地内存中的变量强制刷新到主内存中去；
  （2）这个写会操作会导致其他线程中的volatile变量缓存无效。
2.禁止指令重排序优化。

volatile可以保证线程可见性且提供了一定的有序性，但是无法保证原子性。在JVM底层volatile是采用“内存屏障”来实现的。观察加入volatile关键字和没有加入volatile关键字时所生成的汇编代码发现，
加入volatile关键字时，会多出一个lock前缀指令，lock前缀指令实际上相当于一个内存屏障（也成内存栅栏），内存屏障会提供3个功能：

（1）它确保指令重排序时不会把其后面的指令排到内存屏障之前的位置，也不会把前面的指令排到内存屏障的后面；即在执行到内存屏障这句指令时，在它前面的操作已经全部完成，在它后面的指令都未执行；

（2）它会强制将对缓存的修改操作立即写入主存；

（3）如果是写操作，它会导致其他CPU中对应的缓存行无效。

 */

// 单例模式的双重锁
class TestInstance{
    private volatile static TestInstance instance;
    private TestInstance(){}
    public static TestInstance getInstance(){        //1
        if(instance == null){                        //2
            /*
            通过synchronized和Lock也能够保证可见性，
            synchronized和Lock能保证同一时刻只有一个线程获取锁然后执行同步代码，
            并且在释放锁之前会将对变量的修改刷新到主存当中。因此可以保证可见性
             */
            synchronized(TestInstance.class){        //3
                if(instance == null){                //4
                    instance = new TestInstance();   //5
                }
            }
        }
        return instance;                             //6
    }
}

/*
需要volatile关键字的原因是，在并发情况下，如果没有volatile关键字，在第5行会出现问题。
instance = new TestInstance()不是一个原子性操作;它可以分解为3行伪代码

a. memory = allocate() //分配内存

b. ctorInstanc(memory) //初始化对象

c. instance = memory //设置instance指向刚分配的地址
上面的代码在编译运行时，可能会出现重排序从a-b-c排序为a-c-b。在多线程的情况下会出现以下问题。
当线程A在执行第5行代码时，B线程进来执行到第2行代码。
假设此时A执行的过程中发生了指令重排序，即先执行了a和c，没有执行b。
那么由于A线程执行了c导致instance指向了一段地址，所以B线程判断instance不为null，会直接跳到第6行并返回一个未初始化的对象。

 */