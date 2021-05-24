package chapter13;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest05 {
   public String driver;
   public String url;
   public String user;
   public String password;

    public static void main(String[] args)throws Exception {
        final JDBCTest05 jdbcTest05 = new JDBCTest05();
        jdbcTest05.initParam("JDBCmysql.properties");
        System.out.println("-----先删除已存在的表-----");
        jdbcTest05.executeSql("drop table if exists my_test;");
        System.out.println("-----建表-----");
        jdbcTest05.executeSql("create table my_test(" +
                "test_id int auto_increment primary key," +
                "test_name varchar(255));");
        System.out.println("-----插入数据-----");
        jdbcTest05.executeSql("insert into my_test(test_name)" +
                "select student_name from student_table2;");
        System.out.println("-----执行查询语句-----");
        jdbcTest05.executeSql("select * from my_test");
    }

   public void initParam(String fileName)throws Exception{
       final Properties properties = new Properties();
       properties.load(new FileInputStream(fileName));
       driver = properties.getProperty("driver");
       url = properties.getProperty("url");
       user = properties.getProperty("user");
       password = properties.getProperty("password");
   }

   public void executeSql(String sql)throws Exception{
       Class.forName(driver);
       try(final Connection connection = DriverManager.getConnection(url,user,password);
       Statement statement = connection.createStatement();) {
           final boolean hasResultSet = statement.execute(sql);
           if (hasResultSet){
               try(final ResultSet resultSet = statement.getResultSet();) {
                   final ResultSetMetaData metaData = resultSet.getMetaData();
                   final int columnCount = metaData.getColumnCount();
                   while (resultSet.next()){
                       for (int i = 0 ; i < columnCount;i++){
                           System.out.print(resultSet.getString(i+1)+"\t");
                       }System.out.println();
                   }
               }
           }else{
                System.out.println("本次sql共有"+statement.getUpdateCount()+"条收到影响");
           }
       }
   }
}
