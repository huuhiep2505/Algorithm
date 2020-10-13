package src.hiep.algorithm;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection implements Serializable {
    public static Connection makeConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/AlgorithmDemo";
             con = DriverManager.getConnection(url, "root", "123456");

        } catch (Exception e) {
            System.out.println(e);
        }
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return con;
    }

}
