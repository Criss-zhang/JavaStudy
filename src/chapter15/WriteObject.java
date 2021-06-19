package chapter15;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObject {
    public static void main(String[] args) {
        try (
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
                ){
            objectOutputStream.writeObject(new Person("悟空"));
            objectOutputStream.writeObject(new Person("八戒"));
            objectOutputStream.writeObject(new Person("悟空"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Person  implements Serializable {
    String name;
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}