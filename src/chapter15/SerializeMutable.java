package chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeMutable {
    public static void main(String[] args) {
        try (
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
                final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
        ){
            Person criss = new Person("criss");
            objectOutputStream.writeObject(criss);
            criss.setName("not criss");
            objectOutputStream.writeObject(criss);
            final Person person1 = (Person) objectInputStream.readObject();
            final Person person2 = (Person) objectInputStream.readObject();
            System.out.println(person1.getName());
            System.out.println(person1 == person2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
