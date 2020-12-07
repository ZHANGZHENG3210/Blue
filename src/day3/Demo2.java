package day3;

import day2.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Object[]> list=new ArrayList();
        list.add(new Object[]{50,"保安部","北京"});
        list.add(new Object[]{60,"人才部","天津"});
        list.add(new Object[]{70,"销售部","大连"});
        list.add(new Object[]{80,"后勤部","太原"});
        try (Connection con = ConnectionFactory.getConnection()) {
            con.setAutoCommit(false);
            String sql="INSERT INTO DEPT SET DEPTNO=?,DNAME=?,LOC=?";
            PreparedStatement pst=con.prepareStatement(sql);
            for (Object[] one:list) {
                pst.setObject(1,one[0]);
                pst.setObject(2,one[1]);
                pst.setObject(3,one[2]);
                pst.addBatch();
            }
            pst.executeBatch();
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
