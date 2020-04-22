package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zdaf
 */
public class Koneksi {
    public static Connection sambungDB(){
        String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String host = "localhost";
        String port = "3306";
        String password = "";
        String dbName = "perumahan";
        String url = "jdbc:mysql://"+host+":"+port+"/"+dbName+"?useTimezone=true&serverTimezone=UTC";
        Connection con = null;
        try {
            Class.forName(JDBC_DRIVER_CLASS).newInstance();
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Congrats ! Koneksi sukses");
            return con;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println("Error : " + e.getMessage());
            System.exit(0);
        }
        return null;
    }
}
