package chapter15;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class RedirectOut {
    public static void main(String[] args) {
        try (
                final PrintStream printStream = new PrintStream(new FileOutputStream("out.txt"));
                ){
            System.setOut(printStream);
            System.out.println("normal string");
            System.out.println(new RedirectOut());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
