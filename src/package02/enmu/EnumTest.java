package package02.enmu;

public class EnumTest {
    public static void main(String[] args) {
        for (SeasonEnum s: SeasonEnum.values()
             ) {
            System.out.println(s);
            SeasonEnum fall = SeasonEnum.valueOf(SeasonEnum.class, "fall");
            System.out.println(fall);
        }
    }
}
