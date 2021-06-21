package Class.TryCatch;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputTryCatch {
    public static void main(String[] args) {
        out.println();

        Scanner sc = new Scanner(System.in);
        int userInput = 0;

        try {
            first(sc, userInput);
        } catch (Exception e) {
            out.println("정수형 데이터가 아닌 다른 데이터를 입력하신 모양입니다..");
        }

        sc.close();
    }

    static void first(Scanner sc, int userInput) throws Exception {
        try {
            second(sc, userInput);
        } catch (NumberFormatException e) {
            out.println("메인으로 떠넘기는 에러입니다!!!");
            throw e;
        }
    }

    static void second(Scanner sc, int userInput) throws Exception {
        try {
            userInput = sc.nextInt();
            // 정상적으로 입력했어도 이 코드 때문에 InputMismatchException 과
            // NumberFormatException 에러가 같이 터짐
            int getUserInput = Integer.parseInt(null);
            out.println(getUserInput);
        } catch (InputMismatchException e) {
            out.println("first으로 떠넘기는 에러입니다..");
            throw e;
        }
    }
}
