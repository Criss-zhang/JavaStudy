package chapter15;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class CharsetTest {
    public static void main(String[] args) {
        final SortedMap<String, Charset> map = Charset.availableCharsets();
        for (String s : map.keySet()){
            System.out.print(s+"----");
            System.out.println(map.get(s));
        }
    }
}
