package chapter8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeTest01 {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque(333);
        ad.add("hello");
        ad.addFirst("first");
        ad.addLast("last");
        Iterator iterator = ad.descendingIterator();
        Iterator iterator1 = ad.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(ad.size());
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
