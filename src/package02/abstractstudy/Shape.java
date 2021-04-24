package package02.abstractstudy;

public abstract class Shape {
    {
        System.out.println("执行shape的初始化块");
    }
    private String color;

    public abstract double calPerimeter();

    public abstract String getType();

    public Shape(){};
    public Shape(String color){this.color = color;}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
