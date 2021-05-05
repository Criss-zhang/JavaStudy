package chapter8;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new TreeSet();
        c.add("criss");
        c.add("monkey king");
        c.add("java study");
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            String next = (String)iterator.next();
            System.out.println(next);
            if ("monkey king".equals(next)){
                iterator.remove();
            }
            next = "test array";
        }
        System.out.println(c);
    }
}
