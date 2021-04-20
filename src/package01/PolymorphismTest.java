package package01;

public class PolymorphismTest {
    public static void main(String[] args) {
//        Son te = new Son();
//        System.out.println(te.level);
//        ((Father)te).hello();
//        Father father = new Father();
        Father fa = new Son();
        System.out.println(fa.forTest);
    }
}


class Father{
    public  int level = 1;
    public ForTest forTest = new ForTest(13);

    public void test(){
        System.out.println("父类方法");
    }
    public void hello(){}
}
class Son extends  Father{
    public ForTest forTest = new ForTest(15);
    public int level = 2;

    public void test() {
        System.out.println("子类方法");
    }
    public void sonson(){}
}

class ForTest{
    public int age ;
    public ForTest(int age ){
        this.age = age ;
    }

    @Override
    public String toString() {
        return "ForTest{" +
                "age=" + age +
                '}';
    }
}