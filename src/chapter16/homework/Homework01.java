package chapter16.homework;

import java.util.concurrent.locks.Lock;

public class Homework01 {
    public static void main(String[] args) {
        final Object o = new Object();
        new Thread(new NumThread(o)).start();
        new Thread(new AlphabetThread(o)).start();

    }
}
class NumThread implements Runnable {
    private Object object;

    public NumThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object){
            for (int i = 1 ; i <= 52 ; i++){
                System.out.print(i);
                if (i%2 == 0){
                    try {
                        object.notify();
                        if(i < 52){
                            object.wait();}

                    }catch (Exception e){
                        e.printStackTrace();

                    }
                }

            }
            Thread.currentThread().stop();
        }
    }
}
class AlphabetThread implements Runnable{
    public Object object;
    public static String[] str = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public AlphabetThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
                try {
                    object.notify();
                    if (i <str.length-1) {
                        object.wait();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Thread.currentThread().stop();
        }
    }
}