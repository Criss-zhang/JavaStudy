package chapter9;

import java.util.*;

public class GenericTest06 {
    static <T>void tttt(ArrayList<T> list, TreeSet<T> collection){
        System.out.println(list);
        System.out.println(collection);
    }
    static <T> void tt(Teacher<T> teacher,Collection<T> collection){
        System.out.println(teacher);
        System.out.println(collection);
    }
    static  <T> void arr(T[] arrT,Collection<T> collection){
    }
    static  <T> void arr1(T arrT,Collection<T> collection){
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        TreeSet<Object> treeSet = new TreeSet<>();
//        tttt(list,treeSet);
        Teacher<String> teacher = new Teacher<>();
        Integer[] i = {1,2};
        int ii = 1;
        arr(i,treeSet);
        Integer i1 = new Integer(1);
        String s = "22";
        arr1(s,treeSet);
    }
}
class Teacher<G>{

}