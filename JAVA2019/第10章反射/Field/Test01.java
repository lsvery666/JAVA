/*
	java.lang.reflect.Field

	Class:
		public static Class forName(String str){}		//获得str对应的类型			
		public Field[] getFields(){}						//获得对应类型的所有由public修饰的成员变量
		public Filed[] getDeclaredFields(){}			//获得对应类型的所有成员变量
		public String getSimpleName(){}					//获得对应类型的标识符
		public String getName(){}							//获得对应类型的标识符
		public int getModifiers(){}						//获得对应类型的修饰符

	Filed:
		public String getName(){}							//获得成员变量的标识符
		public int getModifiers(){}						//获得成员变量的修饰符 0-default(缺省) 1-public 2-private 4-protected
		public Class getType(){}							//获得成员变量的类型

	Modifier:
		public static String toString(int i){}			//返回整数对应的修饰符
*/
import java.lang.reflect.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("User");

		/*
		
		//获取所有的public修饰的属性
		Field[] fs=c.getFields();
		System.out.println(fs.length);//1
		System.out.println(fs[0].getName());//age

		//获取所有的属性
		Field[] fs2=c.getDeclaredFields();
		for(Field field:fs2){

			//获取属性的修饰符
			int i=field.getModifiers();
			//System.out.println(i);//2 1 4 0
			String strModifier=Modifier.toString(i);
			System.out.println(strModifier);// private public protected ___

			//获取属性的类型
			Class type=field.getType();
			//System.out.println(type.getName());
			System.out.println(type.getSimpleName());//String int String boolean

			//获取属性的标识符
			System.out.println(field.getName());//id age addr sex
		}

		*/
		
		//反编译
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