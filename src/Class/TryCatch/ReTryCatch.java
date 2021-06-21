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
        out.println(4 / 0);
    }
}
