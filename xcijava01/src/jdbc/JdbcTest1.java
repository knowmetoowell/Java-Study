package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String sql = "select employee_id, last_name, salary from employees order by employee_id";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
//            System.out.println("jdbc driver 로드");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "ace", "ace");
//            System.out.println("conn = " + conn);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getLong(1) + "\t\t\t");
                System.out.print(rs.getString(2) + "\t\t\t");
                System.out.println(rs.getLong(3) + "\t\t\t");
            }

        } catch (Exception e) {
            System.out.println("실패 : " + e.getMessage());
        } finally {

        }
        System.out.println("종료");

    }

}
