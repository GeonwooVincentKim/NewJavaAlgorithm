package Class.Inheritance;

import static java.lang.System.out;

public class A {
    A() {
        this(100);
        out.println("A 생성자입니다.");
    }

    A(int score) {
        this("홍길동");
        out.println("당신의 성적은 .. : " + score);
    }

    A(String userName) {
        out.println("당신의 이름 : " + userName);
    }

    public static void main(String[] args) {
        A a = new A();
        out.println(a);
    }
}
