package myChain;

/**
 * ���ڵ㣩ʵ�壬��װ��'��'����������һ��ʵ�������
 * ��ʵ�彫��Ϊ����������Ľڵ�
 * @author Johness
 */
public class PersonChainNode {
    Person person;                            // ��
    PersonChainNode nextNode;        // �ö���'��'���������һ�����������
    
    // ��ȡ��ǰʵ�����'��'��
    public Person getPerson(){
        return this.person;
    }
    
    // ��ȡ��һ��ʵ��
    public PersonChainNode getNextEntity(){
        return this.nextNode;
    }
    
    // ���췽��
    public PersonChainNode (Person p,PersonChainNode ep){
        this.person = p;
        this.nextNode = ep;
    }
    
    // ���췽��
    public PersonChainNode (Person p){
        this.person = p;
    }
}