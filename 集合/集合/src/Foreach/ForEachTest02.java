package Foreach;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("aad");
        l.add("ddd");
        l.add("zzz");
        l.add("sss");

        // 遍历三种方式
        // 迭代器
        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // get方法
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        // 增强for循环
        for(String s: l){
            System.out.println(s);
        }
    }
}
