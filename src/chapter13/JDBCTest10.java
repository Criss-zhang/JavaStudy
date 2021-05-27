package chapter13;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.FileInputStream;
import java.util.Properties;

public class JDBCTest10 {
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
    public void update(String sql)throws Exception{
        Class.forName(driver);
        final RowSetFactory rowSetFactory = RowSetProvider.newFactory();
        try (
                final JdbcRowSet jdbcRowSet = rowSetFactory.createJdbcRowSet();  ){
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.execute();
            jdbcRowSet.beforeFirst();
            while (jdbcRowSet.next()){
                if (jdbcRowSet.getInt("student_id")==1){
                    jdbcRowSet.updateString("student_name", "criss");
                    jdbcRowSet.updateRow();
                }
                System.out.println(jdbcRowSet.getString(1)+jdbcRowSet.getString(2));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        final JDBCTest10 jdbcTest10 = new JDBCTest10();
        jdbcTest10.initParam();
        jdbcTest10.update("select * from student_table2");
    }
}
