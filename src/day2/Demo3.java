package day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo3 {
    public static void main(String[] args) {
        try(Connection con=ConnectionFactory.getConnection()){
            StringBuffer buffer=new StringBuffer();
            buffer.append("UPDATE emp SET SAL=(");
            buffer.append(" CASE");
            buffer.append(" WHEN DEPTNO=10 THEN SAL+100");
            buffer.append(" WHEN DEPTNO=20 THEN SAL+200");
            buffer.append(" WHEN DEPTNO=30 THEN SAL+300");
            buffer.append(" END");
            buffer.append(")");
            buffer.append("WHERE deptno IN(?,?,?);");
            PreparedStatement pst=con.prepareStatement(buffer.toString());
            pst.setObject(1,10);
            pst.setObject(2,20);
            pst.setObject(3,30);
            int rows=pst.executeUpdate();
            System.out.println("更新了"+rows+"条记录");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
