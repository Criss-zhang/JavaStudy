package chapter13;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest06 {
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
    public void insertUseStatement()throws Exception{
        final long timeMillis = System.currentTimeMillis();
        try(final Connection connection = DriverManager.getConnection(url,user,password);
            final Statement statement = connection.createStatement();) {
            for (int i = 0 ;i<100;i++){
                statement.executeUpdate("insert into student_table2 values(null,'姓名"+i+"',1)");
            }
            System.out.println("使用statement费时"+(System.currentTimeMillis()-timeMillis));
        }
    }

    public void insertUsePreparedStatement()throws Exception{
        final long timeMillis = System.currentTimeMillis();
        try (final Connection connection = DriverManager.getConnection(url,user,password);
             final PreparedStatement preparedStatement = connection.prepareStatement("insert into student_table values(null,?,1)");){
            for (int i = 0 ;i <100;i++){
                preparedStatement.setString(1,"姓名"+i);
                preparedStatement.executeUpdate();
            }
            System.out.println("使用preparedStatement时间："+(System.currentTimeMillis()-timeMillis));
        }
    }
    public void queryPreparedStatement(String studentName)throws Exception{
        try(final Connection connection = DriverManager.getConnection(url,user,password);
            final PreparedStatement preparedStatement = connection.prepareStatement("select * from student_table2 where student_name = ?")) {
            preparedStatement.setString(1,studentName);
            final ResultSet resultSet = preparedStatement.executeQuery();
            final ResultSetMetaData metaData = resultSet.getMetaData();
            final int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
                for (int i = 0; i < columnCount; i++) {
                    System.out.print(resultSet.getString(i + 1) + "\t");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)throws Exception {
        final JDBCTest06 jdbcTest06 = new JDBCTest06();
        jdbcTest06.initParam("JDBCmysql.properties");
//        jdbcTest06.insertUseStatement();
//        jdbcTest06.insertUsePreparedStatement();
        jdbcTest06.queryPreparedStatement("criss");

    }
}
