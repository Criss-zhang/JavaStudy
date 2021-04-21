package package02;

public class SingletonClassTest {
    public static void main(String[] args) {
        SingletonClass instance01 = SingletonClass.getInstance();
        SingletonClass instance02 = SingletonClass.getInstance();
//        System.out.println(instance01 == instance02);
//        FinalVariableClass f = new FinalVariableClass(12);
//        System.out.println(f.age);
//        System.out.println(f.name);
//        FinalVariableClass01 f2 = new FinalVariableClass01();
String a = "hello world";
String b = "hello"+" world";
System.out.println(a == b);
    }
}
class FinalVariableClass{
    final  int age ;
    final String name = "criss";
    final static String gender;
    static {
        gender = "男";
    }
//    {
//        age =12;
//    }
    FinalVariableClass(int age ) {
        this.age = age;
    }
}
class FinalVariableClass01{
    final int a ;
    {
        printAge();
        a = 1111;
    }
    public void printAge(){
        System.out.println(a);
    }
}