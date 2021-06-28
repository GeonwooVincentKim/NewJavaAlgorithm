package Collections.DataBase;

import static java.lang.System.out;

import java.util.List;

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

        // Query No.2 member and print the result
        MemberVO resultVO = dao.selectMember(2);
        out.println("회원정보 출력");
        out.println("회원번호 : " + resultVO.getMember_no());
        out.println("아이디 : " + resultVO.getId());
        out.println("이름 : " + resultVO.getName());

        // Show list of Member
        List<MemberVO> memberList = dao.memberList();
        for (int i = 0; i < memberList.size(); i++) {
            out.println("회원 번호 : " + memberList.get(i).getMember_no() + "\t아이디 : " + memberList.get(i).getId()
                    + "\t이름 : " + memberList.get(i).getName());
        }

        // Update Member
        vo.setName("고길동");
        int r2 = dao.update(vo);
        if (r2 > 0) {
            out.println("회원 수정 성공");
        }

        // Delete Member
        // vo.setMember_no(1);
        int r3 = dao.delete(2);
        if (r3 > 0) {
            out.println("회원 삭제 성공");
        }
    }
}
