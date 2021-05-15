package chapter8;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap(EnumSeason.class);
        enumMap.put(EnumSeason.AUTUMN, "金秋十月");
        enumMap.put(EnumSeason.SPRING,"春天来了 ！！！！");
        System.out.println(enumMap);
    }
}
enum  EnumSeason{
    SPRING,SUMMER,AUTUMN,WINTER;
}