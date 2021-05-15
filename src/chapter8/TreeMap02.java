package chapter8;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap02 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("第1个key", "第1个value");
        treeMap.put("第2个key", "第2个value");
        treeMap.put("第3个key", "第3个value");
        treeMap.put("第4个key", "第4个value");
        treeMap.put("第5个key", "第5个value");
        Set set = treeMap.keySet();
        Object[] objects = set.toArray();
        System.out.println(objects);
        int pos = Arrays.binarySearch(objects, "第4个key");

    }
}
