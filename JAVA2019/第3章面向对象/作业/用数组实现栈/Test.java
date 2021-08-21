public class Test{
	public static void main(String[] args){
		ArrayStack s=new ArrayStack();
		User u1=new User("JACK",10);
		User u2=new User("KING",50);
		User u3=new User("Utal",30);
		User u4=new User("Faker",40);
		User u5=new User("White",50);
		try{
			s.push(u1);
			s.push(u2);
			s.push(u3);
			s.push(u4);
			s.push(u5);
			s.push(u5);
			s.push(u5);
			s.push(u5);
			s.push(u5);
			s.push(u5);
			s.push(u5);
		}catch(StackOperationException e){
			e.printStackTrace();
		}
		try{
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
		}catch(StackOperationException e){
			e.printStackTrace();
		}
		
	}
}
class User{
	String name;
	int age;
	User(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "User[name="+name+",age="+age+"]";
	}
}