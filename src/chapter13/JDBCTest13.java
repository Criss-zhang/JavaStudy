package chapter13;

import com.mysql.jdbc.DatabaseMetaData;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTest13 {
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

   public void insertData(String[] sqls)throws Exception{
        Class.forName(driver);
        try (
                final Connection connection = DriverManager.getConnection(url,user,password);
                ){
            connection.setAutoCommit(false);
            try (final Statement statement = connection.createStatement();){
                for (String sql : sqls){
                    statement.executeUpdate(sql);
                }
            }
            connection.commit();
        }
   }

    public static void main(String[] args)throws Exception {
        final JDBCTest13 jdbcTest13 = new JDBCTest13();
        jdbcTest13.initParam();
        String[] ssss = {
                "insert into student_table2 values(null,'a',1)"
                ,"insert into student_table2 values(null,'b',2)"
                ,"insert into student_table2 values(null,'c',3)"
        };
        jdbcTest13.insertData(ssss);
    }
}
