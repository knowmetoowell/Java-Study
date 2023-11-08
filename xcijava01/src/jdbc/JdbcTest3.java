package jdbc;

import java.sql.*;

public class JdbcTest3 {
    public static void main(String[] args) {

        String sql = """
                
                select employee_id, last_name, salary 
                from employees 
                where department_id > ?
                
                """;

        try (
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "ace", "ace");
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1,80);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    System.out.print(rs.getLong(1) + "\t\t\t");
                    System.out.print(rs.getString(2) + "\t\t\t");
                    System.out.println(rs.getLong(3));
                }
            }
        } catch (Exception e) {
            System.out.println("실패 : " + e.getMessage());
        }
        System.out.println("종료");

    }

}
