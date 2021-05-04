package chapter7;

import java.text.DateFormat;
import java.text.ParseException;

public class FormatTest05 {
    public static void main(String[] args) throws ParseException {
        String str1 = "2021/07/21";
        String str2 = "2021年5月4日";
        System.out.println(DateFormat.getDateInstance().parse(str2));
        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).parse(str1));
//        System.out.println(DateFormat.getDateInstance().parse(str1));
    }
}
