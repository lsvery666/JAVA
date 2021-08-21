public class Test2{
	public static void main(String[]	args){
		//创建DebitAccount类对象，尽管利用super()调用了Account类的构造方法，但不会创建Account类对象
		DebitAccount a=new DebitAccount();
		DebitAccount b=new DebitAccount("002",100.0,50);
		System.out.println(a.getName());
		System.out.println(a.getYue());
		System.out.println(a.getDebit());
		System.out.println(b.getName());
		System.out.println(b.getYue());
		System.out.println(b.getDebit());
	}
}