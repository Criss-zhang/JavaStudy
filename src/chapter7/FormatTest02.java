package chapter7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import static java.text.DateFormat.FULL;


public class FormatTest02 {
    public static void main(String[] args) {
        Date date = new Date();
        Locale[] locales = {Locale.CHINA,Locale.US};
        DateFormat[] df = new DateFormat[18];
        for (int i = 0 ;i < locales.length;i++){
            df[i*8] = DateFormat.getDateInstance(DateFormat.SHORT,locales[i]);
            df[i*8+1] = DateFormat.getDateInstance(DateFormat.MEDIUM,locales[i]);
            df[i*8+2] = DateFormat.getDateInstance(DateFormat.LONG,locales[i]);
            df[i*8+3] = DateFormat.getDateInstance(FULL,locales[i]);
            df[i*8+4] = DateFormat.getTimeInstance(DateFormat.SHORT,locales[i]);
            df[i*8+5] = DateFormat.getTimeInstance(DateFormat.MEDIUM,locales[i]);
            df[i*8+6] = DateFormat.getTimeInstance(DateFormat.LONG,locales[i]);
            df[i*8+7] = DateFormat.getTimeInstance(FULL,locales[i]);
            df[i*8+8] = DateFormat.getDateTimeInstance(FULL,FULL,locales[i]);
        }
        for (int i = 0;i < locales.length;i++){
            String tips = i ==
                    0 ? "--中国格式--":"--美国格式--";
            System.out.println(tips);
            System.out.println("short格式"+df[i*8].format(date));
            System.out.println("medium"+df[i*8+1].format(date));
            System.out.println("long"+df[i*8+2].format(date));
            System.out.println("full"+df[i*8+3].format(date));
            System.out.println("short"+df[i*8+4].format(date));
            System.out.println("medium"+df[i*8+5].format(date));
            System.out.println("long"+df[i*8+6].format(date));
            System.out.println("full"+df[i*8+7].format(date));
            System.out.println("ALL FULL"+df[i*8+8].format(date));
        }
    }
}
