package chapter15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class KeyinTest {
    public static void main(String[] args) {
        try (
                final InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                ){
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                if (line.equals("exit")){
                    System.exit(2);
                }
                System.out.print(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
