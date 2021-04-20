package package01;

public class PolymorphismTest03 {
    public static void main(String[] args) {
        new leaf();
        System.out.println("----");
        new leaf();
    }
}

class Root{
    static{
        System.out.println("Root的静态代码块");
    }
    {
        System.out.println("Root的普通代码块");
    }
    public Root(){
        System.out.println("root的构造器");
    }
}

class Mid extends Root{
    static{
        System.out.println("Mid的静态代码块");
    }
    {
        System.out.println("Mid的普通代码块");
    }
    public Mid(){
        System.out.println("mid的无参构造器");
    }
    public Mid(String msg){
        this();
        System.out.println("mid的有参构造器"+msg);
    }
}
class leaf extends Mid{
    static{
        System.out.println("leaf的静态代码块");
    }
    {
        System.out.println("leaf的普通代码块");
    }
    public leaf(){
        super("啦啦啦啦");
        System.out.println("leaf的有参构造器");
    }

}