public class PolymorphismTest {
    public static void main(String[] args) {
        Son te = new Son();
        System.out.println(te.level);
        ((Father)te).hello();
        Father father = new Father();
    }
}


class Father{
    public  int level = 1;

    public void test(){
        System.out.println("父类方法");
    }
    public void hello(){}
}
class Son extends  Father{
    public int level = 2;

    public void test() {
        System.out.println("子类方法");
    }
    public void sonson(){}
}