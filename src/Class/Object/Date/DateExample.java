package Class.Object.Date;

import static java.lang.System.out;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        out.println();

        Date now = new Date();
        out.println(now);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        out.println(simpleDateFormat);
        out.println(simpleDateFormat.format(now));

        out.println("--------------------------------------------");

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        out.println(simpleDateFormat2);
        out.println(simpleDateFormat2.format(now));

        out.println("--------------------------------------------");

        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        out.println(simpleDateFormat3);
        out.println(simpleDateFormat3.format(now));

        out.println("--------------------------------------------");

        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일 a");
        out.println(simpleDateFormat4);
        out.println(simpleDateFormat4.format(now));
    }
}
