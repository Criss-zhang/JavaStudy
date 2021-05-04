package chapter7;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerI18N {
    public static void main(String[] args) throws IOException {
        ResourceBundle rb = ResourceBundle.getBundle("config/logMess", Locale.getDefault(Locale.Category.FORMAT));
        System.Logger logg = System.getLogger("logg", rb);
        Logger.getLogger("logg").setLevel(Level.INFO);
        Logger.getLogger("logg").addHandler(new FileHandler("a.xml"));
        logg.log(System.Logger.Level.DEBUG,"debug");
        logg.log(System.Logger.Level.INFO,"info");
        logg.log(System.Logger.Level.ERROR,"error");

    }
}
