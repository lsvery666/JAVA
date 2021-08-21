/*
	使用String的时候我们应该注意的问题：尽量不要做字符串频繁的拼接操作
	因为字符串一旦创建不可改变，只要频繁拼接，就会在堆中创建大量的字符串对象，给垃圾回收带来问题。
*/
public class StringTest04{
	public static void main(String[] args){
		String[] ins={"SPORT","MUSIC","FOOD","SLEEP"};
		//要求将上面的兴趣爱好拼接成一个字符串"SPORT,MUSIC,FOOD,SLEEP"
		String temp="";
		for(int i=0;i<ins.length;i++){
			if(i==ins.length-1){
				temp=temp+ins[i];
			}else{
				temp=temp+ins[i]+",";
			}
		}
		System.out.println(temp);
	}
}