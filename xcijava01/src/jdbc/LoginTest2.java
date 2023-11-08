package jdbc;

import org.apache.commons.codec.digest.DigestUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id : ");
        String userid = sc.nextLine();
        System.out.println("pw : ");
        String userpw = DigestUtils.sha512Hex(sc.nextLine());

        String sql = """
                select userid, name
                from members
                where userid=? and userpw=?""";

        try (
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "ace", "ace");
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1,userid);
            stmt.setString(2,userpw);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.print(rs.getString("name") + "(" + rs.getString("userid")+ ") 님이 로그인 하였습니다.");
                } else {
                    System.out.println("아이디 혹은 비번이 틀림");
                }
            }
        } catch (Exception e) {
            System.out.println("실패 : " + e.getMessage());
        }

    }

}
