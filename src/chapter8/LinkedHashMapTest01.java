package chapter8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;

public class LinkedHashMapTest01 {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("英语", 111);
        linkedHashMap.put("语文", 120);
        linkedHashMap.put("数学", 130);
        linkedHashMap.forEach(new BiConsumer() {
            @Override
            public void accept(Object o, Object o2) {
                System.out.println(o+"--->"+o2);
            }
        });
        Iterator iterator = linkedHashMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(linkedHashMap.get(iterator.next()));
        }
    }
}
