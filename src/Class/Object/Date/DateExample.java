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

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        out.println(simpleDateFormat2);
        out.println(simpleDateFormat2.format(now));
    }
}
