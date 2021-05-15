package chapter8;

import java.util.*;

public class CollectionsTest01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hhhh1");
        arrayList.add("hhhh2");
        arrayList.add("hhhh3");
        arrayList.add("hhhh4");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.rotate(arrayList,-1);
        System.out.println(arrayList);
        System.out.println("------");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        Collections.swap(arrayList, 0,arrayList.size()-1);
        System.out.println(arrayList);
    }
}
