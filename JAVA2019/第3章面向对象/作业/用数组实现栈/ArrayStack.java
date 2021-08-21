//栈：先进后出
public class ArrayStack{
	 //使用数组存储数据
	 //栈可以存储多个引用类型的元素
	 Object[] elements;
	 
	 //指向栈顶元素上方的一个帧
	 int index;
	 
	 //栈默认的初始化容量是10
	 //constructor
	 ArrayStack(){
	 	this(10);	
	 }
	 ArrayStack(int max){
	 	elements= new Object[max];
	 	index=0;
	 }
	 
	 //栈应该对外提供push和pop方法
	 public void push(Object element) throws StackOperationException{
	 	if(index==elements.length){
	 		throw new StackOperationException("栈已满");
	 	}
	 	elements[index]=element;
	 	index++;
	 }
	 public Object pop() throws StackOperationException{
	 	if(index==0){
	 		throw new StackOperationException("栈已空");
	 	}
	 	index--;
	 	return elements[index];
	 }
}