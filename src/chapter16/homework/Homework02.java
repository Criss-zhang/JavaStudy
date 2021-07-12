package chapter16.homework;


import java.util.Random;

public class Homework02 {
    public static void main(String[] args) {
        boolean[] b = {true,true,true};
        final Garage garage = new Garage(b);
        new Park("停车线程", garage).start();
        new UnPark("开车线程", garage).start();
    }
}
class Park extends Thread{
    private Garage garage;

    public Park(String name, Garage garage) {
        super(name);
        this.garage = garage;
    }

    @Override
    public void run() {
        synchronized (garage) {
            for (int t = 0; t < 100; t++) {
                for (int i = 0; i < garage.getCarPlace().length; i++) {
                    if (garage.getCarPlace()[i]) {
                        System.out.println(getName() + i + "已停车");
                        garage.getCarPlace()[i] = false;
                        garage.notify();
                        try {
                            if (t != 99){
                            garage.wait();}
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            garage.notify();
                            if (t != 99){
                            garage.wait();}
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
class UnPark extends Thread{
    private Garage garage;

    public UnPark(String name, Garage garage) {
        super(name);
        this.garage = garage;
    }

    @Override
    public void run() {
        synchronized (garage) {
            for (int t = 0; t < 100; t++) {
                for (int i = 0; i < garage.getCarPlace().length; i++) {
                    if (!garage.getCarPlace()[i]) {
                        System.out.println(getName() + i + "已开出");
                        garage.getCarPlace()[i] = true;
                        garage.notify();
                        try {
                            if (t != 99){
                            garage.wait();}
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            garage.notify();
                            if (t != 99){
                            garage.wait();}
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
class Garage{
    private boolean[] carPlace;

    public Garage(boolean[] carPlace) {
        this.carPlace = carPlace;
    }

    public boolean[] getCarPlace() {
        return carPlace;
    }
}