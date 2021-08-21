/*
	StringBufffer���Դ洢�������͵����ݣ����ն������ַ���
*/
public class Test2
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		int a = 1;
		String b = "hhh";
		float c = 2.3f;
		Person p = new Person(15, "Tom");
		sb.append(a);
		sb.append(b);
		sb.append(c);
		sb.append(p);
		System.out.println(sb);	// 1hhh2.3Person[name=Tom, age=15]

		// ����
		sb.insert(1, "abc");
		System.out.println(sb);	// 1abchhh2.3Person[name=Tom, age=15]
		
		// ɾ��
		sb.delete(2, 5);
		System.out.println(sb);	// 1ahh2.3Person[name=Tom, age=15]

		sb.deleteCharAt(1);	// 1hh2.3Person[name=Tom, age=15]
		System.out.println(sb);

		// �޸�
		sb.replace(3, 4, "aaaaa");	// 1hhaaaaa.3Person[name=Tom, age=15]
		System.out.println(sb);
		
		sb.setCharAt(2, '��');	// 1h��aaaaa.3Person[name=Tom, age=15]
		System.out.println(sb);

		sb.setLength(5);	// 1h��aa
		System.out.println(sb);

		// ����
		System.out.println(sb.indexOf("��"));	// 2
		System.out.println(sb.lastIndexOf("a"));	// 4

		// ��ȡ�Ӵ�
		System.out.println(sb.substring(1, 2));	// h

		// ��ת
		System.out.println(sb.reverse());	// aa��h1
		System.out.println(sb);	// aa��h1
	}
}

class Person
{
	int age;
	String name;
	Person(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	public String toString()
	{
		return "Person[name="+name+", age="+age+"]";
	}
}