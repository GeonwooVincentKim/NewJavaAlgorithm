package Class.TryCatch;

import static java.lang.System.out;

public class ReTryCatch {
    public static void main(String[] args) {
        try {
            first();
        } catch (Exception e) {
            out.println("Main() 예외 처리");
            out.println(e.getMessage());
        }
    }

    static void first() throws Exception {
        try {
            second();
        } catch (Exception e) {
            out.println("first() 예외 처리");
            throw e;
        }
    }

    static void second() throws Exception {
        try {
            throw new Exception("예외 발생");
        } catch (Exception e) {
            out.println("second() 예외 처리");
            throw e;
        }
    }
}
