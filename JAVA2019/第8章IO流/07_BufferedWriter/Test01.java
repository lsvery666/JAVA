/*
	BufferedWriter(FileWriter fw)
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		//�������л��������ַ������
		//BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("temp.txt")));
		bw.write("���˻�!");
		//д��һ���зָ���
		bw.newLine();
		bw.write("��Ļʽһ�㶼û��˼��");
		bw.flush();
		bw.close();
	}
}