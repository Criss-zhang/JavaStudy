package package02;

public class WrapperClassTest01 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setPrice(12);
        System.out.println(apple.hashCode());
    }
}
class Apple{
    private  int price;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apple apple = (Apple) o;

        if (price != apple.price) return false;
        return name != null ? name.equals(apple.name) : apple.name == null;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}