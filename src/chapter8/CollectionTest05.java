package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection name = new HashSet();
        name.add(new String("criss"));
        name.add(new String("monkey king"));
        name.add(new String("jackie chen"));
        name.add(new String("banach obama"));
        System.out.println(name);
        System.out.println(calAll(name,s ->((String)s).contains("cri")));
        System.out.println(calAll(name,obj -> ((String)obj).contains("hello")));
        System.out.println(calAll(name, new Predicate() {
            @Override
            public boolean test(Object o) {
                if (((String)o).length()<=12){
                    return true;
                }
                return false;
            }
        }));

    }

    public static int calAll(Collection c , Predicate p){
        int n = 0;
        for (Object o:c
             ) {
            if (p.test(o))n++;
        }
        return n;
    }
}
