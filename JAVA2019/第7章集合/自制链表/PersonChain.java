package myChain;

/**
 * ����������
 * 
 * @author Johness
 */
public class PersonChain{
    private PersonChainNode head; // ͷ�ڵ�
    private int size; // �����ʵ�壨���ڵ��������
    private int modCount; // ���������Ĵ��������ã�

    /**
     * ��������нڵ�����
     * 
     * @return �����нڵ���
     */
    public int getSize() {
        return this.size;
    }

    /**
     * ��ӽڵ��һ�㷽��
     * 
     * @param p
     *            ��ӵ�����ڵ�Ķ��� ����ʵ��ϸ�ڣ���ΪΨһ��ʶ��ͬһ����ŵ�Personֻ�����һ��
     */
    public void addNode(Person p) {
        if (!contains(p.personNo)) { // ���������û�иö�����׼�����
            if (head != null) { // �����ͷ�ڵ㣬������½ڵ���Ϊͷ�ڵ�
                head = new PersonChainNode((myChain.Person) p, head);
                size++;
                modCount++;
            } else { // ���û��ͷ�ڵ㣬����Ӷ�����Ϊͷ�ڵ�
                head = new PersonChainNode((myChain.Person) p, null);
                size++;
                modCount++;
            }
        }
    }

    /**
     * ͨ�����ɾ������
     * 
     * @param personNo
     *            Ҫɾ������ı��
     */
    public void deleteNode(int personNo) {
        if (size == 0) { // �����ǰ����ڵ���Ϊ��
            return;
        }
        if (size == 1) { 
            // ���ֻ��һ���ڵ㲢��������Ҫɾ���Ķ���
            if (head.person.personNo == personNo) {
                head = null;
                size = 0;
            }
            return;
        }
        // ��������ڸö�����
        if (!contains(personNo)) {
            return;
        }

        // ��Ϊ���ӵ�ɾ�����������ͱ��汻ɾ���Ľڵ������
        //��ɾ�����������ǲ����ڵģ�����ֻ��һ��˵����
        int index = 0;
        // ѭ���������ҵ�ɾ���ڵ������
        for (PersonChainNode p = head; p != null; p = p.nextNode) {
            if (!(p.person.personNo == personNo)) {
                index++;
            } else {
                break;
            }
        }
        // ���ɾ�����ǵ�һ���ڵ㣨��ͷ�ڵ㣩
        if (index == 0) {
            head = new PersonChainNode(head.nextNode.person,
                    head.nextNode.nextNode);    // ����ͷ�ڵ��һ���ڵ�Ϊ�µ�ͷ�ڵ�
            size--;                                            // ����ڵ�����һ
            modCount++;                                // ��������������һ
            return;
        }
        
        // ���ɾ���Ľڵ㲻�ǵ�һ���ڵ�
        // ѭ���������ҵ���ɾ���ڵ��ǰһ���ڵ�
        // �������±���count����
        int count = 0;
        for (PersonChainNode p = head; p != null; p = p.nextNode) {
            if (count == index - 1) {    // ����ҵ��˱�ɾ���ڵ��ǰһ���ڵ�
                if (index == size - 1) {    // �����ɾ���ڵ������һ���ڵ�
                    p.nextNode = null;    // ����ɾ���ڵ��ǰһ���ڵ������ָ�������
                } else {                            // �����ɾ���ڵ㲻�����һ���ڵ�
                    p.nextNode = p.nextNode.nextNode;    // ����ɾ���ڵ�ǰһ���ڵ��������ָ��ɾ���ڵ����һ���ڵ�
                }
                size--;                // ��һ����
                modCount++;    // ��һ��������
                return;
            }
            count++;                // û���ҵ���������һ
        }
    }

    /**
     * ͨ���������Ҷ���
     * δʵ��
     * @param name
     *            ��������
     * @return �������飬���ܶ��
     */
    public Person[] searchNodeByPersonName(String name) {
        return null;
    }

    /**
     * ͨ��������Ҷ���
     * δʵ��
     * @param age
     *            ��������
     * @return �������飬���ܶ��
     */
    public Person[] searchPersonByAge(int age) {
        return null;
    }

    /**
     * ͨ����Ų��Ҷ���
     * ���ڱ����Ψһ��ʶ��ѭ���������Ҳ����ؼ���
     * @param personNo
     *            ������
     * @return ���ҵ��Ķ������null
     */
    public Person searchNode(int personNo) {
        Person p = null;
        for (PersonChainNode pcn = head; pcn != null; pcn = pcn.nextNode) {
            if (pcn.person.personNo == personNo) {
                p = pcn.person;
            }
        }
        return p;
    }

    /**
     * ͨ��ԭ�����޸ļ�����ֵ�޸ĸö�������
     * 
     * @param personNo
     *            Ҫ�޸ĵĶ�����
     * @param value
     *            ͨ������ֵ�������ж��޸� ֻ���޸�����������
     */
    public void editNode(int personNo, Object value) {
        // ͨ����ΪΨһ��ʶ�ı�Ų��ҵ�����
        Person target = searchNode(personNo);
        if (target == null) {    // �������Ϊnull
            return;
        }
        if (value == null) {    // ����������Ϊnull
            return;
        }
        // ����������Ϊ�ַ�������
        if (value.getClass() == java.lang.String.class) {
            target.name = value.toString();
            return;
        }
        try {
            // ����������Ϊ����
            target.age = Integer.parseInt(value.toString());
            return;
        } catch (Exception ex) {
            // �������������ʹ���
            return;
        }
    }

    /**
     * ͨ�������Ŵ�ӡ����
     * 
     * @param personNo
     *            ������
     */
    public void printNode(int personNo) {
        Person target = searchNode(personNo);
        if (target == null) {
            return;
        }
        System.out.println(target.toString());
    }

    /**
     * �ж�ָ�������Ƿ����������
     * 
     * @param personNo
     *            ������
     * @return true��ʾ���ڸö���false��ʾ�����ڸö���
     */
    public boolean contains(int personNo) {
        if (size != 0) {
            for (PersonChainNode pcn = head; pcn != null; pcn = pcn.nextNode) {
                if (pcn.person.personNo == personNo) {
                    return true;
                }
            }
        }
        return false;
    }

    // ���򷽷�

    /**
     * ͨ����������
     */
    public void sortByPersonName() {
    }

    /**
     * ͨ����������
     */
    public void sortByPersonAge() {
    }

    /**
     * Ĭ������ͨ��������� 
     * ʹ��ð�������������ж������Ч��
     */
    public void sort() {
        boolean jx = true;        // ð������ļ򻯷���
        for (PersonChainNode pcn = head; pcn != null && jx; pcn = pcn.nextNode) {
            jx = false;
            for (PersonChainNode pc = head; pc != null && pc.nextNode != null; pc = pc.nextNode) {
                if (pc.person.personNo > pc.nextNode.person.personNo) {
                    Person temp = pc.person;
                    pc.person = pc.nextNode.person;
                    pc.nextNode.person = temp;
                    jx = true;
                }
            }
        }
    }

    /**
     * ��ӡ��������
     */
    public void printAll() {
        if (size != 0) {
            for (PersonChainNode pcn = head; pcn != null; pcn = pcn.nextNode) {
                System.out.println(pcn.person.toString());
            }
        }
    }
}