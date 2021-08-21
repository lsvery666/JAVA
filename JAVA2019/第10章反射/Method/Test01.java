/*
	java.lang.reflect.Method;
*/
import java.lang.reflect.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("java.util.Date");//ֻ��Ҫ.class�ļ� ����Ҫ.java�ļ�
		
		Method[] ms=c.getDeclaredMethods();

      /*
		for(Method m:ms){

			//���������η�
			System.out.println(Modifier.toString(m.getModifiers()));
		
			//�����ķ���ֵ����
			System.out.println(m.getReturnType().getSimpleName());
			
			//������
			System.out.println(m.getName());

			//�������β��б�
			Class[] parameterTypes=m.getParameterTypes();
			for(Class parameterType:parameterTypes){
				System.out.println(parameterType.getSimpleName());
			}

		}
		*/

		//������
		StringBuffer sb=new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{"+"\n");
		for(Method m:ms){

			sb.append("   ");
			sb.append(Modifier.toString(m.getModifiers())+" ");
			sb.append(m.getReturnType().getSimpleName()+" ");
			sb.append(m.getName()+"(");
			Class[] parameterTypes=m.getParameterTypes();
			for(int i=0;i<parameterTypes.length;i++){
				if(i==parameterTypes.length-1){
					sb.append(parameterTypes[i].getSimpleName()+" "+(char)('a'+i));
				}else{
					sb.append(parameterTypes[i].getSimpleName()+" "+(char)('a'+i)+",");
				}
			}
			sb.append("){}"+"\n");
		}
		sb.append("}");
		System.out.println(sb);
	}
}