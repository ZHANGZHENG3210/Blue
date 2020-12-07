package day2;

import java.sql.*;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.getConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名：");
        String name = scanner.next();
        System.out.println("输入密码：");
        String password = scanner.next();
//        String name="scoot";
//        String password="a";
        String sql = "SELECT COUNT(*) FROM USER WHERE ENAME=SMITH  AND `password`=HEX(AES_ENCRYPT(333,'zhangzheng'));";
        try {
            Statement st = con.createStatement();
//            PreparedStatement pst=con.prepareStatement(sql);
//            pst.setObject(1,name);
//            pst.setObject(2,password);
            ResultSet set = st.executeQuery(sql);
            set.next();
            long count = set.getLong(1);
            System.out.println(count);
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
