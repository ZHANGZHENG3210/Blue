package day2;

import java.nio.Buffer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo4 {
    public static void main(String[] args) {
        try(Connection con=ConnectionFactory.getConnection()){
            StringBuffer buffer=new StringBuffer();
            buffer.append("DELETE e,d FROM EMP E RIGHT JOIN DEPT D ON E.DEPTNO=D.DEPTNO WHERE D.DEPTNO=?");
            PreparedStatement pst=con.prepareStatement(buffer.toString());
            pst.setObject(1,40);
            int row=pst.executeUpdate();
            System.out.println(row);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
