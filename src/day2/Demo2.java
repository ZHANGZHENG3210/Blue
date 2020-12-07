package day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo2 {
    public static void main(String[] args) {
        Connection con=ConnectionFactory.getConnection();
        try{
            String sql="SELECT E.EMPNO,E.ENAME,D.DNAME FROM EMP E  JOIN DEPT D " +
                    "ON E.DEPTNO=D.DEPTNO WHERE SAL>?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setObject(1,2000);
            ResultSet set=pst.executeQuery();
            while(set.next()){
                int empno=set.getInt("empno");
                String ename=set.getString("ename");
                String dname=set.getString("dname");
                System.out.println(empno+"\t"+ename+"\t"+dname);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
