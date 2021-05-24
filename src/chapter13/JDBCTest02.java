package chapter13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crazy?useSSL=true", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select s.* ,teacher_name from student_table2 s,teacher_table2 t where t.teacher_id = s.java_teacher");
            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
            }
        }catch (Exception e){}
    }
}
