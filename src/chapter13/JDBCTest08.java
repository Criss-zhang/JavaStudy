package chapter13;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class JDBCTest08 {
    JFrame jf = new JFrame("图片管理程序");
    private static Connection conn;
    private static PreparedStatement insert;
    private static PreparedStatement query;
    private static PreparedStatement queryAll;
    private DefaultListModel<ImageHolder> imageModel = new DefaultListModel<>();
    private JList<ImageHolder> imageList = new JList<>(imageModel);
    private JTextField filePath = new JTextField(26);
    private JButton browserBn = new JButton("...");
    private JButton uploadBn = new JButton("上传");
    private JLabel imageLabel = new JLabel();
    JFileChooser chooser = new JFileChooser(".");
    ExtensionFileFilter filter = new ExtensionFileFilter();

    static {
        try {
            final Properties properties = new Properties();
            properties.load(new FileInputStream("JDBCmysql.properties"));
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            insert = conn.prepareStatement("insert into img_table values(null,?,?)", Statement.RETURN_GENERATED_KEYS);
            query = conn.prepareStatement("select img_data from img_table where img_id = ?");
            queryAll = conn.prepareStatement("select img_id,img_name from img_table");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init() throws SQLException {
        filter.addExtension("jpg");
        filter.addExtension("png");
        filter.addExtension("gif");
        filter.addExtension("jpeg");
        filter.setDescription("图片文件（*.jpg,*.png,*.gif,*.jpeg)");
        chooser.addChoosableFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(false);
        fillListModel();
        filePath.setEditable(false);
        imageList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        final JPanel jPanel = new JPanel();
        jPanel.add(filePath);
        jPanel.add(browserBn);
        browserBn.addActionListener(event -> {
            final int result = chooser.showDialog(jf, "浏览图片文件上传");
            if (result == JFileChooser.APPROVE_OPTION) {
                filePath.setText(chooser.getSelectedFile().getPath());
            }
        });
        jPanel.add(uploadBn);
        uploadBn.addActionListener(avt -> {
            if (filePath.getText().trim().length() > 0) {
                upload(filePath.getText());
                filePath.setText("");
            }
        });
        final JPanel left = new JPanel();
        left.setLayout(new BorderLayout());
        left.add(new JScrollPane(imageLabel), BorderLayout.CENTER);
        left.add(jPanel, BorderLayout.SOUTH);
        jf.add(left);
        imageList.setFixedCellWidth(160);
        jf.add(new JScrollPane(imageList), BorderLayout.EAST);
        imageList.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() >= 2) {
                    ImageHolder cur = (ImageHolder) imageList.getSelectedValue();
                    try {
                        showImage(cur.getId());
                    } catch (SQLException sqle) {
                        sqle.printStackTrace();
                    }
                }
            }
        });
        jf.setSize(620, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public void showImage(int id) throws SQLException {
        query.setInt(1, id);
        try (final ResultSet resultSet = query.executeQuery();) {
            if (resultSet.next()) {
                final Blob blob = resultSet.getBlob(1);
                final ImageIcon imageIcon = new ImageIcon(blob.getBytes(1L, (int) blob.length()));
                imageLabel.setIcon(imageIcon);
            }
        }
    }

    public void upload(String fileName) {
        final String imageName = fileName.substring(fileName.lastIndexOf("\\") + 1, fileName.lastIndexOf('.'));
        final File file = new File(fileName);
        try (InputStream is = new FileInputStream(file)) {
            insert.setString(1, imageName);
            insert.setBinaryStream(2, is, (int) file.length());
            final int affect = insert.executeUpdate();
            if (affect == 1) {
                fillListModel();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillListModel() throws SQLException {
        try (
                final ResultSet resultSet = queryAll.executeQuery();
        ) {
            imageModel.clear();
            while (resultSet.next()) {
                imageModel.addElement(new ImageHolder(resultSet.getInt(1), resultSet.getString(2)));
            }
        }
    }


    public static void main(String[] args) throws Exception {
        new JDBCTest08().init();
    }
}
class ExtensionFileFilter extends FileFilter{
    private String description = "";
    private ArrayList<String> extensions = new ArrayList<>();
    public void addExtension(String extension){
        if (!extension.startsWith(".")){
            extension = "." + extension;
            extensions.add(extension.toLowerCase());
        }
    }

    /**
     * Whether the given file is accepted by this filter.
     *
     * @param f the File to test
     * @return true if the file is to be accepted
     */
    @Override
    public boolean accept(File f) {
        if (f.isDirectory())return true;
        final String name = f.getName().toLowerCase();
        for (String extension : extensions){
            if (name.endsWith(extension))return true;
        }
        return false;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The description of this filter. For example: "JPG and GIF Images"
     *
     * @return the description of this filter
     */
    @Override
    public String getDescription() {
        return description;
    }
}
class ImageHolder{
    private int id;
    private String name;
    public ImageHolder(){}

    @Override
    public String toString() {
        return "ImageHolder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageHolder(int id, String name) {
        this.id = id;
        this.name = name;
    }
}