package chapter9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest04 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(1);
        System.out.println(list.get(0));
    }
}
class GenericTest04Class<T extends Number>{
    T hello;
}