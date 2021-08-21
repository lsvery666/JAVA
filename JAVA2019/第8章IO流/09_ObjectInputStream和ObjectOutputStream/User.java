import java.io.Serializable;//该接口是指“可序列化的”
							//该接口没有任何方法，是一个标识接口
							//像这样的接口还有:java.lang.Cloneable;
/*
	标识接口的作用：起到标识的作用。
	JVM如果看到该对象实现了某个标识接口，会对它特殊待遇
*/
public class User implements Serializable
{
	String name;
	User(String name){
		this.name = name;
	}
	public String toString(){
		return "User[name="+name+"]";
	}
}