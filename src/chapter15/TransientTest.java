package chapter15;

import java.io.*;
import java.time.chrono.Era;

public class TransientTest {
    public static void main(String[] args) {
        try (
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
                final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
                ){
            final Me criss = new Me("criss", 12);
            System.out.println(criss.getAge());
            objectOutputStream.writeObject(criss);
            final Me me = (Me) objectInputStream.readObject();
            System.out.println(me.getAge());
            System.out.println(me);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Me implements Serializable {
    String name;
    transient  int age;
    public Me(String name,int age ){
        this.name = name ;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Me{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}