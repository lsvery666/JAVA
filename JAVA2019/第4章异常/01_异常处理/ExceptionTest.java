/*
	异常的产生
	Throwable：可抛出的。 
	|--Error：错误，一般情况下，不编写针对性的代码进行处理，通常是jvm发生的，需要对程序进行修正。OutOfMemoryError、StackOverFlowError
	|--Exception：异常，可以有针对性的处理方式 IndexOutOfBoundsException、NullPointerException、ClassCastException、FileNotFoundException
	
	异常分两种：
	1：编译时被检查的异常，只要是Exception及其子类都是编译时被检测的异常。
	2：运行时异常，其中Exception有一个特殊的子类RuntimeException，以及RuntimeException的子类是运行异常，也就说这个异常是编译时不被检查的异常。

	编译时被检查的异常和运行时异常的区别：
	编译时被检查的异常在函数内被抛出，函数必须要声明，否编译失败。
	声明的原因：是需要调用者对该异常进行处理。
	运行时异常如果在函数内被抛出，在函数上不需要声明。
	不声明的原因：不需要调用者处理，运行时异常发生，已经无法再让程序继续运行，所以，不让调用处理的，直接让程序停止，由调用者对代码进行修正。

*/
import java.io.*;
public class ExceptionTest{
	public static void main(String[]args) throws FileNotFoundException {	//或throws IOException 或 throws Exception
		//创建文件输入流，读取文件
		FileInputStream fis = new FileInputStream("ab.txt");
	}
}
/*
	编译不通过：
	ThrowsTest.java:8: 错误: 未报告的异常错误FileNotFoundException; 
	必须对其进行捕获或声明以便抛出
			FileInputStream fis = new FileInputStream("ab.txt");
*/