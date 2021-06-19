package chapter15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadTeacher {
    public static void main(String[] args) {
        try (
                final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
                ){
            final Teacher teacher1 = (Teacher) objectInputStream.readObject();
            final Teacher teacher2 = (Teacher) objectInputStream.readObject();
            final Person person = (Person) objectInputStream.readObject();
            final Teacher teacher3 = (Teacher) objectInputStream.readObject();
            System.out.println(teacher1.person == teacher2.person);
            System.out.println(teacher1.person == teacher3.person);
            System.out.println(teacher1.person == person);


        }catch (Exception e){

        }
    }
}
