package chapter8;

import java.util.Stack;

public class StackTest01 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("hello1");
        s.push("hello2");
        s.push("hello3");
        s.push("hello4");
        s.push("hello5");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
    }
}
