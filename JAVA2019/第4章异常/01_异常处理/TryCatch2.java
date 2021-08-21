import java.io.*;
public class TryCatch2{	
	/*���³�������޷�ͨ��
	public static void main(String[]	args) throws FileNotFoundException{
		FileInputStream fis=new FileInputStream("abc");
		fis.read();
	}
	*/
	
	
	/*���³���������ͨ��
	public static void main(String[]	args) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("abc");
		fis.read();
	}
	*/
	
	/*���³���������ͨ��
	public static void main(String[]	args) throws IOException{
		FileInputStream fis=new FileInputStream("abc");
		fis.read();
	}
	*/
	
	//���³���������ͨ��
	public static void main(String[] args) throws IOException{
		try{
			
			//����ִ�е��˴�������FileNotFoundException���͵��쳣
			//JVM���Զ�����һ��FileNotFoundException���͵Ķ��󣬽��ö�����ڴ��ַ���Ƹ�catch�����е�e����
			FileInputStream fis = new FileInputStream("abc");
			
			//����Ĵ���������쳣��try����Ĵ��벻�ټ���ִ�У�ֱ�ӽ���catch������ִ��
		   
		   fis.read();
	
		}catch(FileNotFoundException e){
			
			System.out.println("��ȡ���ļ������ڣ�");
			
			//FileNotFoundException��Object�е�toString������������д
			
			System.out.println(e);//java.io.FileNotFoundException: abc (ϵͳ�Ҳ���ָ�����ļ���)
	
		}catch(IOException e){
			
			System.out.println("����IO�쳣��");
		}
		
		System.out.println("try-catch����ִ����ϣ�");
	
	}
	
	
}