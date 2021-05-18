package chapter9;

import java.util.ArrayList;
import java.util.List;

public class genericTest10 {
    public static void main(String[] args) {
        List<?>[] list = new ArrayList<?>[10];
        Object[] o = list;
        List<Integer> l2 = new ArrayList<>();
        l2.add(12);
        o[1] = l2;
        Object o1 = list[1].get(0);
        System.out.println(o1);
        if (o1 instanceof String){
            String s = (String)o1;
        }
        for (List l:list
             ) {
            System.out.println(l);
        }
    }
}
