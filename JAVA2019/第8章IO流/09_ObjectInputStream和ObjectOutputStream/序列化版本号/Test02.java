//���л�֮���޸�User���ͣ���User�м���"String name",���±���User���ٷ����л�ʱ���ִ���
//�������������ϵͳ�Զ��������л����Լ�дһ�����л��汾��
import java.io.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.DBF"));
		Object o = ois.readObject();
		if(o instanceof User)
		{
			User u = (User) o;
			System.out.println(u.name);	// ���name��transient���Σ��������Ϊnull
		}
		
		ois.close();
	}
}
//Exception in thread "main" java.io.InvalidClassException: User; 
//local class incompatible: adj. �����ݵģ�ì�ܵģ�����ͬʱ������
//stream classdesc serialVersionUID = -7020619477594468968,				//�޸�ǰUser�����к�
//local class serialVersionUID = 5211548487022640024					//�޸ĺ�User�����к�