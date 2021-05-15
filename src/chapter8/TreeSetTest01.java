package chapter8;

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet name = new TreeSet();
        name.add("1");
        name.add("2");
        name.add("3");
        name.add("4");
        name.add("5");
        name.add("6");
        System.out.println(name);
        System.out.println(name.first());
        System.out.println(name.last());
        System.out.println(name.headSet("4"));
        System.out.println(name.tailSet("4"));
        System.out.println(name.subSet("2", "4"));
    }
}
