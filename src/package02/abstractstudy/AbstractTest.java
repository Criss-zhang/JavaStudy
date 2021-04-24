package package02.abstractstudy;

import package01.homework03.Transport;

public class AbstractTest {
    public static void main(String[] args) {
        Shape circle = new Circle("green", 12.2d);
        Shape triangle = new Triangle("blue", 12, 12, 12);
        System.out.println(circle.getType());
        System.out.println(triangle.getType());
    }
}