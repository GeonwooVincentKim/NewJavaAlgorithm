package Class.Object;

import static java.lang.System.out;

public class StringBuffer {
    public static void main(String[] args) {
        out.println();

        long start = System.currentTimeMillis();
        out.println(start);

        String str = "";
        for (int i = 0; i < 1000000; i++) {
            str += i;
        }

        out.print(str);

        long end = System.currentTimeMillis();
        out.println("실행 시간 : " + (end - start) / 1000);
    }
}
