package myChain;

/**
 * '��' ��
 * @author Johness
 * @version 1.0
 */
public class Person{
    String name;        // ����
    int age;                // ����
    int personNo;     // ��ţ�����Ψһ��ʶ
    
    // ���ι��췽��
    public Person(String name, int age, int personNo) {
        this.name = name;
        this.age = age;
        this.personNo = personNo;
    }

    // ��ȡ����
    public String getName(){
        return this.name;
    }
    
    // ��ȡ����
    public int getAge(){
        return this.age;
    }
    
    // ��ȡ���
    public int getPersonNo(){
        return this.personNo;
    }
    
    // �����������Ϣ
    public String toString(){
        return "������" + this.name + "\t���䣺" + this.age +"\t���" + this.personNo;
    }
}