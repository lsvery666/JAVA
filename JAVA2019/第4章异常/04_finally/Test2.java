//����finally
public class Test2{
	
	public static void main(String[]	args){
		
		System.out.println(m1());
		/*
		���Ϊ��
		try��ĵ�i=10
		finally���i=11
		10
		*/
					
		m2();
		/*
		���Ϊ��
		try����i=20
		finally��i=21
		*/
			
		System.out.println(m3());
		/*
		���Ϊ��
		try����i=30
		finally��i=31
		31
		*/
	}
	
	public static int m1(){
		int i=0;
		try{
			i=10;
			System.out.println("try��ĵ�i="+i);
			return i;
		}
		finally{
			i++;
			System.out.println("finally���i="+i);
		}
	}
	
	public static void m2(){
		int i=0;
		try{
			i=20;
			System.out.println("try����i="+i);
		}
		finally{
			i++;
			System.out.println("finally��i="+i);
			
		}
	}
	
	public static int m3(){
		int i=0;
		try{
			i=30;
			System.out.println("try����i="+i);
			return i;
		}
		finally{
			i++;
			System.out.println("finally��i="+i);
			return i;
		}
	}
}
/*
	ԭ��
		int i=0��
		try{
			i=10��
			int temp=i;
			return temp;
		}finally{
			i++;
			System.out.println("m1��i="+i);
		}
*/
	

