package chapter13;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest15 {
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
    public void info() throws Exception{
        Class.forName(driver);
        try (
                final Connection connection = DriverManager.getConnection(url,user,password);
        ){
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet rs = metaData.getTableTypes();
            System.out.println(metaData.getDatabaseProductName());
            System.out.println(metaData.getDriverVersion());
            System.out.println(metaData.getDatabaseProductVersion());
            System.out.println("---mysql支持的类型信息---");
            printResultSet(rs);
           rs= metaData.getTables(null,null,"%", new String[]{"TABLE"});
            System.out.println("---当前数据库里的数据表信息");
            printResultSet(rs);
            rs = metaData.getPrimaryKeys(null, null, "student_table2");
            System.out.println("---student_TABLE2表的主键信息---");
            printResultSet(rs);
            rs = metaData.getProcedures(null, null, "%");
            System.out.println("---当前数据库里的存储过程信息");
            printResultSet(rs);
            rs = metaData.getCrossReference(null,null,"teacher_table2", null,null,"student_table2");
            System.out.println("---teacher_table2表和student_table2表之间的外键约束");
            printResultSet(rs);
            rs = metaData.getColumns(null,null,"student_table2","%");
            System.out.println("----student_table2表的全部数据列");
            printResultSet(rs);
        }
    }

    public void printResultSet(ResultSet rs)throws SQLException{
        final ResultSetMetaData metaData = rs.getMetaData();
        for (int i = 0 ; i < metaData.getColumnCount();i++){
            System.out.print(metaData.getColumnName(i+1)+"\t");
        }
        System.out.println();
        while (rs.next()){
            for (int i = 0;i < metaData.getColumnCount();i++){
                System.out.print(rs.getString(1+i)+"\t");
            }
            System.out.println();
        }
        rs.close();
    }

    public static void main(String[] args) throws Exception{
        final JDBCTest15 jdbcTest15 = new JDBCTest15();
        jdbcTest15.initParam();
        jdbcTest15.info();
    }
}
