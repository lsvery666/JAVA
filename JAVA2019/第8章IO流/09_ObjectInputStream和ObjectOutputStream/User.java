import java.io.Serializable;//�ýӿ���ָ�������л��ġ�
							//�ýӿ�û���κη�������һ����ʶ�ӿ�
							//�������Ľӿڻ���:java.lang.Cloneable;
/*
	��ʶ�ӿڵ����ã��𵽱�ʶ�����á�
	JVM��������ö���ʵ����ĳ����ʶ�ӿڣ�������������
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