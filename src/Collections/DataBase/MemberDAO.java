package Collections.DataBase;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    // Show List of Member
    public List<MemberVO> memberList() {
        List<MemberVO> list = new ArrayList<MemberVO>();

        try {
            String sql = "SELECT * FROM member";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                MemberVO vo = new MemberVO();
                vo.setMember_no(resultSet.getInt("member_no"));
                vo.setId(resultSet.getString("id"));
                vo.setName(resultSet.getString("name"));
                list.add(vo);
            }
        } catch (SQLException e) {
            out.println(e.getMessage());
            out.println("<---------------------->");
            e.printStackTrace();
        }

        return list;
    }

    // Get one member and show
    public MemberVO selectMember(int memberNo) {
        MemberVO vo = new MemberVO();

        try {
            String sql = "SELECT * FROM MEMBER WHERE MEMBER_NO = " + memberNo;
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                vo.setMember_no(resultSet.getInt("member_no"));
                vo.setId(resultSet.getString("id"));
                vo.setName(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            out.println(e.getMessage());
            out.println("<--------------------->");
            e.printStackTrace();
        }

        return vo;
    }

    // Insert Data
    // INSERT INTO, UPDATE, DELETE, SELECT * --> Parameter 1
    // MEMBER --> DEFAULT
    public int insert(MemberVO vo) {
        int result = 0;

        try {
            String sql = "INSERT INTO member (member_no, id, name) VALUES (" + vo.getMember_no() + ", '" + vo.getId()
                    + "', '" + vo.getName() + "')";
            result = connectToDataBase(sql);
        } catch (SQLException e) {
            out.println(e.getMessage());
            out.println("<---------------------->");
            e.printStackTrace();
        }

        return result;
    }

    private int connectToDataBase(String sql) throws SQLException {
        int result;
        statement = connection.createStatement();
        result = statement.executeUpdate(sql);
        return result;
    }

    // Update Data
    public int update(MemberVO vo) {
        int result = 0;

        try {
            String sql = "UPDATE MEMBER SET ID = '" + vo.getId() + "', NAME = '" + vo.getName() + "' "
                    + "WHERE MEMBER_NO = " + vo.getMember_no();
            result = connectToDataBase(sql);
        } catch (SQLException e) {
            out.println(e.getMessage());
            out.println("<---------------------->");
            e.printStackTrace();
        }

        return result;
    }

    // Delete Data
    public int delete(int member_no) {
        int result = 0;

        try {
            String sql = "DELETE FROM MEMBER WHERE MEMBER_NO = " + member_no;
            result = connectToDataBase(sql);
        } catch (SQLException e) {
            out.println(e.getMessage());
            out.println("<---------------------->");
            e.printStackTrace();
        }
        return result;
    }
}
