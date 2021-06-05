package chapter14;

@SuppressWarnings(value = "unchecked")
public class AnnotationTest01 {
    public static void main(String[] args) {
        final d d = new d();
        System.out.println(d);
    }
}
@Deprecated(since = "7",forRemoval = true)
class d{

}