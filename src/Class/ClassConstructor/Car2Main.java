package Class.ClassConstructor;

import static java.lang.System.out;

public class Car2Main {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        out.println(c1);

        Car2 c2 = new Car2("중형차");
        out.println(c2);

        Car2 c3 = new Car2("현대", "대형차");
        out.println(c3);

        Car2 c4 = new Car2("Black", "기아", "회물차");
        out.println(c4);

        out.println("c1 == " + c1);
        out.println("c2 == " + c2);
        out.println("c3 == " + c3);
        out.println("c4 == " + c4);
    }
}
