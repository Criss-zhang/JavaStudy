package chapter8;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapTest02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("第1个键", "第1个A");
        hashMap.put("第2个键", "第2个A");
        hashMap.put("第3个键", "第3个A");
//        hashMap.put("第4个键", new B());
        System.out.println(hashMap);
        System.out.println(hashMap.containsValue("hhhh"));
        System.out.println(hashMap.containsValue(new B()));
        System.out.println(hashMap.containsValue(null));
    }
}
class A{
    int count;
    public A(int count){
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return count == a.count;
    }

    @Override
    public int hashCode() {
        return count;
    }
}

class B{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
