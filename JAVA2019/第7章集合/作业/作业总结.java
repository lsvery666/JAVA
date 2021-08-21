/*
	作业总结：
	1.一句话后面忘写";"
	2.重写cmpareTo方法：
		如果让该类implements Comparable,则compareTo的形参必须为为Object;
		如果让该类implements Comparable<类名>,则compareTo的形参可以为<类名>;
		参考 泛型\Test04.java
	3.重写equals方法：
		形参可以是<类名>
	3.String类型尽管实现了Comparable接口，但不可用"<"或">"来比较字符串，应用compareTo方法来比较;
	4.TreeSet t;
	  TreeSet t=new TreeSet();
	  区别：前者作为成员变量时，默认初始化为空指针;
	  		  后者作为成员变量时，非空指针，指针指向一个元素个数为0的集合;
	5.如果在一个方法既要有返回值，也要抛出异常，可写为：
	  try{
	     return <返回值>;
	  }finally{
	  	  throw new <异常名>;
	  }
	6.getMessage不能直接输出异常信息，应用System.out.println(e.getMessage());
*/	