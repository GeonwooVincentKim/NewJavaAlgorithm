package Class.Object.StringBuffer;

import static java.lang.System.out;

public class RealStringBuffer {
    public static void main(String[] args) {
        out.println();

        long start = System.currentTimeMillis();
        out.print(start);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();
        out.println("실행 시간 : " + (end - start) / 1000);
    }
}
