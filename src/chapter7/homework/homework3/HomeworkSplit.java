package chapter7.homework.homework3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

public class HomeworkSplit {
    public static void main(String[] args) {
        String text = "A1B2C3D4E5F6G7H8";
        String num ="";
        String alphabet = "";
        char[] chars = text.toCharArray();
        for (int i = 0;i<chars.length;i++){
            if (Pattern.compile("[0-9]\\d*").matcher(String.valueOf(chars[i])).matches()){
                num += chars[i];
            }else alphabet+= chars[i];
        }
        char[] numCharArray = num.toCharArray();
        char[] alphCharArray = alphabet.toCharArray();
        System.out.println(Arrays.toString(numCharArray));
        System.out.println(Arrays.toString(alphCharArray));
    }
}
