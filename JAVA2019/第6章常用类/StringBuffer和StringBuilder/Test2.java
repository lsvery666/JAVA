/*
	StringBufffer可以存储任意类型的数据，最终都会变成字符串
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

		// 插入
		sb.insert(1, "abc");
		System.out.println(sb);	// 1abchhh2.3Person[name=Tom, age=15]
		
		// 删除
		sb.delete(2, 5);
		System.out.println(sb);	// 1ahh2.3Person[name=Tom, age=15]

		sb.deleteCharAt(1);	// 1hh2.3Person[name=Tom, age=15]
		System.out.println(sb);

		// 修改
		sb.replace(3, 4, "aaaaa");	// 1hhaaaaa.3Person[name=Tom, age=15]
		System.out.println(sb);
		
		sb.setCharAt(2, '中');	// 1h中aaaaa.3Person[name=Tom, age=15]
		System.out.println(sb);

		sb.setLength(5);	// 1h中aa
		System.out.println(sb);

		// 查找
		System.out.println(sb.indexOf("中"));	// 2
		System.out.println(sb.lastIndexOf("a"));	// 4

		// 获取子串
		System.out.println(sb.substring(1, 2));	// h

		// 反转
		System.out.println(sb.reverse());	// aa中h1
		System.out.println(sb);	// aa中h1
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