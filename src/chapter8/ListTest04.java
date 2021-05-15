package chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest04 {
    public static void main(String[] args) {
        int[] ll1 = {1,2,2,2,2,2};
        int[] ll2 = {1,2,2,2,2,2};
        //这个类型是arrays的内部类，在创建的时候，是一个final修饰的固定长度的数组，所以它不能删除也不能增加
        List<int[]> ints = Arrays.asList(ll1);
        System.out.println(ints.getClass());
        ints.add(ll2);
    }
}
