//��ΪUserʵ����Serializable�ӿڣ�JVM���������������������һ�����ԣ�static final long serialVersionUID=-7020619477594468968
import java.io.Serializable;
public class User implements Serializable
{
	//�������������ϵͳ�Զ��������л����Լ�дһ�����л��汾��
	//�Լ�дһ�����л��汾�ź����޸�User�������л�������ִ���
	static final long serialVersionUID=123123;

	//�޸�User�����num���ԣ������л�ʱ���ִ���
	int num;
	
	//��������ø����Բμ����л�����Ҫʹ��transient�ؼ�������
	//String name;
	transient String name;
	User(String name){
		this.name = name;
	}
	public String toString(){
		return "User["+name+"]";
	}

	
}