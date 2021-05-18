package chapter9;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class GenericTest05 {
    static <T> void onlyForStudy(T[] arrayT, Collection<T> collectionT){
        for (T t:arrayT
        ) {
            collectionT.add(t);
        }
    }
    static <T> void onlyForStudy02(T[] arrayT, T[] arrayT2){
        System.out.println(arrayT);
        System.out.println(arrayT2);
    }
    static <T> void onlyForStudy03(Collection<T> collectionT, Collection<T> collectionT2){
        System.out.println(collectionT);
        System.out.println(collectionT2);
    }
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<>();
        LinkedList<Object> linkedList2 = new LinkedList<>();
        Integer[] i = {1,2,3};
        List<Integer> list = new LinkedList();
        onlyForStudy(i, list);
        System.out.println(list);
        List<Object> objectList = new LinkedList<>();
        onlyForStudy(i,objectList);
        System.out.println(objectList);
        String[] str = {"1","2"};
        onlyForStudy02(i,str);
    }
}
