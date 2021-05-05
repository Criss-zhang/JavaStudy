package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Consumer;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("criss");
        c.add("孙悟空");
        c.add("java学习");
        //lambda表达式来写的
        c.forEach(obj ->System.out.println(obj));
        /**
         * 用正常代码来写
         */
        c.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
    }
}
