package package01;

public class PolymorphismTest02 extends FatherClass{
    private  String name;

    /**
     * hello
     */
    @Override
    public void test() {
        System.out.println("被重写的test方法"+name.length());
    }

    public static void main(String[] args) {
        PolymorphismTest02 polymorphismTest02 = new PolymorphismTest02();
        polymorphismTest02.test();

    }
}
class FatherClass{

    public FatherClass(){
//        test();
    }

    public void test() {
        System.out.println("即将被子类重写的方法");
    }
}