package chapter8;

import java.util.TreeSet;

public class TreeSetTest05 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new RR(5));
        ts.add(new RR(-3));
        ts.add(new RR(9));
        ts.add(new RR(-2));
        System.out.println(ts);
        RR first = (RR) ts.first();
        first.count = 20;
        RR last = (RR) ts.last();
        last.count = -2;
        System.out.println(ts);
        System.out.println(ts.remove(new RR(-2)));
        System.out.println(ts);
        System.out.println(ts.remove(new RR(5)));
        System.out.println(ts);
        System.out.println(ts.remove(new RR(-2)));
        System.out.println(ts);


    }

}
class RR implements Comparable<RR>{
    int count ;
    public RR(int count){
        this.count = count;
    }


    @Override
    public String toString() {
        return "RR{" +
                "count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RR rr = (RR) o;

        return count == rr.count;
    }

    @Override
    public int hashCode() {
        return count;
    }


    @Override
    public int compareTo(RR rr) {
        return count > rr.count ? 1 :
                count < rr.count ? -1 : 0;
    }
}
