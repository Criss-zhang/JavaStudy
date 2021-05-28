package chapter13;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest16 {
    public static void main(String[] args) throws Exception {
        final BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/crazy");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("root");
        basicDataSource.setInitialSize(5);
        basicDataSource.setMaxTotal(20);
        basicDataSource.setMinIdle(2);
        final Connection connection = basicDataSource.getConnection();
        final ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setMaxPoolSize(40);


    }
}
