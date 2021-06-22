package Class.Object.Test;

import static java.lang.System.out;

public class StringArrayToString {
    public static void main(String[] args) {
        String[] member = { "hong,홍길동,30", "lee,이순신,40", "kim,김유신,50" };
        out.println(member);

        for (int i = 0; i < member.length; i++) {
            out.println(member[i].split(",")[1]);
        }

        out.println();

        // int ageSum = 0;
        for (int i = 0; i < member.length; i++) {
            out.println(member[i].split(",")[2]);
        }
    }
}
