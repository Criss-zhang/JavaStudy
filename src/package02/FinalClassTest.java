package package02;

public class FinalClassTest {
}
class Person{
    private final Name name;
    public Person(Name name){
        this.name = new Name(name.getFirstName(), name.getLastName());
    }

    public Name getName(){
        return new Name(name.getFirstName(), name.getLastName());
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
}