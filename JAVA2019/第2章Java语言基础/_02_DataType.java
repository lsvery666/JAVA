/*	
	�����������ͣ�byte(1) short(2) int(4) long(8) float(4) double(8) char(2) boolean(1)
	�����������ͣ����顢�ࡢ�ӿ�
	����ӵ͵���Ϊ��byte char short (������ƽ��) --> int --> float --> long --> double
	�Զ�����ת�����ӵͼ��𵽸߼���ϵͳ�Զ�ת�ģ�ƽ��֮���޷��Զ�ת��
	ǿ������ת������һ���߼����������һ���ȸ����ļ���͵ı���

	��������ֵ�������ö����ơ��˽��ơ�ʮ���ơ�ʮ����������ʾ��
	һ������£�����ֵ��������int���͡�
	����int����ֵ���Ը�ֵ��byte�� short ��char ��long ��int��ֻҪ����ֵ��Ŀ�귶Χ���ڣ�Java���Զ����ת����
	����int���������Ը�ֵ��byte�� short ��char ��long ��int����ʹ����ֵ��Ŀ�귶Χ���ڣ���Ҫ��ǿ������ת����
	�����ͼ��������Χ������ֵ����ĳһ���ͣ������128����byte���ͣ�������ͨ������
	����봴��һ��int�����޷���ʾ��long���ͣ�����Ҫ������ֵ��������L����l��
	ͨ������ʹ���������ֵ�L��������������ֵ����int����ֵ��long����ֵ���֡�
	
	����������ֵ��Ĭ��Ϊdouble�ͣ�����ͨ�������D(d)��F(f)��ָ��double������ֵ��float������ֵ

	char�������ڴ���ַ����������ͣ�ռ��2���ֽڣ�����unicode���룬����ǰ128�ֽڱ�����ASCII����;
	�ַ��Ĵ洢��Χ��\u0000~\uFFFF (0 ~ 65535)��
	Ҳ����ʹ�ð˽��ƻ���ʮ�����Ʊ�ʾ�ַ����˽���ʹ�÷�б�ܼ�3λ���ֱ�ʾ������'\141'��ʾ��ĸa;
	ʮ������ʹ�÷�б��u����4λʮ�����Ƶ�����ʾ����'\u0061'��ʾ�ַ�a��

	char���Ա�ʾ�����ַ���byte������
	char��byte��int����Ӣ���ַ��������໥ת��
	char����ֵ���Ը�ֵ��byte�� short ��char ��long ��int��ֻҪ����ֵ��Ŀ�귶Χ���ڣ���Ӣ���ַ�����Java���Զ����ת����
	char���������Ը�ֵ��byte�� short ��char ��long ��int����ʹ����ֵ��Ŀ�귶Χ���ڣ���Ӣ���ַ�������Ҫ��ǿ������ת����
*/
public class _02_DataType{
	public static void main(String[] args){
		// byte a = -128;
		// byte a = -129;	// ������󣺲����ݵ�����: ��intת����byte���ܻ�����ʧ
		// ǿ������ת��
		byte a = (byte)-129;
		System.out.println(a);	// 127

//		short x = 1;
//		byte z = x;		// ����: �����ݵ�����: ��shortת����byte���ܻ�����ʧ
//		System.out.println(z);

//		byte x = 97;
//		char z = x;	//  ����: �����ݵ�����: ��byteת����char���ܻ�����ʧ


		// �Զ�����ת��
		int b = a;
		System.out.println(b);	// 127

		// long c = 2147483648; // ��������̫��int��������ֵ���Ϊ2147483647
		long c = 2147483648L;
		System.out.println(c);	// 2147483648

		// float d = 1.2;	// ������󣺲����ݵ�����: ��doubleת����float���ܻ�����ʧ
		float d = 1.2F;
		System.out.println(d);	// 1.2

		char e = 'a';

		// byte f = e + 10;	// ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		int f = e + 10;

		char g = (char)f;

		System.out.println(e);	// a
		System.out.println(f);	// 107
		System.out.println(g);	// k

		char h = 0;
		System.out.println(h);	// \n

		// char i = 65536;	// ����: �����ݵ�����: ��intת����char���ܻ�����ʧ
		char i = (char)65536;
		System.out.println((int)i);	// 0
	}
}
