/*
	java.math.BigDecimal;
	该类型的数据精确度极高，适合做财务软件。
	财务软件中double类型精确度太低。
*/
import java.math.BigDecimal;
public class MathTest1{
	public static void main(String[] args){
		//创建大数据
		BigDecimal v1=new BigDecimal(10);//这是一个精确度比较高的10
		BigDecimal v2=new BigDecimal(10);
		//做加法运算
		BigDecimal v3=v1.add(v2);
		System.out.println(v3);//20
	}
}