package chapter9;

import java.util.TreeSet;
import java.util.function.Consumer;

public class ListErr {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("12");
//        treeSet.add(12);
        System.out.println(treeSet);
        treeSet.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        });
    }
}
