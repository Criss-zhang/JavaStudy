package chapter7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatTest04 {
    public static void main(String[] args) {
        Locale[] locales = {Locale.CHINA,Locale.US};
        Date date = new Date();
        DateFormat[] df = new DateFormat[2];
        for (int i = 0 ; i < locales.length;i++){
            df[i] = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,locales[i]);
        }
        for (int i = 0 ; i < locales.length ; i ++) {
            String tip = i == 0 ? "--------中国时间--------" : "--------美国时间--------";
            System.out.println(tip);
            System.out.println(df[i].format(date));
        }
    }
}
