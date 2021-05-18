package chapter9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class GenericTest03 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(12);
        List<Number> numberList = new LinkedList<>();
        Integer copy = GenericTest03.copy(numberList, integerList);
        System.out.println(copy);
        System.out.println(numberList);
    }
    public static <T>T copy(Collection<? super T> dest,Collection<T> src){
        T last = null;
        for (T ele : src){
            last = ele;
            dest.add(ele);
        }
        return last;
    }
}