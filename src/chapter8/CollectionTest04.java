package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class CollectionTest04 {
    public static void main(String[] args) {
        Collection name = new HashSet();
        name.add(new String("criss"));
        name.add(new String("monkey king"));
        name.add(new String("jackie chen"));
        name.add(new String("banach obama"));
        System.out.println(name);
        name.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                    if (((String) o).length() <10)return true;
                else {
                    return false;
                }
            }
        });
        System.out.println(name);
    }
}
