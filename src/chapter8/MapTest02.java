package chapter8;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapTest02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("first key", "first");
        hashMap.put("second key", "second");
        hashMap.put("third key", "third");
        System.out.println(hashMap.entrySet());
        hashMap.merge("first key", 12, new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                String s = String.valueOf((int) o2);
                String newString = s + (String)o;
                return newString;
            }
        });
        hashMap.merge("second key", 13, (o1,o2)->(String)o1+String.valueOf(o2));
        System.out.println(hashMap);
        hashMap.computeIfAbsent("forth key", new Function() {
            @Override
            public Object apply(Object o) {
                return "forth";
            }
        });
        System.out.println(hashMap.entrySet());
        hashMap.computeIfPresent("forth key", new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return "new value of forth key";
            }
        });
        System.out.println(hashMap.entrySet());
    }
}
