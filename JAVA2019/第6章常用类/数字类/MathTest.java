/*
	关于数字格式化：Java.text.DecimalFormat;
		数字格式化元素：
		# 任意数字
		, 千分位
		. 小数点
		0 不够补0
*/
import java.text.DecimalFormat;
public class MathTest{
	public static void main(String[] args){
		//1.创建数字格式化对象
		//需求：加入千分位
		DecimalFormat df=new DecimalFormat("###,###");
		//开始格式化
		System.out.println(df.format(1234567));//1,234,567
		
		//需求：加入千分位，保留两位小数
		DecimalFormat df1=new DecimalFormat("###,###.##");//1,234,567.12
		System.out.println(df1.format(1234567.123));
		
		//需求：加入千分位，保留4位小数，并且不够补0
		DecimalFormat df2=new DecimalFormat("###,###.0000");
		System.out.println(df2.format(1234567.123));//1,234,567.1230
	}
}