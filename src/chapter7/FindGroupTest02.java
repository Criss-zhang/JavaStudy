package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroupTest02 {
    public static void main(String[] args) {
        String str = "java study is not easy";
        System.out.println("the target string is :" + str);
        Matcher matcher = Pattern.compile("\\w+").matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());

        }
    }
}
