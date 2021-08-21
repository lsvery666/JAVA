package Set;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet:
    底层其实是TreeMap
    无序不可重复的，但是存储的元素可以按照大小顺序排序
1. TreeSet/TreeMap是自平衡二叉树，遵循左小右大原则存放
2. 遍历二叉树的时候有三种方式：
    前序遍历：根左右
    中序遍历：左根右
    后序遍历：左右根
3. TreeSet/TreeMap集合Iterator迭代器采用的是中序遍历方式，
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> strs = new TreeSet<>();

        strs.add("A");
        strs.add("M");
        strs.add("E");
        strs.add("Z");
        strs.add("F");
        strs.add("C");

        for(String s: strs){
            System.out.println(s);
        }

    }
}
