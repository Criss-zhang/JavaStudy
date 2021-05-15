package chapter8;

import java.util.Collection;
import java.util.TreeSet;
import java.util.function.ToIntFunction;

public class CollectionStreamTest01 {
    public static void main(String[] args) {
        Collection collection = new TreeSet();
        collection.add("criss");
        collection.add("monkey king");
        collection.add("keanu levies");
        collection.add("asdasdasdasd");
        System.out.println(collection.stream().filter(ele -> ((String)ele).contains("cri")).count());
        System.out.println(collection.stream().filter(ele -> ((String)ele).length()<10).count());
        collection.stream().mapToInt(new ToIntFunction() {
            @Override
            public int applyAsInt(Object value) {
                return ((String)value).length();
            }
        }).forEach(System.out::println);


    }
}
