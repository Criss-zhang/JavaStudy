package chapter8;

import java.util.EnumSet;

public class EnumSetTest01 {
    public static void main(String[] args) {
        EnumSet<EST01> est01s = EnumSet.allOf(EST01.class);
        System.out.println(est01s);
        EnumSet<EST01> range = EnumSet.range(EST01.SUMMER, EST01.WINTER);
        System.out.println(range);
        EnumSet<EST01> est01s1 = EnumSet.noneOf(EST01.class);
        System.out.println(est01s1);
        est01s1.add(EST01.SUMMER);
        System.out.println(est01s1);
        EnumSet<EST01> summer = EnumSet.of(EST01.SUMMER, EST01.WINTER);
        System.out.println(summer);
        EnumSet<EST01> est01s2 = EnumSet.complementOf(range);
        System.out.println(est01s2);
        EnumSet<EST01> est01s3 = EnumSet.copyOf(range);
        System.out.println(est01s3.equals(range));
        System.out.println(est01s3 == range);
    }
}
enum EST01{
 SPRING,SUMMER,FALL,WINTER;
}