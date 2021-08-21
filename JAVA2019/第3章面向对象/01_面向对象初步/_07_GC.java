//Garbage collection
//对象没有引用，则变成垃圾。
public class _07_GC{
	public static void main(String[] args){
		//u1是引用，保存指向堆中对象的内存地址。
		_05_User u1 = new _05_User();

		//程序执行到此处，u1不再指向堆中的对象，对象变成了垃圾。
		u1 = null;
		
		//使用一个空的引用去访问成员，会出现什么问题？
		System.out.println(u1.name);
		//编译会通过，但运行会出错：NullPointerException(空指针异常)
		
		Star s = new Star();
		s = null;
		s.sing(); //NullPointerException
	}
}
class Star{
	//成员方法
	public void sing(){
		System.out.println("Sing a song");
	}
}