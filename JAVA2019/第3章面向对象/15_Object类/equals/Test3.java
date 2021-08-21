public class Test3
{
	public static void main(String[] args)
	{
		Person p1 = new Person(20, "Tom");
		Person p2 = new Person(20, "Tom");
		System.out.println(p1.equals(p2));
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

	public boolean equals(Object obj)
	{
		if(obj instanceof Person)
		{
			Person p = (Person)obj;
			return p.age == this.age && p.name.equals(p.name);
		}
		else
		{
			return false;
		}
	}
}