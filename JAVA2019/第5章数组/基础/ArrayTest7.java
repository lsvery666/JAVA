/*
	����main�����еĲ����б�String[] args
	1.String[] args��ר���������������в����ġ�
	2.���磺java ArrayTest7 aa bb 
	  JVM�ڵ���ArrayTest7��main����֮ǰ���Ƚ�"aa bb"����ַ�����"�ո�"�ķ�ʽ�ָȻ��洢��String[] args�С�
	  ��String[] args={"aa","bb"};
	3.main�����е�String[] args����������Ҫ���������������в����ġ�
	
*/

public class ArrayTest7{
	public static void main(String[] args){
		
		/*
		System.out.println(args.length);
		//����
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		*/
		
		//�������и������ʱ������ṩ�û���������
		//��ʽ��java ArrayTest7 <username> <password>
		//����û�û���ṩ�㹻�Ĳ��������˳�ϵͳ
		
		if(args.length!=2){
			System.out.println("�������û��������룺");
			return;
		}
		
		//�����ṩ��ȷ������û�����admin��������123���¼�ɹ�
		String username = args[0];
		String password = args[1];
		if("admin".equals(username) && "123".equals(password)){//���ַ�ʽ�����·�ʽ���Ա����ָ���쳣
		//if(username.equals("admin") && password.equals("123)){
			System.out.println("��¼�ɹ�����ӭ"+username+"������");
		}else{
			System.out.println("��¼ʧ�ܣ��û��������ڻ��������");
		}
	}
}