package package02.homework;

public class TuoLaJi extends Car {
    public int tuoLaJiLong;
    public int carLong;

    public TuoLaJi(int wheels,int tuoLaJiLong){
        super(wheels);
        this.tuoLaJiLong = tuoLaJiLong;
    }

    @Override
    int getLong(int carLong) {
        return carLong;
    }
}
