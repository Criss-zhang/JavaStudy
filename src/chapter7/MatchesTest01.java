package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesTest01 {
    public static void main(String[] args) {
        String[] mails = {
                "kkkkkkk@163.com",
                "asiydvifa@qq.com",
                "zz@qq.com",
                "heihei@aa.x"
        };
        String mailRegEx = "\\w{3,20}@\\w+\\.(com|cn)";
        Pattern mailPattern = Pattern.compile(mailRegEx);
        Matcher matcher = null;
        for (String mail: mails
             ) {
            if (matcher == null){
                matcher = mailPattern.matcher(mail);
            }else{
                matcher.reset(mail);
            }
            String result = mail + (matcher.matches()?"is":"is not")+"a legal e-mail";
            System.out.println(result);
        }
    }
}
