package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTest14 {
    public String driver;
    public String url;
    public String user;
    public String password;

    public void initParam()throws Exception{
        final Properties properties = new Properties();
        properties.load(new FileInputStream("JDBCmysql.properties"));
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
    }
    public void insertBatch(String[] sqls)throws Exception{
        Class.forName(driver);
        try (
                final Connection connection = DriverManager.getConnection(url,user,password);
                ){
            connection.setAutoCommit(false);
            try(
                    final Statement statement = connection.createStatement();
                    ) {
                for (String sql : sqls){
                    statement.addBatch(sql);
                }
                statement.executeLargeBatch();
                connection.commit();
                connection.setAutoCommit(true);
            }
        }
    }

    public static void main(String[] args)throws Exception {
        final JDBCTest14 jdbcTest14 = new JDBCTest14();
        jdbcTest14.initParam();
        String[] sqls = {
                "insert into student_table2 values(null,'1',1);",
                "insert into student_table2 values(null,'2',1);",
                "insert into student_table2 values(null,'3',1);"
        };
        jdbcTest14.insertBatch(sqls);
    }
}
