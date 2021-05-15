package chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest01 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("first add");
        linkedList.add("second add");
        linkedList.offer("first offer");
        linkedList.offer("second offer");
        System.out.println(linkedList);
        linkedList.addFirst("first addFirst");
        System.out.println(linkedList);
        linkedList.offerFirst("first offerFirst");
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        Iterator iterator = linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println("-----分割线------");
        Iterator iterator1 = linkedList.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next());
        }
        System.out.println();
        System.out.println(linkedList.poll());
    }

}
