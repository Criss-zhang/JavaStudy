package chapter7;

import java.util.regex.Pattern;

public class RegularTest {
    public static void main(String[] args) {
        String str = "hello,world";
        String tt = "";
        System.out.println(str.replaceFirst("\\w", "👌"));
        System.out.println(str.replaceFirst("\\w*", "👌"));
        System.out.println(str.replaceFirst("\\w*?", "👌"));
        System.out.println(tt.replaceFirst("\\w*?", "👌"));
        boolean ba = Pattern.matches("a*b", "b");
        System.out.println(ba);
    }
}
