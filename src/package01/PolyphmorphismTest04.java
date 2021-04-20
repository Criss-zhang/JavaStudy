package package01;

public class PolyphmorphismTest04 {
    public static void main(String[] args) {
        System.out.println(new PoTest().a);
    }
}

class PoTest{
    static {
        int a = 10;
    }
    int a = 20;

}