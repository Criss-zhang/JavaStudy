package chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest09 {
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
    public void insertImg(String filePath)throws Exception{
        Class.forName(driver);
        try (
                final Connection connection = DriverManager.getConnection(url, user, password);
                final PreparedStatement preparedStatement = connection.prepareStatement("insert into img_table values(null,?,?);", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ){
            preparedStatement.setString(1,"image");
            preparedStatement.setBinaryStream(2,new FileInputStream(new File(filePath)));
            preparedStatement.executeUpdate();
        }
    }
    public void outPutFile()throws Exception{
        Class.forName(driver);
        try(
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = connection.prepareStatement("select * from img_table where img_id = 1");
                FileOutputStream fileOutputStream = new FileOutputStream(new File("输出路径"));

        ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                InputStream in = resultSet.getBinaryStream("img_data");
                byte[] bytes = new byte[4000];
                int len;
                while ((len = in.read(bytes))>0){
                    fileOutputStream.write(bytes,0,len);
                }
            }


        }
    }
    public void query()throws Exception{
        Class.forName(driver);
        try (
                final Connection connection = DriverManager.getConnection(url, user, password);
                final Statement statement = connection.createStatement();
        ){
            final ResultSet resultSet = statement.executeQuery("select img_id,img_name from img_table;");
            final ResultSetMetaData metaData = resultSet.getMetaData();
            final int columnCount = metaData.getColumnCount();
            while (resultSet.next()){
                for (int i = 0 ; i < columnCount;i++){
                    System.out.print(resultSet.getString(i+1));
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) throws Exception{
        final JDBCTest09 jdbcTest09 = new JDBCTest09();
        jdbcTest09.initParam();
        jdbcTest09.insertImg("图片绝对路径");
        jdbcTest09.query();
        jdbcTest09.outPutFile();
    }
}
