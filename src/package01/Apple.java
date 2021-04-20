package package01;

public class Apple extends Fruit{
    @Override
    public void info() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.num = 12;
        apple.info();
    }


}
class Fruit{

    protected int num;

    public void info(){
        System.out.println("水果数量："+num);
    }
}