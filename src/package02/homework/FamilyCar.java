package package02.homework;

public class FamilyCar extends Car {

    public int carLong;

    public int person;

    public FamilyCar(int wheels,int person){
        super(wheels);
        this.person = person;
    }

    @Override
    int getLong(int carLong) {
        return carLong;
    }
}
