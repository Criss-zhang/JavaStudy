package chapter15;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteToProcess {
    public static void main(String[] args) throws Exception{
        //书里有问题啊，这运行之后，scanner会一直扫描啊,不会停下来
         Process exec = Runtime.getRuntime().exec("java chapter15/ReadStandard.java");
        try (
                 PrintStream printStream = new PrintStream(exec.getOutputStream());
        ){
            System.out.println("hello");
            printStream.println("normal string");
            printStream.println(new WriteToProcess());
        }
    }
}
class ReadStandard{
    public static void main(String[] args) {
        try(
                final Scanner scanner = new Scanner(System.in);
                final PrintStream printStream = new PrintStream(new FileOutputStream("out.txt"));
                ) {
           scanner.useDelimiter("\n");
           while (scanner.hasNext()){
               printStream.println(scanner.next());
           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}