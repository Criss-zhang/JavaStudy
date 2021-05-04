package chapter7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatTest03 {
    public static void main(String[] args) {
        Date date = new Date();
        Locale locale = Locale.US;
        System.out.println(DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,locale).format(date));
    }
}
