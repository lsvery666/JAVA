/*
	return语句后不能再有别的语句，否则编译不能通过，但要注意程序分为编译期和运行期，编译期不会进行判断和运算。
*/
public class _08_return
{
	public static void main(String[] args){
	
		boolean a = true;

		if(a){

			return;	
			// System.out.println(a);	// 错误：无法访问的语句	

		}

		// 区别在于：不在同一个域中
		boolean b = a;

		System.out.println(b);	//编译可以通过，但是无法输出

	}

	//编译无法通过	错误：缺少返回语句
//	public static int isSuccess(boolean a){
//
//		if(a){
//
//			return 1;
//
//		}
//	}
}