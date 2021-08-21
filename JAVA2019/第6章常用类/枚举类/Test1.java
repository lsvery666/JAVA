/*
	需求：定义一个方法，该方法的作用是计算两个int类型数据的商
	如果计算成功则该方法返回1，如果执行失败则该方法返回0
	
	程序执行成功，但是该程序存在风险，如果误将rturn 0写成了return 10，则无法满足需求。
	 
	程序中的问题能在编译阶段解决的，绝对不会放在运行期解决，所以可引入“枚举类型”
*/
public class Test1{
	public static void main(String[] args){
		int a = 10;
		int b = 0;
		int retValue = divide(a,b);
		if(retValue == 1){
			System.out.println("成功");
		}else if(retValue == 0){
			System.out.println("失败");
		}
	}
	public static int divide(int a,int b){
		try{
			int c = a / b;
			return 1;
		}catch(Exception e){
			return 0;
		}
	}
}