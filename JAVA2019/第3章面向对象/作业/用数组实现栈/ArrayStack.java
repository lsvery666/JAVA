//ջ���Ƚ����
public class ArrayStack{
	 //ʹ������洢����
	 //ջ���Դ洢����������͵�Ԫ��
	 Object[] elements;
	 
	 //ָ��ջ��Ԫ���Ϸ���һ��֡
	 int index;
	 
	 //ջĬ�ϵĳ�ʼ��������10
	 //constructor
	 ArrayStack(){
	 	this(10);	
	 }
	 ArrayStack(int max){
	 	elements= new Object[max];
	 	index=0;
	 }
	 
	 //ջӦ�ö����ṩpush��pop����
	 public void push(Object element) throws StackOperationException{
	 	if(index==elements.length){
	 		throw new StackOperationException("ջ����");
	 	}
	 	elements[index]=element;
	 	index++;
	 }
	 public Object pop() throws StackOperationException{
	 	if(index==0){
	 		throw new StackOperationException("ջ�ѿ�");
	 	}
	 	index--;
	 	return elements[index];
	 }
}