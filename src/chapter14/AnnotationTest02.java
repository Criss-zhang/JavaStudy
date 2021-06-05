package chapter14;

import java.util.List;

public class AnnotationTest02 {
    public static void main(String[] args) {
    }
    @SafeVarargs
    public static void faultyMethod(List<String>...lists){
        System.out.println(lists);
    }
}

@FunctionalInterface
interface FunInterface{
    void test();
}