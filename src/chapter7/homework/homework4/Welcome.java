package chapter7.homework.homework4;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Welcome {
    public static void main(String[] args) {
        Locale aDefault = Locale.getDefault(Locale.Category.DISPLAY);
        System.out.println(aDefault);
        ResourceBundle mess = ResourceBundle.getBundle("chapter7/homework/homework4/mess", aDefault);
        String msg = mess.getString("speak");
        System.out.println(MessageFormat.format(msg,"yeeku",new Date()));
    }
}
