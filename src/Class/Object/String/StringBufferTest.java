package Class.Object.String;

import static java.lang.System.out;

public class StringBufferTest {
    public static void main(String[] args) {
        out.println();

        long start = System.currentTimeMillis();
        out.println(start);

        String str = "";
        for (int i = 0; i < 1000000; i++) {
            str += i;
            out.println(i);
        }

        out.print(str);

        long end = System.currentTimeMillis();
        out.println("실행 시간 : " + (end - start) / 1000);
    }
}
