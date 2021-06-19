package chapter15;

import java.io.*;
import java.util.ArrayList;

public class ReplaceTest {
    public static void main(String[] args) {
        try(
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("replace.txt"));
                final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("replace.txt"));
        ) {
            final People criss = new People("criss", 12);
            objectOutputStream.writeObject(criss);
            People o = (People)objectInputStream.readObject();
            System.out.println(o);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class People implements Serializable {

    String name;
    int age;

    private Object writeReplace(){
        ArrayList<Object> list = new ArrayList<>();
        list.add(name);
        list.add(age);
        return this;

    }
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    private void writeObject(ObjectOutputStream out)throws IOException,ClassNotFoundException{
        out.writeObject(new StringBuffer(name));
        out.writeInt(age);
    }
    private void readObject(ObjectInputStream in)throws IOException,ClassNotFoundException{
        this.name = ((StringBuffer) in.readObject()).reverse().toString();
        this.age =in.readInt();

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

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}