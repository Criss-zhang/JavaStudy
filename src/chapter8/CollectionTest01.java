package chapter8;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new TreeSet();
        boolean add1 = c.add("11");
        System.out.println(add1);
        boolean add = c.add("11");
        System.out.println(add);
        System.out.println(c);
    }
}
