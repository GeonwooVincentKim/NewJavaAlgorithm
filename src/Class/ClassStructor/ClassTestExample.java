package Class.ClassStructor;

import static java.lang.System.out;

public class ClassTestExample {
    public static void main(String[] args) {
        ClassTest classTest = new ClassTest(100);
        ClassTest classTest1 = new ClassTest(100);

        ClassTest classTest2 = classTest;

        if (classTest.equals(classTest1)) {
            out.println("두 객체의 값은 서로 같습니다");
        } else {
            out.println("두 객체의 값은 서로 같지 않습니다");
        }

        if (classTest.equals(classTest2)) {
            out.println("두 객체의 값은 서로 같습니다");
        } else {
            out.println("두 객체의 값은 서로 같지 아니합니다");
        }

        out.println("-----------------------------");

        String a = "서울";
        String b = "서울";

        if (a == b) {
            out.println("두 문자열의 값은 서로 같습니다");
        } else {
            out.println("두 문자열의 값은 서로 같지 않습니다");
        }

        out.println("-----------------------------");

        String a1 = new String("부산");
        String b1 = new String("부산");

        if (a1 == b1) {
            out.println("두 문자열의 주소는 서로 같습니다.");
        } else if (a1.equals(b1)) {
            out.println("두 문자열의 값은 서로 같습니다.");
        } else {
            out.println("두 문자열의 값 또는 주소는 서로 같지 않습니다");
        }
    }
}
