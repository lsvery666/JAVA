//ʹ��BufferedReader��FileReader�е�close����������չ
//1.װ����ģʽ��Ҫ��װ�����к��б�װ���ߵ�����
//2.װ����ģʽ��Ҫ��װ���ߺͱ�װ����Ӧ��ʵ��ͬһ������
public class BufferedReader extends Reader//BufferedReader װ����
{
	//������ϵ
	//FileReader reader;//FileReader���Ǳ�װ����
	Reader reader;
	BufferedReader(Reader reader){
		this.reader=reader;
	}
	public void close(){
		System.out.println("��չ����1");
		reader.close();
		System.out.println("��չ����2");
	}
}