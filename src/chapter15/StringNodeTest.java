package chapter15;

import java.io.PrintStream;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
    public static void main(String[] args) {
        String src = "伊阿宋不丢好事带回家时间冻结\n" +
                "干部进拉尔凯美瑞";
        char[] chars = new char[32];
        int hasRead = 0;
        try (
                StringReader stringReader = new StringReader(src);
        ){
            while ((hasRead = stringReader.read(chars)) >0){
                System.out.println(new String(chars,0,hasRead));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try (
                final StringWriter stringWriter = new StringWriter();
                ){
            stringWriter.write("hello\n");
            stringWriter.write("world\n");
            final PrintStream printStream = new PrintStream("路径");
            System.out.println(stringWriter);
            System.out.println(stringWriter.toString());
            printStream.print(stringWriter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
