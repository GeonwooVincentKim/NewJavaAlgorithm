package Collections.DataBase;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO {
    // Object for Access into DataBase
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    // Access into DataBase
    public MemberDAO() {
        try {
            // Load MariaDB Driver
            Class.forName("org.mariadb.jdbc.Driver");

            // Access into DataBase
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3305/javadb", "root", "1234");
        } catch (ClassNotFoundException e) {
            out.println(e.getMessage());
            out.println("<---------------------->");
            e.printStackTrace();
        } catch (SQLException e) {
            out.println(e.getMessage());
            out.println("<---------------------->");
            e.printStackTrace();
        }
    }

    // Insert Data
    public int insert(MemberVO vo) {
        int result = 0;

        try {
            String sql = "INSERT INTO member (member_no, id, name) VALUES (" + vo.getMember_no() + ", '" + vo.getId()
                    + "', '" + vo.getName() + "')";
            statement = connection.createStatement();
            result = statement.executeUpdate(sql);
        } catch (SQLException e) {
            out.println(e.getMessage());
            out.println("<---------------------->");
            e.printStackTrace();
        }

        return result;
    }
}
