package package02.homework;

public abstract class Car {
    protected int wheel;
    protected String name;

    abstract int getLong(int carLong);

    public Car(int wheel){
        this.wheel = wheel;
    }
    public Car(){};

}
