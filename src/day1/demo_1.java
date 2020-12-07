package day1;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class demo_1 {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new Driver());//加载驱动
            String url="jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai";
            String username="root";
            String password="Zz187418#";
            Connection con=DriverManager.getConnection(url,username,password);
            PreparedStatement pst=con.prepareStatement("select  * from emp");
            pst.execute();
            con.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
