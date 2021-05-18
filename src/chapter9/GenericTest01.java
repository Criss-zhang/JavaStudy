package chapter9;

import java.util.ArrayList;
import java.util.List;

public class  GenericTest01 {
    public static void main(String[] args) {
        ArrayList<?> list = new ArrayList();
        ArrayList<String> list1 = new ArrayList();
        String s = new String("sad");
        list1.add(s);
        System.out.println(list instanceof  List);
        Apple apple = new Apple();
        apple.print(list);
    }
}

class Apple<T>{
    public T ss;
    public void print(){
        System.out.println(this.ss);
    }
    public T getSs(){
        return this.ss;
    }
    public void print(List<T> list){
        System.out.println(list);
    }
}
class subApple extends Apple{
    @Override
    public Object getSs() {
        return super.getSs();
    }
}