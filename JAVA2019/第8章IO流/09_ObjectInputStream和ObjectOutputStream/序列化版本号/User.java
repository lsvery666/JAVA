//因为User实现了Serializable接口，JVM会特殊待遇：会给该类添加一个属性：static final long serialVersionUID=-7020619477594468968
import java.io.Serializable;
public class User implements Serializable
{
	//解决方法：不让系统自动生成序列化，自己写一个序列化版本号
	//自己写一个序列化版本号后再修改User，反序列化不会出现错误
	static final long serialVersionUID=123123;

	//修改User，添加num属性，反序列化时出现错误
	int num;
	
	//如果不想让该属性参加序列化，需要使用transient关键字修饰
	//String name;
	transient String name;
	User(String name){
		this.name = name;
	}
	public String toString(){
		return "User["+name+"]";
	}

	
}