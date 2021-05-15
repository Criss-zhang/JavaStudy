package chapter8;

import java.util.WeakHashMap;

public class WeakHashMapTest01 {
    public static void main(String[] args) {
        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.put(new String("english"), new String("bad"));
        weakHashMap.put("chinese", "good");
        System.out.println(weakHashMap);
        System.gc();
        System.runFinalization();
        System.out.println(weakHashMap);
    }
}
