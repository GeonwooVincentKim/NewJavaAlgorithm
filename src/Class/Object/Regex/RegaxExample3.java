package Class.Object.Regex;

import static java.lang.System.out;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegaxExample3 {
    public static void main(String[] args) {
        String source = "휴대폰번호:010-1111-1111," + " 집전화번호:02-1234-5678," + " 이메일주소:email@gmail.com,"
                + " 계좌번호:123-12-123456";
        out.println(source);

        // First Index -> 0 + (The length of Number is 1 to 2)
        // Second Index -> Number length have 3 to 4
        // Third Index -> Can get the number-length which has 4 length Number
        String telPattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
        out.println(telPattern);

        String emailPattern = "(\\w+)@(\\w+).(\\w+)";
        out.println(emailPattern);

        String accountPattern = "(\\d{3})-(\\d{2})-(\\d{6})";
        out.println(accountPattern);

        out.println();
        out.println("----------------------------------------------------");
        out.println();

        // Phone-Number
        Pattern p = Pattern.compile(telPattern);
        Matcher m = p.matcher(source);
        out.println(m);

        out.println();

        out.println("전화번호 : ");
        while (m.find()) {
            out.println(m.group() + " : " + m.group(1) + "," + m.group(2) + "," + m.group(3));
        }

        out.println();
        out.println("----------------------------------------------------");
        out.println();

        // Email
        p = Pattern.compile(emailPattern);
        m = p.matcher(source);
        out.println(m);

        out.println();

        out.println("이메일 : ");
        while (m.find()) {
            out.println(m.group() + " : " + m.group(1) + "," + m.group(2) + "," + m.group(3));
        }

        out.println();
        out.println("----------------------------------------------------");
        out.println();

        // Account
        p = Pattern.compile(accountPattern);
        m = p.matcher(source);
        out.println(m);

        out.println();

        out.println("계좌번호 : ");
        while (m.find()) {
            out.println(m.group() + " : " + m.group(1) + "," + m.group(2) + "," + m.group(3));
        }
    }
}
