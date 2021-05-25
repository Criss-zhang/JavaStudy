package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBCTest07 {
    public String driver;
    public String url;
    public String user;
    public String password;

    public void initParam(String fileName)throws Exception{
        final Properties properties = new Properties();
        properties.load(new FileInputStream(fileName));
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
        Class.forName(driver);
    }
   public void query(String sql)throws Exception{
       try (final Connection connection = DriverManager.getConnection(url,user,password);
            final PreparedStatement preparedStatement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            final ResultSet resultSet = preparedStatement.executeQuery();){
            resultSet.last();
           final int row = resultSet.getRow();
           for (int i = row ; i>0;i--){
               resultSet.absolute(i);
               System.out.println(resultSet.getString(1)+resultSet.getString(2)+resultSet.getString(3));
               resultSet.updateObject(2, "ResultSet PreparedStatement");
               resultSet.updateRow();
           }
       }
   }

    public static void main(String[] args) throws Exception{
        final JDBCTest07 jdbcTest07 = new JDBCTest07();
        jdbcTest07.initParam("JDBCmysql.properties");
        jdbcTest07.query("select * from student_table2");
    }
}
