package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTest03 {
    private String driver;
    private String user;
    private String url;
    private String password;

    public void initParam(String fileName)throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream(fileName));
         driver = properties.getProperty("driver");
         user = properties.getProperty("user");
         url = properties.getProperty("url");
         password = properties.getProperty("password");
    }

    public void createTable(String sql)throws Exception{
        Class.forName(driver);
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement())
        {
            statement.executeUpdate(sql);
        }
    }

    public static void main(String[] args) throws Exception{
        JDBCTest03 jdbcTest03 = new JDBCTest03();
        jdbcTest03.initParam("JDBCmysql.properties");
        jdbcTest03.createTable("create table jdbc_test " +
                "(jdbc_id int auto_increment primary key," +
                "jdbc_name varchar(255)," +
                "jdbc_desc text);");
        System.out.println("建表成功");
    }
}
