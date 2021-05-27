package chapter13;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTest12 {
    public String driver;
    public String url;
    public String user;
    public String password;

    public static void main(String[] args)throws Exception {
        final JDBCTest12 jdbcTest12 = new JDBCTest12();
        jdbcTest12.initParam();
        final CachedRowSet query = jdbcTest12.query("select * from student_table2", 10, 4);
        query.afterLast();
        while (query.previous()){
            System.out.println(query.getString(1)+query.getString(2));
        }
    }
    public void initParam()throws Exception{
        final Properties properties = new Properties();
        properties.load(new FileInputStream("JDBCmysql.properties"));
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
    }
    public CachedRowSet query(String sql,int pageSize,int page)throws Exception{
        Class.forName(driver);
        try (
                final Connection connection = DriverManager.getConnection(url,user,password);
                final Statement statement = connection.createStatement();
                final ResultSet resultSet = statement.executeQuery(sql);
        ){
            final RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            final CachedRowSet cachedRowSet = rowSetFactory.createCachedRowSet();
            cachedRowSet.setPageSize(pageSize);
            cachedRowSet.populate(resultSet,(page-1)*pageSize+1);
            return cachedRowSet;
        }
    }
}
