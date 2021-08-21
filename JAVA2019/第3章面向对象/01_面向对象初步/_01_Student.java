/*
	java分了5片内存。
	1：寄存器。2：本地方法区。3：方法区。4：栈。5：堆。
	栈：存储的都是局部变量 ( 函数中定义的变量，函数上的参数，语句中的变量 )；
		只要数据运算完成所在的区域结束，该数据就会被释放。
	堆：用于存储数组和对象，也就是实体。啥是实体啊？就是用于封装多个数据的。
	1：每一个实体都有内存首地址值。
	2：堆内存中的变量都有默认初始化值。因为数据类型不同，值也不一样。 
	3：垃圾回收机制。
*/
public class _01_Student{
	// 成员变量，也叫实例变量、非静态变量，存在于堆内存中(的对象中)，随着对象的产生而存在，消失而消失，可以直接在声明给它赋值	
	int id = 1;
	boolean sex;
	String name;
	String addr;
	int age;
}