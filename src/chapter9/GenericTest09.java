package chapter9;

public class GenericTest09 {
    public static void main(String[] args) {
        GenericTest09Class<Integer> genericTest09Class =  new GenericTest09Class<>(5);
        Integer size = genericTest09Class.getSize();
        System.out.println(size);
        GenericTest09Class a = genericTest09Class;

    }
}
class GenericTest09Class<T extends Number>{
    T size;
    public GenericTest09Class(){}
    public GenericTest09Class(T size){this.size = size;}
    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }
}