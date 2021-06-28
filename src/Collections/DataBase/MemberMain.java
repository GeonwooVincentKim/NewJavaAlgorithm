package Collections.DataBase;

import static java.lang.System.out;

public class MemberMain {
    public static void main(String[] args) {
        MemberVO vo = new MemberVO();
        out.println(vo);

        vo.setMember_no(2);
        vo.setId("hong");
        vo.setName("홍길동");
    }
}
