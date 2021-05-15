package chapter8;

import java.util.HashMap;

public class HashMapTest01 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("criss1", "criss1");
        hm.put("criss2", "criss2");
        hm.put("criss3", "criss3");
        hm.put("criss4", "criss4");
        hm.put("criss5", "criss5");
        hm.put("criss6", "criss6");
        hm.put("criss7", "criss7");
        hm.put("criss8", "criss8");
        hm.put("criss9", "criss9");
        //证明了hashmap 是无序的
        System.out.println(hm);
    }
}
