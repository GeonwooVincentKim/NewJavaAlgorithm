package Class.TryCatch;

import static java.lang.System.out;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);

            out.print("아이디 : ");
            String inputID = sc.nextLine();
            out.println(inputID);

            out.println("비밀번호 : ");
            String inputPassword = sc.nextLine();
            out.println(inputPassword);

            sc.close();
        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }
}
