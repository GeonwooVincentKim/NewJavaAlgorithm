package Collections.DataBase;

public class MemberVO {
    private int member_no;
    private String id;
    private String name;

    public int getMember_no() {
        return member_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMember_no(int member_no) {
        this.member_no = member_no;
    }
}
