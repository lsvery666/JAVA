//深入finally
public class Test2{
	
	public static void main(String[]	args){
		
		System.out.println(m1());
		/*
		结果为：
		try后的的i=10
		finally后的i=11
		10
		*/
					
		m2();
		/*
		结果为：
		try语句后i=20
		finally后i=21
		*/
			
		System.out.println(m3());
		/*
		结果为：
		try语句后i=30
		finally后i=31
		31
		*/
	}
	
	public static int m1(){
		int i=0;
		try{
			i=10;
			System.out.println("try后的的i="+i);
			return i;
		}
		finally{
			i++;
			System.out.println("finally后的i="+i);
		}
	}
	
	public static void m2(){
		int i=0;
		try{
			i=20;
			System.out.println("try语句后i="+i);
		}
		finally{
			i++;
			System.out.println("finally后i="+i);
			
		}
	}
	
	public static int m3(){
		int i=0;
		try{
			i=30;
			System.out.println("try语句后i="+i);
			return i;
		}
		finally{
			i++;
			System.out.println("finally后i="+i);
			return i;
		}
	}
}
/*
	原理：
		int i=0；
		try{
			i=10；
			int temp=i;
			return temp;
		}finally{
			i++;
			System.out.println("m1的i="+i);
		}
*/
	

