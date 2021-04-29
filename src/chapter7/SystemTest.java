package chapter7;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) throws Exception{
        Map<String, String> env = System.getenv();
        for (String s: env.keySet()
             ) {
            System.out.println(s+"--->"+env.get(s));
        }
        //获取系统所有属性
        Properties properties = System.getProperties();
        properties.store(new FileOutputStream("/Users/zhanggang/Documents/GitHub/SystemProperties.txt"),"System Properties");
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getenv("JAVA_HOME"));
    }
}
