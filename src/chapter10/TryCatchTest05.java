package chapter10;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TryCatchTest05 {
    public static void main(String[] args)throws Exception {
        try (PrintStream ps = new PrintStream(new FileOutputStream("hello.ss"))){
            ps.println("saiubfoagbq");
        }
    }
}
