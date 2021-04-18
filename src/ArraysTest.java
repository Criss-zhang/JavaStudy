import java.util.Arrays;

public class ArraysTest {
    private String[] hanArr = {"零","一","二","三","四","五","六","七","八","九"};
    private String[] unitArr = {"十","百","千"};

    private String[] divide(double num){
        long zheng = (long)num;
        long xiao = Math.round((num-zheng)*100);
        return new String[]{zheng+"",String.valueOf(xiao)};
    }

    private String toHanArr(String numStr){
        String result = "";
        int numLen = numStr.length();
        for (int i = 0;i<numLen;i++){
            int num = numStr.charAt(i) - 48;
            if (i != numLen-1 && num != 0){
                result += hanArr[num] + unitArr[numLen -2 -i];
            }else {
                result += hanArr[num];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArraysTest arraysTest = new ArraysTest();
        System.out.println(Arrays.toString(arraysTest.divide(123.45)));
        System.out.println(arraysTest.toHanArr("1234"));
    }
}
