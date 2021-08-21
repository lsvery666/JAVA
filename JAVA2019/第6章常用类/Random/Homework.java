//作业：生成5个不重复的随机数
import java.util.Random;
import java.util.Arrays;
public class Homework{
	public static void main(String[] args){
		final int a = 5;
		int[] nums = new int[5];//用来存放5个随机数
		Random r = new Random();
		nums[0] = r.nextInt(a);//第一个随机数
		int i=1;//已生成随机数的个数
		while(i>=1 && i<=4){
			int b=r.nextInt(a);
			if(!search(nums,b,i)){
				nums[i]=b;
				i++;
			}
		}
		for(int j=0;j<5;j++){//输出5个随机数
			System.out.println(nums[j]);
		}
	}
	public static boolean search(int[] a,int b,int index){//判断b是否在a的前index个数中
		for(int i=0;i<index;i++){
			if(a[i]==b){
				return true;
			}
		}
		return false;
	}
}
