package chapter8.homework01;

import java.util.HashMap;

public class MapTimesTest {
    public static void main(String[] args) {
        String[] str = {"a","b","a","b","c","a","b","c","b"};
        HashMap hashMap = new HashMap();
        int times;
        for (int i = 0; i < str.length;i++){
            if(hashMap.get(str[i]) == null){
                hashMap.put(str[i],1);
            }else{
                int o = (int)hashMap.get(str[i])+1;
                hashMap.put(str[i],o);
            }
        }
        System.out.println(hashMap);
    }
}
