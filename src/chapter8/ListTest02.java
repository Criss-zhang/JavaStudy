package chapter8;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("forth");
        list.add("fifth");
        System.out.println(list);
        list.add(0,"zero");
        for (int i = 0 ; i < list.size();i++){
            System.out.println(list.get(i));
        }
        list.remove("fifth");
        System.out.println(list);
        System.out.println(list.indexOf("zero"));
        list.set(0,"0");
        System.out.println(list);
        List list2 = list.subList(0, 2);
        System.out.println(list2);
    }
}
