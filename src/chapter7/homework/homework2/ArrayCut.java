package chapter7.homework.homework2;

public class ArrayCut {
    public static void main(String[] args) {
        String abc = "ABCDEFG";
        String cd = abc.replace("CD", "");
        System.out.println(cd);
        String b = cd.replace("B", "");
        String f = b.replace("F", "");
        System.out.println(f);
    }
}
