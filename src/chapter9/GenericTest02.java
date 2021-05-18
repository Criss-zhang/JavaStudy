package chapter9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest02 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        List<Shape> shapeList = new LinkedList<>();
        canvas.drawAll(shapeList);
        List<Circle> circleList = new LinkedList<>();
        circleList.add(new Circle());
        canvas.drawAll(circleList);
    }
}
abstract class Shape{
    public abstract void draw(Canvas c);
}
class Circle extends Shape{

    @Override
    public void draw(Canvas c) {
        System.out.println("this is circle draw:"+c);
    }
}
class Rectangle extends  Shape{

    @Override
    public void draw(Canvas c) {
        System.out.println("this is rectangle draw:"+c);
    }
}
class Canvas{
    public void drawAll(List<? extends Shape> shapes){
        for (Shape s:shapes
             ) {
            s.draw(this);
        }
    }
    public void ddd(List<? super Circle> list){
    }
}