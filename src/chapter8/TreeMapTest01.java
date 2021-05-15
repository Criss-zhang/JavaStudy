package chapter8;

import java.util.TreeMap;

public class TreeMapTest01 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new TreeMapTest01Class(13),1);
        treeMap.put(new TreeMapTest01Class(2),2);
        treeMap.put(new TreeMapTest01Class(20),3);
        System.out.println(treeMap);
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.higherEntry(new TreeMapTest01Class(13)));
    }
}
class TreeMapTest01Class implements Comparable<TreeMapTest01Class>{

    int a ;
    public TreeMapTest01Class(int a){
        this.a = a;
    }

    @Override
    public int compareTo(TreeMapTest01Class o) {
        return this.a > o.a ? 1 :
                this.a < o.a ? -1 :0;
    }

    @Override
    public String toString() {
        return "TreeMapTest01Class{" +
                "a=" + a +
                '}';
    }
}