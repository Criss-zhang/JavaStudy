package chapter8;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest06 {
    public static void main(String[] args) {
//        TreeSet ts = new TreeSet(new Comparator<TST06>() {
//            @Override
//            public int compare(TST06 o1, TST06 o2) {
//                return o1.age > o2.age ? -1:
//                        o1.age < o2.age ?1 :0;
//            }
//        });˙
        TreeSet ts = new TreeSet(((o1, o2) -> {
            TST06 o11 = (TST06) o1;
            TST06 o21 = (TST06) o2;
            return o11.age > o21.age ? -1 :
                    o11.age < o21.age ? 1 :0;
        }));
        ts.add(new TST06(12));
        ts.add(new TST06(-12));
        ts.add(new TST06(0));
        System.out.println(ts);
    }
}
class TST06{
    int age;
    public TST06(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "tst06{" +
                "age=" + age +
                '}';
    }
}