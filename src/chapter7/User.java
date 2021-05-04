package chapter7;

public class User implements Cloneable {
    int age;
    Address address;
    public User(int age){
        this.age = age;
        address = new Address("北京");
    }
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
class CloneTest{
    public static void main(String[] args) throws Exception{
        User user1 = new User(12);
        User user2 = user1.clone();
        System.out.println(user1 == user2);
        System.out.println(user1.address == user2.address);
    }
}