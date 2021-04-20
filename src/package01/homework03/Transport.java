package package01.homework03;

public class Transport {
    private int speed ;
    private int price ;
    {
        run();
        System.out.println("速度是"+speed);
        System.out.println("价格是"+price);
    }
    public static  void run(){
        System.out.println("已准备就绪");
    }

    public Transport(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }

    public Transport() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
