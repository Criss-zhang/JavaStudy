package chapter8;

import java.util.*;

public class CollectionsTest02 {
    public static void main(String[] args) {
        List list = Collections.synchronizedList(new ArrayList());
        list.add("第4个");
        list.add("第3个");
        list.add("第2个");
        list.add("第1个");
        System.out.println(list.get(list.size()-1));
        List list1 = Collections.emptyList();
    }
}
