/*
	java.util.Set
		java.util.SortedSet;无序不可重复，但是存进去的元素可以按照元素大小顺序自动排列
			java.util.TreeSet;
*/
import java.util.*;
import java.text.*;
public class Test01{
	public static void main(String[] args) throws Exception{
		SortedSet s=new TreeSet();
		s.add(10);//自动装箱
		s.add(20);
		s.add(15);
		s.add(30);
		s.add(25);
		s.add(9);
		Iterator it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*
			9
			10
			15
			20
			25
			30
		*/
		SortedSet st=new TreeSet();
		st.add("JACK");
		st.add("SUN");
		st.add("COOK");
		st.add("LUCKY");
		st.add("KING");
		Iterator it2=st.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		//日期
		String st1="2008-08-08";
		String st2="2009-08-08";
		String st3="2008-09-08";
		String st4="2008-08-09";
		String st5="2012-08-08";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date t1=sdf.parse(st1);
		Date t2=sdf.parse(st2);
		Date t3=sdf.parse(st3);
		Date t4=sdf.parse(st4);
		Date t5=sdf.parse(st5);
		SortedSet times=new TreeSet();
		times.add(t1);
		times.add(t2);
		times.add(t3);
		times.add(t4);
		times.add(t5);
		Iterator it3=times.iterator();
		while(it3.hasNext()){
			Object element=it3.next();
			if(element instanceof Date){
				System.out.println(sdf.format((Date)element));
			}
			
		}
	}
}