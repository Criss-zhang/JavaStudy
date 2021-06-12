package chapter15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromProcess {
    public static void main(String[] args) throws Exception {
        final Process java = Runtime.getRuntime().exec("java");
        try (
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(java.getErrorStream()));
                ){
//            System.out.println(java.exitValue());
            String buff = null;
            while ((buff = bufferedReader.readLine()) !=null){
                System.out.println(buff);
            }
            final int i = java.waitFor();
            System.out.println(i);

        }
    }
}
