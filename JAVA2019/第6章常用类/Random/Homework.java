//��ҵ������5�����ظ��������
import java.util.Random;
import java.util.Arrays;
public class Homework{
	public static void main(String[] args){
		final int a = 5;
		int[] nums = new int[5];//�������5�������
		Random r = new Random();
		nums[0] = r.nextInt(a);//��һ�������
		int i=1;//������������ĸ���
		while(i>=1 && i<=4){
			int b=r.nextInt(a);
			if(!search(nums,b,i)){
				nums[i]=b;
				i++;
			}
		}
		for(int j=0;j<5;j++){//���5�������
			System.out.println(nums[j]);
		}
	}
	public static boolean search(int[] a,int b,int index){//�ж�b�Ƿ���a��ǰindex������
		for(int i=0;i<index;i++){
			if(a[i]==b){
				return true;
			}
		}
		return false;
	}
}
