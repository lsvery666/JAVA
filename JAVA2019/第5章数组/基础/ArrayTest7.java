/*
	关于main方法中的参数列表String[] args
	1.String[] args是专门用来接收命令行参数的。
	2.例如：java ArrayTest7 aa bb 
	  JVM在调用ArrayTest7的main方法之前，先将"aa bb"这个字符串以"空格"的方式分割，然后存储在String[] args中。
	  即String[] args={"aa","bb"};
	3.main方法中的String[] args数组的设计主要是用来接收命令行参数的。
	
*/

public class ArrayTest7{
	public static void main(String[] args){
		
		/*
		System.out.println(args.length);
		//遍历
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		*/
		
		//需求：运行该软件的时候必须提供用户名和密码
		//格式：java ArrayTest7 <username> <password>
		//如果用户没有提供足够的参数，则退出系统
		
		if(args.length!=2){
			System.out.println("请输入用户名和密码：");
			return;
		}
		
		//参数提供正确，如果用户名是admin，密码是123则登录成功
		String username = args[0];
		String password = args[1];
		if("admin".equals(username) && "123".equals(password)){//这种方式较于下方式可以避免空指针异常
		//if(username.equals("admin") && password.equals("123)){
			System.out.println("登录成功，欢迎"+username+"回来！");
		}else{
			System.out.println("登录失败，用户名不存在或密码错误！");
		}
	}
}