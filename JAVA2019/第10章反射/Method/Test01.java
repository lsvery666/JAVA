/*
	java.lang.reflect.Method;
*/
import java.lang.reflect.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("java.util.Date");//只需要.class文件 不需要.java文件
		
		Method[] ms=c.getDeclaredMethods();

      /*
		for(Method m:ms){

			//方法的修饰符
			System.out.println(Modifier.toString(m.getModifiers()));
		
			//方法的返回值类型
			System.out.println(m.getReturnType().getSimpleName());
			
			//方法名
			System.out.println(m.getName());

			//方法的形参列表
			Class[] parameterTypes=m.getParameterTypes();
			for(Class parameterType:parameterTypes){
				System.out.println(parameterType.getSimpleName());
			}

		}
		*/

		//反编译
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