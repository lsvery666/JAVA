import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.DBF"));
		User u1 = new User("JACK");
		oos.writeObject(u1);
		oos.flush();
		oos.close();
	}
}