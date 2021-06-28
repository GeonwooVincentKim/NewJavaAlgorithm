package Collections.DataBase;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args) {
        Connection connection = null;
        out.println(connection);

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3305/javadb", "root", "1234");
        } catch (ClassNotFoundException e) {
            out.println(e.getMessage());
            out.println("<--------------------->");
            e.printStackTrace();
        } catch (SQLException e) {
            out.println(e.getMessage());
            out.println("<--------------------->");
            e.printStackTrace();
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("<--------------------->");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                }
            }
        }

        if (connection != null) {
            out.println("데이터베이스 접속 성공");
        }
    }
}
