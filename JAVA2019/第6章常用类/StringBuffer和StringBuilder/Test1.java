/*
	java.lang.StringBuffer;
	java.lang.StringBuilder;
	1.StringBuffer��StringBuilder����һ���ַ���������
	2.����ԭ��
		Ԥ�����ڴ�������һ��ռ䣬�������ַ�����
		���Ԥ���Ŀռ䲻���ã�������Զ����ݣ������ɸ����ַ�����
	3.StringBuffer,StringBuilder��String��������
		String�ǲ��ɱ���ַ����У��洢���ַ�����������
		StringBuffer�ײ���һ��char���飬���Ǹ�char�����ǿɱ�ģ����ҿ����Զ�����
	4.StringBuffer��StringBuilder��Ĭ�ϳ�ʼ��������16
	5.����Ż�StringBuffer��StringBuilder�أ�
		����ڴ���StringBuffer֮ǰ��Ԥ��StringBuffer�Ĵ洢�ַ�����
		Ȼ���ٴ���StringBuffer��ʱ�����ָ����ʼ�������ķ�ʽ����StringBuffer
		Ϊ�˼��ٵײ�����Ŀ��������Ч��
	6.StringBuffer��StringBuilder������
		StringBuffer���̰߳�ȫ�ģ������ڶ��̵߳Ļ�����ʹ�ò����������
		StringBuilder�Ƿ��̰߳�ȫ�ġ�
*/
public class Test1{
	public static void main(String[] args){
		//�����ַ�������������
		StringBuffer sb = new StringBuffer(10);//16
		//������StringBuffer��׷���ַ���
		String[] ins = {"�˶�","����","˯��","��ʳ"};
		//�Ƽ��ַ���Ƶ��ƴ��ʹ��StringBuffer����StringBuilder
		for(int i=0;i<ins.length;i++){
			if(i==ins.length-1){
				sb.append(ins[i]);
			}else{
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		System.out.println(sb);
	}
	
}