package package02.interfacestudy;

public interface Output {
    int MAX_CACHE_LINE =50;

    void out();
    void getData(String msg);

    default void print(String... msgs){
        for (String msg :msgs){
            System.out.println(msg);
        }
    }
    default void test(){
        System.out.println("默认的test方法");
    }

    static String staticTest(){return "接口里的类方法";}

}
