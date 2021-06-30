package Class.TryCatch;

import static java.lang.System.out;
import java.lang.String;

public class ReTryCatch {
    public static void main(String[] args) {
        try {
            out.println("main() 함수에서 예외 터뜨려보기");
            first();
        } catch (Exception e) {
            out.println("Main() 예외 처리");
            out.println(e.getMessage());
        }
    }

    static void first() throws Exception {
        try {
            out.println("first() 함수에서 예외 터뜨려보기");
            second();
        } catch (Exception e) {
            out.println("first() 예외 처리");
            throw e;
        }
    }

    static void second() throws Exception {
        try {
            out.println("second() 함수에서 예외 터뜨려보기");
            throw new Exception("예외 발생");
        } catch (Exception e) {
            out.println("second() 예외 처리");
            throw e;
        }
    }
}
