package package02.homework;

public class Cart extends Car {
    public double weight;

    public int carLong;

    public Cart(int wheels,double weight){
        super(wheels);
        this.weight = weight;
    }

    @Override
    int getLong(int carLong) {
        return carLong;
    }
}
