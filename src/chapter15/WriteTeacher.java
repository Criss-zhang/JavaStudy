package chapter15;

import java.io.*;

public class WriteTeacher {
    public static void main(String[] args) {
        try (
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
                ){
            final Person criss = new Person("criss");
            final Teacher cccc = new Teacher("cccc", criss);
            final Teacher ssss = new Teacher("ssss", criss);
            objectOutputStream.writeObject(cccc);
            objectOutputStream.writeObject(ssss);
            objectOutputStream.writeObject(criss);
            objectOutputStream.writeObject(ssss);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Teacher implements Serializable{
    Person person;
    String name;
    public Teacher(String name,Person person){
        this.name = name;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "person=" + person +
                ", name='" + name + '\'' +
                '}';
    }
}