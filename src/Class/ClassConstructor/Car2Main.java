package Class.ClassConstructor;

import static java.lang.System.out;

public class Car2Main {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        out.println(c1);

        Car2 c2 = new Car2("중형차");
        out.println(c2);

        Car2 c3 = new Car2();
        out.println(c3);
    }
}
