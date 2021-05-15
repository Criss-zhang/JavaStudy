package chapter8;

import java.util.HashMap;
import java.util.function.BiFunction;

public class MapTest01 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        Object put = hm.put("criss", "hello");
        System.out.println(put);
        hm.put("criss", "new hello");
        hm.put("criss1", "hello");
        System.out.println(hm.containsKey("criss"));
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.containsValue("bu hello"));
        System.out.println(hm.containsValue("hello"));
        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        HashMap hm2 = new HashMap();
        hm2.put("cccc", 123123);
        hm2.putAll(hm);
        System.out.println(hm2);
        System.out.println(hm2.remove("cccc",123123));
        System.out.println(hm2.values());
        hm2.compute("cccc", new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return null;
            }
        });
        System.out.println(hm2);
    }
}
