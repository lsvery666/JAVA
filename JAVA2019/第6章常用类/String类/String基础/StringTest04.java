/*
	ʹ��String��ʱ������Ӧ��ע������⣺������Ҫ���ַ���Ƶ����ƴ�Ӳ���
	��Ϊ�ַ���һ���������ɸı䣬ֻҪƵ��ƴ�ӣ��ͻ��ڶ��д����������ַ������󣬸��������մ������⡣
*/
public class StringTest04{
	public static void main(String[] args){
		String[] ins={"SPORT","MUSIC","FOOD","SLEEP"};
		//Ҫ���������Ȥ����ƴ�ӳ�һ���ַ���"SPORT,MUSIC,FOOD,SLEEP"
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