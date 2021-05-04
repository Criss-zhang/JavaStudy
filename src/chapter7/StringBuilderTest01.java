package chapter7;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("world");
        System.out.println(stringBuilder);
        stringBuilder.insert(2,"111111");
        System.out.println(stringBuilder);
        stringBuilder.delete(2,7);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        stringBuilder.setLength(2);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
    }
}
