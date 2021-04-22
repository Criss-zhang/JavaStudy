package package02;

public class FinalClassTest {
    public static void main(String[] args) {
        Name name = new Name("criss", "zhang");
        Person person = new Person(name);
        name.setFirstName("cccc");
        System.out.println(person);
    }
}
class Person{
    private final Name name;
    public Person(Name name){
        //重新创建了一个对象。。。使其值不能被外部改变
        this.name = new Name(name.getFirstName(), name.getLastName());
    }

    public Name getName(){
        return new Name(name.getFirstName(), name.getLastName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                '}';
    }
}
class Name{
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}