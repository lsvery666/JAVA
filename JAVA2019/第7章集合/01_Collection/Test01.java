/*
	���ϣ����ڴ洢���ݵ�����
	���Ϻ����������
	1.�����ǹ̶����ȵģ������ǿɱ䳤�ȵģ�
	2.������Դ洢�����������ͣ�Ҳ���Դ洢�����������ͣ����Ǽ���ֻ�ܴ洢������������
	3.����洢��Ԫ�ر�����ͬһ���������ͣ����ϴ洢��Ԫ�ؿ����ǲ�ͬ��������
*/
import java.util.ArrayList;
import java.util.Collection;
public class Test01{
    public static void main(String[] args){
        //��������
        Collection c = new ArrayList();//��̬

        //���Ԫ��
        c.add(1);//�Զ�װ��

        Object o=new Object();
        c.add(o);//Collection����ֻ�ܵ����洢Ԫ�أ�����ֻ�ܴ洢��������

        Customer cus=new Customer("����",10);
        c.add(cus);

        //��ȡԪ�ظ���
        System.out.println(c.size());//3

        //�Ƿ�Ϊ��
        System.out.println(c.isEmpty());//false

        //������ת����Object���͵�����
        Object[] objs = c.toArray();
        for(int i=0;i<objs.length;i++){
            System.out.println(objs[i]);
        }
		/*
			1
			java.lang.Object@532760d8
			����
		*/

        //���
        c.clear();
        System.out.println(c.size());//0
        System.out.println(c.isEmpty());//true

    }
}

class Customer{
    String name;
    int age;
    Customer(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name;
    }
}