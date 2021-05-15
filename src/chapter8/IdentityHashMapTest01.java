package chapter8;

import java.util.IdentityHashMap;

public class IdentityHashMapTest01 {
    public static void main(String[] args) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(12,14);
//        identityHashMap.put(12,144);
        identityHashMap.put("12", 15);
        identityHashMap.put(new IdentityHashMapTest01Class(), "i1");
        identityHashMap.put(new IdentityHashMapTest01Class(), "i2");
        System.out.println(identityHashMap);
    }
}
class IdentityHashMapTest01Class{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}