/*
	������ǿforѭ����ȱ�㣺û���±�
*/
public class Test02{
	public static void main(String[] args){
		String[] ins={"�˶�","����","����","��ʳ"};
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ins.length;i++){
			if(i==ins.length-1){
				sb.append(ins[i]);
			}else{
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		//���ϵ�ѭ���Ͳ��ʺ�����ǿforѭ��
	}
}