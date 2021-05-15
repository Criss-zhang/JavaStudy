package chapter8;

import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListTest01 {
    public static void main(String[] args) {
        List l = new LinkedList();
        System.out.println(l.isEmpty());
        l.add(0,12);
        l.add(1,12);
        l.add(1,12);
        System.out.println(l);
        System.out.println(l.set(1,-3));
        System.out.println(l.subList(0,l.size()-1));
        l.replaceAll(new UnaryOperator() {
            @Override
            public Object apply(Object o) {
                if ((int)o ==-3) {
                   o =0;
                }
                return o;
            }
        });
        System.out.println(l);
    }
}
