package chapter8;

import java.util.LinkedHashSet;

public class HashSetTest02 {
    public static void main(String[] args) {
        LinkedHashSet name = new LinkedHashSet();
        name.add("criss");
        name.add("zhang");
        System.out.println(name);
        name.add("heihei");
        System.out.println(name);
    }
}
