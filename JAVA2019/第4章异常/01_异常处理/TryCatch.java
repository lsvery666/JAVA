/*
	�����쳣�ķ�ʽ������׽�����쳣
	�﷨��
		try{
			���ܳ����쳣�Ĵ���;
		}catch(�쳣����1 ����){
			�����쳣�Ĵ���;
		}catch(�쳣����2 ����){
			�����쳣�Ĵ���;
		}catch(�쳣����3 ����){
			�����쳣�Ĵ���;
		}
	1.catch�������д���
	2.���Ǵ��ϵ���catch���쳣���ͱ����С���󣨴��ӵ�����
	3.catch�������ֻ��ִ��һ����ִ���꣬try-catch���ͽ�����
*/
import java.io.*;
public class TryCatch{
	public static void main(String[] args){
		/*���³�����벻��ͨ�� ��ΪFileNotFoundException����ArithmeticException������
		try{
			FileInputStream fis=new FileInputStream("ab.txt");
		}catch(ArithmeticException e){
		}
		*/
		
		
		/*���³������ͨ��
		try{
			FileInputStream fis=new FileInputStream("ab.txt");
		}catch(FileNotFoundException e){
		}
		*/
		
		/*���³�����벻��ͨ��	��Ϊfis.read()�������һ������IOException���쳣
		try{
			FileInputStream fis = new FileInputStream("ab.txt");
			fis.read();
		}catch(FileNotFoundException e){
		}
		*/
		
		
		/*���³���ͨ��
		try{
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}
		*/
		
		//���³������ͨ��
		try{
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(IOException e){
			
		}
		
		
		/*�����޷�ͨ����catch����д��������Ǳ�����ϵ��µ��쳣���ʹ�С����
		try{
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(IOException e){
			
		}catch(FileNotFoundException e){
			
		}
		*/
	}
	
}