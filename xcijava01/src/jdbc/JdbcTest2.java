package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest2 {
    public static void main(String[] args) {



        String sql = "select employee_id, last_name, salary from employees order by employee_id";
        try (
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "ace", "ace");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.print(rs.getLong(1) + "\t\t\t");
                System.out.print(rs.getString(2) + "\t\t\t");
                System.out.println(rs.getLong(3));
            }

        } catch (Exception e) {
            System.out.println("실패 : " + e.getMessage());
        }
        System.out.println("종료");

    }

}
