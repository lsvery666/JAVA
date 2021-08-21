/*
	�����������+ - * / % ++ --	
	1. �ڶ������ͻ������ʱ���Ƚ���������ת��Ϊ�����������������㣻
	2. byte\short\char֮����㲻�ụ��ת����ȫ��ת����int���м��㡣

	��ֵ�������= += -= *= /= %=
	+=��=������+=���Զ�����ǿ������ת��

	�Ƚ��������> < >= <= ==
	���ؽ��Ҫô��true��Ҫô��false

	�߼��������& | ^ ! && ||
	^:��� &&��||:��·�롢��·��

	λ�������& | ~ ^ << >> >>>(�޷�������)
	M << n��M * 2^n ��32λ�з�������ʾ
	M >> n: M / 2^n ��32λ�з�������ʾ

	�����������<boolean���ʽ>?<���ʽ1>:<���ʽ2>

	��������ȼ���priority.png

*/
public class _03_operator
{
	public static void main(String[] args){
		char a = 'a';
		char b = 0;
		// char c = a + b;	// ����: �����ݵ�����: ��intת����char���ܻ�����ʧ
		char c = (char)(a + b);
		System.out.println(c);	// a

		int d = 10;
		int e = 3;
		int f = d / e;
		float g = (float)(d/e);
		System.out.println(f);	// 3
		System.out.println(g);	// 3.0

		byte h = 10;
		//h = h + 10;//�����ݵ�����: ��intת����byte���ܻ�����ʧ
		h+=10;
		System.out.println(h);	// 20

		byte i = 10;
		i+=1000;
		System.out.println(i);	// -14 = (1010%256) - 256

		int x = 1010%256;
		System.out.println(x);	// 242

		System.out.println(1 & 2);		// 0
		System.out.println(1 | 2);		// 3
		System.out.println(1 ^ 2);		// 3
		System.out.println(1 << 2);		// 4
		System.out.println(1 >> 2);		// 0
		System.out.println(1 >>> 2);	// 0
		
		System.out.println(1 << 7);		// 128
		System.out.println(1 << 31);	// -2147483648
		System.out.println(1 << 32);	// 1
		
		System.out.println(12 >> 2);	// 3,  (24��0) 0000 1100 --> (24��0) 0000 0011 ��λ��0
		// �����ڼ�������Բ������ʽ�洢�����룺����λ���䣬����λ��λȡ���ټ�1
		System.out.println(-8 >> 2);	// -2, (24��1) 1111 1000 --> (24��1) 1111 1110 ��λ��1

		// >> �� >>> ������
		System.out.println(12 >>> 2);	// 3,  (24��0) 0000 1100 --> (24��0) 0000 0011 ��λ��0
		System.out.println(-8 >>> 2);	// 1073741822 = 2^30 - 2, 0011 1111 (16��1) 1111 1110 ��λ��0
		
		byte j = 10;
		long k = j / 3;
		//byte l = (byte)(int)j/3;	// ������Ϊ/�����ȼ���ǿ������ת���ͣ�����(byte)��(int)��ֻ��j��������
		byte l = (byte) (j/3);
		System.out.println(l);		// 3
	}
}