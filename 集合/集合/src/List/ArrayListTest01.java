package List;
/*
class ArrayList :
    ArrayList���ϵײ������飬���������±�ģ�����ArrayList�кܶ����������
    ArrayList���ϵײ�Ĭ�ϳ�ʼ��������10���ײ��ȴ�����һ������Ϊ0�����飬����ӵ�һ��Ԫ�ص�ʱ�򣬳�ʼ������Ϊ10��
    ����֮���������ԭ������1.5��
 */

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        System.out.println(l1.size());  // 0 ��ȡ����Ԫ�صĸ�������������

        ArrayList l2 = new ArrayList(20);

        HashSet hashSet = new HashSet();
        hashSet.add(3);
        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(0);

        // ���췽�����Խ���һ��Collection������ת��ΪArrayList
        ArrayList l3 = new ArrayList(hashSet);
        for (int i = 0; i < l3.size(); i++) {
            System.out.println(l3.get(i));  // 0 1 3
        }
    }
}
