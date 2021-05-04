package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesTest02 {
    public static void main(String[] args) {
        String[] msgs = {
                "java rer1ere",
                "rerere java"
        };
        Pattern compile = Pattern.compile("re\\w*");
        Matcher matcher = null;
        for (int i = 0; i< msgs.length;i++){
            if (matcher == null){
                matcher = compile.matcher(msgs[i]);
            }else{
                matcher.reset(msgs[i]);
            }
            System.out.println(matcher.replaceAll("👌"));
        }
        for (int i = 0; i< msgs.length;i++){
            if (matcher == null){
                matcher = compile.matcher(msgs[i]);
            }else{
                matcher.reset(msgs[i]);
            }
            System.out.println(matcher.replaceFirst("👌"));
        }
    }
}
