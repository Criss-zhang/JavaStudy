package chapter8;

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        TRE tre = new TRE(12);
        ts.add(tre);
//        ts.add(new String());
        System.out.println(ts);
        System.out.println(ts.add(tre));
        System.out.println(ts);
        ((TRE)(ts.first())).arg = 1;
        System.out.println(((TRE)ts.first()).arg);
        System.out.println(((TRE)ts.last()).arg);

    }
}
class TRE implements Comparable<TRE>{

    int arg;
    public TRE(int arg){this.arg = arg;}

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int compareTo(TRE o) {
        return 1;
        //这个值如果返回的是0，则在add的时候无法添加，否则会比较顺序
//        return 0;
    }
}