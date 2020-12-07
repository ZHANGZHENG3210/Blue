package day2;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai";
            String username = "root";
            String password = "Zz187418#";
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
