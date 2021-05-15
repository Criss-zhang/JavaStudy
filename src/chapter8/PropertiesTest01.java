package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("username", "criss");
        properties.setProperty("password", "123456");
        properties.store(new FileOutputStream("PropertiesTest01.properties"), "this is a file");
        Properties properties1 = new Properties();
        properties1.setProperty("gender", "male");
        properties1.load(new FileInputStream("PropertiesTest01.properties"));
        System.out.println(properties1);
    }
}
