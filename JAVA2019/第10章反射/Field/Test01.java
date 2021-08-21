/*
	java.lang.reflect.Field

	Class:
		public static Class forName(String str){}		//���str��Ӧ������			
		public Field[] getFields(){}						//��ö�Ӧ���͵�������public���εĳ�Ա����
		public Filed[] getDeclaredFields(){}			//��ö�Ӧ���͵����г�Ա����
		public String getSimpleName(){}					//��ö�Ӧ���͵ı�ʶ��
		public String getName(){}							//��ö�Ӧ���͵ı�ʶ��
		public int getModifiers(){}						//��ö�Ӧ���͵����η�

	Filed:
		public String getName(){}							//��ó�Ա�����ı�ʶ��
		public int getModifiers(){}						//��ó�Ա���������η� 0-default(ȱʡ) 1-public 2-private 4-protected
		public Class getType(){}							//��ó�Ա����������

	Modifier:
		public static String toString(int i){}			//����������Ӧ�����η�
*/
import java.lang.reflect.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("User");

		/*
		
		//��ȡ���е�public���ε�����
		Field[] fs=c.getFields();
		System.out.println(fs.length);//1
		System.out.println(fs[0].getName());//age

		//��ȡ���е�����
		Field[] fs2=c.getDeclaredFields();
		for(Field field:fs2){

			//��ȡ���Ե����η�
			int i=field.getModifiers();
			//System.out.println(i);//2 1 4 0
			String strModifier=Modifier.toString(i);
			System.out.println(strModifier);// private public protected ___

			//��ȡ���Ե�����
			Class type=field.getType();
			//System.out.println(type.getName());
			System.out.println(type.getSimpleName());//String int String boolean

			//��ȡ���Եı�ʶ��
			System.out.println(field.getName());//id age addr sex
		}

		*/
		
		//������
		Field[] fs=c.getDeclaredFields();
		StringBuffer sb=new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{"+'\n');
		for(Field field:fs){
			sb.append("   ");
			if(field.getModifiers()!=0){
				sb.append(Modifier.toString(field.getModifiers())+" ");
			}
			sb.append(field.getType().getSimpleName()+" ");
			sb.append(field.getName()+";"+'\n');
		}
		sb.append("}");
		System.out.println(sb);


	}
}