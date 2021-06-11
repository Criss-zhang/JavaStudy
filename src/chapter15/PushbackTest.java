package chapter15;

import java.io.FileReader;
import java.io.PushbackReader;

public class PushbackTest {
    public static void main(String[] args) {
        try (
                final PushbackReader pushbackReader = new PushbackReader(new FileReader
                        ("/Users/zhanggang/Documents/GitHub/JavaStudy/src/chapter15/PushbackTest.java"),64);
                ){
            char[] chars = new char[32];
            String lastContent = "";
            int hasRead = 0;
            while ((hasRead = pushbackReader.read(chars)) > 0){
                String content = new String(chars,0,hasRead);
                int targetIndex = 0;
                if ((targetIndex =
                        (lastContent + content).indexOf("new FileReader")) >0){
                    pushbackReader.unread((lastContent+content).toCharArray());
                    if (targetIndex > 32){
                        chars = new char[targetIndex];
                    }
                    pushbackReader.read(chars,0,targetIndex);
                    System.out.print(new String(chars,0,targetIndex));
                    System.exit(0);
                }else {
                    System.out.print(lastContent);
                    lastContent = content;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
