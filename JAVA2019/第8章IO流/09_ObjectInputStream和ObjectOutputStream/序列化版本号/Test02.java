//序列化之后，修改User类型，在User中加入"String name",重新编译User后，再反序列化时出现错误
//解决方法：不让系统自动生成序列化，自己写一个序列化版本号
import java.io.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.DBF"));
		Object o = ois.readObject();
		if(o instanceof User)
		{
			User u = (User) o;
			System.out.println(u.name);	// 如果name被transient修饰，这里输出为null
		}
		
		ois.close();
	}
}
//Exception in thread "main" java.io.InvalidClassException: User; 
//local class incompatible: adj. 不相容的；矛盾的；不能同时成立的
//stream classdesc serialVersionUID = -7020619477594468968,				//修改前User的序列号
//local class serialVersionUID = 5211548487022640024					//修改后User的序列号