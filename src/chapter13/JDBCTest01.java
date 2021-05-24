package chapter13;

import java.sql.*;

public class JDBCTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
     Class.forName("com.mysql.jdbc.Driver");
     try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crazy?useSSL=true", "root", "root");
          Statement statement = connection.createStatement()){
         ResultSet resultSet = statement.executeQuery("select s.* ,teacher_name " +
                 "from student_table2 s,teacher_table2 t " +
                 "where s.java_teacher = t.teacher_id");
         while (resultSet.next()){
             System.out.println(resultSet.getString(1)+resultSet.getString(2)+resultSet.getString(3)+resultSet.getString(4));
         }
     }catch (Exception e){

     }
    }
}
