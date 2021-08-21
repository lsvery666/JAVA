/*
	关于JAVA语言中的向上转型和向下转型
	向上转型：upcasting 子转父
	向下转型：downcasting 父转子
	无论是向上转型还是向下转型，两个类之间必须要有继承关系

	成员变量 --- 编译运行都看 = 左边。
	成员函数 --- 编译看 = 左边，运行看 = 右边。
	静态函数 --- 编译运行都看 = 左边。
*/
public class Test2{
	public static void main(String[] args){
		
		//向上转型又被称作：自动类型转换
		//父类型的引用指向子类型对象
		//程序分两个阶段：编译阶段，运行阶段
		//程序编译阶段只知道a1是一个Animal类型
		//程序在运行的时候堆中的实际对象是Cat类型
		Animal a1 = new Cat();

		//子父类成员变量同名 无论编译和运行，成员变量参考的都是引用变量所属的类中的成员变量
		System.out.println(a1.name);//animal
		System.out.println(((Cat)a1).name);//cat
		
		//程序在编译阶段a1被编译器看做是Animal类型
		//所以程序在编译阶段a1引用绑定的是Animal类中的eat方法（静态绑定）
		//程序在运行的时候堆中的对象实际上是Cat类型，而Cat已经重写了eat方法
		//所以程序在运行阶段对象的绑定的方法是Cat中的eat方法(动态绑定)
		a1.eat();//猫吃鱼
		
		
		Animal a2 = new Cat();//向上转型
		
		//要执行move方法，怎么做？
		// a2.run();	// 错误: 找不到符号 a2.run();
		//只能强制类型转换，需要加强制类型转换符
		//向下转型：强制类型转换
		Cat c1 = (Cat)a2;
		c1.run();//猫在走猫步
		
		//判断一下程序运行的时候会出什么问题？
		/*
		Animal a3 = new Dog();
		Cat c2 = (Cat)a3;//编译通过，但运行时会报ClassCastException异常
		*/
		//在做强制类型转换的时候程序是存在风险的
		//为了避免ClassCastException的发生，JAVA引入了instanceof
		
		/*
			用法：
			instanceof运算符的运算结果时boolean类型
			（<引用> instanceof <类型>)    值为true or false
			例如：(a instanceof Cat)如果结果是true
			表示a引用指向堆中的JAVA对象时Cat类型
		*/
		Animal a3 = new Dog();
		System.out.println(a3 instanceof Cat);	//False
		
		//推荐：在做向下转型的时候要使用instanceof运算符判断，避免ClassCastException
		if(a3 instanceof Cat){
			Cat c2 = (Cat)a3;
		}
	}
}