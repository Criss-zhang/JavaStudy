package chapter15;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        try(
                final FileOutputStream fileOutputStream = new FileOutputStream("路径");
                final PrintStream printStream = new PrintStream(fileOutputStream);
                ){
            printStream.println("simple arrays");
            printStream.println(new PrintStreamTest());
            printStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
