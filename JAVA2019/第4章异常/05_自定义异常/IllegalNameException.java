/*
	����ע��ʱҪ���û������Ȳ�������6λ
	�Զ�����Ч�����쳣��
		1.����ʱ�쳣��ֱ�Ӽ̳�Exception
		2.����ʱ�쳣��ֱ�Ӽ̳�RunTimeException
*/
public class IllegalNameException extends Exception{
	//�����������췽��
	public IllegalNameException(){}
	public IllegalNameException(String msg){
		super(msg);
	}
}