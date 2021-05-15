package chapter8;

import java.util.ArrayDeque;

public class DequeTest02 {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.push("first push");
        ad.push("second push");
        ad.push("third push");
        System.out.println(ad.peek());
        System.out.println(ad);
        System.out.println("--");
        System.out.println(ad.pop());
        System.out.println(ad);
        System.out.println("--");
        ad.offer("forth push");
        System.out.println(ad);
        System.out.println(ad.pollLast());
    }
}
