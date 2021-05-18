package chapter9;

import java.util.LinkedList;
import java.util.List;

public class GenericTest07 {
    public static <T,S extends T> void he(List<T> list1,List<S> list2){
        list1.addAll(list2);
    }
    public static void main(String[] args) {
        GenericTest07Test genericTest07Test1 = new <Integer>GenericTest07Test(12);
        GenericTest07Test genericTest07Test2 = new <String>GenericTest07Test("hello");
    }
}
class GenericTest07Test{
    public <T> GenericTest07Test(T t){
        System.out.println(t);
    }
}