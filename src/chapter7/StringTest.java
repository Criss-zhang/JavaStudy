package chapter7;

public class StringTest {
    public static void main(String[] args) {
        String s = new String("hello.world");
        System.out.println(s.charAt(5));
        String str1  = "crissz6zzzzz";
        String str2  = "crisszzz";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.concat(str2));
        String criss = "criss";
        StringBuffer criss1 = new StringBuffer("Criss");
        System.out.println(criss.contentEquals(criss1));
        System.out.println(criss.endsWith("iss"));
        System.out.println(criss.equalsIgnoreCase(String.valueOf(criss1)));
        byte[] bytes = "12".getBytes();
        for (byte b:bytes
             ) {
            System.out.println(b);
        }
        char[] chars = "criss".toCharArray();
        for (char c:chars
             ) {
            System.out.println(c);
        }
        str1.getChars(0,2,chars, 2);
        System.out.println(str1);
        System.out.println(chars);
        System.out.println(str1.indexOf("s"));
        System.out.println(str1.length());
    }
}
