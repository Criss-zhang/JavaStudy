package chapter8;

import java.util.TreeSet;

public class TreeSetTest04 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new HH(3));
        ts.add(new HH(5));
        ts.add(new HH(6));
        ts.add(new HH(4));
        System.out.println(ts);
        ((HH) (ts.first())).age = 2;
        ((HH) (ts.last())).age = 10;
        System.out.println(ts);
        System.out.println(ts.remove(new HH(5)));
        System.out.println(ts);
    }
}
class HH implements Comparable<HH>{
    int age ;
    public HH(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "HH{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HH hh = (HH) o;

        return age == hh.age;
    }

    @Override
    public int hashCode() {
        return age;
    }


    @Override
    public int compareTo(HH o) {
        return o.age > age ? 1:
                o.age < age ? -1 :0;
    }
}