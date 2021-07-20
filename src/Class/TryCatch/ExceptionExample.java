package Class.TryCatch;

import static java.lang.System.out;

import java.util.Scanner;

public class ExceptionExample {
    static String userID = "seo";
    static String userPassword = "smg1234";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {

            out.print("아이디 : ");
            String inputID = sc.nextLine();
            out.println(inputID);

            out.println("비밀번호 : ");
            String inputPassword = sc.nextLine();
            out.println(inputPassword);

            if (!userID.equals(inputID)) {
                throw new LoginException("아이디가 올바르지 않습니다 : ");
            } else if (!userPassword.equals(inputPassword)) {
                throw new LoginException("비밀번호가 올바르지 않습니다.");
            } else {
                out.println("로그인 성공");
            }

            // sc.close();
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("---------------------------");
            e.printStackTrace();

        } finally {
            sc.close();
        }
    }
}
