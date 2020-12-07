package day3;

import day2.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Demo1 {
    public static void main(String[] args) {
        try(Connection con= ConnectionFactory.getConnection()){
            con.setAutoCommit(false);
            String sql_1="Update emp set deptno=? where deptno=?";
            String sql_2="Delete from dept where deptno=?";
            PreparedStatement pst=con.prepareStatement(sql_1);
            pst.setObject(1,20);
            pst.setObject(2,30);
            int i=pst.executeUpdate();
            System.out.println("删除了"+i);
            pst=con.prepareStatement(sql_2);
            pst.setObject(1,30);
            i=pst.executeUpdate();
            System.out.println("删除了"+i);
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
