package chapter7;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest01 {
    public static void main(String[] args) throws IOException {
        System.Logger logger = System.getLogger("helloJava");
        Logger.getLogger("helloJava").setLevel(Level.SEVERE);
        Logger.getLogger("helloJava").addHandler(new FileHandler("helloJava.xml"));
        logger.log(System.Logger.Level.DEBUG,"DEBUG");
        logger.log(System.Logger.Level.INFO,"INFO");
        logger.log(System.Logger.Level.ERROR,"ERROR");
    }
}
