package package02.enmu;

public class EnumTest02 {
    public static void main(String[] args) {
        Gender male = Gender.valueOf("MALE");
        male.info();
    }
}
