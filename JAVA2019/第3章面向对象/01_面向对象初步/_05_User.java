public class _05_User{

	int age;
	String name;

	//���幹�췽��
	//���췽������������
	_05_User(){
		System.out.println("User���޲������췽��ִ�гɹ�");
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