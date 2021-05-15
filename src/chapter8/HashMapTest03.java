package chapter8;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(new HashMapTest03Class(1), "这是1");
        hashMap.put(new HashMapTest03Class(2), "这是2");
        hashMap.put(new HashMapTest03Class(3), "这是3");
        hashMap.put(new HashMapTest03Class(4), "这是4");
        System.out.println(hashMap);
        Iterator iterator = hashMap.keySet().iterator();
        HashMapTest03Class next = (HashMapTest03Class)iterator.next();
        next.a = 1111;
        System.out.println(hashMap);
        hashMap.remove(new HashMapTest03Class(1111));
        System.out.println(hashMap);
        System.out.println(hashMap.get(new HashMapTest03Class(1111)));
        System.out.println(hashMap.get(new HashMapTest03Class(1)));
    }
}
class HashMapTest03Class{
    int a ;
    public HashMapTest03Class(int a){
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashMapTest03Class that = (HashMapTest03Class) o;

        return a == that.a;
    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public String toString() {
        return "HashMapTest03Class{" +
                "a=" + a +
                '}';
    }
}