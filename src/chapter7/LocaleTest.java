package chapter7;


import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class LocaleTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("/Users/zhanggang/Documents/GitHub/JavaStudy/src/package02/work/PointTest.java"));
        scanner.useDelimiter("\n");
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
