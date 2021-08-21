public class _06_UserTest{
	public static void main(String[] args){
		_05_User a=new _05_User();
		_05_User b=new _05_User(10);
		_05_User c=new _05_User("张三");
		_05_User d=new _05_User("张三",10);
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(d.name);
		System.out.println(d.age);
	}
}