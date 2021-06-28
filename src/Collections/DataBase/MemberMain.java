package Collections.DataBase;

import static java.lang.System.out;

public class MemberMain {
    public static void main(String[] args) {
        // Create MemberVO Instance
        MemberVO vo = new MemberVO();
        out.println(vo);

        vo.setMember_no(2);
        vo.setId("hong");
        vo.setName("홍길동");

        // Create MemberDAO Instance
        MemberDAO dao = new MemberDAO();
        out.println(dao);

        // Add Member
        int r = dao.insert(vo);
        if (r > 0) {
            out.println("회원 등록 성공");
        }
    }
}
