package chapter8.homework01;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListAddElements {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        System.out.println(list);
        System.out.println(list.get(5));
        for (int i = 0 ; i <2;i++){
            Random random = new Random();
            int i1 = random.nextInt(9);
            System.out.println(list.get(i1));
        }
        System.out.println(list.remove(3));
        System.out.println(list);
    }
}
