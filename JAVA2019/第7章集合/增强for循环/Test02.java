/*
	关于增强for循环的缺点：没有下标
*/
public class Test02{
	public static void main(String[] args){
		String[] ins={"运动","音乐","旅游","美食"};
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ins.length;i++){
			if(i==ins.length-1){
				sb.append(ins[i]);
			}else{
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		//以上的循环就不适合用增强for循环
	}
}