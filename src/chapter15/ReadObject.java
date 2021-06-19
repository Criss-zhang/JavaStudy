package chapter15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (
                final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
                ){
            Person person = (Person) objectInputStream.readObject();
            System.out.println(person.getName());
            Person person2 = (Person) objectInputStream.readObject();
            System.out.println(person2.getName());
        }catch (Exception e){

        }
    }
}
