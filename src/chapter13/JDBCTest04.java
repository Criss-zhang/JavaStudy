package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTest04 {
    public String driver;
    public String url;
    public String user;
    public String password;

    public void initParam(String fileName)throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream(fileName));
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
    }
    public int insertData(String sql)throws Exception{
        Class.forName(driver);
        try (Connection connection = DriverManager.getConnection(url,user,password);
             Statement statement = connection.createStatement()){
            int i = statement.executeUpdate(sql);
            return i;
        }
    }

    public static void main(String[] args) throws Exception{
         JDBCTest04 jdbcTest04 = new JDBCTest04();
         jdbcTest04.initParam("JDBCmysql.properties");
         String sql = "insert into jdbc_test(jdbc_name,jdbc_desc) select s.student_name,t.teacher_name " +
                 "from student_table2 s,teacher_table2 t where t.teacher_id = s.java_teacher;";
         int i = jdbcTest04.insertData(sql);
         System.out.println(i);
    }

}
