package package02;

public class CashImmutable {
    private static int MAX_SIZE = 10;
    private static CashImmutable[] cash = new CashImmutable[MAX_SIZE];
    private static int pos = 0;
    private final String name;

    private CashImmutable(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static CashImmutable[] getCash(){
        return cash;
    }
    public static  CashImmutable valueOf(String name){
        for (int i = 0;i< MAX_SIZE;i++){
            if (cash[i]!= null &&
            cash[i].getName().equals(name)){
                return cash[i];
            }
        }
        if (pos >= MAX_SIZE){
            cash[0] = new CashImmutable(name);
            pos = 0;
        }else {
            cash[pos] = new CashImmutable(name);
            pos++;
        }
        return cash[pos-1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CashImmutable that = (CashImmutable) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CashImmutable{" +
                "name='" + name + '\'' +
                '}';
    }
}
class CashImmutableTest{
    public static void main(String[] args) {
        CashImmutable criss01 = CashImmutable.valueOf("criss");
        CashImmutable criss02 = CashImmutable.valueOf("ss");
        System.out.println(criss01 == criss02);
        for (CashImmutable c: CashImmutable.getCash()
             ) {
            System.out.println(c);
        }
    }
}