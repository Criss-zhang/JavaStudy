package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroupTest {
    public static void main(String[] args) {
        String stttt = "lll 12345678901，12234567890";
        Matcher matcher = Pattern.compile("((123\\d)|(122\\d))\\d{7}").matcher(stttt);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
