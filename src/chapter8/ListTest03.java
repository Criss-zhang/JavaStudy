package chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest03 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("第一个");
        list.add("第二个");
        list.add("第三个");
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.previousIndex());
            System.out.println(iterator.hasPrevious());
            System.out.println(iterator.next());
//            System.out.println(iterator.previous());
            iterator.add(12.2);
        }
        list.remove(new LT03());
        System.out.println(list);
        list.remove(new LT03());
        System.out.println(list);

    }
}
class LT03{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}