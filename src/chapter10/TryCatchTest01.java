package chapter10;

import java.util.Scanner;

public class TryCatchTest01 {
    public static void main(String[] args) {
        while (true){
        try {
            throw  new Exception("hello this is an exception");
        }catch (Exception e){
//            continue;
            e.printStackTrace();
            break;
        }
    }}
}
