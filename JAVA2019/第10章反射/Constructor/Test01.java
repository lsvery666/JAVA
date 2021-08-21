/*
	获取构造方法
*/
import java.lang.reflect.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("java.lang.String");
		Constructor[] cs=c.getDeclaredConstructors();
		
		/*
		for(Constructor con:cs){
			System.out.println(Modifier.toString(con.getModifiers()));
			System.out.println(c.getSimpleName());
			Class[] parameterTypes=con.getParameterTypes();
			for(Class parameterType:parameterTypes){
				System.out.println(parameterType.getSimpleName());
			}
		}
		*/

		//反编译
		StringBuffer sb=new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		
		for(Constructor con:cs){
			sb.append("   ");

			if(con.getModifiers()!=0){
				sb.append(Modifier.toString(con.getModifiers())+" ");
			}

			sb.append(c.getSimpleName());

			Class[] parameterTypes=con.getParameterTypes();
			sb.append("(");
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