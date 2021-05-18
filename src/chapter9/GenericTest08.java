package chapter9;

public class GenericTest08 {
    public static void main(String[] args) {
        String s = GenericTest08Class.<String>nil().head();
    }
}
class GenericTest08Class<T>{
    public static  <E> GenericTest08Class<E> nil(){
        return null;
    }
    T head(){return null;}
    public static <E> GenericTest08Class<E> cons(E head,GenericTest08Class<E> l){
        return null;
    }

}