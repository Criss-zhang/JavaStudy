package chapter9.homework01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Utils {
    public static <T> void copy(List<T> dest,List<? extends T> src){
        Iterator iterator = src.iterator();
        while (iterator.hasNext()){
            dest.add((T) iterator.next());
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(13);
        integerList.add(14);
        integerList.add(15);
        integerList.add(16);
        integerList.add(17);
        List<Number> numberList = new ArrayList<>();
        copy(numberList,integerList);
        Iterator<Number> iterator = numberList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
