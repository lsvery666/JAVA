public class _05_User{

	int age;
	String name;

	//定义构造方法
	//构造方法构成了重载
	_05_User(){
		System.out.println("User的无参数构造方法执行成功");
		/*
		name=null;
		age=0;
		*/
	}

	_05_User(int _age){
		age=_age;
		//name=null;
	}

	_05_User(String _name){
		name=_name;
		//age=0;
	}

	_05_User(String _name,int _age){
		name=_name;
		age=_age;
	}
}